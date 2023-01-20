/**
 */
package shipyardV4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.SelectorMatch#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see shipyardV4.ShipyardV4Package#getSelectorMatch()
 * @model
 * @generated
 */
public interface SelectorMatch extends SelectorPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Match</b></em>' containment reference list.
	 * The list contents are of type {@link shipyardV4.SelectorMatchPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' containment reference list.
	 * @see shipyardV4.ShipyardV4Package#getSelectorMatch_Match()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectorMatchPropertiesAbstract> getMatch();

} // SelectorMatch
