package coverage.computation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.commons.model.trace.Trace;
import org.etsi.mts.tdl.TestDescription;

import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.DomainSpecificCoverage;
import coverage.dslSpecific.DSLSpecificCoverageExecutor;

public class TDLTestCaseCoverage {

	private TestDescription testCase;
	private Resource MUTResource;
	private Trace<?, ?, ?> trace;
	
	private DomainSpecificCoverage dslSpecificCoverage;
	private Map<Context, List<EObject>> coverageContext_eobjects= new HashMap<>();

	private List<EObject> modelObjects;
	private List<String> tcObjectCoverageStatus;
	private List<String> tcObjectCoverageStatus_pv;
	
	double tcObjectCoveragePercentage;
	
	private List<EObject> branchObjects;
	private List<String> tcBranchCoverageStatus;
	double tcBranchCoveragePercentage;
	
	public TDLTestCaseCoverage() {
		modelObjects = new ArrayList<>();
		tcObjectCoverageStatus = new ArrayList<>();
		tcObjectCoverageStatus_pv = new ArrayList<>();
	}
	
	//calculating the coverage of the test case based on the model execution trace and dsl-specific coverage rules
	public void calculateTCCoverage () {
		listEObjects();
		Step<?> rootStep = trace.getRootStep();
		calculateCoverageBasedOnTrace(rootStep);
		
		//if there is a dsl-specific coverage, initialize the map
		dslSpecificCoverage = TDLCoverageUtil.getInstance().getDslSpecificCoverage();
		if (dslSpecificCoverage != null) {
			dslSpecificCoverage.getContexts().
				forEach(c -> coverageContext_eobjects.put(c, new ArrayList<>()));
			runDSLSpecificCoverage();
		}
		
		findNotCoverableObjects();
		calculateObjectCoveragePercentage();
		if (hasBranchCoverageInformation()) {
			calculateBranchCoveragePercentage();
		}
	}

	private void listEObjects() {
		//list objects of the MUTResource of the test case and set their initial status as NOT-COVERED
		TreeIterator<EObject> modelContents = MUTResource.getAllContents();
		while (modelContents.hasNext()) {
			modelObjects.add(modelContents.next());
			tcObjectCoverageStatus.add(TDLCoverageUtil.NOT_COVERED);
		}
	}
	
	private void calculateCoverageBasedOnTrace(Object rootStep) {
		//System.out.println("Execution Trace:");
		if (rootStep instanceof SequentialStep) {
			SequentialStep<?, ?> step = (SequentialStep<?, ?>) rootStep;
			if (step.getMseoccurrence() != null) {
				EObject object = step.getMseoccurrence().getMse().getCaller();
				//System.out.println("execution rule: " + step.getMseoccurrence().getMse().getAction()+
				//		" (executedObject = " + object + ")");
				setObjectCoverage(object, TDLCoverageUtil.COVERED);
			}
			if (step.getSubSteps() != null) {
				for (int i=0; i < step.getSubSteps().size(); i++) {
					calculateCoverageBasedOnTrace(step.getSubSteps().get(i));
				}
			}
		}
	}
	
	private void runDSLSpecificCoverage() {
		//find the eobjects related to the rule's context
		for (Entry<Context,List<EObject>> entry:coverageContext_eobjects.entrySet()) {
			String contextName = entry.getKey().getMetaclass().getName();
			for (EObject object: modelObjects) {
				String objectTypeName = object.eClass().getName();
				if (contextName.equals(objectTypeName) ||
						object.eClass().getEAllSuperTypes().stream().
							filter(st -> st.getName().equals(contextName)).findAny().isPresent()) {
					entry.getValue().add(object);
				}
			}
		}
		//apply domain specific coverage while the coverage matrix changes
		DSLSpecificCoverageExecutor executor = new DSLSpecificCoverageExecutor(this);
		boolean isCoverageMatrixChanged = true;
		while (isCoverageMatrixChanged) {
			tcObjectCoverageStatus_pv = new ArrayList<>(tcObjectCoverageStatus);
			coverageContext_eobjects.entrySet().stream().filter(entry -> !entry.getValue().isEmpty()).
				forEach(entry -> executor.applyCoverageRules(entry.getKey().getRules(), entry.getValue()));
			isCoverageMatrixChanged = !Objects.equals(tcObjectCoverageStatus_pv, tcObjectCoverageStatus);
		}
		//if there are branchSpecificationRules, compute the branch coverage
		if (executor.hasBranchSpecificationRule()) {
			branchObjects = new ArrayList<>();
			tcBranchCoverageStatus = new ArrayList<>();
			executor.runBranchCoverageRules();
			
		}
	}
	
	public String getObjectCoverage(EObject object) {
		int objectIndex = modelObjects.indexOf(object);
		if (objectIndex != -1){
			return tcObjectCoverageStatus.get(objectIndex);
		}
		return null;
	}
	
	public void setObjectCoverage(EObject object, String coverageStatus) {
		int objectIndex = modelObjects.indexOf(object);
		if (objectIndex != -1 && 
				tcObjectCoverageStatus.get(objectIndex) != TDLCoverageUtil.COVERED){
			tcObjectCoverageStatus.set(objectIndex, coverageStatus);
		}
	}
	
	public void setObjectNotCoverable(EObject object) {
		int objectIndex = modelObjects.indexOf(object);
		if (objectIndex != -1){
			tcObjectCoverageStatus.set(objectIndex, TDLCoverageUtil.NOT_TRACED);
		}
	}
	
	//if not-covered eobjects are of the not-coverable types, set their status as not-coverable
	private void findNotCoverableObjects() {
		for (int i=0; i<tcObjectCoverageStatus.size(); i++) {
			if (tcObjectCoverageStatus.get(i) == TDLCoverageUtil.NOT_COVERED &&
					!TDLCoverageUtil.getInstance().isClassCoverable(modelObjects.get(i).eClass())) {
				tcObjectCoverageStatus.set(i, TDLCoverageUtil.NOT_TRACED);
			}
		}
	}
	
	public void calculateObjectCoveragePercentage() {
		int numOfCoveredObjs = 0;
		int numOfNotCoverableElements = 0;
		for (String coverage:tcObjectCoverageStatus) {
			if (coverage == TDLCoverageUtil.NOT_TRACED) {
				numOfNotCoverableElements++;
			}
			else if (coverage == TDLCoverageUtil.COVERED) {
				numOfCoveredObjs++;
			}
		}
		int numOfCoverableElements = tcObjectCoverageStatus.size() - numOfNotCoverableElements;
		tcObjectCoveragePercentage = (double)(numOfCoveredObjs*100)/numOfCoverableElements;
		try {
		BigDecimal bd = new BigDecimal(tcObjectCoveragePercentage).setScale(2, RoundingMode.HALF_UP);
		tcObjectCoveragePercentage = bd.doubleValue();
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException:" + tcObjectCoveragePercentage);
		}
		System.out.println(this.testCase.getName() + "-model element coverage: " + 
				numOfCoveredObjs + "/" + numOfCoverableElements + " = " + tcObjectCoveragePercentage +"%");
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
		System.out.println(testCase.getName() + "-branch coverage: " + 
				numOfCoveredBranches + "/" + numOfBranches + " = " + tcBranchCoveragePercentage +"%");
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
	
	public List<EObject> getModelObjects() {
		return modelObjects;
	}
	
	public List<String> getTcObjectCoverageStatus() {
		return tcObjectCoverageStatus;
	}

	public List<EObject> getBranchObjects() {
		return branchObjects;
	}

	public List<String> getTcBranchCoverageStatus() {
		return tcBranchCoverageStatus;
	}

	public double getTcObjectCoveragePercentage() {
		return tcObjectCoveragePercentage;
	}

	public double getTcBranchCoveragePercentage() {
		return tcBranchCoveragePercentage;
	}
	
	public boolean hasBranchCoverageInformation() {
		return tcBranchCoverageStatus == null ? false : true;
	}
	
}
