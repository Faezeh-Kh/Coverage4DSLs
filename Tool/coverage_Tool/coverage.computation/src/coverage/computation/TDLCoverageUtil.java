package coverage.computation;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.imt.tdl.utilities.DSLProcessor;

import DSLSpecificCoverage.DomainSpecificCoverage;
import coverage.dslSpecific.DSLSpecificCoverageHandler;
import coverage.dslSpecific.IDSLSpecificCoverage;

public class TDLCoverageUtil {
	
private static TDLCoverageUtil instance = new TDLCoverageUtil();
	
	private DSLProcessor dslProcessor;
	private Path DSLPath;
	private EPackage metamodelRootElement;
	private Set<String> coverableClasses_me = new HashSet<>();
	private Set<String> extendedClassesWithoutStep_me = new HashSet<>();
	private Set<String> coverableClasses_b = new HashSet<>();
	private Set<String> extendedClassesWithoutStep_b = new HashSet<>();
	
	private List<EClass> classesWithDynamicFeatures = new ArrayList<>();
	private List<EClass> dynamicClasses = new ArrayList<>();
	
	public static final String COVERED = "Covered";
	public static final String NOT_COVERED = "Not_Covered";
	public static final String NOT_TRACED = "Not_Traced";
	
	private IDSLSpecificCoverage dslSpecificCoverageExtension;
	private DomainSpecificCoverage dslSpecificCoverage;
	
	private TDLTestSuiteCoverage testSuiteCoverage;

	//make the constructor private so that this class cannot be
	//instantiated
	private TDLCoverageUtil(){}

	//Get the only object available
	public static TDLCoverageUtil getInstance(){
		return instance;
	}
	public TDLTestSuiteCoverage getTestSuiteCoverage() {
		return testSuiteCoverage;
	}
	public void setTestSuiteCoverage(TDLTestSuiteCoverage coverage) {
		testSuiteCoverage = coverage;
	}

	public Path getDSLPath() {
		return DSLPath;
	}

	public void setDSLPath(Path DSLPath) {
		instance.DSLPath = DSLPath;
	}
	
	public void runCoverageComputation() {
		coverableClasses_me.clear();
		extendedClassesWithoutStep_me.clear();
		coverableClasses_b.clear();
		extendedClassesWithoutStep_b.clear();
		dynamicClasses.clear();
		classesWithDynamicFeatures.clear();
		dslSpecificCoverage = null;
		dslSpecificCoverageExtension = null;
		
		dslProcessor = new DSLProcessor(DSLPath);
		dslProcessor.loadDSLMetaclasses();
		metamodelRootElement = dslProcessor.getMetamodelRootElement();
		findCoverableClassesFromDSLSemantics();
		
		testSuiteCoverage.calculateTSCoverage();
	}
	
	private void findCoverableClassesFromDSLSemantics(){
		dslProcessor.findDSLExtendedClasses();
		extendedClassesWithoutStep_me.addAll(dslProcessor.getExtendedClassesWithoutStep());
		coverableClasses_me.addAll(dslProcessor.getExtendedClassesWithStep());
		extendedClassesWithoutStep_b.addAll(extendedClassesWithoutStep_me);
		coverableClasses_b.addAll(coverableClasses_me);
		checkInheritanceForNotCoverableClasses();
	}
	
	//for each class that is not coverable (it is not extended in the interpreter)
	//if one of its super classes is coverable, the class must be set as coverable 
	public void checkInheritanceForNotCoverableClasses() {
		for (EClassifier clazz: metamodelRootElement.getEClassifiers()) {
			String className = clazz.getName();
			if (clazz instanceof EClass eclazz) {
				if (!coverableClasses_me.contains(className) && 
						!extendedClassesWithoutStep_me.contains(className)) {
					checkInheritance(eclazz);
				}
				checkDynamicAspectsOfClass(eclazz);	
			}
		}	
	}
	
	private void checkInheritance(EClass eClazz) {
		for (EClass superClass:eClazz.getEAllSuperTypes()) {
			if (coverableClasses_me.contains(superClass.getName())) {
				coverableClasses_me.add(eClazz.getName());
				coverableClasses_b.add(eClazz.getName());
				break;
			}
		}
	}
	
	private void checkDynamicAspectsOfClass(EClassifier clazz) {
		List<EAnnotation> classDynamicAnnotations = clazz.getEAnnotations().stream().
				filter(a -> a.getSource().equals("dynamic") || a.getSource().equals("aspect")).collect(Collectors.toList());
		//if the type of the object is dynamic, all of its features must be set to the default values
		if (classDynamicAnnotations != null && classDynamicAnnotations.size()>0) {
			dynamicClasses.add((EClass) clazz);
		}
		else {
			List<EStructuralFeature> dynamicFeatures = ((EClass) clazz).getEAllStructuralFeatures().stream().
					filter(f -> isDynamicFeature(f)).collect(Collectors.toList());
			if (dynamicFeatures != null && dynamicFeatures.size()>0) {
				classesWithDynamicFeatures.add((EClass) clazz);
			}
		}
	}
	
	private boolean isDynamicFeature(EStructuralFeature feature) {
		List<EAnnotation> featureDynamicAnnotations = feature.getEAnnotations().stream().
				filter(a -> a.getSource().equals("dynamic") || 
						a.getSource().equals("aspect")).collect(Collectors.toList());
		return (featureDynamicAnnotations != null && featureDynamicAnnotations.size() > 0);
	}

	public boolean isClassCoverable(EClass clazz, String metric) {
		if (metric == TDLTestCaseCoverage.MODELELEMENTCOVERAGE) {
			return coverableClasses_me.contains(clazz.getName());
		}
		else if (metric == TDLTestCaseCoverage.BRANCHCOVERAGE) {
			return coverableClasses_b.contains(clazz.getName());
		}
		return false;
	}
	
	//add a class and all of its sub classes
	public void addCoverableClass(EClass clazz, String metric) {
		if (metric == TDLTestCaseCoverage.MODELELEMENTCOVERAGE) {
			if (!coverableClasses_me.contains(clazz.getName())) {
				coverableClasses_me.add(clazz.getName());
				List<String> notCoverableSubClasses = metamodelRootElement.getEClassifiers().stream().
						filter(c -> c instanceof EClass).map(c -> (EClass) c).
						filter(c -> c.getEAllSuperTypes().stream().
								filter(sc -> sc.getName().equals(clazz.getName())).findAny().isPresent() 
								&& !coverableClasses_me.contains(c.getName())
								&& !extendedClassesWithoutStep_me.contains(c.getName())).
						map (c -> c.getName()).collect(Collectors.toList());
					coverableClasses_me.addAll(notCoverableSubClasses);
			}
		}
		else if (metric == TDLTestCaseCoverage.BRANCHCOVERAGE) {
			if (!coverableClasses_b.contains(clazz.getName())) {
				coverableClasses_b.add(clazz.getName());
				List<String> notCoverableSubClasses = metamodelRootElement.getEClassifiers().stream().
						filter(c -> c instanceof EClass).map(c -> (EClass) c).
						filter(c -> c.getEAllSuperTypes().stream().
								filter(sc -> sc.getName().equals(clazz.getName())).findAny().isPresent() 
								&& !coverableClasses_b.contains(c.getName())
								&& !extendedClassesWithoutStep_b.contains(c.getName())).
						map (c -> c.getName()).collect(Collectors.toList());
					coverableClasses_b.addAll(notCoverableSubClasses);
			}
		}
	}
	
	public void removeCoverableClass(EClass clazz, String metric) {
		if (metric == TDLTestCaseCoverage.MODELELEMENTCOVERAGE) {
			if (coverableClasses_me.contains(clazz.getName())) {
				coverableClasses_me.remove(clazz.getName());
			}
		}
		else if (metric == TDLTestCaseCoverage.BRANCHCOVERAGE) {
			if (coverableClasses_b.contains(clazz.getName())) {
				coverableClasses_b.remove(clazz.getName());
			}
		}
	}
	//remove a class and all of its sub classes
	public void removeCoverableClass_subClass(EClass clazz, String metric) {
		if (metric == TDLTestCaseCoverage.MODELELEMENTCOVERAGE) {
			if (coverableClasses_me.contains(clazz.getName())) {
				coverableClasses_me.remove(clazz.getName());
				List<String> coverableSubClasses = metamodelRootElement.getEClassifiers().stream().
						filter(c -> c instanceof EClass).map(c -> (EClass) c).
						filter(c -> c.getEAllSuperTypes().stream().
								filter(sc -> sc.getName().equals(clazz.getName())).findAny().isPresent() 
								&& coverableClasses_me.contains(c.getName())).
						map (c -> c.getName()).collect(Collectors.toList());
					coverableClasses_me.removeAll(coverableSubClasses);
			}
		}
		else if (metric == TDLTestCaseCoverage.BRANCHCOVERAGE) {
			if (coverableClasses_b.contains(clazz.getName())) {
				coverableClasses_b.remove(clazz.getName());
				List<String> coverableSubClasses = metamodelRootElement.getEClassifiers().stream().
						filter(c -> c instanceof EClass).map(c -> (EClass) c).
						filter(c -> c.getEAllSuperTypes().stream().
								filter(sc -> sc.getName().equals(clazz.getName())).findAny().isPresent() 
								&& coverableClasses_b.contains(c.getName())).
						map (c -> c.getName()).collect(Collectors.toList());
					coverableClasses_b.removeAll(coverableSubClasses);
			}
		}
	}
	
	public List<EClass> getClassesWithDynamicFeatures() {
		return classesWithDynamicFeatures;
	}

	public List<EClass> getDynamicClasses() {
		return dynamicClasses;
	}
	
	public DomainSpecificCoverage getDslSpecificCoverage() {
		if (dslSpecificCoverage == null) {
			findDSLSpecificCoverage();
		}
		return dslSpecificCoverage;
	}
	
	public IDSLSpecificCoverage getDslSpecificCoverageExtension() {
		if (dslSpecificCoverageExtension == null) {
			findDSLSpecificCoverage();
		}
		return dslSpecificCoverageExtension;
	}
	
	private void findDSLSpecificCoverage() {
		//check if there is a DSL-Specific coverage extension
		DSLSpecificCoverageHandler dslSpecificCoverageHandler = new DSLSpecificCoverageHandler();
		dslSpecificCoverageExtension = dslSpecificCoverageHandler.getDSLSpecificCoverage();
		//1. if the rules are implemented in a java class, retrieve them using extension point
		if (dslSpecificCoverageExtension != null &&
				dslSpecificCoverageExtension.getDomainSpecificCoverage() != null) {
			dslSpecificCoverage = dslSpecificCoverageExtension.getDomainSpecificCoverage();
		}
		//2. else, check .dsl file for the path to the coverageRules.xmi file
		else {
			Resource coverageFileResource = loadDSLSpecificCoverageFile();
			if (coverageFileResource != null) {
				dslSpecificCoverage = (DomainSpecificCoverage) coverageFileResource.getContents().get(0);
			}
		}
	}
	
	private Resource loadDSLSpecificCoverageFile() {
		String coverageFilePath = getCoverageFilePath();
		if (coverageFilePath != null) {
			Resource coverageFileResource = (new ResourceSetImpl()).getResource(URI.createURI(coverageFilePath), true);
			return coverageFileResource;
		}
		return null;
	}
	
	private String getCoverageFilePath() {
		String path = dslProcessor.getPath2CoverageRules();
		if (path != null) {
			path = path.replaceFirst("resource", "plugin");
			return path;
		}
		return null;
	}
}