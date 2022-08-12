/**
 */
package xminiJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xminiJava.ObjectInstance#getFieldbindings <em>Fieldbindings</em>}</li>
 *   <li>{@link xminiJava.ObjectInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see xminiJava.XminiJavaPackage#getObjectInstance()
 * @model annotation="aspect"
 * @generated
 */
public interface ObjectInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Fieldbindings</b></em>' containment reference list.
	 * The list contents are of type {@link xminiJava.FieldBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldbindings</em>' containment reference list.
	 * @see xminiJava.XminiJavaPackage#getObjectInstance_Fieldbindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldBinding> getFieldbindings();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(xminiJava.Class)
	 * @see xminiJava.XminiJavaPackage#getObjectInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	xminiJava.Class getType();

	/**
	 * Sets the value of the '{@link xminiJava.ObjectInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(xminiJava.Class value);

} // ObjectInstance
