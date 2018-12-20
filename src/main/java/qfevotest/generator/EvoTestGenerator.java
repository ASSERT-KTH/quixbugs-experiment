package qfevotest.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Class that generates Evosuite test
 * @author Matias Martinez
 *
 */
public class EvoTestGenerator {

	public void generate(String programName, File output) {

	}

	/**
	 * 
	 * @param urlClasspath
	 * @param argumentsEvo
	 * @return
	 */
	protected boolean runProcess(URL[] urlClasspath, String[] argumentsEvo, int timeout) {
		Process p = null;

		String javaPath = "";
		javaPath += "java";

		try {

			List<String> command = new ArrayList<String>();
			command.add(javaPath);
			command.add("-jar");
			command.add(new File("./libs/evosuite-master-1.0.6-SNAPSHOT.jar").getAbsolutePath());

			for (String arg : argumentsEvo) {
				command.add(arg);
			}
			System.out.println("Running EvoGenerate " + (command));
			ProcessBuilder pb = new ProcessBuilder(command.toArray(new String[command.size()]));
			pb.redirectOutput();
			pb.redirectErrorStream(true);
			p = pb.start();
			p.waitFor(timeout * 2 * 1000, TimeUnit.MILLISECONDS);

			String out = readOut(p);
			System.out.println("ES generation output: \n " + out);
			p.destroyForcibly();
			return true;
		} catch (IOException | InterruptedException | IllegalThreadStateException ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
			if (p != null)
				p.destroyForcibly();
		}
		return false;
	}

	private static String readOut(Process p) {
		String out = "";
		String all = "";
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				if (line.startsWith("Writing JUnit test case")) {
					out += line + "\n";
				}
				all += line + "\n";

			}
			if ("".equals(out)) {
				return all;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return out;
	}

	public void compileEvoSuiteTest(String dirtocompile, String programName) throws IOException {
		this.compileProgram(dirtocompile, programName+"_ESTest");

	}

	public static void compileProgram(String dirtocompile, String programName) throws IOException {
		dirtocompile+=File.separator+"java_programs"+File.separator;
		Process p = null;
		System.out.println("Compiling Directory " + dirtocompile);
		String dependencyPath= new File("./libs/evosuite-standalone-runtime-1.0.6-SNAPSHOT.jar").getAbsolutePath();

		String path = System.getProperty("java.class.path")+":"+dependencyPath;
		String[] command = new String[] { "javac", "-cp", path,
				programName+".java" };
		String[] commandNode = new String[] { "javac", "-cp", path,
				"Node.java" };
//		System.out.println(Arrays.toString(command));
			
		ProcessBuilder pb = new ProcessBuilder(command);
		if("DEPTH_FIRST_SEARCH".equals(programName)) {
			ProcessBuilder pbnode = new ProcessBuilder(commandNode);
			pbnode.redirectOutput();
			pbnode.redirectErrorStream(true);
			pbnode.directory(new File(dirtocompile));
			Process pnode = pbnode.start();
			String outnode = readOut(pnode);
			System.out.println("Compilation: " + outnode.isEmpty() + ": " + outnode);
		}
		pb.redirectOutput();
		pb.redirectErrorStream(true);
		pb.directory(new File(dirtocompile));
		p = pb.start();
		String out = readOut(p);
		System.out.println("Compilation: " + out.isEmpty() + ": " + out);

	}

	public boolean runEvosuite(String programClassName, String location, String outES, int seed, int timeoutSeconds,
			boolean useDSE) throws Exception {

		File fESout = new File(outES + File.separator + "seed_" + seed);
		fESout.mkdirs();

		long init = System.currentTimeMillis();

		boolean reponse = true;
		// generate a process for running evosuite
		String[] command = new String[] { "-class", programClassName, //
				"-projectCP", new File("./target/classes/").getAbsolutePath(), //

				"-base_dir", fESout.getAbsolutePath() };//

		String[] defaultsParameters = new String[] {
				// Default options:
				"-Dglobal_timeout", Integer.toString(timeoutSeconds * 2), "-seed", Integer.toString(seed)//
				, "-Drandom_seed", Integer.toString(seed), //
				"-Dsearch_budget", Integer.toString(timeoutSeconds), //
				//// Stopping conditions options: [MAXSTATEMENTS,
				//// MAXTESTS, MAXTIME, MAXGENERATIONS,
				//// MAXFITNESSEVALUATIONS, TIMEDELTA])
				"-Dstopping_condition", "MaxTime", "-Dsandbox", "false", //
				"-Dno_runtime_dependency", "true", //
				"-mem", "2000", //
				"-Djunit_check", "true" };

		command = concat(command, defaultsParameters);
		// if symbolic execution, we add these arguments.
		if (useDSE) {

			String[] dse = new String[] { "-Dlocal_search_rate", "2", // "8",
																		// //
					"-Dlocal_search_budget", "5", //
					"-Dlocal_search_budget_type", "TIME", //
					"-Dlocal_search_adaptation_rate", "0.33", //
					"-Dlocal_search_probability", "1.0", //
					"-Ddse_probability", "1.0",//
			};
			command = concat(command, dse);
		}

		boolean sucess = runProcess(null, command, timeoutSeconds);
		reponse &= sucess;

		long time = (System.currentTimeMillis() - init) / 1000;
		System.out.println("Evo end in total " + time);
		return reponse;
	}

	public static String[] concat(String[] a, String[] b) {
		int aLen = a.length;
		int bLen = b.length;
		String[] c = new String[aLen + bLen];
		System.arraycopy(a, 0, c, 0, aLen);
		System.arraycopy(b, 0, c, aLen, bLen);
		return c;
	}

}
