/**
 */
package xminiJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xminiJava.Or#getLeft <em>Left</em>}</li>
 *   <li>{@link xminiJava.Or#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see xminiJava.XminiJavaPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see xminiJava.XminiJavaPackage#getOr_Left()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link xminiJava.Or#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see xminiJava.XminiJavaPackage#getOr_Right()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link xminiJava.Or#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // Or
