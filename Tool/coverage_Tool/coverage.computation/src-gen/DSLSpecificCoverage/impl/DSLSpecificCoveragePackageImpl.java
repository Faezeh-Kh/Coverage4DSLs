/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.ConditionType;
import DSLSpecificCoverage.ConditionalIgnore;
import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.CoverageByContent;
import DSLSpecificCoverage.CoverageOfReferenced;
import DSLSpecificCoverage.CoveredContents;
import DSLSpecificCoverage.DSLSpecificCoverageFactory;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;
import DSLSpecificCoverage.DomainSpecificCoverage;
import DSLSpecificCoverage.Ignore;
import DSLSpecificCoverage.Rule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSLSpecificCoveragePackageImpl extends EPackageImpl implements DSLSpecificCoveragePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSpecificCoverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageOfReferencedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageByContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalIgnoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coveredContentsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionTypeEEnum = null;

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
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DSLSpecificCoveragePackageImpl() {
		super(eNS_URI, DSLSpecificCoverageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DSLSpecificCoveragePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DSLSpecificCoveragePackage init() {
		if (isInited) return (DSLSpecificCoveragePackage)EPackage.Registry.INSTANCE.getEPackage(DSLSpecificCoveragePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDSLSpecificCoveragePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DSLSpecificCoveragePackageImpl theDSLSpecificCoveragePackage = registeredDSLSpecificCoveragePackage instanceof DSLSpecificCoveragePackageImpl ? (DSLSpecificCoveragePackageImpl)registeredDSLSpecificCoveragePackage : new DSLSpecificCoveragePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDSLSpecificCoveragePackage.createPackageContents();

		// Initialize created meta-data
		theDSLSpecificCoveragePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDSLSpecificCoveragePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DSLSpecificCoveragePackage.eNS_URI, theDSLSpecificCoveragePackage);
		return theDSLSpecificCoveragePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSpecificCoverage() {
		return domainSpecificCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainSpecificCoverage_Name() {
		return (EAttribute)domainSpecificCoverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificCoverage_Contexts() {
		return (EReference)domainSpecificCoverageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificCoverage_Metamodel() {
		return (EReference)domainSpecificCoverageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Metaclass() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Rules() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgnore() {
		return ignoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIgnore_IgnoreSubtypes() {
		return (EAttribute)ignoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverageOfReferenced() {
		return coverageOfReferencedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageOfReferenced_Reference() {
		return (EReference)coverageOfReferencedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverageByContent() {
		return coverageByContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverageByContent_ContainmentReference() {
		return (EReference)coverageByContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoverageByContent_Multiplicity() {
		return (EAttribute)coverageByContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalIgnore() {
		return conditionalIgnoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalIgnore_Condition() {
		return (EAttribute)conditionalIgnoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalIgnore_ContainerType() {
		return (EReference)conditionalIgnoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoveredContents() {
		return coveredContentsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionType() {
		return conditionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLSpecificCoverageFactory getDSLSpecificCoverageFactory() {
		return (DSLSpecificCoverageFactory)getEFactoryInstance();
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
		domainSpecificCoverageEClass = createEClass(DOMAIN_SPECIFIC_COVERAGE);
		createEAttribute(domainSpecificCoverageEClass, DOMAIN_SPECIFIC_COVERAGE__NAME);
		createEReference(domainSpecificCoverageEClass, DOMAIN_SPECIFIC_COVERAGE__CONTEXTS);
		createEReference(domainSpecificCoverageEClass, DOMAIN_SPECIFIC_COVERAGE__METAMODEL);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__METACLASS);
		createEReference(contextEClass, CONTEXT__RULES);

		ruleEClass = createEClass(RULE);

		ignoreEClass = createEClass(IGNORE);
		createEAttribute(ignoreEClass, IGNORE__IGNORE_SUBTYPES);

		coverageOfReferencedEClass = createEClass(COVERAGE_OF_REFERENCED);
		createEReference(coverageOfReferencedEClass, COVERAGE_OF_REFERENCED__REFERENCE);

		coverageByContentEClass = createEClass(COVERAGE_BY_CONTENT);
		createEReference(coverageByContentEClass, COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE);
		createEAttribute(coverageByContentEClass, COVERAGE_BY_CONTENT__MULTIPLICITY);

		conditionalIgnoreEClass = createEClass(CONDITIONAL_IGNORE);
		createEAttribute(conditionalIgnoreEClass, CONDITIONAL_IGNORE__CONDITION);
		createEReference(conditionalIgnoreEClass, CONDITIONAL_IGNORE__CONTAINER_TYPE);

		// Create enums
		coveredContentsEEnum = createEEnum(COVERED_CONTENTS);
		conditionTypeEEnum = createEEnum(CONDITION_TYPE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ignoreEClass.getESuperTypes().add(this.getRule());
		coverageOfReferencedEClass.getESuperTypes().add(this.getRule());
		coverageByContentEClass.getESuperTypes().add(this.getRule());
		conditionalIgnoreEClass.getESuperTypes().add(this.getRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainSpecificCoverageEClass, DomainSpecificCoverage.class, "DomainSpecificCoverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSpecificCoverage_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainSpecificCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificCoverage_Contexts(), this.getContext(), null, "contexts", null, 1, -1, DomainSpecificCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificCoverage_Metamodel(), theEcorePackage.getEPackage(), null, "metamodel", null, 1, 1, DomainSpecificCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Metaclass(), theEcorePackage.getEClass(), null, "metaclass", null, 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Rules(), this.getRule(), null, "rules", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ignoreEClass, Ignore.class, "Ignore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIgnore_IgnoreSubtypes(), ecorePackage.getEBoolean(), "ignoreSubtypes", "true", 0, 1, Ignore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coverageOfReferencedEClass, CoverageOfReferenced.class, "CoverageOfReferenced", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoverageOfReferenced_Reference(), theEcorePackage.getEReference(), null, "reference", null, 1, 1, CoverageOfReferenced.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coverageByContentEClass, CoverageByContent.class, "CoverageByContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoverageByContent_ContainmentReference(), theEcorePackage.getEReference(), null, "containmentReference", null, 1, 1, CoverageByContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoverageByContent_Multiplicity(), this.getCoveredContents(), "multiplicity", null, 1, 1, CoverageByContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalIgnoreEClass, ConditionalIgnore.class, "ConditionalIgnore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalIgnore_Condition(), this.getConditionType(), "condition", null, 1, 1, ConditionalIgnore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalIgnore_ContainerType(), theEcorePackage.getEClass(), null, "containerType", null, 1, -1, ConditionalIgnore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(coveredContentsEEnum, CoveredContents.class, "CoveredContents");
		addEEnumLiteral(coveredContentsEEnum, CoveredContents.ALL);
		addEEnumLiteral(coveredContentsEEnum, CoveredContents.ONE);

		initEEnum(conditionTypeEEnum, ConditionType.class, "ConditionType");
		addEEnumLiteral(conditionTypeEEnum, ConditionType.INCLUSION);
		addEEnumLiteral(conditionTypeEEnum, ConditionType.EXCLUSION);

		// Create resource
		createResource(eNS_URI);
	}

} //DSLSpecificCoveragePackageImpl
