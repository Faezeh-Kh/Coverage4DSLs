/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.Branch;
import DSLSpecificCoverage.BranchSpecification;
import DSLSpecificCoverage.Condition;
import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.CoverageByContent;
import DSLSpecificCoverage.CoverageOfReferenced;
import DSLSpecificCoverage.CoveredContents;
import DSLSpecificCoverage.DSLSpecificCoverageFactory;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;
import DSLSpecificCoverage.DomainSpecificCoverage;
import DSLSpecificCoverage.ExclusionRule;
import DSLSpecificCoverage.ExplicitBranch;
import DSLSpecificCoverage.Ignore;
import DSLSpecificCoverage.ImplicitBranch;
import DSLSpecificCoverage.InclusionRule;
import DSLSpecificCoverage.LimitationType;
import DSLSpecificCoverage.LimitedIgnore;
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
	private EClass inclusionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionRuleEClass = null;

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
	private EClass ignoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitedIgnoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explicitBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

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
	private EEnum limitationTypeEEnum = null;

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
	public EReference getDomainSpecificCoverage_Metamodel() {
		return (EReference)domainSpecificCoverageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificCoverage_Contexts() {
		return (EReference)domainSpecificCoverageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSpecificCoverage_Imports() {
		return (EReference)domainSpecificCoverageEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getRule_Description() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Condition() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclusionRule() {
		return inclusionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusionRule() {
		return exclusionRuleEClass;
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
	public EClass getLimitedIgnore() {
		return limitedIgnoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimitedIgnore_Type() {
		return (EAttribute)limitedIgnoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLimitedIgnore_ContainerMetaclass() {
		return (EReference)limitedIgnoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranchSpecification() {
		return branchSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchSpecification_Branches() {
		return (EReference)branchSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplicitBranch() {
		return explicitBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExplicitBranch_OCLQuery() {
		return (EAttribute)explicitBranchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_OCLConstraint() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitBranch() {
		return implicitBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
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
	public EEnum getLimitationType() {
		return limitationTypeEEnum;
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
		createEReference(domainSpecificCoverageEClass, DOMAIN_SPECIFIC_COVERAGE__METAMODEL);
		createEReference(domainSpecificCoverageEClass, DOMAIN_SPECIFIC_COVERAGE__CONTEXTS);
		createEReference(domainSpecificCoverageEClass, DOMAIN_SPECIFIC_COVERAGE__IMPORTS);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__METACLASS);
		createEReference(contextEClass, CONTEXT__RULES);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__DESCRIPTION);
		createEReference(ruleEClass, RULE__CONDITION);

		inclusionRuleEClass = createEClass(INCLUSION_RULE);

		exclusionRuleEClass = createEClass(EXCLUSION_RULE);

		coverageOfReferencedEClass = createEClass(COVERAGE_OF_REFERENCED);
		createEReference(coverageOfReferencedEClass, COVERAGE_OF_REFERENCED__REFERENCE);

		coverageByContentEClass = createEClass(COVERAGE_BY_CONTENT);
		createEReference(coverageByContentEClass, COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE);
		createEAttribute(coverageByContentEClass, COVERAGE_BY_CONTENT__MULTIPLICITY);

		ignoreEClass = createEClass(IGNORE);
		createEAttribute(ignoreEClass, IGNORE__IGNORE_SUBTYPES);

		limitedIgnoreEClass = createEClass(LIMITED_IGNORE);
		createEAttribute(limitedIgnoreEClass, LIMITED_IGNORE__TYPE);
		createEReference(limitedIgnoreEClass, LIMITED_IGNORE__CONTAINER_METACLASS);

		branchSpecificationEClass = createEClass(BRANCH_SPECIFICATION);
		createEReference(branchSpecificationEClass, BRANCH_SPECIFICATION__BRANCHES);

		explicitBranchEClass = createEClass(EXPLICIT_BRANCH);
		createEAttribute(explicitBranchEClass, EXPLICIT_BRANCH__OCL_QUERY);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__OCL_CONSTRAINT);

		implicitBranchEClass = createEClass(IMPLICIT_BRANCH);

		branchEClass = createEClass(BRANCH);

		// Create enums
		coveredContentsEEnum = createEEnum(COVERED_CONTENTS);
		limitationTypeEEnum = createEEnum(LIMITATION_TYPE);
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
		inclusionRuleEClass.getESuperTypes().add(this.getRule());
		exclusionRuleEClass.getESuperTypes().add(this.getRule());
		coverageOfReferencedEClass.getESuperTypes().add(this.getInclusionRule());
		coverageByContentEClass.getESuperTypes().add(this.getInclusionRule());
		ignoreEClass.getESuperTypes().add(this.getExclusionRule());
		limitedIgnoreEClass.getESuperTypes().add(this.getExclusionRule());
		branchSpecificationEClass.getESuperTypes().add(this.getRule());
		explicitBranchEClass.getESuperTypes().add(this.getBranch());
		implicitBranchEClass.getESuperTypes().add(this.getBranch());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainSpecificCoverageEClass, DomainSpecificCoverage.class, "DomainSpecificCoverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainSpecificCoverage_Name(), ecorePackage.getEString(), "name", null, 1, 1, DomainSpecificCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificCoverage_Metamodel(), theEcorePackage.getEPackage(), null, "metamodel", null, 1, 1, DomainSpecificCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificCoverage_Contexts(), this.getContext(), null, "contexts", null, 1, -1, DomainSpecificCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSpecificCoverage_Imports(), this.getDomainSpecificCoverage(), null, "imports", null, 0, -1, DomainSpecificCoverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Metaclass(), theEcorePackage.getEClass(), null, "metaclass", null, 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Rules(), this.getRule(), null, "rules", null, 1, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Description(), ecorePackage.getEString(), "description", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Condition(), this.getCondition(), null, "condition", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inclusionRuleEClass, InclusionRule.class, "InclusionRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusionRuleEClass, ExclusionRule.class, "ExclusionRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coverageOfReferencedEClass, CoverageOfReferenced.class, "CoverageOfReferenced", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoverageOfReferenced_Reference(), theEcorePackage.getEReference(), null, "reference", null, 1, -1, CoverageOfReferenced.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coverageByContentEClass, CoverageByContent.class, "CoverageByContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoverageByContent_ContainmentReference(), theEcorePackage.getEReference(), null, "containmentReference", null, 1, 1, CoverageByContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoverageByContent_Multiplicity(), this.getCoveredContents(), "multiplicity", null, 1, 1, CoverageByContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ignoreEClass, Ignore.class, "Ignore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIgnore_IgnoreSubtypes(), ecorePackage.getEBoolean(), "ignoreSubtypes", "true", 0, 1, Ignore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(limitedIgnoreEClass, LimitedIgnore.class, "LimitedIgnore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLimitedIgnore_Type(), this.getLimitationType(), "type", null, 1, 1, LimitedIgnore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLimitedIgnore_ContainerMetaclass(), theEcorePackage.getEClass(), null, "containerMetaclass", null, 1, -1, LimitedIgnore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchSpecificationEClass, BranchSpecification.class, "BranchSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranchSpecification_Branches(), this.getBranch(), null, "branches", null, 1, -1, BranchSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(explicitBranchEClass, ExplicitBranch.class, "ExplicitBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExplicitBranch_OCLQuery(), ecorePackage.getEString(), "OCLQuery", null, 1, 1, ExplicitBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_OCLConstraint(), theEcorePackage.getEString(), "OCLConstraint", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicitBranchEClass, ImplicitBranch.class, "ImplicitBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(branchEClass, Branch.class, "Branch", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(coveredContentsEEnum, CoveredContents.class, "CoveredContents");
		addEEnumLiteral(coveredContentsEEnum, CoveredContents.ALL);
		addEEnumLiteral(coveredContentsEEnum, CoveredContents.ONE);

		initEEnum(limitationTypeEEnum, LimitationType.class, "LimitationType");
		addEEnumLiteral(limitationTypeEEnum, LimitationType.CONTAINED_BY);
		addEEnumLiteral(limitationTypeEEnum, LimitationType.NOT_CONTAINED_BY);

		// Create resource
		createResource(eNS_URI);
	}

} //DSLSpecificCoveragePackageImpl
