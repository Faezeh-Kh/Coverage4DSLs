/**
 */
package tll;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tll.Machine#getNeighbour <em>Neighbour</em>}</li>
 * </ul>
 *
 * @see tll.TllPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends Component {
	/**
	 * Returns the value of the '<em><b>Neighbour</b></em>' reference list.
	 * The list contents are of type {@link tll.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighbour</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbour</em>' reference list.
	 * @see tll.TllPackage#getMachine_Neighbour()
	 * @model upper="2"
	 * @generated
	 */
	EList<Component> getNeighbour();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void do_();

} // Machine
