package qfevotest.testrunner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Lauches a process and parses its output.
 * 
 * @author Matias Martinez, matias.martinez@inria.fr
 * 
 */
public class LaucherJUnitProcess {

	protected Logger log = Logger.getLogger(Thread.currentThread().getName());
	boolean avoidInterruption = false;

	public LaucherJUnitProcess(boolean avoidInterruption) {
		super();
		this.avoidInterruption = avoidInterruption;
	}

	public LaucherJUnitProcess() {
		this(false);
	}


	boolean outputInFile = true;

	public TestResult execute(String classpath, String test2Exec,  String location) {
		Process p = null;
		String jvmPath = "java";

		String newClasspath = classpath;

		try {
			File ftemp = null;
			if (outputInFile)
				ftemp = File.createTempFile("out", "txt");

			List<String> command = new ArrayList<String>();

			command.add(jvmPath);
			command.add("-Xmx2048m");
			command.add("-cp");
			command.add(newClasspath);
			command.add(laucherClassName().getCanonicalName());
			command.add(test2Exec);

			
			printCommandToExecute(command);

			ProcessBuilder pb = new ProcessBuilder("/bin/bash");

			if (outputInFile) {
				pb.redirectOutput(ftemp);
			} else
				pb.redirectOutput();
			pb.redirectErrorStream(true);
			pb.directory(new File(location));
			long t_start = System.currentTimeMillis();
			p = pb.start();

			BufferedWriter p_stdin = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));

			try {
				// Set up the timezone
				//String timeZone = ConfigurationProperties.getProperty("timezone");
				//p_stdin.write("TZ=\"" + timeZone + "\"");
				p_stdin.newLine();
				p_stdin.flush();
				p_stdin.write("export TZ");
				p_stdin.newLine();
				p_stdin.flush();
				p_stdin.write("echo $TZ");
				p_stdin.newLine();
				p_stdin.flush();
				// Writing the command
				p_stdin.write(toString(command));

				p_stdin.newLine();
				p_stdin.flush();

				// end
				p_stdin.write("exit");
				p_stdin.newLine();
				p_stdin.flush();

			} catch (IOException e) {
				System.out.println(e);
			}

			//
			p.waitFor(10, TimeUnit.MINUTES);

			if (!avoidInterruption) {
				// We force obtaining the exit value.
				p.exitValue();
			}

			BufferedReader output = null;
			if (outputInFile)
				output = new BufferedReader(new FileReader(ftemp.getAbsolutePath()));
			else
				output = new BufferedReader(new InputStreamReader(p.getInputStream()));
			TestResult tr = getTestResult(output);
			p.destroyForcibly();
			return tr;
		} catch (IOException | InterruptedException | IllegalThreadStateException ex) {
			log.info("The Process that runs JUnit test cases had problems: " + ex.getMessage());
			if (p != null)
				p.destroyForcibly();
		}
		return null;
	}

	private String getPath(Class<?> class1) {
		return new File(
				"./" + class1.getPackage().getName().replaceAll("\\.", "/") + "/" + class1.getSimpleName() + ".class")
						.getAbsolutePath();
	}

	protected String urlArrayToString(URL[] urls) {
		String s = "";
		for (int i = 0; i < urls.length; i++) {
			URL url = urls[i];
			s += url.getPath() + File.pathSeparator;
		}
		return s;
	}

	protected String getProcessError(InputStream str) {
		String out = "";
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(str));
			String line;
			while ((line = in.readLine()) != null) {
				out += line + "\n";
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return out;
	}

	private void printCommandToExecute(List<String> command) {
		String commandString = toString(command);
		String commandToPrint = commandString;
		System.out.println("Executing process: \n" + commandToPrint);
	}

	private String toString(List<String> command) {
		String commandString = command.toString().replace("[", "").replace("]", "").replace(",", " ");
		return commandString;
	}

	public Class laucherClassName() {
		return JUnitExternalExecutor.class;
	}

	/**
	 * This method analyze the output of the junit executor (i.e.,
	 * {@link JUnitTestExecutor}) and return an entity called TestResult with
	 * the result of the test execution
	 * 
	 * @param p
	 * @return
	 */
	protected TestResult getTestResult(BufferedReader in) {
		System.out.println("Analyzing output from process");
		TestResult tr = new TestResult();
		boolean success = false;
		String processOut = "";
		try {
			String line;
			while ((line = in.readLine()) != null) {
				processOut += line + "\n";
				if (line.startsWith(JUnitExternalExecutor.OUTSEP)) {
					String[] resultPrinted = line.split(JUnitExternalExecutor.OUTSEP);
					int nrtc = Integer.valueOf(resultPrinted[1]);
					tr.casesExecuted = nrtc;
					int nrfailing = Integer.valueOf(resultPrinted[2]);
					tr.failures = nrfailing;
					if (resultPrinted.length > 3 && !"".equals(resultPrinted[3])) {
						String[] failingTestList = resultPrinted[3].replace("[", "").replace("]", "").split(",");
						for (String failingTest : failingTestList) {
							failingTest = failingTest.trim();
							if (!failingTest.isEmpty() && !failingTest.equals("-"))
								tr.failTest.add(failingTest);
						}
					}
					success = true;
				}
			}
			// log.debug("Process output:\n"+ out);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (success)
			return tr;
		else {
			System.out.println("Error reading the validation process\n output: \n" + processOut);
			return null;
		}
	}

}
