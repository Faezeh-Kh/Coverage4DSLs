package coverage.computation;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.etsi.mts.tdl.Package;

import coverage.report.ObjectCoverageStatus;
import coverage.report.TestCoverageReport;

public class TDLTestSuiteCoverage {

	private Package testSuite;
	private List<TDLTestCaseCoverage> tcCoverages;

	private List<TestCoverageReport> coverageReports;
	private List<List<ObjectCoverageStatus>> tsCoverageInfos;
	
	public TDLTestSuiteCoverage() {
		tcCoverages = new ArrayList<>();
		coverageReports = new ArrayList<>();
	}
	
	//for every test case of the test suite, add its coverage to the list
	public void addTCCoverage(TDLTestCaseCoverage tcCoverage) {
		tcCoverages.add(tcCoverage);
	}
	
	//Calculating coverage of the test suite based on its test cases coverage
	public void calculateTSCoverage() {
		//for each test case, calculate coverage using the generic tool
		//if the DSL provides a dsl-specific coverage tool, call its methods: ignoring model objects, retrieving coverage rules
		for (TDLTestCaseCoverage tcCoverageObj : tcCoverages) {
			if (TDLCoverageUtil.getInstance().getDslSpecificCoverageExtension() != null) {
				TDLCoverageUtil.getInstance().getDslSpecificCoverageExtension().ignoreModelObjects(tcCoverageObj.getMUTResource());
			}
			tcCoverageObj.calculateTCCoverage();
			tcCoverageObj.getCoverageReports().forEach(report -> updateTestSuiteReport(report));
		}
		for (TestCoverageReport report:coverageReports) {
			report.computeCoveragePercentage();
			report.printCoverageResult(getTestSuiteName());
		}
		createCoverageInfos();
	}
	
	private void updateTestSuiteReport(TestCoverageReport tcCoverageReport) {
		TestCoverageReport tsCoverageReport;
		//if there is no report or no report with the same title, create a new report
		if (coverageReports.isEmpty() || !coverageReports.stream().anyMatch(r -> r.getReportTitle().equals(tcCoverageReport.getReportTitle()))) {
			tsCoverageReport = new TestCoverageReport(tcCoverageReport.getReportTitle());
			tsCoverageReport.setObjects(tcCoverageReport.getObjects());
			tsCoverageReport.setObjectCoverageStatus(tcCoverageReport.getObjectCoverageStatus());
			coverageReports.add(tsCoverageReport);
		}else {
			tsCoverageReport = coverageReports.stream().filter(r -> r.getReportTitle().equals(tcCoverageReport.getReportTitle())).findFirst().get();
			for (int i=0; i<tcCoverageReport.getObjectCoverageStatus().size(); i++) {
				String tcCoverage = tcCoverageReport.getObjectCoverageStatus().get(i);
				if (tcCoverage == TDLCoverageUtil.COVERED & tsCoverageReport.getObjectCoverageStatus().get(i) != TDLCoverageUtil.COVERED) {
					tsCoverageReport.getObjectCoverageStatus().set(i, TDLCoverageUtil.COVERED);
				}
			}
			
		}
	}
	
	public void createCoverageInfos() {
		tsCoverageInfos = new ArrayList<>();
		for (TestCoverageReport tsReport:coverageReports) {
			List<ObjectCoverageStatus> coverageInfo4Objects = new ArrayList<>();
			ObjectCoverageStatus percentageInfo = new ObjectCoverageStatus();
			percentageInfo.setMetaclass(null);
			percentageInfo.setModelObject(null);
			//for each model object, the coverage information must be set
			for (int i=0; i<tsReport.getObjects().size(); i++) {
				ObjectCoverageStatus objectCoverage = new ObjectCoverageStatus();
				objectCoverage.setModelObject(tsReport.getObjects().get(i));
				objectCoverage.setMetaclass(tsReport.getObjects().get(i).eClass());
				for (TDLTestCaseCoverage tcCoverageObj : tcCoverages) {
					TestCoverageReport tcReport = tcCoverageObj.getTcCoverageRepot(tsReport.getReportTitle());
					String tcCoverage = tcReport.getObjectCoverageStatus().get(i);
					objectCoverage.getCoverage().add(tcCoverage);
				}
				objectCoverage.getCoverage().add(tsReport.getObjectCoverageStatus().get(i));
				
				coverageInfo4Objects.add(objectCoverage);
			}
			//add the overall result as the last row of the info array
			for (TDLTestCaseCoverage tcCoverageObj : tcCoverages) {
				TestCoverageReport tcReport = tcCoverageObj.getTcCoverageRepot(tsReport.getReportTitle());
				percentageInfo.getCoverage().add(tcReport.getCoveragePercentage()+"");
			}
			percentageInfo.getCoverage().add(tsReport.getCoveragePercentage()+"");
			coverageInfo4Objects.add(percentageInfo);
			tsCoverageInfos.add(coverageInfo4Objects);
		}
	}
	
	public Package getTestSuite() {
		return testSuite;
	}
	
	public void setTestSuite(Package testSuite) {
		this.testSuite = testSuite;
	}
	
	public String getTestSuiteName() {
		return testSuite.getName();
	}

	public List<TDLTestCaseCoverage> getTcCoverages() {
		return tcCoverages;
	}

	public List<TestCoverageReport> getCoverageReports() {
		return coverageReports;
	}

	public List<List<ObjectCoverageStatus>> getTsCoverageInfos() {
		return tsCoverageInfos;
	}

	public boolean isCoverageComputed() {
		return coverageReports.isEmpty()? false:true;
	}
	
	public TestCoverageReport getTsCoverageRepot(String reportTitle) {
		try {
			return coverageReports.stream()
					.filter(r -> r.getReportTitle().equals(reportTitle)).findFirst().get();
		}
		catch (NoSuchElementException e) {
			return null;
		}
	}
	
	public List<ObjectCoverageStatus> getTsCoverageInfo(String reportTitle) {
		try {
			return tsCoverageInfos.get(coverageReports.indexOf(getTsCoverageRepot(reportTitle)));
		}catch (NoSuchElementException e) {
			return getTsCoverageInfo(TDLCoverageUtil.TRACEBASEDCOVERAGE);
		}
		
	}
}
