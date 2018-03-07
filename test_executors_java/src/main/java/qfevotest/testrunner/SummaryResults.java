package qfevotest.testrunner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Matias Martinez
 *
 */
public class SummaryResults {
	// One results for seed
	List<TestResult> result = new ArrayList<>();

	public List<TestResult> getResult() {
		return result;
	}

	public void addResultForSeed(TestResult tr) {
		this.result.add(tr);
	}

	public void setResult(List<TestResult> result) {
		this.result = result;
	}

	public boolean isCorrect() {
		for (TestResult testResult : result) {
			if (!testResult.areAllTestsPassing()) {
				return false;
			}
		}
		return true;
	}

	public List<TestResult> getFailing() {
		return this.result.stream().filter(e -> !e.areAllTestsPassing()).collect(Collectors.toList());

	}
}
