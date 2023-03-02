/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.Metadata#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.MetadataPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getMetadata_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetadataPropertiesAbstract> getMetadata();

} // Metadata
