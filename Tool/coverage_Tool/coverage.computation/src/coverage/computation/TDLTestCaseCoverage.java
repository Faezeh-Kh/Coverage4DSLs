package coverage.computation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Objects;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.commons.model.trace.Trace;
import org.etsi.mts.tdl.TestDescription;

import DSLSpecificCoverage.BranchCoverage;
import DSLSpecificCoverage.BranchSpecification;
import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.DomainSpecificCoverage;
import DSLSpecificCoverage.ModelElementCoverage;
import coverage.dslSpecific.DSLSpecificBranchCoverage;
import coverage.dslSpecific.DSLSpecificCoverageExecutor;

public class TDLTestCaseCoverage {

	public static String COVERAGEBYTRACE = "Trace";
	public static String MODELELEMENTCOVERAGE = "ModelElementCoverage";
	public static String BRANCHCOVERAGE = "BranchCoverage";
	
	private TestDescription testCase;
	private Resource MUTResource;
	private Trace<?, ?, ?> trace;

	private List<EObject> modelObjects;
	private List<String> tcObjectCoverageStatusByTrace;
	double tcCoveragePercentageByTrace;
	
	private DomainSpecificCoverage dslSpecificCoverage;
	
	private HashMap<Context, List<EObject>> meCoverageContext_eobjects;
	private List<String> tcObjectCoverageStatus4me;
	private List<String> tcObjectCoverageStatus4me_pv;
	double tcMECoveragePercentage;
	
	private List<EObject> branchObjects;
	private HashMap<Context, List<EObject>> branchCoverageContext_eobjects;
	private HashMap<BranchSpecification, List<EObject>> branchingRule_contextObjects;
	private List<String> tcObjectCoverageStatus4b;
	private List<String> tcObjectCoverageStatus4b_pv;
	
	private List<String> tcBranchCoverageStatus;
	double tcBranchCoveragePercentage;
	
	public TDLTestCaseCoverage() {
		modelObjects = new ArrayList<>();
		tcObjectCoverageStatusByTrace = new ArrayList<>();
	}
	
	//calculating the coverage of the test case based on the model execution trace and dsl-specific coverage rules
	public void calculateTCCoverage () {
		listEObjects();
		Step<?> rootStep = trace.getRootStep();
		calculateCoverageBasedOnTrace(rootStep);
		
		//if there is a dsl-specific coverage, initialize the map
		dslSpecificCoverage = TDLCoverageUtil.getInstance().getDslSpecificCoverage();
		if (dslSpecificCoverage != null) {
			runDSLSpecificCoverage();
		}
	}

	private void listEObjects() {
		//list objects of the MUTResource of the test case and set their initial status as NOT-COVERED
		TreeIterator<EObject> modelContents = MUTResource.getAllContents();
		while (modelContents.hasNext()) {
			modelObjects.add(modelContents.next());
			tcObjectCoverageStatusByTrace.add(TDLCoverageUtil.NOT_COVERED);
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
				setObjectCoverage(object, TDLCoverageUtil.COVERED, COVERAGEBYTRACE);
			}
			if (step.getSubSteps() != null) {
				for (int i=0; i < step.getSubSteps().size(); i++) {
					calculateCoverageBasedOnTrace(step.getSubSteps().get(i));
				}
			}
		}
	}
	
	private void runDSLSpecificCoverage() {
		ModelElementCoverage modelElementCoverage = getModelElementCoverage();
		if (modelElementCoverage != null) {
			runModelElementCoverage(modelElementCoverage);
		}
		BranchCoverage branchCoverage = getBranchCoverage();
		if (branchCoverage != null) {
			runBranchCoverage(branchCoverage);
		}
	}
	
	private void runModelElementCoverage(ModelElementCoverage modelElementCoverage) {
		//the initial coverage status is the one calculated using the trace
		tcObjectCoverageStatus4me = new ArrayList<>(tcObjectCoverageStatusByTrace);
		
		//finding contexts and their instances
		meCoverageContext_eobjects= new HashMap<>();
		setMECoverageContext_objects(modelElementCoverage);
		
		//apply domain specific coverage while the coverage matrix changes
		DSLSpecificCoverageExecutor executor = new DSLSpecificCoverageExecutor(this, MODELELEMENTCOVERAGE);
		boolean isCoverageMatrixChanged = true;
		while (isCoverageMatrixChanged) {
			tcObjectCoverageStatus4me_pv = new ArrayList<>(tcObjectCoverageStatus4me);
			meCoverageContext_eobjects.entrySet().stream()
				.filter(entry -> !entry.getValue().isEmpty())
				.forEach(entry -> executor.applyCoverageRules(entry.getKey().getRules(), entry.getValue()));
			isCoverageMatrixChanged = !Objects.equals(tcObjectCoverageStatus4me_pv, tcObjectCoverageStatus4me);
		}
		findNotCoverableObjects(MODELELEMENTCOVERAGE);
		calculateObjectCoveragePercentage(MODELELEMENTCOVERAGE);
	}

	private void runBranchCoverage(BranchCoverage branchCoverage) {
		//the initial coverage status is the one calculated using the trace
		tcObjectCoverageStatus4b = new ArrayList<>(tcObjectCoverageStatusByTrace);
		
		//finding contexts and their instances
		branchCoverageContext_eobjects= new HashMap<>();
		branchingRule_contextObjects= new HashMap<>();
		setBranchCoverageContext_objects(branchCoverage);
		
		//apply domain specific coverage while the coverage matrix changes
		DSLSpecificCoverageExecutor executor = new DSLSpecificCoverageExecutor(this, BRANCHCOVERAGE);
		boolean isCoverageMatrixChanged = true;
		while (isCoverageMatrixChanged) {
			tcObjectCoverageStatus4b_pv = new ArrayList<>(tcObjectCoverageStatus4b);
			branchCoverageContext_eobjects.entrySet().stream()
				.filter(entry -> !entry.getValue().isEmpty())
				.forEach(entry -> executor.applyCoverageRules(entry.getKey().getRules(), entry.getValue()));
			isCoverageMatrixChanged = !Objects.equals(tcObjectCoverageStatus4b_pv, tcObjectCoverageStatus4b);
		}
		findNotCoverableObjects(BRANCHCOVERAGE);
		
		branchObjects = new ArrayList<>();
		tcBranchCoverageStatus = new ArrayList<>();
		DSLSpecificBranchCoverage branchCoverageExecutor = new DSLSpecificBranchCoverage(branchingRule_contextObjects);
		branchCoverageExecutor.runBranchCoverageComputation(this);
		
		calculateBranchCoveragePercentage();
	}
	
	private ModelElementCoverage getModelElementCoverage() {
		try {
			return dslSpecificCoverage.getCoverageMetrics().stream()
					.filter(m -> m instanceof ModelElementCoverage)
					.map (m -> (ModelElementCoverage) m)
					.findFirst().get();
		}catch (NoSuchElementException e) {
			return null;
		}
	}
	
	private BranchCoverage getBranchCoverage() {
		try {
			return dslSpecificCoverage.getCoverageMetrics().stream()
					.filter(m -> m instanceof BranchCoverage)
					.map (m -> (BranchCoverage) m)
					.findFirst().get();
		}catch (NoSuchElementException e) {
			return null;
		}
	}
	
	private void setMECoverageContext_objects(ModelElementCoverage metric) {
		metric.getContexts().forEach(c -> 
			meCoverageContext_eobjects.put(c, new ArrayList<>()));
		//find the eobjects related to the rule's context
		for (Entry<Context,List<EObject>> entry:meCoverageContext_eobjects.entrySet()) {
			String contextName = entry.getKey().getMetaclass().getName();
			entry.getValue().addAll(modelObjects.stream()
					.filter(o -> isContextInstance(contextName, o))
					.toList());
		}
	}
	
	private void setBranchCoverageContext_objects(BranchCoverage bc) {
		bc.getContexts().forEach(c -> 
			branchCoverageContext_eobjects.put(c, new ArrayList<>()));
		//find the eobjects related to the rule's context
		for (Entry<Context,List<EObject>> entry:branchCoverageContext_eobjects.entrySet()) {
			String contextName = entry.getKey().getMetaclass().getName();
			entry.getValue().addAll(modelObjects.stream()
					.filter(o -> isContextInstance(contextName, o))
					.toList());
		}
		
		bc.getBranchSpecifications().forEach(bs -> 
			branchingRule_contextObjects.put(bs, new ArrayList<>()));
		//find the eobjects related to the branch specification contexts
		for (Entry<BranchSpecification,List<EObject>> entry:branchingRule_contextObjects.entrySet()) {
			String contextName = entry.getKey().getContext().getName();
			entry.getValue().addAll(modelObjects.stream()
					.filter(o -> isContextInstance(contextName, o))
					.toList());
		}
	}
	
	private boolean isContextInstance(String contextName, EObject object) {
		String objectTypeName = object.eClass().getName();
		if (objectTypeName.equals(contextName) ||
				object.eClass().getEAllSuperTypes().stream().
					filter(st -> st.getName().equals(contextName)).findAny().isPresent()) {
			return true;
		}
		return false;
	}
	
	public String getObjectCoverage(EObject object, String metric) {
		int objectIndex = modelObjects.indexOf(object);
		if (objectIndex != -1){
			if (metric == COVERAGEBYTRACE) {
				return tcObjectCoverageStatusByTrace.get(objectIndex);
			}
			else if (metric == MODELELEMENTCOVERAGE) {
				return tcObjectCoverageStatus4me.get(objectIndex);
			}
			else if (metric == BRANCHCOVERAGE) {
				return tcObjectCoverageStatus4b.get(objectIndex);
			}
		}
		return null;
	}
	
	public void setObjectCoverage(EObject object, String coverageStatus, String metric) {
		int objectIndex = modelObjects.indexOf(object);
		if (objectIndex != -1) {
			if (metric == COVERAGEBYTRACE) {
				if (tcObjectCoverageStatusByTrace.get(objectIndex) != TDLCoverageUtil.COVERED){
					tcObjectCoverageStatusByTrace.set(objectIndex, coverageStatus);
				}
			}else if (metric == MODELELEMENTCOVERAGE) {
				if (tcObjectCoverageStatus4me.get(objectIndex) != TDLCoverageUtil.COVERED){
					tcObjectCoverageStatus4me.set(objectIndex, coverageStatus);
				}
			}else if (metric == BRANCHCOVERAGE) {
				if (tcObjectCoverageStatus4b.get(objectIndex) != TDLCoverageUtil.COVERED){
					tcObjectCoverageStatus4b.set(objectIndex, coverageStatus);
				}
			}
		}
	}
	
	public void setObjectNotCoverable(EObject object, String metric) {
		int objectIndex = modelObjects.indexOf(object);
		if (objectIndex != -1){
			if (metric == COVERAGEBYTRACE) {
				tcObjectCoverageStatusByTrace.set(objectIndex, TDLCoverageUtil.NOT_TRACED);
			}else if (metric == MODELELEMENTCOVERAGE) {
				tcObjectCoverageStatus4me.set(objectIndex, TDLCoverageUtil.NOT_TRACED);
			}else if (metric == BRANCHCOVERAGE) {
				tcObjectCoverageStatus4b.set(objectIndex, TDLCoverageUtil.NOT_TRACED);
			}
		}
	}
	
	//if not-covered eobjects are of the not-coverable types, set their status as not-coverable
	private void findNotCoverableObjects(String metric) {
		if (metric == COVERAGEBYTRACE) {
			for (int i=0; i<tcObjectCoverageStatusByTrace.size(); i++) {
				if (tcObjectCoverageStatusByTrace.get(i) == TDLCoverageUtil.NOT_COVERED &&
						!TDLCoverageUtil.getInstance().isClassCoverable(modelObjects.get(i).eClass(), MODELELEMENTCOVERAGE)) {
					tcObjectCoverageStatusByTrace.set(i, TDLCoverageUtil.NOT_TRACED);
				}
			}
		}else if (metric == MODELELEMENTCOVERAGE) {
			for (int i=0; i<tcObjectCoverageStatus4me.size(); i++) {
				if (tcObjectCoverageStatus4me.get(i) == TDLCoverageUtil.NOT_COVERED &&
						!TDLCoverageUtil.getInstance().isClassCoverable(modelObjects.get(i).eClass(), MODELELEMENTCOVERAGE)) {
					tcObjectCoverageStatus4me.set(i, TDLCoverageUtil.NOT_TRACED);
				}
			}
		}else if (metric == BRANCHCOVERAGE) {
			for (int i=0; i<tcObjectCoverageStatus4b.size(); i++) {
				if (tcObjectCoverageStatus4b.get(i) == TDLCoverageUtil.NOT_COVERED &&
						!TDLCoverageUtil.getInstance().isClassCoverable(modelObjects.get(i).eClass(), BRANCHCOVERAGE)) {
					tcObjectCoverageStatus4b.set(i, TDLCoverageUtil.NOT_TRACED);
				}
			}
		}
	}

	public void calculateObjectCoveragePercentage(String metric) {
		if (metric == COVERAGEBYTRACE) {
			tcCoveragePercentageByTrace = computeCoveragePercentage(tcObjectCoverageStatusByTrace, metric);
		}
		else if (metric == MODELELEMENTCOVERAGE) {
			tcMECoveragePercentage = computeCoveragePercentage(tcObjectCoverageStatus4me, metric);
		}
		else if (metric == BRANCHCOVERAGE) {
			calculateBranchCoveragePercentage();
		}
		
	}
	
	private double computeCoveragePercentage(List<String> coverageStatus, String metric) {
		int numOfCoveredObjs = 0;
		int numOfNotCoverableElements = 0;
		for (String coverage:coverageStatus) {
			if (coverage == TDLCoverageUtil.NOT_TRACED) {
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
		System.out.println(this.testCase.getName() + "-coverage-"+ metric + ": " + 
				numOfCoveredObjs + "/" + numOfCoverableElements + " = " + percentage +"%");
		return percentage;
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

	public double getTcCoveragePercentageByTrace() {
		return tcCoveragePercentageByTrace;
	}

	public Map<Context, List<EObject>> getMeCoverageContext_eobjects() {
		return meCoverageContext_eobjects;
	}

	public List<String> getTcObjectCoverageStatus4me() {
		return tcObjectCoverageStatus4me;
	}

	public double getTcMECoveragePercentage() {
		return tcMECoveragePercentage;
	}

	public Map<Context, List<EObject>> getBranchCoverageContext_eobjects() {
		return branchCoverageContext_eobjects;
	}

	public Map<BranchSpecification, List<EObject>> getBranchingRule_contextObjects() {
		return branchingRule_contextObjects;
	}

	public List<String> getTcObjectCoverageStatus4b() {
		return tcObjectCoverageStatus4b;
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
	
	public boolean hasBranchCoverageInformation() {
		return tcBranchCoverageStatus == null ? false : true;
	}
	
}
