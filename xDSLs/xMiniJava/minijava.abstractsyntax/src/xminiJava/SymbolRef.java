/**
 */
package xminiJava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xminiJava.SymbolRef#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see xminiJava.XminiJavaPackage#getSymbolRef()
 * @model
 * @generated
 */
public interface SymbolRef extends Expression {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' reference.
	 * @see #setSymbol(Symbol)
	 * @see xminiJava.XminiJavaPackage#getSymbolRef_Symbol()
	 * @model
	 * @generated
	 */
	Symbol getSymbol();

	/**
	 * Sets the value of the '{@link xminiJava.SymbolRef#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(Symbol value);

} // SymbolRef
