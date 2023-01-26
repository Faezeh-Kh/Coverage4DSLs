package coverage.computation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.etsi.mts.tdl.Package;

public class TDLTestSuiteCoverage {

	private Package testSuite;
	private List<TDLTestCaseCoverage> tcCoverages;

	private List<EObject> modelObjects;
	private List<String> tsObjectCoverageStatus;
	double tsObjectCoveragePercentage;
	
	public List<ObjectCoverageStatus> coverageOfModelObjects;
	private ObjectCoverageStatus objectCoverageOverallResult;
	
	private List<EObject> branchObjects;
	private List<String> tsBranchCoverageStatus;
	double tsBranchCoveragePercentage;
	
	public List<ObjectCoverageStatus> coverageOfBranches;
	private ObjectCoverageStatus branchCoverageOverallResult;
	
	public TDLTestSuiteCoverage() {
		tcCoverages = new ArrayList<>();
		modelObjects = new ArrayList<>();
		
		tsObjectCoverageStatus = new ArrayList<>();
		tsObjectCoveragePercentage = 0;

		coverageOfModelObjects = new ArrayList<>();
		objectCoverageOverallResult = new ObjectCoverageStatus();
	}
	//for every test case of the test suite, add its coverage to the list
	public void addTCCoverage(TDLTestCaseCoverage tcCoverage) {
		this.tcCoverages.add(tcCoverage);
	}
	public List<TDLTestCaseCoverage> getTCCoverages() {
		return this.tcCoverages;
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
			
			computeModelElementCoverage(tcCoverageObj);
			
			if (tcCoverageObj.hasBranchCoverageInformation()) {
				computeBranchCoverage(tcCoverageObj);
			}
		}
		if (!tsObjectCoverageStatus.isEmpty()) {
			calculateObjectCoveragePercentage();
			setObjectCoverageInfos();
		}
		if (tsBranchCoverageStatus != null && !tsBranchCoverageStatus.isEmpty()) {
			calculateBranchCoveragePercentage();
			setBranchCoverageInfos();
		}
	}
	
	private void computeModelElementCoverage(TDLTestCaseCoverage tcCoverageObj) {
		objectCoverageOverallResult.getCoverage().add(tcCoverageObj.getTcObjectCoveragePercentage() + "");
		//if it is the first test case, copy the whole test case object coverage status for the test suite
		if (tsObjectCoverageStatus.size() == 0) {
			modelObjects.addAll(tcCoverageObj.getModelObjects());
			tsObjectCoverageStatus.addAll(tcCoverageObj.getTcObjectCoverageStatus());
		}
		else {
			for (int i=0; i<tcCoverageObj.getTcObjectCoverageStatus().size(); i++) {
				String tcCoverage = tcCoverageObj.getTcObjectCoverageStatus().get(i);
				if (tcCoverage == TDLCoverageUtil.COVERED & tsObjectCoverageStatus.get(i) != TDLCoverageUtil.COVERED) {
					tsObjectCoverageStatus.set(i, TDLCoverageUtil.COVERED);
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
	
	public void calculateObjectCoveragePercentage() {
		int numOfCoveredObjs = 0;
		int numOfNotCoverableElements = 0;
		for (String coverage:tsObjectCoverageStatus) {
			if (coverage == TDLCoverageUtil.NOT_TRACED) {
				numOfNotCoverableElements++;
			}
			else if (coverage == TDLCoverageUtil.COVERED) {
				numOfCoveredObjs++;
			}
		}
		int numOfCoverableElements = tsObjectCoverageStatus.size() - numOfNotCoverableElements;
		tsObjectCoveragePercentage = (double)(numOfCoveredObjs*100)/numOfCoverableElements;
		try {
			BigDecimal bd = new BigDecimal(tsObjectCoveragePercentage).setScale(2, RoundingMode.HALF_UP);
			tsObjectCoveragePercentage = bd.doubleValue();
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException:" + tsBranchCoveragePercentage);
		}
		objectCoverageOverallResult.getCoverage().add(tsObjectCoveragePercentage + "");
		System.out.println("Test suite model element coverage: " + 
				numOfCoveredObjs + "/" + numOfCoverableElements + " = " + tsObjectCoveragePercentage +"%");
	
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
		System.out.println("Test suite branch coverage: " + 
				numOfCoveredBranches + "/" + numOfBranches + " = " + tsBranchCoveragePercentage +"%");
	}
	
	public void setObjectCoverageInfos() {
		//for each model object, the coverage information must be set
		for (int i=0; i<modelObjects.size(); i++) {
			ObjectCoverageStatus objectCoverage = new ObjectCoverageStatus();
			objectCoverage.setModelObject(modelObjects.get(i));
			objectCoverage.setMetaclass(modelObjects.get(i).eClass());
			for (TDLTestCaseCoverage tcCoverageObj : tcCoverages) {
				String tcCoverage = tcCoverageObj.getTcObjectCoverageStatus().get(i);
				objectCoverage.getCoverage().add(tcCoverage);
			}
			String tsCoverage = tsObjectCoverageStatus.get(i);
			objectCoverage.getCoverage().add(tsCoverage);
			coverageOfModelObjects.add(objectCoverage);
		}
		//add the overall result as the last row of the info array
		objectCoverageOverallResult.setMetaclass(null);
		objectCoverageOverallResult.setModelObject(null);
		coverageOfModelObjects.add(objectCoverageOverallResult);
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
	
	public List<ObjectCoverageStatus> getCoverageOfModelObjects(){
		return this.coverageOfModelObjects;
	}
	
	public List<ObjectCoverageStatus> getCoverageOfBranches() {
		return coverageOfBranches;
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
	public List<EObject> getModelObjects() {
		return modelObjects;
	}
	public List<TDLTestCaseCoverage> getTcCoverages() {
		return tcCoverages;
	}
	public double getTsCoveragePercentage() {
		return tsObjectCoveragePercentage;
	}
	public List<String> getTsObjectCoverageStatus() {
		return tsObjectCoverageStatus;
	}
}
