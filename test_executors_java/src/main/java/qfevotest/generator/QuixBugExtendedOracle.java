package qfevotest.generator;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import qfevotest.generator.multithread.EVRunner;
import qfevotest.testrunner.LaucherJUnitProcess;
import qfevotest.testrunner.SummaryResults;
import qfevotest.testrunner.TestResult;

/**
 * Class that a) invokes the generation of evosuite test cases, and b) execute
 * programs over generated test cases.
 * 
 * @author Matias Martinez
 *
 */
public class QuixBugExtendedOracle {

	static int[] seeds = new int[20];

	static {
		// by default, seeds from 0 to 20-1
		for (int i = 0; i < 20; i++) {
			seeds[i] = i + 1;
		}
	}
	static String[] subjectsQuixBugs = new String[] { "bitcount", "bucketsort", "find_first_in_sorted",
			"find_in_sorted", "flatten", "gcd", "get_factors", "hanoi", "is_valid_parenthesization", "kheapsort",
			"knapsack", "kth", "lcs_length", "levenshtein", "lis", "longest_common_subsequence", "max_sublist_sum",
			"mergesort", "next_palindrome", "next_permutation", "pascal", "possible_change", "powerset", "quicksort",
			"rpn_eval", "shunting_yard", "sieve", "sqrt", "subsequences", "to_base", "wrap", };

	public void generateTest4AllPrograms(String out, int seed) throws Exception {

		for (String prog : subjectsQuixBugs) {
			generateAndRunEvoTests(out, prog, seed);
		}

	}

	/**
	 * 
	 * @param patchesDir
	 *            path to dir where the patches bytecode are located
	 * @param testLocation
	 *            patchesDir path to dir where the tests bytecode are located
	 * @param programToRepair
	 *            name of the program to repair
	 * @return
	 * @throws IOException 
	 */
	public SummaryResults runEvosuiteAllSeedOnPatch(Path patchesDir, Path testLocation, String programToRepair) throws IOException {

		SummaryResults summaryResult = new SummaryResults(patchesDir.toString(),programToRepair);
		EvoTestGenerator generator = new EvoTestGenerator();
		File patchedVersionFolder = patchesDir.toFile();
		for (int seed : seeds) {
			System.out.println("Running " + programToRepair + " seed " + seed);

			File testFolderSeed = new File(
					testLocation + File.separator + "seed_" + seed + File.separator + "evosuite-tests");
			if (testFolderSeed.exists()) {
				LaucherJUnitProcess la = new LaucherJUnitProcess();
				generator.compileProgram(patchedVersionFolder.getAbsolutePath() , programToRepair);
				TestResult testResult = la.execute(
						patchedVersionFolder.getAbsolutePath() + File.pathSeparator + testFolderSeed.getAbsolutePath()
								+ File.pathSeparator + System.getProperty("java.class.path"),
						"java_programs." + programToRepair.toUpperCase() + "_ESTest", testFolderSeed.getAbsolutePath());

				summaryResult.addResultForSeed(testResult);
				System.out.println("Results for " + programToRepair + " seed " + seed + ": " + testResult);
				

			} else {
				System.out.println("Any folder at " + testFolderSeed.getAbsolutePath());
			}

		}
		outputResult(summaryResult);
		return summaryResult;

	}

	private void outputResult(SummaryResults summaryResult) {
		
		FileWriter fw = null;		
		try {
			  fw = new FileWriter("report.txt",true); 
			  fw.write(System.getProperty("line.separator"));
			  fw.write(new Date().toString() + " - Analyzing patched program: "+summaryResult.getProgramName() + " under path "+ summaryResult.getPatchPath());
			  fw.write(System.getProperty("line.separator"));
			  if(summaryResult.isCorrect()) {
				  fw.write("passed all tests ");
			  } else {
				  fw.write("failed tests number: "+summaryResult.getFailing().size());
			  }
			  fw.flush();			
		} catch (Exception e) {
			System.out.println("An error in generating a evosuit running result report.");
		} finally {
			 if (fw != null)  {
				 try {
					fw.close();
				} catch (IOException e) {
					System.out.println("failed to close file writer stream");
				}
			 }
	                
		}
        
		
	}

	public void generateTest4AllProgramsAllSeed(String outDir) throws Exception {

		for (String programToRepair : subjectsQuixBugs) {

			generateTestsAllForProgram(outDir, programToRepair);

		}

	}

	private void generateTestsAllForProgram(String outDir, String prog) throws Exception, IOException {
		for (int seed : seeds) {
			System.out.println("****Seed " + seed + " of program " + prog);
			generateAndRunEvoTests(outDir, prog, seed);
		}
	}

	public boolean generateAndRunEvoTests(String outDir, String prog, int seed) throws Exception, IOException {
		EvoTestGenerator ev = new EvoTestGenerator();
		System.out.println("Running " + prog + " seed " + seed);
		boolean useDSE = false;
		int timeout = 60;

		boolean generated = ev.runEvosuite("java_programs" + "." + prog.toUpperCase(), new File(".").getAbsolutePath(),
				outDir, seed, timeout, useDSE);

		File fESout = new File(outDir + File.separator + "seed_" + seed + File.separator + "evosuite-tests");

		ev.compileEvoSuiteTest(fESout.getAbsolutePath(), prog);

		LaucherJUnitProcess la = new LaucherJUnitProcess();

		TestResult testsResults = la.execute(
				fESout.getAbsolutePath() + File.pathSeparator + System.getProperty("java.class.path"),
				"java_programs." + prog.toUpperCase() + "_ESTest", fESout.getAbsolutePath());
		System.out.println("Results for " + prog + " seed " + seed + ": " + testsResults);
		return testsResults.areAllTestsPassing();
	}

	public boolean checkDeterministic(String testLocation, String programToRepair) throws Exception, IOException {
		int times = 10;
		boolean sameresults = true;

		for (int seed : seeds) {
			System.out.println("Running " + programToRepair + " seed " + seed);

			File fESout = new File(testLocation + File.separator + "seed_" + seed + File.separator + "evosuite-tests");
			if (fESout.exists()) {
				LaucherJUnitProcess la = new LaucherJUnitProcess();
				TestResult lastResult = null;
				// boolean sameresults = true;
				for (int i = 0; i < times; i++) {
					TestResult tr = la.execute(
							fESout.getAbsolutePath() + File.pathSeparator + System.getProperty("java.class.path"),
							"java_programs." + programToRepair.toUpperCase() + "_ESTest", fESout.getAbsolutePath());
					System.out
							.println("Results for " + programToRepair + " seed " + seed + " at time " + i + ": " + tr);
					if (lastResult != null) {
						sameresults &= (lastResult.equals(tr));
					}
					lastResult = tr;
				}
				System.out.println("check deterministic  " + programToRepair + " seed " + seed + ": " + sameresults);
				if (!sameresults) {
					System.out
							.println("Error not deterministic tests for program " + programToRepair + " seed " + seed);
					return false;
				}
			} else {
				System.out.println("Alert:  Seed not exist " + seed);
			}
		}
		return sameresults;
	}

	public void generateTestAllSeedMultithread(String outDir, int numThreads) throws Exception {

		ExecutorService exec = Executors.newFixedThreadPool(numThreads);

		for (String programToRepair : subjectsQuixBugs) {

			for (int seed : seeds) {
				System.out.println("****Registering Seed " + seed + " of program " + programToRepair);
				// runGeneration(out, prog, seed);
				EVRunner evrunner = new EVRunner(outDir, seed, programToRepair);
				exec.execute(evrunner);

			}

		}
		exec.shutdown();
		try {
			if (!exec.awaitTermination(10, TimeUnit.HOURS)) {
				exec.shutdownNow();
			}
		} catch (InterruptedException e) {
			exec.shutdownNow();
		}
	}

	public void runAllResults(File patchDirectory, File generatedTest) {

	}

}
