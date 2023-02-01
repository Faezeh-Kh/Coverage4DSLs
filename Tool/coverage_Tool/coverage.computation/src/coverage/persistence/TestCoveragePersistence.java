package coverage.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionContext;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.etsi.mts.tdl.PackageableElement;
import org.etsi.mts.tdl.TestDescription;

import TestCoverage.CoverageStatus;
import TestCoverage.ModelObjectCoverageStatus;
import TestCoverage.TestCaseCoverage;
import TestCoverage.TestCoverageFactory;
import TestCoverage.TestSuiteCoverage;
import coverage.computation.TDLCoverageUtil;
import coverage.computation.TDLTestCaseCoverage;
import coverage.computation.TDLTestSuiteCoverage;
import coverage.computation.TestCoverageReport;

public class TestCoveragePersistence implements IEngineAddon{
	
	String pathToReportsFiles;
	Resource testSuiteResource;
	Resource MUTResource;
	private List<EObject> modelObjects = new ArrayList<>();
	
	@Override
	public void engineStopped(IExecutionEngine<?> engine) {
		if (!TDLCoverageUtil.getInstance().getTestSuiteCoverage().isCoverageComputed()) {
			TDLCoverageUtil.getInstance().runCoverageComputation();
		}
		IExecutionContext<?, ?, ?> _executionContext = engine.getExecutionContext();
		pathToReportsFiles = _executionContext.getWorkspace().getExecutionPath().toString();
		testSuiteResource = getCopyOfTestSuite(_executionContext);
		TDLCoverageUtil.getInstance().getTestSuiteCoverage().getCoverageReports()
			.forEach(r -> saveCoverageReport(r));
	}
		
	private void saveCoverageReport(TestCoverageReport report) {
		TestSuiteCoverage tsCoverage = createTestSuiteObjectCoverage(report);
		//create a resource for the test coverage
		URI tsCoverageURI = URI.createURI(pathToReportsFiles + File.separator + report.getReportTitle() + ".xmi", false);
		Resource tsCoverageResource = (new ResourceSetImpl()).createResource(tsCoverageURI);
		tsCoverageResource.getContents().add(tsCoverage);
		//saving resources
		try {
			tsCoverageResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private TestSuiteCoverage createTestSuiteObjectCoverage (TestCoverageReport tsReport) {
	   //create test coverage according to the TDLTestCoverage.ecore structure
	   org.etsi.mts.tdl.Package copiedTestSuite = (org.etsi.mts.tdl.Package) testSuiteResource.getContents().get(0);
	   TDLTestSuiteCoverage tsCoveragObject = TDLCoverageUtil.getInstance().getTestSuiteCoverage();
	   TestSuiteCoverage testSuiteCoverage = TestCoverageFactory.eINSTANCE.createTestSuiteCoverage();
	   testSuiteCoverage.setTestSuite(copiedTestSuite);
	   testSuiteCoverage.setCoveragePercentage(tsReport.getCoveragePercentage());

	   for (TDLTestCaseCoverage tcCoverageObject : tsCoveragObject.getTcCoverages()) {
		   String testCaseName = tcCoverageObject.getTestCaseName();
		   Optional<PackageableElement> optionalTC = copiedTestSuite.getPackagedElement().stream().
				   filter(p -> p instanceof TestDescription).
				   filter(t -> t.getName().equals(testCaseName)).findFirst();
		   if (optionalTC.isEmpty()) { break; }
		   TestDescription copiedTestCase = (TestDescription) optionalTC.get();
		   TestCaseCoverage testCaseCoverage = TestCoverageFactory.eINSTANCE.createTestCaseCoverage();
		   testCaseCoverage.setTestCase(copiedTestCase);
		   TestCoverageReport tcReport = tcCoverageObject.getTcCoverageRepot(tsReport.getReportTitle());
		   testCaseCoverage.setCoveragePercentage(tcReport.getCoveragePercentage());
		   
		   copyMUTResource(tcCoverageObject.getMUTResource(), copiedTestCase.getName()+"_"+tcReport.getReportTitle());
		   for (int i=0; i<tcReport.getObjects().size(); i++) {
			   ModelObjectCoverageStatus tcModelObjectCoverageStatus = TestCoverageFactory.eINSTANCE.createModelObjectCoverageStatus();
			   EObject modelObject = tcReport.getObjects().get(i);
			   tcModelObjectCoverageStatus.setModelObject(getEObjectFromCopiedMUT(modelObject));
			   String tcCoverage = "";
			   tcCoverage = tcReport.getObjectCoverageStatus().get(i);
			   tcModelObjectCoverageStatus.setCoverageStatus(getCoverageStatus(tcCoverage));
			   testCaseCoverage.getTcObjectCoverageStatus().add(tcModelObjectCoverageStatus);
		   }
		   testSuiteCoverage.getTestCaseCoverages().add(testCaseCoverage);
	   }
	   
	   for (int i=0; i<tsReport.getObjects().size(); i++) {
		   ModelObjectCoverageStatus tsModelObjectCoverageStatus = TestCoverageFactory.eINSTANCE.createModelObjectCoverageStatus();
		   EObject modelObject = tsReport.getObjects().get(i);
		   tsModelObjectCoverageStatus.setModelObject(getEObjectFromCopiedMUT(modelObject));
		   String tsCoverage = "";
		   tsCoverage = tsReport.getObjectCoverageStatus().get(i);
		   tsModelObjectCoverageStatus.setCoverageStatus(getCoverageStatus(tsCoverage));
		   testSuiteCoverage.getTsObjectCoverageStatus().add(tsModelObjectCoverageStatus);
	   }
	   return testSuiteCoverage;
	}
	
	private CoverageStatus getCoverageStatus(String coverage) {
		if (coverage == TDLCoverageUtil.COVERED) {
			return CoverageStatus.COVERED;
		}
		else if (coverage == TDLCoverageUtil.NOT_COVERED) {
			return CoverageStatus.NOTCOVERED;
		}
		else if (coverage == TDLCoverageUtil.NOSTATUS) {
			return CoverageStatus.NOSTATUS;
		}
		return null;
	}

	private Resource getCopyOfTestSuite(IExecutionContext<?, ?, ?> _executionContext) {
		String copiedTestSuitePath = pathToReportsFiles + File.separator 
				+ _executionContext.getResourceModel().getURI().lastSegment();
		URI copiedTestSuiteURI = URI.createPlatformResourceURI(copiedTestSuitePath, false);
		return (new ResourceSetImpl()).getResource(copiedTestSuiteURI, true);
	}
	
	//save the model under test if it is not saved or if it is different from the current saved file
	private void copyMUTResource (Resource resource, String testID) {
		URI modelURI = null;
		String path = pathToReportsFiles + File.separator + "testedModels"+ File.separator;
		if (MUTResource == null) {
			modelURI = URI.createURI(path +"mut.xmi", false);
		}
		//the test case uses a different model under test
		else if (!EcoreUtil.equals(MUTResource.getContents().get(0), resource.getContents().get(0))) {
			modelURI = URI.createURI(path + "mut_" + testID + ".xmi", false);
		}
		//the model under test is already copied, so do nothing
		else {return;}
		
		MUTResource = (new ResourceSetImpl()).createResource(modelURI);
		MUTResource.getContents().addAll(EcoreUtil.copyAll(resource.getContents()));
	    try {
	    	MUTResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    TreeIterator<EObject> modelContents = MUTResource.getAllContents();
		while (modelContents.hasNext()) {
			modelObjects.add(modelContents.next());
		}
	}
	
	private EObject getEObjectFromCopiedMUT (EObject eobject) {
		EcoreUtil.resolveAll(eobject);
		if (modelObjects.stream().filter(o -> EcoreUtil.equals(o, eobject)).findFirst().isEmpty()) {
			System.out.println("cannot find eobject " + eobject);
		}
		Optional<EObject> matchedEObject = modelObjects.stream().filter(o -> EcoreUtil.equals(o, eobject)).findFirst();
		if (matchedEObject.isPresent()) {
			return matchedEObject.get();
		}
		return null;
	}
}
