package coverage.report;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import coverage.computation.TDLCoverageUtil;

public class TestCoverageReport {

	private String reportTitle;
	private Set<String> coverableClasses;
	private List<EObject> objects;
	private List<String> objectCoverageStatus;
	
	private int numOfCoveredObjs;
	private int numOfCoverableElements;
	private int numOfNotCoverableElements;
	private double coveragePercentage;
	
	public TestCoverageReport(String title) {
		reportTitle = title;
		coverableClasses = new HashSet<>();
		objects = new ArrayList<>();
		objectCoverageStatus = new ArrayList<>();
		numOfCoveredObjs = 0;
		numOfCoverableElements = 0;
		numOfNotCoverableElements = 0;
	}
	
	//The initial coverage status for all objects is not-covered
	public void setInitialCoverageStatus() {
		if (objects != null) {
			objects.forEach(o -> objectCoverageStatus.add(TDLCoverageUtil.NOT_COVERED));
		}
	}
		
	public String getObjectCoverage(EObject object) {
		int objectIndex = objects.indexOf(object);
		if (objectIndex != -1){
			return objectCoverageStatus.get(objectIndex);
		}
		return null;
	}
	
	public void setObjectCoverage(EObject object, String coverageStatus) {
		int objectIndex = objects.indexOf(object);
		if (objectIndex != -1) {
			if (objectCoverageStatus.get(objectIndex) != TDLCoverageUtil.COVERED){
				objectCoverageStatus.set(objectIndex, coverageStatus);
			}
		}
	}
	
	public void setObjectNotCoverable(EObject object) {
		int objectIndex = objects.indexOf(object);
		if (objectIndex != -1){
			objectCoverageStatus.set(objectIndex, TDLCoverageUtil.NOSTATUS);
		}
	}
	
	//if not-covered eobjects are of the not-coverable types, set their status as not-coverable
	public void findNotCoverableObjects() {
		for (int i=0; i<objectCoverageStatus.size(); i++) {
			if (objectCoverageStatus.get(i) == TDLCoverageUtil.NOT_COVERED &&
					!coverableClasses.contains(objects.get(i).eClass().getName())) {
				objectCoverageStatus.set(i, TDLCoverageUtil.NOSTATUS);
			}
		}
	}
	
	public double computeCoveragePercentage() {
		for (String coverage:objectCoverageStatus) {
			if (coverage == TDLCoverageUtil.NOSTATUS) {
				numOfNotCoverableElements++;
			}
			else if (coverage == TDLCoverageUtil.COVERED) {
				numOfCoveredObjs++;
			}
		}
		numOfCoverableElements = objectCoverageStatus.size() - numOfNotCoverableElements;
		coveragePercentage = (double)(numOfCoveredObjs*100)/numOfCoverableElements;
		try {
			BigDecimal bd = new BigDecimal(coveragePercentage).setScale(2, RoundingMode.HALF_UP);
			coveragePercentage = bd.doubleValue();
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException:" + coveragePercentage);
		}
		return coveragePercentage;
	}
	
	public void printCoverageResult(String reportOwner) {
		System.out.println(reportOwner + "-" + reportTitle + ": " + 
				numOfCoveredObjs + "/" 
				+ numOfCoverableElements+ " = " 
				+ coveragePercentage +"%");
	}

	public String getReportTitle() {
		return reportTitle;
	}

	public int getNumOfCoveredObjs() {
		return numOfCoveredObjs;
	}

	public int getNumOfCoverableElements() {
		return numOfCoverableElements;
	}

	public int getNumOfNotCoverableElements() {
		return numOfNotCoverableElements;
	}

	public Set<String> getCoverableClasses() {
		return coverableClasses;
	}
	public void setCoverableClasses(Set<String> coverableClasses) {
		this.coverableClasses.addAll(coverableClasses);
	}
	public List<EObject> getObjects() {
		return objects;
	}
	public void setObjects(List<EObject> modelObjects) {
		objects.addAll(modelObjects);
	}
	public List<String> getObjectCoverageStatus() {
		return objectCoverageStatus;
	}
	public void setObjectCoverageStatus(List<String> objectCoverageStatus) {
		this.objectCoverageStatus.addAll(objectCoverageStatus);
	}
	public double getCoveragePercentage() {
		return coveragePercentage;
	}
	public void setCoveragePercentage(double coveragePercentage) {
		this.coveragePercentage = coveragePercentage;
	}
		
}
