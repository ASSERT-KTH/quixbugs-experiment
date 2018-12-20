package qfevotest.generator;

/**
 * 
 */
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;

import qfevotest.generator.EvoTestGenerator;
import qfevotest.generator.QuixBugExtendedOracle;
import qfevotest.testrunner.SummaryResults;

public class PatchAssessmentTest {

	@Test
	public void testGenerate1() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		int seed = 1;
		qg.generateTest4AllPrograms("./out", seed);
	}

	@Test
	public void testGenerateAllSeed() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		qg.generateTest4AllProgramsAllSeed("./generatedTests");
	}

	@Test
	public void testGenerate1Subject() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		boolean success = qg.generateAndRunEvoTests("./out", "subsequences", 19);
		assertTrue(success);
	}

	@Test
	public void testGenerateAllSeedMulti() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		qg.generateTestAllSeedMultithread("./out10s", 2);
	}

	@Test
	public void testCheckDetermLis1() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		boolean determ = qg.checkDeterministic("./out", "LIS");
		assertTrue(determ);
	}
	
	@Test
	public void testCheckDeterminismAll() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		for (String subjects : qg.subjectsQuixBugs) {
			boolean determ = qg.checkDeterministic("./generatedTests", subjects.toUpperCase());
			assertTrue(determ);
		}
		
	}
	
	
	@Test
	public void testRunPatchPassing() throws Exception {
		//Here, we pass the location to the patched version bytecode
		 Properties prop = new Properties();   
	     InputStream in = Object.class.getResourceAsStream("/test.properties");   
	     prop.load(in); 	    	     
	     for(Object patchPath:prop.keySet()) {
	    	    String program = prop.getProperty((String) patchPath);
	    		File patchLocation = new File("./patchedPrograms/"+patchPath);
	    		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
	    		SummaryResults resultallseed = qg.runEvosuiteAllSeedOnPatch(patchLocation.toPath(),
	    				new File("./generatedTests").toPath(), program,20,"report.txt","");
	    		//assertTrue(resultallseed.isCorrect());//removing this assertion, not all test must pass
	     }	
	}
	
	/**
	 *  Test 30 seeds of Evosuite over patched programs
	 * @throws Exception
	 */
	@Test
	public void evosuite_30_seeds() throws Exception {
		int seed = 30;
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		Map<String, SummaryResults> resultByProgram = qg.runAllResults(new File("./generatedTests"),seed,"Evosuite-30-seeds.txt");
		qg.outputResult(resultByProgram.values());
		System.out.println("\nEND: printing finals results: ");
		for (String program : resultByProgram.keySet()) {
			
			SummaryResults sr = resultByProgram.get(program);
			List<?> failingSeed = sr.getFailing();
			System.out.println(program + "failing test number" + sr.getFailingNumber() +" total number:" +sr.getTotalNumber() +": pass all test? " + sr.isCorrect() + " failings: (" + failingSeed.size()
					+ ") " + failingSeed);
		}
	}
	
	/**
	 * Test one seed of Evosuite over patched programs
	 * @throws Exception
	 */
	
	@Test
	public void evosuite_1_seed() throws Exception {
		int seed = 1;
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		Map<String, SummaryResults> resultByProgram = qg.runAllResults(new File("./generatedTests"),seed,"Evosuite-1-seed.txt");
		qg.outputResult(resultByProgram.values());
		System.out.println("\nEND: printing finals results: ");
		for (String program : resultByProgram.keySet()) {			
			SummaryResults sr = resultByProgram.get(program);
			List<?> failingSeed = sr.getFailing();
			System.out.println(program + ": pass all test? " + sr.isCorrect() + " failings: (" + failingSeed.size()
					+ ") " + failingSeed);
		}
	}
	
	
	/**
	 * Test five seeds of Evosuite over patched programs
	 * @throws Exception
	 */
	@Test
	public void evosuite_5_seeds() throws Exception {
		int seed = 5;
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		Map<String, SummaryResults> resultByProgram = qg.runAllResults(new File("./generatedTests"),seed,"Evosuite-5-seeds.txt");
		qg.outputResult(resultByProgram.values());
		System.out.println("\nEND: printing finals results: ");
		for (String program : resultByProgram.keySet()) {			
			SummaryResults sr = resultByProgram.get(program);
			List<?> failingSeed = sr.getFailing();
			System.out.println(program + "failing test number" + sr.getFailingNumber() +" total number:" +sr.getTotalNumber() +": pass all test? " + sr.isCorrect() + " failings: (" + failingSeed.size()
					+ ") " + failingSeed);
		}
	}

	@Test
	public void testRunPatchFailling() throws Exception {
		// Here, we pass the location to the patched version bytecode which
		// fails
		URL urlPatchTest = this.getClass().getClassLoader().getResource("testpatch1");
		File patchLocation = new File(urlPatchTest.getPath());
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		SummaryResults resultallseed = qg.runEvosuiteAllSeedOnPatch(patchLocation.toPath(),
				new File("./generatedTests").toPath(), "LIS",20,"report.txt","");
		assertFalse(resultallseed.isCorrect());
	}
	
	
	/**
	 * Run 10 InputSampling test over patched programs
	 * @throws Exception
	 */
	@Test
	public void inputSampling_10_assessment() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		String testPath = "./generatedTests/InputSampling_10";
		String reportName="InputSampling_10.txt";
		Map<String, SummaryResults> resultByProgram = qg.runAllResults(new File(testPath),0,reportName);
		qg.outputResult(resultByProgram.values());
		System.out.println("\nEND: printing finals results: ");
		for (String program : resultByProgram.keySet()) {
			
			SummaryResults sr = resultByProgram.get(program);
			List<?> failingSeed = sr.getFailing();
			System.out.println(program + "failing test number" + sr.getFailingNumber() +" total number:" +sr.getTotalNumber());

		}
	}
	
	

	/**
	 * Run 50 InputSampling test over patched programs
	 * @throws Exception
	 */
	@Test
	public void inputSampling_50_assessment() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		String testPath = "./generatedTests/InputSampling_50";
		String reportName="InputSampling_50.txt";
		Map<String, SummaryResults> resultByProgram = qg.runAllResults(new File(testPath),0,reportName);
		qg.outputResult(resultByProgram.values());
		System.out.println("\nEND: printing finals results: ");
		for (String program : resultByProgram.keySet()) {
			
			SummaryResults sr = resultByProgram.get(program);
			List<?> failingSeed = sr.getFailing();
			System.out.println(program + "failing test number" + sr.getFailingNumber() +" total number:" +sr.getTotalNumber());

		}
	}
	
	
	/**
	 * Run 300 InputSampling test over patched programs
	 * @throws Exception
	 */
	@Test
	public void inputSampling_300_assessment() throws Exception {
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		String testPath = "./generatedTests/InputSampling_300";
		String reportName="InputSampling_300.txt";
		Map<String, SummaryResults> resultByProgram = qg.runAllResults(new File(testPath),0,reportName);
		qg.outputResult(resultByProgram.values());
		System.out.println("\nEND: printing finals results: ");
		for (String program : resultByProgram.keySet()) {			
			SummaryResults sr = resultByProgram.get(program);
			List<?> failingSeed = sr.getFailing();
			System.out.println(program + "failing test number" + sr.getFailingNumber() +" total number:" +sr.getTotalNumber());
		}
	}
	

	/**
	 * To check the whether tests generated by Evosuite fail on the version used for generating them
	 * @throws Exception
	 */
	
	@Test
	public void testCheckCorretnessOriginalAll() throws Exception {
		List<String> failing = new ArrayList<>();
		QuixBugExtendedOracle qg = new QuixBugExtendedOracle();
		for (String subjects : qg.subjectsQuixBugs) {
			boolean allPassing = qg.checkOriginalCorrect("./generatedTests", subjects.toUpperCase());
			if(!allPassing)
				failing.add(subjects);
		}
		System.out.println("failings: "+ failing);
			}
	
	/**
	 * Manual compile tests.
	 * @throws IOException
	 */
	
	@Test
	public void compileUpdatedProgram() throws IOException {
		for(int i = 1; i<=30;i++) {
		EvoTestGenerator.compileProgram("./generatedTests/seed_"+i+"/evosuite-tests","SHORTEST_PATH_LENGTHS_ESTest");
		}
	}

}
