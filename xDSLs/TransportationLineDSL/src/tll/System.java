/**
 */
package tll;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tll.System#getArea <em>Area</em>}</li>
 *   <li>{@link tll.System#getSimconfig <em>Simconfig</em>}</li>
 *   <li>{@link tll.System#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @see tll.TllPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference list.
	 * The list contents are of type {@link tll.Area}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference list.
	 * @see tll.TllPackage#getSystem_Area()
	 * @model containment="true"
	 * @generated
	 */
	EList<Area> getArea();

	/**
	 * Returns the value of the '<em><b>Simconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simconfig</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simconfig</em>' containment reference.
	 * @see #setSimconfig(SimConfig)
	 * @see tll.TllPackage#getSystem_Simconfig()
	 * @model containment="true"
	 * @generated
	 */
	SimConfig getSimconfig();

	/**
	 * Sets the value of the '{@link tll.System#getSimconfig <em>Simconfig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simconfig</em>' containment reference.
	 * @see #getSimconfig()
	 * @generated
	 */
	void setSimconfig(SimConfig value);

	/**
	 * Returns the value of the '<em><b>Log</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' attribute list.
	 * @see tll.TllPackage#getSystem_Log()
	 * @model
	 * @generated
	 */
	EList<String> getLog();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void simulate();

} // System
