package qfevotest.generator;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;

import qfevotest.generator.EvoTestGenerator;
import qfevotest.generator.QuixBugExtendedOracle;
import qfevotest.testrunner.LaucherJUnitProcess;
import qfevotest.testrunner.TestResult;
/**
 * Generation
 * @author Matias Martinez
 *
 */
public class EvoTestGeneratorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLisGenerateTest() throws Exception {
		EvoTestGenerator ev = new EvoTestGenerator();
		boolean useDSE = false;
		int timeoutSeconds = 60;
		int seed = 1;
		String packageName = "java_programs";
		boolean generated = ev.runEvosuite(packageName + "." + "DEPTH_FIRST_SEARCH", new File(".").getAbsolutePath(), "./out", seed,
				timeoutSeconds, useDSE);
		assertTrue(generated);
	}

	@Test
	public void testListGenerateCompileRun() throws Exception {
		EvoTestGenerator ev = new EvoTestGenerator();
		boolean useDSE = false;
		int timeout = 10;
		int seed = 1;
		boolean generated = ev.runEvosuite("java_programs.LIS", new File(".").getAbsolutePath(), "./out", seed, timeout,
				useDSE);
		assertTrue(generated);

		File fESout = new File("./out" + File.separator + "seed_" + seed + File.separator + "evosuite-tests");

		ev.compileEvoSuiteTest(fESout.getAbsolutePath(), "LIS");

		LaucherJUnitProcess la = new LaucherJUnitProcess();

		TestResult tr = la.execute(
				fESout.getAbsolutePath() + File.pathSeparator + System.getProperty("java.class.path"),
				"java_programs.LIS_ESTest", fESout.getAbsolutePath());
		System.out.println(tr);
	}
	
	
	@Test
	public void testPossibleChangeGenerateCompileRun() throws Exception {
		EvoTestGenerator ev = new EvoTestGenerator();
		boolean useDSE = false;
		int timeout = 60;
		int seed = 1;

		String programName  = "POSSIBLE_CHANGE";
		boolean generated = ev.runEvosuite("java_programs."+programName, new File(".").getAbsolutePath(), "./out", seed, timeout,
				useDSE);
		assertTrue(generated);

		File fESout = new File("./out" + File.separator + "seed_" + seed + File.separator + "evosuite-tests");

		ev.compileEvoSuiteTest(fESout.getAbsolutePath(), programName);

		LaucherJUnitProcess la = new LaucherJUnitProcess();

		TestResult tr = la.execute(
				fESout.getAbsolutePath() + File.pathSeparator + System.getProperty("java.class.path"),
				"java_programs."+programName
				+ "_ESTest", fESout.getAbsolutePath());
		System.out.println(tr);
		assertTrue(tr.areAllTestsPassing());
	}

	@Test
	public void testListOnlyRun() throws Exception {
		QuixBugExtendedOracle qb = new QuixBugExtendedOracle();
		int seed = 1;
		boolean success = qb.generateAndRunEvoTests("./out", "lis", seed);
		assertTrue(success);
		LaucherJUnitProcess la = new LaucherJUnitProcess();
		File fESout = new File("./out" + File.separator + "seed_" + seed + File.separator + "evosuite-tests");

		TestResult tr = la.execute(
				fESout.getAbsolutePath() + File.pathSeparator + System.getProperty("java.class.path"),
				"java_programs.LIS_ESTest", fESout.getAbsolutePath());
		System.out.println(tr);
		assertTrue(tr.areAllTestsPassing());
		assertEquals(5, tr.casesExecuted);
		assertEquals(0, tr.failures);

	}

	@Test
	public void testLisTestFailing() throws Exception {
		QuixBugExtendedOracle qb = new QuixBugExtendedOracle();
		int seed = 1;
		boolean success = qb.generateAndRunEvoTests("./out", "lis", seed);
		assertTrue(success);
		LaucherJUnitProcess la = new LaucherJUnitProcess();
		File fESout = new File("./out" + File.separator + "seed_test" + seed + File.separator + "evosuite-tests");

		EvoTestGenerator ev = new EvoTestGenerator();
		ev.compileEvoSuiteTest(fESout.getAbsolutePath(), "LIS");

		TestResult tr = la.execute(
				fESout.getAbsolutePath() + File.pathSeparator + System.getProperty("java.class.path"),
				"java_programs.LIS_ESTest", fESout.getAbsolutePath());
		System.out.println(tr);
		assertFalse(tr.areAllTestsPassing());
		assertEquals(6, tr.casesExecuted);
		assertEquals(1, tr.failures);

	}


	@Test
	public void testBitCountFailing1() throws Exception {
		int seed = 1;
		LaucherJUnitProcess la = new LaucherJUnitProcess();
		File fESout = new File("./out" + File.separator + "seed_" + seed + File.separator + "evosuite-tests");

		EvoTestGenerator ev = new EvoTestGenerator();
		ev.compileEvoSuiteTest(fESout.getAbsolutePath(), "BITCOUNT");

		TestResult tr = la.execute(
				fESout.getAbsolutePath() + File.pathSeparator + System.getProperty("java.class.path"),
				"java_programs.BITCOUNT_ESTest", fESout.getAbsolutePath());
		System.out.println(tr);
		assertTrue(tr.areAllTestsPassing());
		assertEquals(4, tr.casesExecuted);
		assertEquals(0, tr.failures);

	}

	
	@Test
	public void testLisPatchedFailing() throws Exception {
		
		QuixBugExtendedOracle qb = new QuixBugExtendedOracle();
		int seed = 1;
		boolean success = qb.generateAndRunEvoTests("./out", "lis", seed);
		assertTrue(success);
		
		EvoTestGenerator ev = new EvoTestGenerator();
			
		LaucherJUnitProcess la = new LaucherJUnitProcess();
		File fESout = new File("./out" + File.separator + "seed_" + seed + File.separator + "evosuite-tests");

	
		ev.compileEvoSuiteTest(fESout.getAbsolutePath(), "LIS");
		//Version with a seeded patch
		URL urlPatchTest = this.getClass().getClassLoader().getResource("testpatch1");
		File patchLocation = new File(urlPatchTest.getFile());
		System.out.println("Test patched version at "+patchLocation);
		ev.compileProgram(patchLocation.getAbsolutePath(), "LIS");
		
		TestResult tr = la
				.execute(
						patchLocation.getAbsolutePath() + File.pathSeparator + fESout.getAbsolutePath()
								+ File.pathSeparator + System.getProperty("java.class.path"),
						"java_programs.LIS_ESTest", fESout.getAbsolutePath());
		System.out.println(tr);
		assertFalse(tr.areAllTestsPassing());

	}
	
	
	


}
