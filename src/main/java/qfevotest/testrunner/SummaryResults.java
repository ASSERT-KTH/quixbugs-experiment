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
	String patchPath;
	String programName;
	String patchDiff;
	String reportName;


	public SummaryResults(String patchedProgramPath, String programName) {
		this.patchPath = patchedProgramPath;
		this.programName = programName;
	}
	
	public SummaryResults(String patchedProgramPath, String programName, String patchDiff) {
		this.patchPath = patchedProgramPath;
		this.programName = programName;
		this.patchDiff = patchDiff;
	}
	
	

	public List<TestResult> getResult() {
		return result;
	}

	public void addResultForSeed(TestResult tr) {
		this.result.add(tr);
	}

	public void setResult(List<TestResult> result) {
		this.result = result;
	}

	public Boolean isCorrect() {
		if(result.size()==0) {
			return null;
		}
		for (TestResult testResult : result) {
			if (testResult != null && !testResult.areAllTestsPassing()) {
				return false;
			}
		}
		
		return true;
	}

	public List<TestResult> getFailing() {
		return this.result.stream().filter(e -> e != null && !e.areAllTestsPassing()).collect(Collectors.toList());

	}

	public String getPatchPath() {
		return patchPath;
	}
	
	public int getFailingNumber() {		
		int  num=0;
		for(TestResult tr: result) {
			num+=tr.getFailureCount();
		}		
		return num;
	}
	
	
	
	public int getTotalNumber() {
		int num = 0;
		for(TestResult tr: result) {
			num+=tr.getCasesExecuted();
		}		
		return num;
	}
	
	public String getFailingInfo() {		
		String  failingInfo="";
		for(TestResult tr: result) {
			failingInfo+=tr.failTest.toString();
		}		
		return failingInfo;
	}
	
	

	public void setPatchPath(String patchPath) {
		this.patchPath = patchPath;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getPatchDiff() {
		return patchDiff;
	}

	public void setPatchDiff(String patchDiff) {
		this.patchDiff = patchDiff;
	}
	
	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

}
