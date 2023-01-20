/**
 */
package shipyardV4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipyard Api Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.ShipyardApiVersion#getApiVersion <em>Api Version</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getShipyardApiVersion()
 * @model
 * @generated
 */
public interface ShipyardApiVersion extends ShipyardPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see #setApiVersion(String)
	 * @see shipyardV4.ShipyardV4Package#getShipyardApiVersion_ApiVersion()
	 * @model required="true"
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Sets the value of the '{@link shipyardV4.ShipyardApiVersion#getApiVersion <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Version</em>' attribute.
	 * @see #getApiVersion()
	 * @generated
	 */
	void setApiVersion(String value);

} // ShipyardApiVersion
