package qfevotest.generator.multithread;

import qfevotest.generator.QuixBugExtendedOracle;

/**
 * 
 * @author Matias Martinez
 *
 */
public class EVRunner implements Runnable {

	String out;
	int seed;
	String program;

	public EVRunner(String out, int seed, String program) {
		super();
		this.out = out;
		this.seed = seed;
		this.program = program;
	}

	public void run() {
		QuixBugExtendedOracle generator = new QuixBugExtendedOracle();
		try {
			generator.generateAndRunEvoTests(out, program, seed);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
