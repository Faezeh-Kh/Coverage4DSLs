/**
 */
package TestCoverage.impl;

import TestCoverage.CoverageStatus;
import TestCoverage.ModelObjectCoverageStatus;
import TestCoverage.TestCaseCoverage;
import TestCoverage.TestCoverageFactory;
import TestCoverage.TestCoveragePackage;
import TestCoverage.TestSuiteCoverage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.etsi.mts.tdl.tdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestCoveragePackageImpl extends EPackageImpl implements TestCoveragePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteCoverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseCoverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelObjectCoverageStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coverageStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TestCoverage.TestCoveragePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestCoveragePackageImpl() {
		super(eNS_URI, TestCoverageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TestCoveragePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestCoveragePackage init() {
		if (isInited) return (TestCoveragePackage)EPackage.Registry.INSTANCE.getEPackage(TestCoveragePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestCoveragePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestCoveragePackageImpl theTestCoveragePackage = registeredTestCoveragePackage instanceof TestCoveragePackageImpl ? (TestCoveragePackageImpl)registeredTestCoveragePackage : new TestCoveragePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		tdlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTestCoveragePackage.createPackageContents();

		// Initialize created meta-data
		theTestCoveragePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestCoveragePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestCoveragePackage.eNS_URI, theTestCoveragePackage);
		return theTestCoveragePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuiteCoverage() {
		return testSuiteCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuiteCoverage_TestSuite() {
		return (EReference)testSuiteCoverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuiteCoverage_TestCaseCoverages() {
		return (EReference)testSuiteCoverageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuiteCoverage_TsObjectCoverageStatus() {
		return (EReference)testSuiteCoverageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSuiteCoverage_CoveragePercentage() {
		return (EAttribute)testSuiteCoverageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCaseCoverage() {
		return testCaseCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCaseCoverage_TestCase() {
		return (EReference)testCaseCoverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCaseCoverage_TcObjectCoverageStatus() {
		return (EReference)testCaseCoverageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCaseCoverage_CoveragePercentage() {
		return (EAttribute)testCaseCoverageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelObjectCoverageStatus() {
		return modelObjectCoverageStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelObjectCoverageStatus_ModelObject() {
		return (EReference)modelObjectCoverageStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelObjectCoverageStatus_CoverageStatus() {
		return (EAttribute)modelObjectCoverageStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoverageStatus() {
		return coverageStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCoverageFactory getTestCoverageFactory() {
		return (TestCoverageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		testSuiteCoverageEClass = createEClass(TEST_SUITE_COVERAGE);
		createEReference(testSuiteCoverageEClass, TEST_SUITE_COVERAGE__TEST_SUITE);
		createEReference(testSuiteCoverageEClass, TEST_SUITE_COVERAGE__TEST_CASE_COVERAGES);
		createEReference(testSuiteCoverageEClass, TEST_SUITE_COVERAGE__TS_OBJECT_COVERAGE_STATUS);
		createEAttribute(testSuiteCoverageEClass, TEST_SUITE_COVERAGE__COVERAGE_PERCENTAGE);

		testCaseCoverageEClass = createEClass(TEST_CASE_COVERAGE);
		createEReference(testCaseCoverageEClass, TEST_CASE_COVERAGE__TEST_CASE);
		createEReference(testCaseCoverageEClass, TEST_CASE_COVERAGE__TC_OBJECT_COVERAGE_STATUS);
		createEAttribute(testCaseCoverageEClass, TEST_CASE_COVERAGE__COVERAGE_PERCENTAGE);

		modelObjectCoverageStatusEClass = createEClass(MODEL_OBJECT_COVERAGE_STATUS);
		createEReference(modelObjectCoverageStatusEClass, MODEL_OBJECT_COVERAGE_STATUS__MODEL_OBJECT);
		createEAttribute(modelObjectCoverageStatusEClass, MODEL_OBJECT_COVERAGE_STATUS__COVERAGE_STATUS);

		// Create enums
		coverageStatusEEnum = createEEnum(COVERAGE_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		tdlPackage thetdlPackage = (tdlPackage)EPackage.Registry.INSTANCE.getEPackage(tdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(testSuiteCoverageEClass, TestSuiteCoverage.class, "TestSuiteCoverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSuiteCoverage_TestSuite(), thetdlPackage.getPackage(), null, "testSuite", null, 1, 1, TestSuiteCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSuiteCoverage_TestCaseCoverages(), this.getTestCaseCoverage(), null, "testCaseCoverages", null, 1, -1, TestSuiteCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSuiteCoverage_TsObjectCoverageStatus(), this.getModelObjectCoverageStatus(), null, "tsObjectCoverageStatus", null, 1, -1, TestSuiteCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSuiteCoverage_CoveragePercentage(), ecorePackage.getEDouble(), "coveragePercentage", null, 1, 1, TestSuiteCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseCoverageEClass, TestCaseCoverage.class, "TestCaseCoverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestCaseCoverage_TestCase(), thetdlPackage.getTestDescription(), null, "testCase", null, 1, 1, TestCaseCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCaseCoverage_TcObjectCoverageStatus(), this.getModelObjectCoverageStatus(), null, "tcObjectCoverageStatus", null, 1, -1, TestCaseCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestCaseCoverage_CoveragePercentage(), ecorePackage.getEDouble(), "coveragePercentage", null, 1, 1, TestCaseCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelObjectCoverageStatusEClass, ModelObjectCoverageStatus.class, "ModelObjectCoverageStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelObjectCoverageStatus_ModelObject(), ecorePackage.getEObject(), null, "modelObject", null, 1, 1, ModelObjectCoverageStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelObjectCoverageStatus_CoverageStatus(), this.getCoverageStatus(), "coverageStatus", null, 1, 1, ModelObjectCoverageStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(coverageStatusEEnum, CoverageStatus.class, "CoverageStatus");
		addEEnumLiteral(coverageStatusEEnum, CoverageStatus.COVERED);
		addEEnumLiteral(coverageStatusEEnum, CoverageStatus.NOTCOVERED);
		addEEnumLiteral(coverageStatusEEnum, CoverageStatus.NOSTATUS);

		// Create resource
		createResource(eNS_URI);
	}

} //TestCoveragePackageImpl
