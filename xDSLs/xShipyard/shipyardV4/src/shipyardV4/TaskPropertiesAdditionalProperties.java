/**
 */
package shipyardV4;

import jsonMetaschemaMM.JsonDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Properties Additional Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.TaskPropertiesAdditionalProperties#getKey <em>Key</em>}</li>
 *   <li>{@link shipyardV4.TaskPropertiesAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getTaskPropertiesAdditionalProperties()
 * @model
 * @generated
 */
public interface TaskPropertiesAdditionalProperties extends TaskPropertiesPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see shipyardV4.ShipyardV4Package#getTaskPropertiesAdditionalProperties_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link shipyardV4.TaskPropertiesAdditionalProperties#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' reference.
	 * @see #setAdditionalProperties(JsonDocument)
	 * @see shipyardV4.ShipyardV4Package#getTaskPropertiesAdditionalProperties_AdditionalProperties()
	 * @model
	 * @generated
	 */
	JsonDocument getAdditionalProperties();

	/**
	 * Sets the value of the '{@link shipyardV4.TaskPropertiesAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(JsonDocument value);

} // TaskPropertiesAdditionalProperties
