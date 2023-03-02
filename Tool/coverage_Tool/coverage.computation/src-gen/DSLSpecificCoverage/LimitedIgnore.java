/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limited Ignore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.LimitedIgnore#getType <em>Type</em>}</li>
 *   <li>{@link DSLSpecificCoverage.LimitedIgnore#getContainerMetaclass <em>Container Metaclass</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getLimitedIgnore()
 * @model
 * @generated
 */
public interface LimitedIgnore extends ExclusionRule {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link DSLSpecificCoverage.LimitationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see DSLSpecificCoverage.LimitationType
	 * @see #setType(LimitationType)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getLimitedIgnore_Type()
	 * @model required="true"
	 * @generated
	 */
	LimitationType getType();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.LimitedIgnore#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see DSLSpecificCoverage.LimitationType
	 * @see #getType()
	 * @generated
	 */
	void setType(LimitationType value);

	/**
	 * Returns the value of the '<em><b>Container Metaclass</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Metaclass</em>' reference list.
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getLimitedIgnore_ContainerMetaclass()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getContainerMetaclass();

} // LimitedIgnore
