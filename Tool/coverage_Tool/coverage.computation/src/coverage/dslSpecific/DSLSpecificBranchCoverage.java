package coverage.dslSpecific;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

import DSLSpecificCoverage.Branch;
import DSLSpecificCoverage.BranchSpecification;
import DSLSpecificCoverage.ExplicitBranch;
import DSLSpecificCoverage.ImplicitBranch;
import coverage.computation.TDLCoverageUtil;
import coverage.computation.TDLTestCaseCoverage;
import coverage.computation.TestCoverageReport;
import coverage.utilities.OCLInterpreter;

public class DSLSpecificBranchCoverage {

	private DSLSpecificCoverageExecutor dslSpecificCoverageExecutor;
	private TDLTestCaseCoverage testCaseCoverage;
	private HashMap<BranchSpecification, List<EObject>> branchingRule_contextObjects;
	
	private HashMap<EObject, ArrayList<EObject>> branchingRoot_branches = new HashMap<>();
	private TestCoverageReport tcBranchCoverageReport;
	
	public DSLSpecificBranchCoverage(DSLSpecificCoverageExecutor executor) {
		this.dslSpecificCoverageExecutor = executor;
		testCaseCoverage = executor.getTestCaseCoverage();
		branchingRule_contextObjects = executor.getBranchingRule_contextObjects();
	}
	
	public TestCoverageReport runBranchCoverageComputation() {
		tcBranchCoverageReport = new TestCoverageReport(TDLCoverageUtil.BRANCHCOVERAGE);
		tcBranchCoverageReport.setCoverableClasses(dslSpecificCoverageExecutor.getCoverableClasses());

		OCLInterpreter oclLauncher = new OCLInterpreter();
		//for every branching root, find its branches
		for(Entry<BranchSpecification, List<EObject>> rule_contextObjects:branchingRule_contextObjects.entrySet()) {
			for (EObject branchingRoot:rule_contextObjects.getValue()) {
				//because of the inheritance relationship, an object might be already added by other rules
				if (branchingRoot_branches.get(branchingRoot) == null) {
					branchingRoot_branches.put(branchingRoot, new ArrayList<>());
				}
				BranchSpecification branchingRule = rule_contextObjects.getKey();
				for (Branch branch:branchingRule.getBranches()) {
					if (branch instanceof ExplicitBranch explicitBranch) {
						String query2getBranch = explicitBranch.getOCLQuery();
						ArrayList<EObject> queryResult = oclLauncher.runQuery(branchingRoot, query2getBranch);
						if (queryResult != null && !queryResult.isEmpty()) {
							branchingRoot_branches.get(branchingRoot).addAll(queryResult);
							for (EObject branchObject:queryResult) {
								tcBranchCoverageReport.getObjects().add(branchObject);
								tcBranchCoverageReport.getObjectCoverageStatus().add(dslSpecificCoverageExecutor.getObjectCoverage(branchObject));
							}
						}	
					}
					else if(branch instanceof ImplicitBranch implicitBranch) {
						branchingRoot_branches.get(branchingRoot).add(implicitBranch);
						tcBranchCoverageReport.getObjects().add(implicitBranch);
						//TODO: how to check if the implicit branch is covered
						//tcBranchCoverageReport.getObjectCoverageStatus().add(?);
					}
				}
			}			
		}
		
		tcBranchCoverageReport.findNotCoverableObjects();
		tcBranchCoverageReport.computeCoveragePercentage();
		tcBranchCoverageReport.printCoverageResult(testCaseCoverage.getTestCaseName());
		
		return tcBranchCoverageReport;
	}
	
	public HashMap<BranchSpecification, List<EObject>> getBranchingRule_contextObjects() {
		return branchingRule_contextObjects;
	}

	public HashMap<EObject, ArrayList<EObject>> getBranchingRoot_branches() {
		return branchingRoot_branches;
	}

	public TestCoverageReport getTcBranchCoverageReport() {
		return tcBranchCoverageReport;
	}

	public List<EObject> getBranchObjects() {
		return tcBranchCoverageReport.getObjects();
	}

	public List<String> getTcBranchCoverageStatus() {
		return tcBranchCoverageReport.getObjectCoverageStatus();
	}

	public double getTcBranchCoveragePercentage() {
		return tcBranchCoverageReport.getCoveragePercentage();
	}
}
