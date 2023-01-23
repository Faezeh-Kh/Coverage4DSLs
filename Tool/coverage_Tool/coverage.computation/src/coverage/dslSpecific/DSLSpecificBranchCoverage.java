package coverage.dslSpecific;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.eclipse.emf.ecore.EObject;

import DSLSpecificCoverage.Branch;
import DSLSpecificCoverage.BranchSpecification;
import coverage.computation.TDLTestCaseCoverage;
import coverage.utilities.OCLInterpreter;

public class DSLSpecificBranchCoverage {

	private HashMap<BranchSpecification, List<EObject>> branchingRule_contextObjects = new HashMap<>();
	private HashMap<EObject, ArrayList<EObject>> branchingRoot_branches = new HashMap<>();

	public DSLSpecificBranchCoverage(HashMap<BranchSpecification, List<EObject>> branchingRule_contextObjects) {
		this.branchingRule_contextObjects = branchingRule_contextObjects;
	}
	
	public void runBranchCoverageComputation(TDLTestCaseCoverage testCaseCoverage) {
		ArrayList<EObject> allBranches = new ArrayList<>();
		OCLInterpreter oclLauncher = new OCLInterpreter();
		//for every branching object, run the query specified by the rule to find its branches
		for(Entry<BranchSpecification, List<EObject>> rule_contextObjects:branchingRule_contextObjects.entrySet()) {
			for (EObject branchingRoot:rule_contextObjects.getValue()) {
				//because of the inheritance relationship, an object might be already added by other rules
				if (branchingRoot_branches.get(branchingRoot) == null) {
					branchingRoot_branches.put(branchingRoot, new ArrayList<>());
				}
				BranchSpecification branchingRule = rule_contextObjects.getKey();
				for (Branch branchSpecification:branchingRule.getBranches()) {
					String query2getBranch = branchSpecification.getQuery();
					ArrayList<EObject> queryResult = oclLauncher.runQuery(branchingRoot, query2getBranch.substring(1, query2getBranch.length()-1));
					if (queryResult != null && !queryResult.isEmpty()) {
						branchingRoot_branches.get(branchingRoot).addAll(queryResult);
						allBranches.addAll(queryResult);
					}					
				}
			}			
		}
		for(EObject object:testCaseCoverage.getModelObjects()) {
			if (allBranches.contains(object)) {
				testCaseCoverage.getTcBranchCoverageStatus().put(object, testCaseCoverage.getObjectCoverage(object));
			}
		}
	}

	public HashMap<BranchSpecification, List<EObject>> getBranchingRule_contextObjects() {
		return branchingRule_contextObjects;
	}

	public HashMap<EObject, ArrayList<EObject>> getBranchingRoot_branches() {
		return branchingRoot_branches;
	}
}
