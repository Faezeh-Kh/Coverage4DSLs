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
	
	private HashMap<EObject, String> branch_tsCoverageStatus;
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
		if (!branch_tsCoverageStatus.isEmpty()) {
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
		}else {
			for (int i=0; i<tcCoverageObj.getTcObjectCoverageStatus().size(); i++) {
				String tcCoverage = tcCoverageObj.getTcObjectCoverageStatus().get(i);
				if (tcCoverage == TDLCoverageUtil.COVERED & tsObjectCoverageStatus.get(i) != TDLCoverageUtil.COVERED) {
					tsObjectCoverageStatus.set(i, TDLCoverageUtil.COVERED);
				}
			}
		}
	}
	
	private void computeBranchCoverage(TDLTestCaseCoverage tcCoverageObj) {
		if (branch_tsCoverageStatus == null) {
			branch_tsCoverageStatus = new HashMap<>();
			coverageOfBranches = new ArrayList<>();
			branchCoverageOverallResult = new ObjectCoverageStatus();
		}
		
		branchCoverageOverallResult.getCoverage().add(tcCoverageObj.getTcBranchCoveragePercentage() + "");
		//if it is the first test case, copy the whole test case object coverage status for the test suite
		if (branch_tsCoverageStatus.size() == 0) {
			branch_tsCoverageStatus.putAll(tcCoverageObj.getTcBranchCoverageStatus());
		}else {
			for (Entry<EObject, String> branch_tcCoverage:tcCoverageObj.getTcBranchCoverageStatus().entrySet()) {
				EObject branchObject = branch_tcCoverage.getKey();
				String branchObjectCoverage = branch_tcCoverage.getValue();
				if (branchObjectCoverage == TDLCoverageUtil.COVERED 
						& branch_tsCoverageStatus.get(branchObject) != TDLCoverageUtil.COVERED) {
					branch_tsCoverageStatus.put(branchObject, TDLCoverageUtil.COVERED);
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
		System.out.println("Test suite coverage: " + 
				numOfCoveredObjs + "/" + numOfCoverableElements + " = " + tsObjectCoveragePercentage +"%");
	
	}

	public void calculateBranchCoveragePercentage() {
		int numOfBranches = branch_tsCoverageStatus.size();
		int numOfCoveredBranches = (int) branch_tsCoverageStatus.values().stream()
				.filter(coverage -> coverage == TDLCoverageUtil.COVERED).count();
		tsBranchCoveragePercentage = (double)(numOfCoveredBranches*100)/numOfBranches;
		try {
			BigDecimal bd = new BigDecimal(tsBranchCoveragePercentage).setScale(2, RoundingMode.HALF_UP);
			tsBranchCoveragePercentage = bd.doubleValue();
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException:" + tsBranchCoveragePercentage);
		}
		System.out.println("Test suite Branch coverage: " + 
				numOfCoveredBranches + "/" + numOfBranches + " = " + tsBranchCoveragePercentage +"%");
	}
	
	public void setObjectCoverageInfos() {
		List<EObject> modelObjects = this.modelObjects;
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
		//if there is branch coverage information, set data for that too
		if (branchCoverageOverallResult != null) {
			for (Entry <EObject, String> branch_coverage : branch_tsCoverageStatus.entrySet()) {
				EObject branchObject = branch_coverage.getKey();
				ObjectCoverageStatus branchCoverage = new ObjectCoverageStatus();
				branchCoverage.setModelObject(branchObject);
				branchCoverage.setMetaclass(branchObject.eClass());
				for (TDLTestCaseCoverage tcCoverageObj : tcCoverages) {
					String tcBranchCoverage = tcCoverageObj.getTcBranchCoverageStatus().get(branchObject);
					branchCoverage.getCoverage().add(tcBranchCoverage);
				}
				String tsBranchCoverage = branch_coverage.getValue();
				branchCoverage.getCoverage().add(tsBranchCoverage);
				coverageOfBranches.add(branchCoverage);
			}
			//add the overall result as the last row of the info array
			branchCoverageOverallResult.setMetaclass(null);
			branchCoverageOverallResult.setModelObject(null);
			coverageOfBranches.add(branchCoverageOverallResult);
		}
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
