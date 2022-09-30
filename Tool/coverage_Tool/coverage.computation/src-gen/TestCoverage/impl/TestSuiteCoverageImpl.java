/**
 */
package TestCoverage.impl;

import TestCoverage.ModelObjectCoverageStatus;
import TestCoverage.TestCaseCoverage;
import TestCoverage.TestCoveragePackage;
import TestCoverage.TestSuiteCoverage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Suite Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestCoverage.impl.TestSuiteCoverageImpl#getTestSuite <em>Test Suite</em>}</li>
 *   <li>{@link TestCoverage.impl.TestSuiteCoverageImpl#getTestCaseCoverages <em>Test Case Coverages</em>}</li>
 *   <li>{@link TestCoverage.impl.TestSuiteCoverageImpl#getTsObjectCoverageStatus <em>Ts Object Coverage Status</em>}</li>
 *   <li>{@link TestCoverage.impl.TestSuiteCoverageImpl#getCoveragePercentage <em>Coverage Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestSuiteCoverageImpl extends MinimalEObjectImpl.Container implements TestSuiteCoverage {
	/**
	 * The cached value of the '{@link #getTestSuite() <em>Test Suite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestSuite()
	 * @generated
	 * @ordered
	 */
	protected org.etsi.mts.tdl.Package testSuite;

	/**
	 * The cached value of the '{@link #getTestCaseCoverages() <em>Test Case Coverages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCaseCoverages()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCaseCoverage> testCaseCoverages;

	/**
	 * The cached value of the '{@link #getTsObjectCoverageStatus() <em>Ts Object Coverage Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTsObjectCoverageStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelObjectCoverageStatus> tsObjectCoverageStatus;

	/**
	 * The default value of the '{@link #getCoveragePercentage() <em>Coverage Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveragePercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double COVERAGE_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCoveragePercentage() <em>Coverage Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveragePercentage()
	 * @generated
	 * @ordered
	 */
	protected double coveragePercentage = COVERAGE_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuiteCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestCoveragePackage.Literals.TEST_SUITE_COVERAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.etsi.mts.tdl.Package getTestSuite() {
		if (testSuite != null && testSuite.eIsProxy()) {
			InternalEObject oldTestSuite = (InternalEObject)testSuite;
			testSuite = (org.etsi.mts.tdl.Package)eResolveProxy(oldTestSuite);
			if (testSuite != oldTestSuite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_SUITE, oldTestSuite, testSuite));
			}
		}
		return testSuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.etsi.mts.tdl.Package basicGetTestSuite() {
		return testSuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestSuite(org.etsi.mts.tdl.Package newTestSuite) {
		org.etsi.mts.tdl.Package oldTestSuite = testSuite;
		testSuite = newTestSuite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_SUITE, oldTestSuite, testSuite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCaseCoverage> getTestCaseCoverages() {
		if (testCaseCoverages == null) {
			testCaseCoverages = new EObjectContainmentEList<TestCaseCoverage>(TestCaseCoverage.class, this, TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_CASE_COVERAGES);
		}
		return testCaseCoverages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelObjectCoverageStatus> getTsObjectCoverageStatus() {
		if (tsObjectCoverageStatus == null) {
			tsObjectCoverageStatus = new EObjectContainmentEList<ModelObjectCoverageStatus>(ModelObjectCoverageStatus.class, this, TestCoveragePackage.TEST_SUITE_COVERAGE__TS_OBJECT_COVERAGE_STATUS);
		}
		return tsObjectCoverageStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCoveragePercentage() {
		return coveragePercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoveragePercentage(double newCoveragePercentage) {
		double oldCoveragePercentage = coveragePercentage;
		coveragePercentage = newCoveragePercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestCoveragePackage.TEST_SUITE_COVERAGE__COVERAGE_PERCENTAGE, oldCoveragePercentage, coveragePercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_CASE_COVERAGES:
				return ((InternalEList<?>)getTestCaseCoverages()).basicRemove(otherEnd, msgs);
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TS_OBJECT_COVERAGE_STATUS:
				return ((InternalEList<?>)getTsObjectCoverageStatus()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_SUITE:
				if (resolve) return getTestSuite();
				return basicGetTestSuite();
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_CASE_COVERAGES:
				return getTestCaseCoverages();
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TS_OBJECT_COVERAGE_STATUS:
				return getTsObjectCoverageStatus();
			case TestCoveragePackage.TEST_SUITE_COVERAGE__COVERAGE_PERCENTAGE:
				return getCoveragePercentage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_SUITE:
				setTestSuite((org.etsi.mts.tdl.Package)newValue);
				return;
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_CASE_COVERAGES:
				getTestCaseCoverages().clear();
				getTestCaseCoverages().addAll((Collection<? extends TestCaseCoverage>)newValue);
				return;
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TS_OBJECT_COVERAGE_STATUS:
				getTsObjectCoverageStatus().clear();
				getTsObjectCoverageStatus().addAll((Collection<? extends ModelObjectCoverageStatus>)newValue);
				return;
			case TestCoveragePackage.TEST_SUITE_COVERAGE__COVERAGE_PERCENTAGE:
				setCoveragePercentage((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_SUITE:
				setTestSuite((org.etsi.mts.tdl.Package)null);
				return;
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_CASE_COVERAGES:
				getTestCaseCoverages().clear();
				return;
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TS_OBJECT_COVERAGE_STATUS:
				getTsObjectCoverageStatus().clear();
				return;
			case TestCoveragePackage.TEST_SUITE_COVERAGE__COVERAGE_PERCENTAGE:
				setCoveragePercentage(COVERAGE_PERCENTAGE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_SUITE:
				return testSuite != null;
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TEST_CASE_COVERAGES:
				return testCaseCoverages != null && !testCaseCoverages.isEmpty();
			case TestCoveragePackage.TEST_SUITE_COVERAGE__TS_OBJECT_COVERAGE_STATUS:
				return tsObjectCoverageStatus != null && !tsObjectCoverageStatus.isEmpty();
			case TestCoveragePackage.TEST_SUITE_COVERAGE__COVERAGE_PERCENTAGE:
				return coveragePercentage != COVERAGE_PERCENTAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (coveragePercentage: ");
		result.append(coveragePercentage);
		result.append(')');
		return result.toString();
	}

} //TestSuiteCoverageImpl
