package simpletest.generator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Ignore;

import qfevotest.generator.EvoTestGenerator;
import spoon.Launcher;
import spoon.OutputType;
import spoon.SpoonModelBuilder.InputType;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.AnnotationFactory;
import spoon.reflect.factory.Factory;
import spoon.support.compiler.jdt.JDTBasedSpoonCompiler;
import spoon.support.reflect.code.CtBlockImpl;

/**
 * Class that generates the test cases from the json files.
 * 
 * @author Matias Martinez
 *
 */
public class TestsGenerator {

	public static int TIMEOUT = 3000;
	public static int DELTA_FLOAT_COMPARISON = 0;
	public static int TOTAL_TEST_NUMBER=5000;

	public static double[] DELTAS_TESTS_SQRT = new double[] { 0.01, 0.5, 0.3, 0.2, 0.01, 0.05, 0.03 };
	// Test to add anotation ignore: key is program+test_id
	public static List<String> TEST_T_ADD_IGNORE = java.util.Arrays.asList("LEVENSHTEIN3");

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void createTestCases(String ROOT_DIR, String program, String output,
			String testPackageName, String subjectsPakcageName) throws Exception {
		System.out.println("generating test case for program : " + program);

		File outputSrcDirectory = new File(output);
		outputSrcDirectory.mkdirs();

		createOracle(outputSrcDirectory, testPackageName);

		System.out.println("Generating test cases at " + outputSrcDirectory);
		// Initialization of model
		final Launcher comp = new Launcher();
		comp.getEnvironment().setShouldCompile(true);
		comp.buildModel();
		Factory f = (Factory) comp.getFactory();

		// Creation of test class
		String name = program.toUpperCase() + "_TEST";
		CtClass ctclass = f.createClass(name);
		CtPackage p = f.Core().createPackage();
		p.setSimpleName(testPackageName);
		ctclass.setParent(p);
		ctclass.setVisibility(ModifierKind.PUBLIC);

		// Creation of test cases
		int i_nr_testcase = 0;
		for(int i=0;i<TOTAL_TEST_NUMBER;i++) {
		//for (String i_input : inputs) {

			CtMethod ctm = f.createMethod();
			ctm.setSimpleName("test_" + (i_nr_testcase));
			ctm.setVisibility(ModifierKind.PUBLIC);
			ctm.setType(f.Type().VOID.unbox());
			CtBlock block = new CtBlockImpl<>();

			ctm.setBody(block);
			ctclass.addMethod(ctm);

			ctm.addThrownType(f.createCtTypeReference(Exception.class));
			Type[] parametersTypes = getTypesOfParameters(program, program.toUpperCase(), subjectsPakcageName);
			Map parameterMap = RandomTestConfig.getRandomParamters(parametersTypes,program);
			
			
			String expected = getOutput(program, program.toUpperCase(), subjectsPakcageName, (Object[]) parameterMap.get("parameters"));

			if("error".equals(expected)) {
				continue;
			}
			Class returnType = getReturnType(program, program.toUpperCase(), subjectsPakcageName);
			boolean isOutputDecimal = returnType.getSimpleName().toLowerCase().equals("double");
			CtCodeSnippetStatement stmtInvProgramUnderRepair = f.Core().createCodeSnippetStatement();
			stmtInvProgramUnderRepair.setValue(returnType.getCanonicalName() + " result = " + subjectsPakcageName + "."
					+ program.toUpperCase() + "." + program.toLowerCase() + "("
					+ (parameterMap.get("parametersToString")) + ")");

			block.addStatement(stmtInvProgramUnderRepair);


			CtCodeSnippetStatement stmtAssert = f.Core().createCodeSnippetStatement();
			
			if (isNumber(returnType) || returnType.isPrimitive()) {
				if (returnType.getSimpleName().toLowerCase().equals("double")) {
					stmtAssert.setValue("org.junit.Assert.assertEquals( (" +"double" + ") "
							+ expected + ", result, " + getFloatComparisonDelta(program, i_nr_testcase) + ")");
				} else {
					stmtAssert.setValue("org.junit.Assert.assertEquals( (" + returnType.getCanonicalName() + ") "
							+ expected + ", result" + ")");

				}
				block.addStatement(stmtAssert);

			} else {
				CtCodeSnippetStatement stmtCall = f.Core().createCodeSnippetStatement();

				stmtCall.setValue(
						"String resultFormatted = " + testPackageName + "." + QuixFixOracleHelper.class.getSimpleName()
								+ ".format(" + "result," + (!isOutputDecimal) + ")");
				block.addStatement(stmtCall);
				
				stmtAssert.setValue("org.junit.Assert.assertEquals(" + "\""
						+ QuixFixOracleHelper.format(expected, (!isOutputDecimal)) + "\"" + ", resultFormatted)");
				block.addStatement(stmtAssert);
			}

			

			AnnotationFactory af = f.Annotation();
			af.annotate(ctm, org.junit.Test.class, "timeout", getTimeOut(program, i_nr_testcase));

			if (TEST_T_ADD_IGNORE.contains(program.toUpperCase() + i_nr_testcase)) {
				af.annotate(ctm, Ignore.class);
			}
			i_nr_testcase++;
		
		}
		
		// We configure the output and compile the tests generated
		comp.setSourceOutputDirectory(outputSrcDirectory);
		comp.getFactory().getEnvironment().setShouldCompile(true);
		comp.getFactory().getEnvironment().setNoClasspath(true);
		comp.getModelBuilder().compile();
		JDTBasedSpoonCompiler jdtSpoonModelBuilder = new JDTBasedSpoonCompiler(f);
		jdtSpoonModelBuilder.setSourceOutputDirectory(outputSrcDirectory);
		jdtSpoonModelBuilder.generateProcessedSourceFiles(OutputType.COMPILATION_UNITS);
		jdtSpoonModelBuilder.compile(InputType.CTTYPES);
		jdtSpoonModelBuilder.generateProcessedSourceFiles(OutputType.CLASSES);

		System.out.println("Generated test cases stored at " + outputSrcDirectory);
	}

	private boolean createOracle(File outputSrcDirectory, String testPackage) throws IOException {
		boolean created = false;
		File oracleFile = new File((outputSrcDirectory).getAbsoluteFile() + File.separator
				+ QuixFixOracleHelper.class.getCanonicalName().replaceAll("\\.", File.separator) + ".java");
		if (oracleFile.exists()) {

			File destinationOracle = new File((outputSrcDirectory).getAbsoluteFile() + File.separator + testPackage
					+ File.separator + QuixFixOracleHelper.class.getSimpleName() + ".java");
			if (!destinationOracle.exists()) {
				System.out.println("Creating oracle java file at " + destinationOracle);
				FileUtils.copyFile(oracleFile, destinationOracle);
				this.replaceImport(destinationOracle, testPackage);
			}
			created = true;
		}
		return created;
	}

	/**
	 * Check if the type is a Number (Wrapper or primitive)
	 */
	public boolean isNumber(Class type) {
		return Number.class.isAssignableFrom(type) || (type.isPrimitive() && (type.getSimpleName().equals("double")
				|| type.getSimpleName().equals("int") || type.getSimpleName().equals("float")));
	}

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		
		String ROOT_DIR = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String subjectPackageName = "java_programs";
		String testPackageName = "java_programs";

		
		String[] names = new String[] { "find_in_sorted","get_factors","is_valid_parenthesization","knapsack","levenshtein","lis","mergesort"
				, "next_permutation","quicksort","rpn_eval","powerset" };
		
		for (String prog : names) {
			String programToExecute = prog;
			String out = ROOT_DIR+"../../generatedTests/simple_5000";
			TestsGenerator ct = new TestsGenerator();
			ct.createTestCases(ROOT_DIR, programToExecute, out, testPackageName, subjectPackageName);
			EvoTestGenerator.compileProgram(out,prog.toUpperCase() + "_TEST");
		}
		System.out.println("End");
	}



	/**
	 * Returns types of the parameters of a method which name is given as parameter
	 * 
	 * @param methodName
	 * @param className
	 * @param packageName
	 * @return
	 * @throws Exception
	 */
	public static Type[] getTypesOfParameters(String methodName, String className, String packageName)
			throws Exception {
		
		Class target_class = Class.forName(packageName + "." + className);
		Method[] method = target_class.getDeclaredMethods();
		for (Method m : method) {
			if (!m.getName().equals(methodName)) {
				continue;
			}
			Type[] types = m.getParameterTypes();
			return types;
		}
		return null;
	}
	
	
	public static String getOutput(String methodName, String className, String packageName, Object[] params)
			{
		
		Class target_class = null;
		try {
			target_class = Class.forName(packageName + "." + className);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Method[] method = target_class.getDeclaredMethods();
		Method targetMethod = null;
		for (Method m : method) {
			if (!m.getName().equals(methodName)) {
				continue;
			}
			targetMethod = m;			
		}
		String ouputValue = "";
		try {
			//System.out.println("input params1 :"+params[0]);
			//System.out.println("input params2 :"+params[1].toString());
	        ouputValue = String.valueOf(targetMethod.invoke(null, params));
		} catch(Exception e) {
			return "error";
		}
		
		return ouputValue;
	}
	
	

	/**
	 * Returns the *return* type of the parameters of a method which name is given
	 * as parameter
	 * 
	 * @param methodName
	 * @param className
	 * @param packageName
	 * @return
	 * @throws Exception
	 */
	public static Class getReturnType(String methodName, String className, String packageName) throws Exception {

		Class target_class = Class.forName(packageName + "." + className);
		Method[] method = target_class.getDeclaredMethods();

		for (Method m : method) {
			if (!m.getName().equals(methodName)) {
				continue;
			}

			Class type = m.getReturnType();
			return type;
		}
		return null;
	}

	private static double getFloatComparisonDelta(String program, int nrTestcase) {
		if (program.toLowerCase().equals("sqrt")) {
			return DELTAS_TESTS_SQRT[nrTestcase];
		} else {
			return DELTA_FLOAT_COMPARISON;
		}

	}

	/**
	 * Some special timeouts for given methods
	 * 
	 * @param program
	 * @param nrTestcase
	 * @return
	 */
	private static int getTimeOut(String program, int nrTestcase) {
		if (program.toLowerCase().equals("levenshtein") && nrTestcase == 3) {
			return 40000;
		} else {
			return TIMEOUT;
		}

	}

	public void replaceImport(File fileOracle, String testPackage) {
		List<String> lines = new ArrayList<String>();
		String line = null;
		String lineSep = System.lineSeparator();
		try {

			FileReader fr = new FileReader(fileOracle);
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				if (line.trim().startsWith("package"))
					line = "package " + testPackage + ";";
				lines.add(line + lineSep);
			}
			fr.close();
			br.close();

			FileWriter fw = new FileWriter(fileOracle);
			BufferedWriter out = new BufferedWriter(fw);
			for (String s : lines)
				out.write(s);
			out.flush();
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
