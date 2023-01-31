package coverage.computation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.etsi.mts.tdl.Package;

public class TDLTestSuiteCoverage {

	private Package testSuite;
	private List<TDLTestCaseCoverage> tcCoverages;

	private List<EObject> modelObjects;
	private List<String> tsObjectCoverageStatusByTrace;
	double tsCoveragePercentageByTrace;
	
	private List<String> tsObjectCoverageStatus4me;
	double tsCoveragePercentage4me;
	
	private List<EObject> branchObjects;
	private List<String> tsBranchCoverageStatus;
	double tsBranchCoveragePercentage;
	
	public List<ObjectCoverageStatus> coverageOfModelObjectsByTrace;
	private ObjectCoverageStatus objectCoverageOverallResultByTrace;
	public List<ObjectCoverageStatus> coverageOfModelObjects4me;
	private ObjectCoverageStatus objectCoverageOverallResult4me;
	public List<ObjectCoverageStatus> coverageOfBranches;
	private ObjectCoverageStatus branchCoverageOverallResult;
	
	public TDLTestSuiteCoverage() {
		tcCoverages = new ArrayList<>();
		modelObjects = new ArrayList<>();
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
			
			computeCoverageByTrace(tcCoverageObj);
			
			if (tcCoverageObj.hasModelElementCoverage()) {
				computeModelElementCoverage(tcCoverageObj);
			}
			if (tcCoverageObj.hasBranchCoverage()) {
				computeBranchCoverage(tcCoverageObj);
			}
		}
		
		calculateObjectCoveragePercentage(TDLTestCaseCoverage.TRACEBASEDCOVERAGE);
		setObjectCoverageInfosByTrace();
		
		if (tsObjectCoverageStatus4me != null && !tsObjectCoverageStatus4me.isEmpty()) {
			calculateObjectCoveragePercentage(TDLTestCaseCoverage.MODELELEMENTCOVERAGE);
			setObjectCoverageInfos();
		}
		if (tsBranchCoverageStatus != null && !tsBranchCoverageStatus.isEmpty()) {
			calculateBranchCoveragePercentage();
			setBranchCoverageInfos();
		}
	}
	
	private void computeCoverageByTrace(TDLTestCaseCoverage tcCoverageObj) {
		if (tsObjectCoverageStatusByTrace == null) {
			tsObjectCoverageStatusByTrace = new ArrayList<>();
			objectCoverageOverallResultByTrace = new ObjectCoverageStatus();
		}
		objectCoverageOverallResultByTrace.getCoverage().add(tcCoverageObj.getTcCoveragePercentageByTrace() + "");
		//if it is the first test case, copy the whole test case object coverage status for the test suite
		if (tsObjectCoverageStatusByTrace.size() == 0) {
			modelObjects.addAll(tcCoverageObj.getAllModelObjects());
			tsObjectCoverageStatusByTrace.addAll(tcCoverageObj.getTcObjectCoverageStatusByTrace());
		}
		else {
			for (int i=0; i<tcCoverageObj.getTcObjectCoverageStatusByTrace().size(); i++) {
				String tcCoverage = tcCoverageObj.getTcObjectCoverageStatusByTrace().get(i);
				if (tcCoverage == TDLCoverageUtil.COVERED & tsObjectCoverageStatusByTrace.get(i) != TDLCoverageUtil.COVERED) {
					tsObjectCoverageStatusByTrace.set(i, TDLCoverageUtil.COVERED);
				}
			}
		}
	}

	private void computeModelElementCoverage(TDLTestCaseCoverage tcCoverageObj) {
		if (tsObjectCoverageStatus4me == null) {
			tsObjectCoverageStatus4me = new ArrayList<>();
			objectCoverageOverallResult4me = new ObjectCoverageStatus();
		}
		objectCoverageOverallResult4me.getCoverage().add(tcCoverageObj.getTcMECoveragePercentage() + "");
		//if it is the first test case, copy the whole test case object coverage status for the test suite
		if (tsObjectCoverageStatus4me.size() == 0) {
			tsObjectCoverageStatus4me.addAll(tcCoverageObj.getTcObjectCoverageStatus4me());
		}
		else {
			for (int i=0; i<tcCoverageObj.getTcObjectCoverageStatus4me().size(); i++) {
				String tcCoverage = tcCoverageObj.getTcObjectCoverageStatus4me().get(i);
				if (tcCoverage == TDLCoverageUtil.COVERED & tsObjectCoverageStatus4me.get(i) != TDLCoverageUtil.COVERED) {
					tsObjectCoverageStatus4me.set(i, TDLCoverageUtil.COVERED);
				}
			}
		}
	}
	
	private void computeBranchCoverage(TDLTestCaseCoverage tcCoverageObj) {
		if (tsBranchCoverageStatus == null) {
			branchObjects = new ArrayList<>();
			tsBranchCoverageStatus = new ArrayList<>();
			coverageOfBranches = new ArrayList<>();
			branchCoverageOverallResult = new ObjectCoverageStatus();
		}
		
		branchCoverageOverallResult.getCoverage().add(tcCoverageObj.getTcBranchCoveragePercentage() + "");
		//if it is the first test case, copy the whole test case object coverage status for the test suite
		if (tsBranchCoverageStatus.size() == 0) {
			branchObjects.addAll(tcCoverageObj.getBranchObjects());
			tsBranchCoverageStatus.addAll(tcCoverageObj.getTcBranchCoverageStatus());
		}
		else {
			for (int i=0; i<tcCoverageObj.getTcBranchCoverageStatus().size(); i++) {
				String tcCoverage = tcCoverageObj.getTcBranchCoverageStatus().get(i);
				if (tcCoverage == TDLCoverageUtil.COVERED & tsBranchCoverageStatus.get(i) != TDLCoverageUtil.COVERED) {
					tsBranchCoverageStatus.set(i, TDLCoverageUtil.COVERED);
				}
			}
		}
	}
	
	public void calculateObjectCoveragePercentage(String metric) {
		if (metric == TDLTestCaseCoverage.TRACEBASEDCOVERAGE) {
			tsCoveragePercentageByTrace = computeCoveragePercentage(tsObjectCoverageStatusByTrace, metric);
			objectCoverageOverallResultByTrace.getCoverage().add(tsCoveragePercentageByTrace + "");
		}
		else if (metric == TDLTestCaseCoverage.MODELELEMENTCOVERAGE) {
			tsCoveragePercentage4me = computeCoveragePercentage(tsObjectCoverageStatus4me, metric);
			objectCoverageOverallResult4me.getCoverage().add(tsCoveragePercentage4me + "");
		}
		else if (metric == TDLTestCaseCoverage.BRANCHCOVERAGE) {
			calculateBranchCoveragePercentage();
		}
		
	}
	
	private double computeCoveragePercentage(List<String> coverageStatus, String metric) {
		int numOfCoveredObjs = 0;
		int numOfNotCoverableElements = 0;
		for (String coverage:coverageStatus) {
			if (coverage == TDLCoverageUtil.NOSTATUS) {
				numOfNotCoverableElements++;
			}
			else if (coverage == TDLCoverageUtil.COVERED) {
				numOfCoveredObjs++;
			}
		}
		int numOfCoverableElements = coverageStatus.size() - numOfNotCoverableElements;
		double percentage = (double)(numOfCoveredObjs*100)/numOfCoverableElements;
		try {
			BigDecimal bd = new BigDecimal(percentage).setScale(2, RoundingMode.HALF_UP);
			percentage = bd.doubleValue();
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException:" + percentage);
		}
		System.out.println(testSuite.getName() + "-coverage-"+ metric + ": " + 
				numOfCoveredObjs + "/" + numOfCoverableElements + " = " + percentage +"%");
		return percentage;
	}

	public void calculateBranchCoveragePercentage() {
		int numOfBranches = tsBranchCoverageStatus.size();
		int numOfCoveredBranches = (int) tsBranchCoverageStatus.stream()
				.filter(coverage -> coverage == TDLCoverageUtil.COVERED).count();
		tsBranchCoveragePercentage = (double)(numOfCoveredBranches*100)/numOfBranches;
		try {
			BigDecimal bd = new BigDecimal(tsBranchCoveragePercentage).setScale(2, RoundingMode.HALF_UP);
			tsBranchCoveragePercentage = bd.doubleValue();
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException:" + tsBranchCoveragePercentage);
		}
		branchCoverageOverallResult.getCoverage().add(tsBranchCoveragePercentage + "");
		System.out.println("Test suite branch coverage: " + 
				numOfCoveredBranches + "/" + numOfBranches + " = " + tsBranchCoveragePercentage +"%");
	}
	
	public void setObjectCoverageInfosByTrace() {
		coverageOfModelObjectsByTrace = new ArrayList<>();
		//for each model object, the coverage information must be set
		for (int i=0; i<modelObjects.size(); i++) {
			ObjectCoverageStatus objectCoverage = new ObjectCoverageStatus();
			objectCoverage.setModelObject(modelObjects.get(i));
			objectCoverage.setMetaclass(modelObjects.get(i).eClass());
			for (TDLTestCaseCoverage tcCoverageObj : tcCoverages) {
				String tcCoverage = tcCoverageObj.getTcObjectCoverageStatusByTrace().get(i);
				objectCoverage.getCoverage().add(tcCoverage);
			}
			String tsCoverage = tsObjectCoverageStatusByTrace.get(i);
			objectCoverage.getCoverage().add(tsCoverage);
			coverageOfModelObjectsByTrace.add(objectCoverage);
		}
		//add the overall result as the last row of the info array
		objectCoverageOverallResultByTrace.setMetaclass(null);
		objectCoverageOverallResultByTrace.setModelObject(null);
		coverageOfModelObjectsByTrace.add(objectCoverageOverallResultByTrace);
	}
	
	public void setObjectCoverageInfos() {
		coverageOfModelObjects4me = new ArrayList<>();
		//for each model object, the coverage information must be set
		for (int i=0; i<modelObjects.size(); i++) {
			ObjectCoverageStatus objectCoverage = new ObjectCoverageStatus();
			objectCoverage.setModelObject(modelObjects.get(i));
			objectCoverage.setMetaclass(modelObjects.get(i).eClass());
			for (TDLTestCaseCoverage tcCoverageObj : tcCoverages) {
				String tcCoverage = tcCoverageObj.getTcObjectCoverageStatus4me().get(i);
				objectCoverage.getCoverage().add(tcCoverage);
			}
			String tsCoverage = tsObjectCoverageStatus4me.get(i);
			objectCoverage.getCoverage().add(tsCoverage);
			coverageOfModelObjects4me.add(objectCoverage);
		}
		//add the overall result as the last row of the info array
		objectCoverageOverallResult4me.setMetaclass(null);
		objectCoverageOverallResult4me.setModelObject(null);
		coverageOfModelObjects4me.add(objectCoverageOverallResult4me);
	}
	
	public void setBranchCoverageInfos() {
		for (int i=0; i<branchObjects.size(); i++) {
			ObjectCoverageStatus branchCoverage = new ObjectCoverageStatus();
			branchCoverage.setModelObject(branchObjects.get(i));
			branchCoverage.setMetaclass(branchObjects.get(i).eClass());
			for (TDLTestCaseCoverage tcCoverageObj : tcCoverages) {
				String tcBranchCoverage = tcCoverageObj.getTcBranchCoverageStatus().get(i);
				branchCoverage.getCoverage().add(tcBranchCoverage);
			}
			String tsBranchCoverage = tsBranchCoverageStatus.get(i);
			branchCoverage.getCoverage().add(tsBranchCoverage);
			coverageOfBranches.add(branchCoverage);
		}
		//add the overall result as the last row of the info array
		branchCoverageOverallResult.setMetaclass(null);
		branchCoverageOverallResult.setModelObject(null);
		coverageOfBranches.add(branchCoverageOverallResult);
	}
	
	public boolean hasModelElementCoverage () {
		return tsObjectCoverageStatus4me == null ? false:true;
	}
	
	public boolean hasBranchCoverage () {
		return tsBranchCoverageStatus == null ? false:true;
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

	public List<EObject> getModelObjects() {
		return modelObjects;
	}

	public List<String> getTsObjectCoverageStatusByTrace() {
		return tsObjectCoverageStatusByTrace;
	}

	public double getTsCoveragePercentageByTrace() {
		return tsCoveragePercentageByTrace;
	}

	public List<String> getTsObjectCoverageStatus4me() {
		return tsObjectCoverageStatus4me;
	}

	public double getTsCoveragePercentage4me() {
		return tsCoveragePercentage4me;
	}

	public List<EObject> getBranchObjects() {
		return branchObjects;
	}

	public List<String> getTsBranchCoverageStatus() {
		return tsBranchCoverageStatus;
	}

	public double getTsBranchCoveragePercentage() {
		return tsBranchCoveragePercentage;
	}

	public List<ObjectCoverageStatus> getCoverageOfModelObjectsByTrace() {
		return coverageOfModelObjectsByTrace;
	}

	public ObjectCoverageStatus getObjectCoverageOverallResultByTrace() {
		return objectCoverageOverallResultByTrace;
	}

	public List<ObjectCoverageStatus> getCoverageOfModelObjects4me() {
		return coverageOfModelObjects4me;
	}

	public ObjectCoverageStatus getObjectCoverageOverallResult4me() {
		return objectCoverageOverallResult4me;
	}

	public List<ObjectCoverageStatus> getCoverageOfBranches() {
		return coverageOfBranches;
	}

	public ObjectCoverageStatus getBranchCoverageOverallResult() {
		return branchCoverageOverallResult;
	}
}
