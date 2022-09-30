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
			case DSLSpecificCoveragePackage.CONTEXT: return createContext();
			case DSLSpecificCoveragePackage.IGNORE: return createIgnore();
			case DSLSpecificCoveragePackage.COVERAGE_OF_REFERENCED: return createCoverageOfReferenced();
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT: return createCoverageByContent();
			case DSLSpecificCoveragePackage.CONDITIONAL_IGNORE: return createConditionalIgnore();
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
			case DSLSpecificCoveragePackage.CONDITION_TYPE:
				return createConditionTypeFromString(eDataType, initialValue);
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
			case DSLSpecificCoveragePackage.CONDITION_TYPE:
				return convertConditionTypeToString(eDataType, instanceValue);
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
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
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
	public ConditionalIgnore createConditionalIgnore() {
		ConditionalIgnoreImpl conditionalIgnore = new ConditionalIgnoreImpl();
		return conditionalIgnore;
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
	public ConditionType createConditionTypeFromString(EDataType eDataType, String initialValue) {
		ConditionType result = ConditionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionTypeToString(EDataType eDataType, Object instanceValue) {
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
