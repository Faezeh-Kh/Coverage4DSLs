/**
 */
package tll;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tll.Component#getHosts <em>Hosts</em>}</li>
 *   <li>{@link tll.Component#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link tll.Component#getUncertainty <em>Uncertainty</em>}</li>
 * </ul>
 *
 * @see tll.TllPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hosts</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tll.Item#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosts</em>' reference.
	 * @see #setHosts(Item)
	 * @see tll.TllPackage#getComponent_Hosts()
	 * @see tll.Item#getLocation
	 * @model opposite="location"
	 * @generated
	 */
	Item getHosts();

	/**
	 * Sets the value of the '{@link tll.Component#getHosts <em>Hosts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hosts</em>' reference.
	 * @see #getHosts()
	 * @generated
	 */
	void setHosts(Item value);

	/**
	 * Returns the value of the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Time</em>' attribute.
	 * @see #setProcessingTime(int)
	 * @see tll.TllPackage#getComponent_ProcessingTime()
	 * @model
	 * @generated
	 */
	int getProcessingTime();

	/**
	 * Sets the value of the '{@link tll.Component#getProcessingTime <em>Processing Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Time</em>' attribute.
	 * @see #getProcessingTime()
	 * @generated
	 */
	void setProcessingTime(int value);

	/**
	 * Returns the value of the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uncertainty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty</em>' attribute.
	 * @see #setUncertainty(int)
	 * @see tll.TllPackage#getComponent_Uncertainty()
	 * @model
	 * @generated
	 */
	int getUncertainty();

	/**
	 * Sets the value of the '{@link tll.Component#getUncertainty <em>Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty</em>' attribute.
	 * @see #getUncertainty()
	 * @generated
	 */
	void setUncertainty(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void do_();

} // Component
