/**
 */
package xminiJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Ref Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xminiJava.ArrayRefValue#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see xminiJava.XminiJavaPackage#getArrayRefValue()
 * @model annotation="aspect"
 * @generated
 */
public interface ArrayRefValue extends Value {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(ArrayInstance)
	 * @see xminiJava.XminiJavaPackage#getArrayRefValue_Instance()
	 * @model
	 * @generated
	 */
	ArrayInstance getInstance();

	/**
	 * Sets the value of the '{@link xminiJava.ArrayRefValue#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(ArrayInstance value);

} // ArrayRefValue
