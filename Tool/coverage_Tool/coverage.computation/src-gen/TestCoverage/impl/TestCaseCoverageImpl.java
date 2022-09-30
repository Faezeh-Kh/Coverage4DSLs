/**
 */
package TestCoverage.impl;

import TestCoverage.ModelObjectCoverageStatus;
import TestCoverage.TestCaseCoverage;
import TestCoverage.TestCoveragePackage;

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

import org.etsi.mts.tdl.TestDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestCoverage.impl.TestCaseCoverageImpl#getTestCase <em>Test Case</em>}</li>
 *   <li>{@link TestCoverage.impl.TestCaseCoverageImpl#getTcObjectCoverageStatus <em>Tc Object Coverage Status</em>}</li>
 *   <li>{@link TestCoverage.impl.TestCaseCoverageImpl#getCoveragePercentage <em>Coverage Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestCaseCoverageImpl extends MinimalEObjectImpl.Container implements TestCaseCoverage {
	/**
	 * The cached value of the '{@link #getTestCase() <em>Test Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCase()
	 * @generated
	 * @ordered
	 */
	protected TestDescription testCase;

	/**
	 * The cached value of the '{@link #getTcObjectCoverageStatus() <em>Tc Object Coverage Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcObjectCoverageStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelObjectCoverageStatus> tcObjectCoverageStatus;

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
	protected TestCaseCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestCoveragePackage.Literals.TEST_CASE_COVERAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDescription getTestCase() {
		if (testCase != null && testCase.eIsProxy()) {
			InternalEObject oldTestCase = (InternalEObject)testCase;
			testCase = (TestDescription)eResolveProxy(oldTestCase);
			if (testCase != oldTestCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestCoveragePackage.TEST_CASE_COVERAGE__TEST_CASE, oldTestCase, testCase));
			}
		}
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDescription basicGetTestCase() {
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestCase(TestDescription newTestCase) {
		TestDescription oldTestCase = testCase;
		testCase = newTestCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestCoveragePackage.TEST_CASE_COVERAGE__TEST_CASE, oldTestCase, testCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelObjectCoverageStatus> getTcObjectCoverageStatus() {
		if (tcObjectCoverageStatus == null) {
			tcObjectCoverageStatus = new EObjectContainmentEList<ModelObjectCoverageStatus>(ModelObjectCoverageStatus.class, this, TestCoveragePackage.TEST_CASE_COVERAGE__TC_OBJECT_COVERAGE_STATUS);
		}
		return tcObjectCoverageStatus;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestCoveragePackage.TEST_CASE_COVERAGE__COVERAGE_PERCENTAGE, oldCoveragePercentage, coveragePercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestCoveragePackage.TEST_CASE_COVERAGE__TC_OBJECT_COVERAGE_STATUS:
				return ((InternalEList<?>)getTcObjectCoverageStatus()).basicRemove(otherEnd, msgs);
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
			case TestCoveragePackage.TEST_CASE_COVERAGE__TEST_CASE:
				if (resolve) return getTestCase();
				return basicGetTestCase();
			case TestCoveragePackage.TEST_CASE_COVERAGE__TC_OBJECT_COVERAGE_STATUS:
				return getTcObjectCoverageStatus();
			case TestCoveragePackage.TEST_CASE_COVERAGE__COVERAGE_PERCENTAGE:
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
			case TestCoveragePackage.TEST_CASE_COVERAGE__TEST_CASE:
				setTestCase((TestDescription)newValue);
				return;
			case TestCoveragePackage.TEST_CASE_COVERAGE__TC_OBJECT_COVERAGE_STATUS:
				getTcObjectCoverageStatus().clear();
				getTcObjectCoverageStatus().addAll((Collection<? extends ModelObjectCoverageStatus>)newValue);
				return;
			case TestCoveragePackage.TEST_CASE_COVERAGE__COVERAGE_PERCENTAGE:
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
			case TestCoveragePackage.TEST_CASE_COVERAGE__TEST_CASE:
				setTestCase((TestDescription)null);
				return;
			case TestCoveragePackage.TEST_CASE_COVERAGE__TC_OBJECT_COVERAGE_STATUS:
				getTcObjectCoverageStatus().clear();
				return;
			case TestCoveragePackage.TEST_CASE_COVERAGE__COVERAGE_PERCENTAGE:
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
			case TestCoveragePackage.TEST_CASE_COVERAGE__TEST_CASE:
				return testCase != null;
			case TestCoveragePackage.TEST_CASE_COVERAGE__TC_OBJECT_COVERAGE_STATUS:
				return tcObjectCoverageStatus != null && !tcObjectCoverageStatus.isEmpty();
			case TestCoveragePackage.TEST_CASE_COVERAGE__COVERAGE_PERCENTAGE:
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

} //TestCaseCoverageImpl
