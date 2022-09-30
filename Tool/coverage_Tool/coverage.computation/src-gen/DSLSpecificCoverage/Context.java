/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.Context#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link DSLSpecificCoverage.Context#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Metaclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass</em>' reference.
	 * @see #setMetaclass(EClass)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getContext_Metaclass()
	 * @model required="true"
	 * @generated
	 */
	EClass getMetaclass();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.Context#getMetaclass <em>Metaclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaclass</em>' reference.
	 * @see #getMetaclass()
	 * @generated
	 */
	void setMetaclass(EClass value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link DSLSpecificCoverage.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getContext_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Context
