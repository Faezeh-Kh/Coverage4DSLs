/**
 */
package TestCoverage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TestCoverage.TestCoverageFactory
 * @model kind="package"
 * @generated
 */
public interface TestCoveragePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestCoverage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://coverage.metamodel/TestCoverage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TestCoverage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestCoveragePackage eINSTANCE = TestCoverage.impl.TestCoveragePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestCoverage.impl.TestSuiteCoverageImpl <em>Test Suite Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestCoverage.impl.TestSuiteCoverageImpl
	 * @see TestCoverage.impl.TestCoveragePackageImpl#getTestSuiteCoverage()
	 * @generated
	 */
	int TEST_SUITE_COVERAGE = 0;

	/**
	 * The feature id for the '<em><b>Test Suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_COVERAGE__TEST_SUITE = 0;

	/**
	 * The feature id for the '<em><b>Test Case Coverages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_COVERAGE__TEST_CASE_COVERAGES = 1;

	/**
	 * The feature id for the '<em><b>Ts Object Coverage Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_COVERAGE__TS_OBJECT_COVERAGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Coverage Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_COVERAGE__COVERAGE_PERCENTAGE = 3;

	/**
	 * The number of structural features of the '<em>Test Suite Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_COVERAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Test Suite Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_COVERAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestCoverage.impl.TestCaseCoverageImpl <em>Test Case Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestCoverage.impl.TestCaseCoverageImpl
	 * @see TestCoverage.impl.TestCoveragePackageImpl#getTestCaseCoverage()
	 * @generated
	 */
	int TEST_CASE_COVERAGE = 1;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_COVERAGE__TEST_CASE = 0;

	/**
	 * The feature id for the '<em><b>Tc Object Coverage Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_COVERAGE__TC_OBJECT_COVERAGE_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Coverage Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_COVERAGE__COVERAGE_PERCENTAGE = 2;

	/**
	 * The number of structural features of the '<em>Test Case Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_COVERAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Test Case Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_COVERAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestCoverage.impl.ModelObjectCoverageStatusImpl <em>Model Object Coverage Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestCoverage.impl.ModelObjectCoverageStatusImpl
	 * @see TestCoverage.impl.TestCoveragePackageImpl#getModelObjectCoverageStatus()
	 * @generated
	 */
	int MODEL_OBJECT_COVERAGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Model Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT_COVERAGE_STATUS__MODEL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Coverage Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT_COVERAGE_STATUS__COVERAGE_STATUS = 1;

	/**
	 * The number of structural features of the '<em>Model Object Coverage Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT_COVERAGE_STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Object Coverage Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT_COVERAGE_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestCoverage.CoverageStatus <em>Coverage Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestCoverage.CoverageStatus
	 * @see TestCoverage.impl.TestCoveragePackageImpl#getCoverageStatus()
	 * @generated
	 */
	int COVERAGE_STATUS = 3;


	/**
	 * Returns the meta object for class '{@link TestCoverage.TestSuiteCoverage <em>Test Suite Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite Coverage</em>'.
	 * @see TestCoverage.TestSuiteCoverage
	 * @generated
	 */
	EClass getTestSuiteCoverage();

	/**
	 * Returns the meta object for the reference '{@link TestCoverage.TestSuiteCoverage#getTestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test Suite</em>'.
	 * @see TestCoverage.TestSuiteCoverage#getTestSuite()
	 * @see #getTestSuiteCoverage()
	 * @generated
	 */
	EReference getTestSuiteCoverage_TestSuite();

	/**
	 * Returns the meta object for the containment reference list '{@link TestCoverage.TestSuiteCoverage#getTestCaseCoverages <em>Test Case Coverages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Case Coverages</em>'.
	 * @see TestCoverage.TestSuiteCoverage#getTestCaseCoverages()
	 * @see #getTestSuiteCoverage()
	 * @generated
	 */
	EReference getTestSuiteCoverage_TestCaseCoverages();

	/**
	 * Returns the meta object for the containment reference list '{@link TestCoverage.TestSuiteCoverage#getTsObjectCoverageStatus <em>Ts Object Coverage Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ts Object Coverage Status</em>'.
	 * @see TestCoverage.TestSuiteCoverage#getTsObjectCoverageStatus()
	 * @see #getTestSuiteCoverage()
	 * @generated
	 */
	EReference getTestSuiteCoverage_TsObjectCoverageStatus();

	/**
	 * Returns the meta object for the attribute '{@link TestCoverage.TestSuiteCoverage#getCoveragePercentage <em>Coverage Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage Percentage</em>'.
	 * @see TestCoverage.TestSuiteCoverage#getCoveragePercentage()
	 * @see #getTestSuiteCoverage()
	 * @generated
	 */
	EAttribute getTestSuiteCoverage_CoveragePercentage();

	/**
	 * Returns the meta object for class '{@link TestCoverage.TestCaseCoverage <em>Test Case Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case Coverage</em>'.
	 * @see TestCoverage.TestCaseCoverage
	 * @generated
	 */
	EClass getTestCaseCoverage();

	/**
	 * Returns the meta object for the reference '{@link TestCoverage.TestCaseCoverage#getTestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test Case</em>'.
	 * @see TestCoverage.TestCaseCoverage#getTestCase()
	 * @see #getTestCaseCoverage()
	 * @generated
	 */
	EReference getTestCaseCoverage_TestCase();

	/**
	 * Returns the meta object for the containment reference list '{@link TestCoverage.TestCaseCoverage#getTcObjectCoverageStatus <em>Tc Object Coverage Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tc Object Coverage Status</em>'.
	 * @see TestCoverage.TestCaseCoverage#getTcObjectCoverageStatus()
	 * @see #getTestCaseCoverage()
	 * @generated
	 */
	EReference getTestCaseCoverage_TcObjectCoverageStatus();

	/**
	 * Returns the meta object for the attribute '{@link TestCoverage.TestCaseCoverage#getCoveragePercentage <em>Coverage Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage Percentage</em>'.
	 * @see TestCoverage.TestCaseCoverage#getCoveragePercentage()
	 * @see #getTestCaseCoverage()
	 * @generated
	 */
	EAttribute getTestCaseCoverage_CoveragePercentage();

	/**
	 * Returns the meta object for class '{@link TestCoverage.ModelObjectCoverageStatus <em>Model Object Coverage Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Object Coverage Status</em>'.
	 * @see TestCoverage.ModelObjectCoverageStatus
	 * @generated
	 */
	EClass getModelObjectCoverageStatus();

	/**
	 * Returns the meta object for the reference '{@link TestCoverage.ModelObjectCoverageStatus#getModelObject <em>Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Object</em>'.
	 * @see TestCoverage.ModelObjectCoverageStatus#getModelObject()
	 * @see #getModelObjectCoverageStatus()
	 * @generated
	 */
	EReference getModelObjectCoverageStatus_ModelObject();

	/**
	 * Returns the meta object for the attribute '{@link TestCoverage.ModelObjectCoverageStatus#getCoverageStatus <em>Coverage Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage Status</em>'.
	 * @see TestCoverage.ModelObjectCoverageStatus#getCoverageStatus()
	 * @see #getModelObjectCoverageStatus()
	 * @generated
	 */
	EAttribute getModelObjectCoverageStatus_CoverageStatus();

	/**
	 * Returns the meta object for enum '{@link TestCoverage.CoverageStatus <em>Coverage Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Status</em>'.
	 * @see TestCoverage.CoverageStatus
	 * @generated
	 */
	EEnum getCoverageStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestCoverageFactory getTestCoverageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TestCoverage.impl.TestSuiteCoverageImpl <em>Test Suite Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestCoverage.impl.TestSuiteCoverageImpl
		 * @see TestCoverage.impl.TestCoveragePackageImpl#getTestSuiteCoverage()
		 * @generated
		 */
		EClass TEST_SUITE_COVERAGE = eINSTANCE.getTestSuiteCoverage();

		/**
		 * The meta object literal for the '<em><b>Test Suite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE_COVERAGE__TEST_SUITE = eINSTANCE.getTestSuiteCoverage_TestSuite();

		/**
		 * The meta object literal for the '<em><b>Test Case Coverages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE_COVERAGE__TEST_CASE_COVERAGES = eINSTANCE.getTestSuiteCoverage_TestCaseCoverages();

		/**
		 * The meta object literal for the '<em><b>Ts Object Coverage Status</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE_COVERAGE__TS_OBJECT_COVERAGE_STATUS = eINSTANCE.getTestSuiteCoverage_TsObjectCoverageStatus();

		/**
		 * The meta object literal for the '<em><b>Coverage Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SUITE_COVERAGE__COVERAGE_PERCENTAGE = eINSTANCE.getTestSuiteCoverage_CoveragePercentage();

		/**
		 * The meta object literal for the '{@link TestCoverage.impl.TestCaseCoverageImpl <em>Test Case Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestCoverage.impl.TestCaseCoverageImpl
		 * @see TestCoverage.impl.TestCoveragePackageImpl#getTestCaseCoverage()
		 * @generated
		 */
		EClass TEST_CASE_COVERAGE = eINSTANCE.getTestCaseCoverage();

		/**
		 * The meta object literal for the '<em><b>Test Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE_COVERAGE__TEST_CASE = eINSTANCE.getTestCaseCoverage_TestCase();

		/**
		 * The meta object literal for the '<em><b>Tc Object Coverage Status</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE_COVERAGE__TC_OBJECT_COVERAGE_STATUS = eINSTANCE.getTestCaseCoverage_TcObjectCoverageStatus();

		/**
		 * The meta object literal for the '<em><b>Coverage Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE_COVERAGE__COVERAGE_PERCENTAGE = eINSTANCE.getTestCaseCoverage_CoveragePercentage();

		/**
		 * The meta object literal for the '{@link TestCoverage.impl.ModelObjectCoverageStatusImpl <em>Model Object Coverage Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestCoverage.impl.ModelObjectCoverageStatusImpl
		 * @see TestCoverage.impl.TestCoveragePackageImpl#getModelObjectCoverageStatus()
		 * @generated
		 */
		EClass MODEL_OBJECT_COVERAGE_STATUS = eINSTANCE.getModelObjectCoverageStatus();

		/**
		 * The meta object literal for the '<em><b>Model Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_OBJECT_COVERAGE_STATUS__MODEL_OBJECT = eINSTANCE.getModelObjectCoverageStatus_ModelObject();

		/**
		 * The meta object literal for the '<em><b>Coverage Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_OBJECT_COVERAGE_STATUS__COVERAGE_STATUS = eINSTANCE.getModelObjectCoverageStatus_CoverageStatus();

		/**
		 * The meta object literal for the '{@link TestCoverage.CoverageStatus <em>Coverage Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestCoverage.CoverageStatus
		 * @see TestCoverage.impl.TestCoveragePackageImpl#getCoverageStatus()
		 * @generated
		 */
		EEnum COVERAGE_STATUS = eINSTANCE.getCoverageStatus();

	}

} //TestCoveragePackage
