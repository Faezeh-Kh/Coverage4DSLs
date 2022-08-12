/**
 */
package xminiJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xminiJava.ArrayLength#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @see xminiJava.XminiJavaPackage#getArrayLength()
 * @model
 * @generated
 */
public interface ArrayLength extends Expression {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(Expression)
	 * @see xminiJava.XminiJavaPackage#getArrayLength_Array()
	 * @model containment="true"
	 * @generated
	 */
	Expression getArray();

	/**
	 * Sets the value of the '{@link xminiJava.ArrayLength#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(Expression value);

} // ArrayLength
