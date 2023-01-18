/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Ignore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.ConditionalIgnore#getCondition <em>Condition</em>}</li>
 *   <li>{@link DSLSpecificCoverage.ConditionalIgnore#getContainerType <em>Container Type</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getConditionalIgnore()
 * @model
 * @generated
 */
public interface ConditionalIgnore extends ExclusionRule {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link DSLSpecificCoverage.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see DSLSpecificCoverage.ConditionType
	 * @see #setCondition(ConditionType)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getConditionalIgnore_Condition()
	 * @model required="true"
	 * @generated
	 */
	ConditionType getCondition();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.ConditionalIgnore#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see DSLSpecificCoverage.ConditionType
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ConditionType value);

	/**
	 * Returns the value of the '<em><b>Container Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Type</em>' reference list.
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getConditionalIgnore_ContainerType()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getContainerType();

} // ConditionalIgnore
