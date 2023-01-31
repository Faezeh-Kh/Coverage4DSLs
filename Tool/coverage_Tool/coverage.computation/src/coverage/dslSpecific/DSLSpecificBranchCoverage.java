package coverage.dslSpecific;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
import coverage.utilities.OCLInterpreter;

public class DSLSpecificBranchCoverage {

	private DSLSpecificCoverageExecutor dslSpecificCoverageExecutor;
	private TDLTestCaseCoverage testCaseCoverage;
	private HashMap<BranchSpecification, List<EObject>> branchingRule_contextObjects;
	
	private HashMap<EObject, ArrayList<EObject>> branchingRoot_branches = new HashMap<>();
	private List<EObject> branchObjects;
	private List<String> tcBranchCoverageStatus;
	double tcBranchCoveragePercentage;
	
	public DSLSpecificBranchCoverage(DSLSpecificCoverageExecutor executor) {
		this.dslSpecificCoverageExecutor = executor;
		testCaseCoverage = executor.getTestCaseCoverage();
		branchingRule_contextObjects = executor.getBranchingRule_contextObjects();
	}
	
	public void runBranchCoverageComputation() {
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
								branchObjects.add(branchObject);
								tcBranchCoverageStatus.add(dslSpecificCoverageExecutor.getObjectCoverage(branchObject));
							}
						}	
					}
					else if(branch instanceof ImplicitBranch implicitBranch) {
						branchingRoot_branches.get(branchingRoot).add(implicitBranch);
						branchObjects.add(implicitBranch);
						//TODO: how to check if the implicit branch is covered
					}
				}
			}			
		}
		calculateBranchCoveragePercentage();
	}

	public void calculateBranchCoveragePercentage() {
		int numOfBranches = branchObjects.size();
		int numOfCoveredBranches = (int) tcBranchCoverageStatus.stream()
				.filter(coverage -> coverage == TDLCoverageUtil.COVERED).count();
		tcBranchCoveragePercentage = (double)(numOfCoveredBranches*100)/numOfBranches;
		try {
		BigDecimal bd = new BigDecimal(tcBranchCoveragePercentage).setScale(2, RoundingMode.HALF_UP);
		tcBranchCoveragePercentage = bd.doubleValue();
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException:" + tcBranchCoveragePercentage);
		}
		System.out.println(testCaseCoverage.getTestCaseName() + "-Branch coverage: " + 
				numOfCoveredBranches + "/" + numOfBranches + " = " + tcBranchCoveragePercentage +"%");
	}
	
	public HashMap<BranchSpecification, List<EObject>> getBranchingRule_contextObjects() {
		return branchingRule_contextObjects;
	}

	public HashMap<EObject, ArrayList<EObject>> getBranchingRoot_branches() {
		return branchingRoot_branches;
	}

	public List<EObject> getBranchObjects() {
		return branchObjects;
	}

	public List<String> getTcBranchCoverageStatus() {
		return tcBranchCoverageStatus;
	}

	public double getTcBranchCoveragePercentage() {
		return tcBranchCoveragePercentage;
	}
}
