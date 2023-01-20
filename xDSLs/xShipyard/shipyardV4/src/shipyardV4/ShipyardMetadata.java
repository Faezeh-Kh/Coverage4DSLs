/**
 */
package shipyardV4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipyard Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.ShipyardMetadata#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getShipyardMetadata()
 * @model
 * @generated
 */
public interface ShipyardMetadata extends ShipyardPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see shipyardV4.ShipyardV4Package#getShipyardMetadata_Metadata()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link shipyardV4.ShipyardMetadata#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

} // ShipyardMetadata
