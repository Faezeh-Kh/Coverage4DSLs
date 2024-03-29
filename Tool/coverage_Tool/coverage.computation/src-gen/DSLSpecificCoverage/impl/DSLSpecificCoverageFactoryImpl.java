/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.*;

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
public class DSLSpecificCoverageFactoryImpl extends EFactoryImpl implements DSLSpecificCoverageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSLSpecificCoverageFactory init() {
		try {
			DSLSpecificCoverageFactory theDSLSpecificCoverageFactory = (DSLSpecificCoverageFactory)EPackage.Registry.INSTANCE.getEFactory(DSLSpecificCoveragePackage.eNS_URI);
			if (theDSLSpecificCoverageFactory != null) {
				return theDSLSpecificCoverageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DSLSpecificCoverageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLSpecificCoverageFactoryImpl() {
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
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE: return createDomainSpecificCoverage();
			case DSLSpecificCoveragePackage.IMPORT: return createImport();
			case DSLSpecificCoveragePackage.CONTEXT: return createContext();
			case DSLSpecificCoveragePackage.COVERAGE_OF_REFERENCED: return createCoverageOfReferenced();
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT: return createCoverageByContent();
			case DSLSpecificCoveragePackage.IGNORE: return createIgnore();
			case DSLSpecificCoveragePackage.LIMITED_IGNORE: return createLimitedIgnore();
			case DSLSpecificCoveragePackage.BRANCH_SPECIFICATION: return createBranchSpecification();
			case DSLSpecificCoveragePackage.EXPLICIT_BRANCH: return createExplicitBranch();
			case DSLSpecificCoveragePackage.CONDITION: return createCondition();
			case DSLSpecificCoveragePackage.IMPLICIT_BRANCH: return createImplicitBranch();
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
			case DSLSpecificCoveragePackage.COVERED_CONTENTS:
				return createCoveredContentsFromString(eDataType, initialValue);
			case DSLSpecificCoveragePackage.LIMITATION_TYPE:
				return createLimitationTypeFromString(eDataType, initialValue);
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
			case DSLSpecificCoveragePackage.COVERED_CONTENTS:
				return convertCoveredContentsToString(eDataType, instanceValue);
			case DSLSpecificCoveragePackage.LIMITATION_TYPE:
				return convertLimitationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSpecificCoverage createDomainSpecificCoverage() {
		DomainSpecificCoverageImpl domainSpecificCoverage = new DomainSpecificCoverageImpl();
		return domainSpecificCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageOfReferenced createCoverageOfReferenced() {
		CoverageOfReferencedImpl coverageOfReferenced = new CoverageOfReferencedImpl();
		return coverageOfReferenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageByContent createCoverageByContent() {
		CoverageByContentImpl coverageByContent = new CoverageByContentImpl();
		return coverageByContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ignore createIgnore() {
		IgnoreImpl ignore = new IgnoreImpl();
		return ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitedIgnore createLimitedIgnore() {
		LimitedIgnoreImpl limitedIgnore = new LimitedIgnoreImpl();
		return limitedIgnore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchSpecification createBranchSpecification() {
		BranchSpecificationImpl branchSpecification = new BranchSpecificationImpl();
		return branchSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitBranch createExplicitBranch() {
		ExplicitBranchImpl explicitBranch = new ExplicitBranchImpl();
		return explicitBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitBranch createImplicitBranch() {
		ImplicitBranchImpl implicitBranch = new ImplicitBranchImpl();
		return implicitBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoveredContents createCoveredContentsFromString(EDataType eDataType, String initialValue) {
		CoveredContents result = CoveredContents.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoveredContentsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitationType createLimitationTypeFromString(EDataType eDataType, String initialValue) {
		LimitationType result = LimitationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLimitationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLSpecificCoveragePackage getDSLSpecificCoveragePackage() {
		return (DSLSpecificCoveragePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DSLSpecificCoveragePackage getPackage() {
		return DSLSpecificCoveragePackage.eINSTANCE;
	}

} //DSLSpecificCoverageFactoryImpl
