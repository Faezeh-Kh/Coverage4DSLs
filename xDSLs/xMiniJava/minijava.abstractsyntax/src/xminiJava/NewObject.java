/**
 */
package xminiJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xminiJava.NewObject#getType <em>Type</em>}</li>
 *   <li>{@link xminiJava.NewObject#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see xminiJava.XminiJavaPackage#getNewObject()
 * @model
 * @generated
 */
public interface NewObject extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(xminiJava.Class)
	 * @see xminiJava.XminiJavaPackage#getNewObject_Type()
	 * @model
	 * @generated
	 */
	xminiJava.Class getType();

	/**
	 * Sets the value of the '{@link xminiJava.NewObject#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(xminiJava.Class value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link xminiJava.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see xminiJava.XminiJavaPackage#getNewObject_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArgs();

} // NewObject
