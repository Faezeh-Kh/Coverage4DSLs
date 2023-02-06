package coverage.dslSpecific;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import DSLSpecificCoverage.Branch;
import DSLSpecificCoverage.BranchSpecification;
import DSLSpecificCoverage.ExplicitBranch;
import DSLSpecificCoverage.ImplicitBranch;
import coverage.computation.TDLCoverageUtil;
import coverage.computation.TDLTestCaseCoverage;
import coverage.report.TestCoverageReport;
import coverage.utilities.OCLInterpreter;

public class DSLSpecificBranchCoverage {

	private DSLSpecificCoverageExecutor dslSpecificCoverageExecutor;
	private TDLTestCaseCoverage testCaseCoverage;
	private HashMap<BranchSpecification, Set<EObject>> branchingRule_contextObjects;
	
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
		for(Entry<BranchSpecification, Set<EObject>> rule_contextObjects:branchingRule_contextObjects.entrySet()) {
			for (EObject branchingRoot:rule_contextObjects.getValue()) {
				//because of the inheritance relationship, an object might be already added by other rules
				if (branchingRoot_branches.get(branchingRoot) == null) {
					branchingRoot_branches.put(branchingRoot, new ArrayList<>());
				}
				List<String> branchesCoverageStatus = new ArrayList<>();
				for (Branch branch:rule_contextObjects.getKey().getBranches()) {
					if (branch instanceof ExplicitBranch explicitBranch) {
						String query2getBranch = explicitBranch.getOCLQuery();
						ArrayList<EObject> queryResult = oclLauncher.runQuery(branchingRoot, query2getBranch);
						if (queryResult != null && !queryResult.isEmpty()) {
							branchingRoot_branches.get(branchingRoot).addAll(queryResult);
							for (EObject branchObject:queryResult) {
								tcBranchCoverageReport.getObjects().add(branchObject);
								String objectCoverage = dslSpecificCoverageExecutor.getObjectCoverage(branchObject);
								tcBranchCoverageReport.getObjectCoverageStatus().add(objectCoverage);
								branchesCoverageStatus.add(objectCoverage);
							}
						}	
					}
					else if(branch instanceof ImplicitBranch implicitBranch) {
						String objectCoverage = computeImplicitBranchCoverage(branchingRoot);
						branchingRoot_branches.get(branchingRoot).add(implicitBranch);
						tcBranchCoverageReport.getObjects().add(implicitBranch);
						tcBranchCoverageReport.getObjectCoverageStatus().add(objectCoverage);
						branchesCoverageStatus.add(objectCoverage);
					}
				}
				//
//				tcBranchCoverageReport.getObjects().add(branchingRoot);
//				if (branchesCoverageStatus.contains(TDLCoverageUtil.NOSTATUS)) {
//					tcBranchCoverageReport.getObjectCoverageStatus().add(TDLCoverageUtil.NOSTATUS);
//				}
//				else if (branchesCoverageStatus.contains(TDLCoverageUtil.COVERED) 
//						&& branchesCoverageStatus.contains(TDLCoverageUtil.NOT_COVERED)) {
//					tcBranchCoverageReport.getObjectCoverageStatus().add(TDLCoverageUtil.PARTLY_COVERED);
//				}
//				else if (!branchesCoverageStatus.contains(TDLCoverageUtil.COVERED)) {
//					tcBranchCoverageReport.getObjectCoverageStatus().add(TDLCoverageUtil.NOT_COVERED);
//				}
//				else {
//					tcBranchCoverageReport.getObjectCoverageStatus().add(TDLCoverageUtil.COVERED);
//				}
			}			
		}
		
		tcBranchCoverageReport.computeCoveragePercentage();
		tcBranchCoverageReport.printCoverageResult(testCaseCoverage.getTestCaseName());
		
		return tcBranchCoverageReport;
	}

	private String computeImplicitBranchCoverage(EObject branchingRoot) {
		String objectCoverage = TDLCoverageUtil.NOSTATUS;
		//check if there is any explicit branch captured by trace
		boolean isExplicitBranchCaptured = branchingRoot_branches.get(branchingRoot).stream()
			.anyMatch(xb -> dslSpecificCoverageExecutor.getObjectsCapturedByTrace_extended().contains(xb));
		if (!isExplicitBranchCaptured) {
			//if no explicit branch is covered, then the implicit branch is covered
			objectCoverage = TDLCoverageUtil.COVERED;
		}
		else {
			//check if between two observation of the branching root, there is no explicit branch, then the implicit branch is covered
			int index1 = dslSpecificCoverageExecutor.getObjectsCapturedByTrace_extended().indexOf(branchingRoot);
			for (int index2 = index1 + 1
					; index2 <= dslSpecificCoverageExecutor.getObjectsCapturedByTrace_extended().lastIndexOf(branchingRoot)
					; index2++) {
				EObject capturedObject = dslSpecificCoverageExecutor.getObjectsCapturedByTrace_extended().get(index2);
				//if there is an element between two occurrences of the branching root
				if (capturedObject == branchingRoot && index2 > index1 + 1) {
					isExplicitBranchCaptured = false;
					for (int i = index1 + 1; i > index2; i++) {
						EObject objectInBetween = dslSpecificCoverageExecutor.getObjectsCapturedByTrace_extended().get(i);
						isExplicitBranchCaptured = branchingRoot_branches.get(branchingRoot).stream().anyMatch(xb -> xb == objectInBetween);
						if (isExplicitBranchCaptured) {
							break;
						}
					}
					//if there is no explicit branch element between two occurrences of the branching root, the implicit branch is covered
					if (!isExplicitBranchCaptured) {
						objectCoverage = TDLCoverageUtil.COVERED;
						break;
					}
				}
			}
		}
		return objectCoverage;
	}

	public HashMap<BranchSpecification, Set<EObject>> getBranchingRule_contextObjects() {
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
