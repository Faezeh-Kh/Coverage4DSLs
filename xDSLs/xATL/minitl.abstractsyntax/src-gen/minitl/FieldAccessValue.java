/**
 */
package minitl;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Access Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitl.FieldAccessValue#getObject <em>Object</em>}</li>
 *   <li>{@link minitl.FieldAccessValue#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see minitl.minitlPackage#getFieldAccessValue()
 * @model
 * @generated
 */
public interface FieldAccessValue extends Value {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(Value)
	 * @see minitl.minitlPackage#getFieldAccessValue_Object()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getObject();

	/**
	 * Sets the value of the '{@link minitl.FieldAccessValue#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Value value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see minitl.minitlPackage#getFieldAccessValue_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link minitl.FieldAccessValue#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

} // FieldAccessValue
