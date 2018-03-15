package qfevotest.testrunner;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Matias Martinez, matias.martinez@inria.fr
 *
 */
public class TestResult {

	public int casesExecuted = 0;
	public int failures = 0;
	public List<String> successTest = new ArrayList<String>();

	public List<String> failTest = new ArrayList<String>();

	public List<String> getSuccessTest() {
		return successTest;
	}

	public void setSuccessTest(List<String> successTest) {
		this.successTest = successTest;
	}

	public List<String> getFailures() {
		return failTest;
	}

	public void setFailTest(List<String> failTest) {
		this.failTest = failTest;
	}

	public boolean areAllTestsPassing() {
		return failures == 0;
	}

	@Override
	public String toString() {
		return "TR: Success: " + (failures == 0) + ", failTest= " + failures + ", was successful: "
				+ this.areAllTestsPassing() + ", cases executed: " + casesExecuted + "] ," + this.failTest;
	}

	public int getFailureCount() {
		return failures;
	}

	public int getCasesExecuted() {
		return casesExecuted;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestResult other = (TestResult) obj;
		if (casesExecuted != other.casesExecuted)
			return false;
		if (failTest == null) {
			if (other.failTest != null)
				return false;
		} else if (!failTest.equals(other.failTest))
			return false;
		if (failures != other.failures)
			return false;
		return true;
	}

}
