/**
 */
package DSLSpecificCoverage;

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
 * @see DSLSpecificCoverage.DSLSpecificCoverageFactory
 * @model kind="package"
 * @generated
 */
public interface DSLSpecificCoveragePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DSLSpecificCoverage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://coverage/DSLSpecificCoverage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DSLSpecificCoverage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSLSpecificCoveragePackage eINSTANCE = DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl.init();

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.DomainSpecificCoverageImpl <em>Domain Specific Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.DomainSpecificCoverageImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getDomainSpecificCoverage()
	 * @generated
	 */
	int DOMAIN_SPECIFIC_COVERAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_COVERAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_COVERAGE__METAMODEL = 1;

	/**
	 * The feature id for the '<em><b>Coverage Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_COVERAGE__COVERAGE_METRICS = 2;

	/**
	 * The number of structural features of the '<em>Domain Specific Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_COVERAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain Specific Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SPECIFIC_COVERAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.ContextImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Metaclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__METACLASS = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__RULES = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.RuleImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.InclusionRuleImpl <em>Inclusion Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.InclusionRuleImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getInclusionRule()
	 * @generated
	 */
	int INCLUSION_RULE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_RULE__DESCRIPTION = RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_RULE__CONDITION = RULE__CONDITION;

	/**
	 * The number of structural features of the '<em>Inclusion Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inclusion Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.ExclusionRuleImpl <em>Exclusion Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.ExclusionRuleImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getExclusionRule()
	 * @generated
	 */
	int EXCLUSION_RULE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_RULE__DESCRIPTION = RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_RULE__CONDITION = RULE__CONDITION;

	/**
	 * The number of structural features of the '<em>Exclusion Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclusion Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSION_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.CoverageOfReferencedImpl <em>Coverage Of Referenced</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.CoverageOfReferencedImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getCoverageOfReferenced()
	 * @generated
	 */
	int COVERAGE_OF_REFERENCED = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_OF_REFERENCED__DESCRIPTION = INCLUSION_RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_OF_REFERENCED__CONDITION = INCLUSION_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_OF_REFERENCED__REFERENCE = INCLUSION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coverage Of Referenced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_OF_REFERENCED_FEATURE_COUNT = INCLUSION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coverage Of Referenced</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_OF_REFERENCED_OPERATION_COUNT = INCLUSION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.CoverageByContentImpl <em>Coverage By Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.CoverageByContentImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getCoverageByContent()
	 * @generated
	 */
	int COVERAGE_BY_CONTENT = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_BY_CONTENT__DESCRIPTION = INCLUSION_RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_BY_CONTENT__CONDITION = INCLUSION_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Containment Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE = INCLUSION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_BY_CONTENT__MULTIPLICITY = INCLUSION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coverage By Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_BY_CONTENT_FEATURE_COUNT = INCLUSION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Coverage By Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_BY_CONTENT_OPERATION_COUNT = INCLUSION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.IgnoreImpl <em>Ignore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.IgnoreImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getIgnore()
	 * @generated
	 */
	int IGNORE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE__DESCRIPTION = EXCLUSION_RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE__CONDITION = EXCLUSION_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Ignore Subtypes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE__IGNORE_SUBTYPES = EXCLUSION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ignore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_FEATURE_COUNT = EXCLUSION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ignore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPERATION_COUNT = EXCLUSION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.LimitedIgnoreImpl <em>Limited Ignore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.LimitedIgnoreImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getLimitedIgnore()
	 * @generated
	 */
	int LIMITED_IGNORE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITED_IGNORE__DESCRIPTION = EXCLUSION_RULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITED_IGNORE__CONDITION = EXCLUSION_RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITED_IGNORE__TYPE = EXCLUSION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Metaclass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITED_IGNORE__CONTAINER_METACLASS = EXCLUSION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Limited Ignore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITED_IGNORE_FEATURE_COUNT = EXCLUSION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Limited Ignore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITED_IGNORE_OPERATION_COUNT = EXCLUSION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.BranchSpecificationImpl <em>Branch Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.BranchSpecificationImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getBranchSpecification()
	 * @generated
	 */
	int BRANCH_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_SPECIFICATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_SPECIFICATION__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_SPECIFICATION__BRANCHES = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_SPECIFICATION__CONDITION = 3;

	/**
	 * The number of structural features of the '<em>Branch Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_SPECIFICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Branch Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.BranchImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 10;

	/**
	 * The feature id for the '<em><b>OCL Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__OCL_QUERY = 0;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.ConditionImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 11;

	/**
	 * The feature id for the '<em><b>OCL Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OCL_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.CoverageMetricImpl <em>Coverage Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.CoverageMetricImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getCoverageMetric()
	 * @generated
	 */
	int COVERAGE_METRIC = 12;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_METRIC__CONTEXTS = 0;

	/**
	 * The number of structural features of the '<em>Coverage Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_METRIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Coverage Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.ModelElementCoverageImpl <em>Model Element Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.ModelElementCoverageImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getModelElementCoverage()
	 * @generated
	 */
	int MODEL_ELEMENT_COVERAGE = 13;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_COVERAGE__CONTEXTS = COVERAGE_METRIC__CONTEXTS;

	/**
	 * The number of structural features of the '<em>Model Element Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_COVERAGE_FEATURE_COUNT = COVERAGE_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Element Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_COVERAGE_OPERATION_COUNT = COVERAGE_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.impl.BranchCoverageImpl <em>Branch Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.impl.BranchCoverageImpl
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getBranchCoverage()
	 * @generated
	 */
	int BRANCH_COVERAGE = 14;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_COVERAGE__CONTEXTS = COVERAGE_METRIC__CONTEXTS;

	/**
	 * The feature id for the '<em><b>Branch Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_COVERAGE__BRANCH_SPECIFICATIONS = COVERAGE_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Branch Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_COVERAGE_FEATURE_COUNT = COVERAGE_METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Branch Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_COVERAGE_OPERATION_COUNT = COVERAGE_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.CoveredContents <em>Covered Contents</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.CoveredContents
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getCoveredContents()
	 * @generated
	 */
	int COVERED_CONTENTS = 15;

	/**
	 * The meta object id for the '{@link DSLSpecificCoverage.LimitationType <em>Limitation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSLSpecificCoverage.LimitationType
	 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getLimitationType()
	 * @generated
	 */
	int LIMITATION_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.DomainSpecificCoverage <em>Domain Specific Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Specific Coverage</em>'.
	 * @see DSLSpecificCoverage.DomainSpecificCoverage
	 * @generated
	 */
	EClass getDomainSpecificCoverage();

	/**
	 * Returns the meta object for the attribute '{@link DSLSpecificCoverage.DomainSpecificCoverage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DSLSpecificCoverage.DomainSpecificCoverage#getName()
	 * @see #getDomainSpecificCoverage()
	 * @generated
	 */
	EAttribute getDomainSpecificCoverage_Name();

	/**
	 * Returns the meta object for the reference '{@link DSLSpecificCoverage.DomainSpecificCoverage#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see DSLSpecificCoverage.DomainSpecificCoverage#getMetamodel()
	 * @see #getDomainSpecificCoverage()
	 * @generated
	 */
	EReference getDomainSpecificCoverage_Metamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link DSLSpecificCoverage.DomainSpecificCoverage#getCoverageMetrics <em>Coverage Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coverage Metrics</em>'.
	 * @see DSLSpecificCoverage.DomainSpecificCoverage#getCoverageMetrics()
	 * @see #getDomainSpecificCoverage()
	 * @generated
	 */
	EReference getDomainSpecificCoverage_CoverageMetrics();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see DSLSpecificCoverage.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference '{@link DSLSpecificCoverage.Context#getMetaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metaclass</em>'.
	 * @see DSLSpecificCoverage.Context#getMetaclass()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Metaclass();

	/**
	 * Returns the meta object for the containment reference list '{@link DSLSpecificCoverage.Context#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see DSLSpecificCoverage.Context#getRules()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Rules();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see DSLSpecificCoverage.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link DSLSpecificCoverage.Rule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see DSLSpecificCoverage.Rule#getDescription()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Description();

	/**
	 * Returns the meta object for the containment reference '{@link DSLSpecificCoverage.Rule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see DSLSpecificCoverage.Rule#getCondition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Condition();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.InclusionRule <em>Inclusion Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusion Rule</em>'.
	 * @see DSLSpecificCoverage.InclusionRule
	 * @generated
	 */
	EClass getInclusionRule();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.ExclusionRule <em>Exclusion Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusion Rule</em>'.
	 * @see DSLSpecificCoverage.ExclusionRule
	 * @generated
	 */
	EClass getExclusionRule();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.CoverageOfReferenced <em>Coverage Of Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage Of Referenced</em>'.
	 * @see DSLSpecificCoverage.CoverageOfReferenced
	 * @generated
	 */
	EClass getCoverageOfReferenced();

	/**
	 * Returns the meta object for the reference list '{@link DSLSpecificCoverage.CoverageOfReferenced#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference</em>'.
	 * @see DSLSpecificCoverage.CoverageOfReferenced#getReference()
	 * @see #getCoverageOfReferenced()
	 * @generated
	 */
	EReference getCoverageOfReferenced_Reference();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.CoverageByContent <em>Coverage By Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage By Content</em>'.
	 * @see DSLSpecificCoverage.CoverageByContent
	 * @generated
	 */
	EClass getCoverageByContent();

	/**
	 * Returns the meta object for the reference '{@link DSLSpecificCoverage.CoverageByContent#getContainmentReference <em>Containment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containment Reference</em>'.
	 * @see DSLSpecificCoverage.CoverageByContent#getContainmentReference()
	 * @see #getCoverageByContent()
	 * @generated
	 */
	EReference getCoverageByContent_ContainmentReference();

	/**
	 * Returns the meta object for the attribute '{@link DSLSpecificCoverage.CoverageByContent#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see DSLSpecificCoverage.CoverageByContent#getMultiplicity()
	 * @see #getCoverageByContent()
	 * @generated
	 */
	EAttribute getCoverageByContent_Multiplicity();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.Ignore <em>Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore</em>'.
	 * @see DSLSpecificCoverage.Ignore
	 * @generated
	 */
	EClass getIgnore();

	/**
	 * Returns the meta object for the attribute '{@link DSLSpecificCoverage.Ignore#isIgnoreSubtypes <em>Ignore Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Subtypes</em>'.
	 * @see DSLSpecificCoverage.Ignore#isIgnoreSubtypes()
	 * @see #getIgnore()
	 * @generated
	 */
	EAttribute getIgnore_IgnoreSubtypes();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.LimitedIgnore <em>Limited Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limited Ignore</em>'.
	 * @see DSLSpecificCoverage.LimitedIgnore
	 * @generated
	 */
	EClass getLimitedIgnore();

	/**
	 * Returns the meta object for the attribute '{@link DSLSpecificCoverage.LimitedIgnore#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see DSLSpecificCoverage.LimitedIgnore#getType()
	 * @see #getLimitedIgnore()
	 * @generated
	 */
	EAttribute getLimitedIgnore_Type();

	/**
	 * Returns the meta object for the reference list '{@link DSLSpecificCoverage.LimitedIgnore#getContainerMetaclass <em>Container Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container Metaclass</em>'.
	 * @see DSLSpecificCoverage.LimitedIgnore#getContainerMetaclass()
	 * @see #getLimitedIgnore()
	 * @generated
	 */
	EReference getLimitedIgnore_ContainerMetaclass();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.BranchSpecification <em>Branch Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Specification</em>'.
	 * @see DSLSpecificCoverage.BranchSpecification
	 * @generated
	 */
	EClass getBranchSpecification();

	/**
	 * Returns the meta object for the attribute '{@link DSLSpecificCoverage.BranchSpecification#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see DSLSpecificCoverage.BranchSpecification#getDescription()
	 * @see #getBranchSpecification()
	 * @generated
	 */
	EAttribute getBranchSpecification_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link DSLSpecificCoverage.BranchSpecification#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see DSLSpecificCoverage.BranchSpecification#getBranches()
	 * @see #getBranchSpecification()
	 * @generated
	 */
	EReference getBranchSpecification_Branches();

	/**
	 * Returns the meta object for the containment reference '{@link DSLSpecificCoverage.BranchSpecification#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see DSLSpecificCoverage.BranchSpecification#getCondition()
	 * @see #getBranchSpecification()
	 * @generated
	 */
	EReference getBranchSpecification_Condition();

	/**
	 * Returns the meta object for the reference '{@link DSLSpecificCoverage.BranchSpecification#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see DSLSpecificCoverage.BranchSpecification#getContext()
	 * @see #getBranchSpecification()
	 * @generated
	 */
	EReference getBranchSpecification_Context();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see DSLSpecificCoverage.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link DSLSpecificCoverage.Branch#getOCLQuery <em>OCL Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OCL Query</em>'.
	 * @see DSLSpecificCoverage.Branch#getOCLQuery()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_OCLQuery();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see DSLSpecificCoverage.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link DSLSpecificCoverage.Condition#getOCLConstraint <em>OCL Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OCL Constraint</em>'.
	 * @see DSLSpecificCoverage.Condition#getOCLConstraint()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_OCLConstraint();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.CoverageMetric <em>Coverage Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage Metric</em>'.
	 * @see DSLSpecificCoverage.CoverageMetric
	 * @generated
	 */
	EClass getCoverageMetric();

	/**
	 * Returns the meta object for the containment reference list '{@link DSLSpecificCoverage.CoverageMetric#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see DSLSpecificCoverage.CoverageMetric#getContexts()
	 * @see #getCoverageMetric()
	 * @generated
	 */
	EReference getCoverageMetric_Contexts();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.ModelElementCoverage <em>Model Element Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Coverage</em>'.
	 * @see DSLSpecificCoverage.ModelElementCoverage
	 * @generated
	 */
	EClass getModelElementCoverage();

	/**
	 * Returns the meta object for class '{@link DSLSpecificCoverage.BranchCoverage <em>Branch Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Coverage</em>'.
	 * @see DSLSpecificCoverage.BranchCoverage
	 * @generated
	 */
	EClass getBranchCoverage();

	/**
	 * Returns the meta object for the containment reference list '{@link DSLSpecificCoverage.BranchCoverage#getBranchSpecifications <em>Branch Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch Specifications</em>'.
	 * @see DSLSpecificCoverage.BranchCoverage#getBranchSpecifications()
	 * @see #getBranchCoverage()
	 * @generated
	 */
	EReference getBranchCoverage_BranchSpecifications();

	/**
	 * Returns the meta object for enum '{@link DSLSpecificCoverage.CoveredContents <em>Covered Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Covered Contents</em>'.
	 * @see DSLSpecificCoverage.CoveredContents
	 * @generated
	 */
	EEnum getCoveredContents();

	/**
	 * Returns the meta object for enum '{@link DSLSpecificCoverage.LimitationType <em>Limitation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Limitation Type</em>'.
	 * @see DSLSpecificCoverage.LimitationType
	 * @generated
	 */
	EEnum getLimitationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DSLSpecificCoverageFactory getDSLSpecificCoverageFactory();

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
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.DomainSpecificCoverageImpl <em>Domain Specific Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.DomainSpecificCoverageImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getDomainSpecificCoverage()
		 * @generated
		 */
		EClass DOMAIN_SPECIFIC_COVERAGE = eINSTANCE.getDomainSpecificCoverage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SPECIFIC_COVERAGE__NAME = eINSTANCE.getDomainSpecificCoverage_Name();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_COVERAGE__METAMODEL = eINSTANCE.getDomainSpecificCoverage_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Coverage Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SPECIFIC_COVERAGE__COVERAGE_METRICS = eINSTANCE.getDomainSpecificCoverage_CoverageMetrics();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.ContextImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Metaclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__METACLASS = eINSTANCE.getContext_Metaclass();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__RULES = eINSTANCE.getContext_Rules();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.RuleImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__DESCRIPTION = eINSTANCE.getRule_Description();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONDITION = eINSTANCE.getRule_Condition();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.InclusionRuleImpl <em>Inclusion Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.InclusionRuleImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getInclusionRule()
		 * @generated
		 */
		EClass INCLUSION_RULE = eINSTANCE.getInclusionRule();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.ExclusionRuleImpl <em>Exclusion Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.ExclusionRuleImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getExclusionRule()
		 * @generated
		 */
		EClass EXCLUSION_RULE = eINSTANCE.getExclusionRule();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.CoverageOfReferencedImpl <em>Coverage Of Referenced</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.CoverageOfReferencedImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getCoverageOfReferenced()
		 * @generated
		 */
		EClass COVERAGE_OF_REFERENCED = eINSTANCE.getCoverageOfReferenced();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_OF_REFERENCED__REFERENCE = eINSTANCE.getCoverageOfReferenced_Reference();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.CoverageByContentImpl <em>Coverage By Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.CoverageByContentImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getCoverageByContent()
		 * @generated
		 */
		EClass COVERAGE_BY_CONTENT = eINSTANCE.getCoverageByContent();

		/**
		 * The meta object literal for the '<em><b>Containment Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE = eINSTANCE.getCoverageByContent_ContainmentReference();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE_BY_CONTENT__MULTIPLICITY = eINSTANCE.getCoverageByContent_Multiplicity();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.IgnoreImpl <em>Ignore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.IgnoreImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getIgnore()
		 * @generated
		 */
		EClass IGNORE = eINSTANCE.getIgnore();

		/**
		 * The meta object literal for the '<em><b>Ignore Subtypes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IGNORE__IGNORE_SUBTYPES = eINSTANCE.getIgnore_IgnoreSubtypes();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.LimitedIgnoreImpl <em>Limited Ignore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.LimitedIgnoreImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getLimitedIgnore()
		 * @generated
		 */
		EClass LIMITED_IGNORE = eINSTANCE.getLimitedIgnore();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMITED_IGNORE__TYPE = eINSTANCE.getLimitedIgnore_Type();

		/**
		 * The meta object literal for the '<em><b>Container Metaclass</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIMITED_IGNORE__CONTAINER_METACLASS = eINSTANCE.getLimitedIgnore_ContainerMetaclass();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.BranchSpecificationImpl <em>Branch Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.BranchSpecificationImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getBranchSpecification()
		 * @generated
		 */
		EClass BRANCH_SPECIFICATION = eINSTANCE.getBranchSpecification();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_SPECIFICATION__DESCRIPTION = eINSTANCE.getBranchSpecification_Description();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_SPECIFICATION__BRANCHES = eINSTANCE.getBranchSpecification_Branches();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_SPECIFICATION__CONDITION = eINSTANCE.getBranchSpecification_Condition();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_SPECIFICATION__CONTEXT = eINSTANCE.getBranchSpecification_Context();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.BranchImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>OCL Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__OCL_QUERY = eINSTANCE.getBranch_OCLQuery();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.ConditionImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>OCL Constraint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__OCL_CONSTRAINT = eINSTANCE.getCondition_OCLConstraint();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.CoverageMetricImpl <em>Coverage Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.CoverageMetricImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getCoverageMetric()
		 * @generated
		 */
		EClass COVERAGE_METRIC = eINSTANCE.getCoverageMetric();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_METRIC__CONTEXTS = eINSTANCE.getCoverageMetric_Contexts();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.ModelElementCoverageImpl <em>Model Element Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.ModelElementCoverageImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getModelElementCoverage()
		 * @generated
		 */
		EClass MODEL_ELEMENT_COVERAGE = eINSTANCE.getModelElementCoverage();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.impl.BranchCoverageImpl <em>Branch Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.impl.BranchCoverageImpl
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getBranchCoverage()
		 * @generated
		 */
		EClass BRANCH_COVERAGE = eINSTANCE.getBranchCoverage();

		/**
		 * The meta object literal for the '<em><b>Branch Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_COVERAGE__BRANCH_SPECIFICATIONS = eINSTANCE.getBranchCoverage_BranchSpecifications();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.CoveredContents <em>Covered Contents</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.CoveredContents
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getCoveredContents()
		 * @generated
		 */
		EEnum COVERED_CONTENTS = eINSTANCE.getCoveredContents();

		/**
		 * The meta object literal for the '{@link DSLSpecificCoverage.LimitationType <em>Limitation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSLSpecificCoverage.LimitationType
		 * @see DSLSpecificCoverage.impl.DSLSpecificCoveragePackageImpl#getLimitationType()
		 * @generated
		 */
		EEnum LIMITATION_TYPE = eINSTANCE.getLimitationType();

	}

} //DSLSpecificCoveragePackage
