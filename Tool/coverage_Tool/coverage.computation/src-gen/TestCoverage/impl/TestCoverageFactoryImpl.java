/**
 */
package TestCoverage.impl;

import TestCoverage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestCoverageFactoryImpl extends EFactoryImpl implements TestCoverageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestCoverageFactory init() {
		try {
			TestCoverageFactory theTestCoverageFactory = (TestCoverageFactory)EPackage.Registry.INSTANCE.getEFactory(TestCoveragePackage.eNS_URI);
			if (theTestCoverageFactory != null) {
				return theTestCoverageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestCoverageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCoverageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TestCoveragePackage.TEST_SUITE_COVERAGE: return createTestSuiteCoverage();
			case TestCoveragePackage.TEST_CASE_COVERAGE: return createTestCaseCoverage();
			case TestCoveragePackage.MODEL_OBJECT_COVERAGE_STATUS: return createModelObjectCoverageStatus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TestCoveragePackage.COVERAGE_STATUS:
				return createCoverageStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TestCoveragePackage.COVERAGE_STATUS:
				return convertCoverageStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuiteCoverage createTestSuiteCoverage() {
		TestSuiteCoverageImpl testSuiteCoverage = new TestSuiteCoverageImpl();
		return testSuiteCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCaseCoverage createTestCaseCoverage() {
		TestCaseCoverageImpl testCaseCoverage = new TestCaseCoverageImpl();
		return testCaseCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelObjectCoverageStatus createModelObjectCoverageStatus() {
		ModelObjectCoverageStatusImpl modelObjectCoverageStatus = new ModelObjectCoverageStatusImpl();
		return modelObjectCoverageStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageStatus createCoverageStatusFromString(EDataType eDataType, String initialValue) {
		CoverageStatus result = CoverageStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCoveragePackage getTestCoveragePackage() {
		return (TestCoveragePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestCoveragePackage getPackage() {
		return TestCoveragePackage.eINSTANCE;
	}

} //TestCoverageFactoryImpl
