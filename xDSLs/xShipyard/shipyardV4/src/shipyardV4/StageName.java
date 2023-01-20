/**
 */
package shipyardV4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.StageName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getStageName()
 * @model
 * @generated
 */
public interface StageName extends StagePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see shipyardV4.ShipyardV4Package#getStageName_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link shipyardV4.StageName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StageName
