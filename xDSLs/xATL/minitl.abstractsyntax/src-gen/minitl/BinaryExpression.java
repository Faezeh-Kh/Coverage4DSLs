/**
 */
package minitl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitl.BinaryExpression#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link minitl.BinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see minitl.minitlPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Value {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link minitl.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see minitl.minitlPackage#getBinaryExpression_Expressions()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Value> getExpressions();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link minitl.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see minitl.Operator
	 * @see #setOperator(Operator)
	 * @see minitl.minitlPackage#getBinaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link minitl.BinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see minitl.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // BinaryExpression
