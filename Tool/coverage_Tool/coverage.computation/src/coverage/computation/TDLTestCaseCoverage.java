package coverage.computation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.commons.model.trace.Trace;
import org.etsi.mts.tdl.TestDescription;

import DSLSpecificCoverage.DomainSpecificCoverage;
import coverage.dslSpecific.DSLSpecificCoverageExecutor;

public class TDLTestCaseCoverage {
	
	private TestDescription testCase;
	private Resource MUTResource;
	private List<EObject> allModelObjects;
	
	private Trace<?, ?, ?> trace;
	private List<EObject> objectsCapturedByTrace;
	
	private Set<String> coverableClasses = new HashSet<>();
	private List<String> tcObjectCoverageStatusByTrace;
	double tcCoveragePercentageByTrace;
	
	public boolean hasDSLSpecificeCoverage;
	private HashMap<DomainSpecificCoverage, List<String>> dslSpecificCoverage_tcCoverageStatus;
	private HashMap<DomainSpecificCoverage, Double> dslSpecificCoverage_tcCoveragePercentage;
	private List<EObject> branchObjects;
	private List<String> tcBranchCoverageStatus;
	double tcBranchCoveragePercentage;
	
	public TDLTestCaseCoverage() {
		allModelObjects = new ArrayList<>();
		tcObjectCoverageStatusByTrace = new ArrayList<>();
		coverableClasses = new HashSet<>(TDLCoverageUtil.getInstance().getCoverableClasses());
	}
	
	public void calculateTCCoverage () {
		listEObjects();
		//calculating the coverage of the test case based on the model execution trace
		Step<?> rootStep = trace.getRootStep();
		calculateCoverageBasedOnTrace(rootStep);
		findNotCoverableObjects();
		tcCoveragePercentageByTrace = computeCoveragePercentage(tcObjectCoverageStatusByTrace, "basedOnTrace");
		
		//if there are dsl-specific coverage rule sets, run them
		List<DomainSpecificCoverage> dslSpecificCoverages = TDLCoverageUtil.getInstance().getDslSpecificCoverages();
		if (dslSpecificCoverages != null) {
			hasDSLSpecificeCoverage = true;
			DSLSpecificCoverageExecutor executor = new DSLSpecificCoverageExecutor(this);
			for (DomainSpecificCoverage dsc:dslSpecificCoverages) {
				executor.runDSLSpecificCoverage(dsc);
				dslSpecificCoverage_tcCoverageStatus.put(dsc, executor.getTcObjectCoverageStatus());
				dslSpecificCoverage_tcCoveragePercentage.put(dsc, executor.getTcCoveragePercentage());
				if (executor.hasBranchCoverage) {
					branchObjects = executor.getBranchingObjects();
					tcBranchCoverageStatus = executor.getTcBranchCoverageStatus();
					tcBranchCoveragePercentage = executor.getTcBranchCoveragePercentage();
				}
			}
		}
	}

	private void listEObjects() {
		//list objects of the MUTResource of the test case and set their initial status as NOT-COVERED
		TreeIterator<EObject> modelContents = MUTResource.getAllContents();
		while (modelContents.hasNext()) {
			allModelObjects.add(modelContents.next());
			tcObjectCoverageStatusByTrace.add(TDLCoverageUtil.NOT_COVERED);
		}
	}
	
	private void calculateCoverageBasedOnTrace(Object rootStep) {
		//System.out.println("Execution Trace:");
		if (rootStep instanceof SequentialStep) {
			SequentialStep<?, ?> step = (SequentialStep<?, ?>) rootStep;
			if (step.getMseoccurrence() != null) {
				EObject object = step.getMseoccurrence().getMse().getCaller();
				objectsCapturedByTrace.add(object);
				setObjectCoverage(object, TDLCoverageUtil.COVERED);
			}
			if (step.getSubSteps() != null) {
				for (int i=0; i < step.getSubSteps().size(); i++) {
					calculateCoverageBasedOnTrace(step.getSubSteps().get(i));
				}
			}
		}
	}
	
	public void setObjectCoverage(EObject object, String coverageStatus) {
		int objectIndex = allModelObjects.indexOf(object);
		if (objectIndex != -1) {
			if (tcObjectCoverageStatusByTrace.get(objectIndex) != TDLCoverageUtil.COVERED){
				tcObjectCoverageStatusByTrace.set(objectIndex, coverageStatus);
			}
		}
	}
	
	//if not-covered eobjects are of the not-coverable types, set their status as not-coverable
	private void findNotCoverableObjects() {
		for (int i=0; i<tcObjectCoverageStatusByTrace.size(); i++) {
			if (tcObjectCoverageStatusByTrace.get(i) == TDLCoverageUtil.NOT_COVERED &&
					!coverableClasses.contains(allModelObjects.get(i).eClass().getName())) {
				tcObjectCoverageStatusByTrace.set(i, TDLCoverageUtil.NOSTATUS);
			}
		}
	}
	
	public double computeCoveragePercentage(List<String> coverageStatus, String coverageName) {
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
		System.out.println(testCase.getName() + "-coverage-" + coverageName+": " + 
				numOfCoveredObjs + "/" + numOfCoverableElements + " = " + percentage +"%");
		return percentage;
	}
	

	
	public Trace<?, ?, ?> getTrace() {
		return trace;
	}

	public void setTrace(Trace<?, ?, ?> trace) {
		this.trace = trace;
	}

	public Resource getMUTResource() {
		return MUTResource;
	}

	public void setMUTResource(Resource MUTResource) {
		this.MUTResource = MUTResource;
	}

	public TestDescription getTestCase() {
		return testCase;
	}
	
	public void setTestCase(TestDescription testCase) {
		this.testCase = testCase;
	}
	
	public String getTestCaseName() {
		return testCase.getName();
	}
	
	public List<EObject> getAllModelObjects() {
		return allModelObjects;
	}

	public List<EObject> getObjectsCapturedByTrace() {
		return objectsCapturedByTrace;
	}

	public List<String> getTcObjectCoverageStatusByTrace() {
		return tcObjectCoverageStatusByTrace;
	}

	public double getTcCoveragePercentageByTrace() {
		return tcCoveragePercentageByTrace;
	}
	
}
