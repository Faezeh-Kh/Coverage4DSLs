/**
 */
package shipyardV4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipyard Spec1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.ShipyardSpec1#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getShipyardSpec1()
 * @model
 * @generated
 */
public interface ShipyardSpec1 extends ShipyardPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' containment reference.
	 * @see #setSpec(ShipyardSpec)
	 * @see shipyardV4.ShipyardV4Package#getShipyardSpec1_Spec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ShipyardSpec getSpec();

	/**
	 * Sets the value of the '{@link shipyardV4.ShipyardSpec1#getSpec <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' containment reference.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(ShipyardSpec value);

} // ShipyardSpec1
