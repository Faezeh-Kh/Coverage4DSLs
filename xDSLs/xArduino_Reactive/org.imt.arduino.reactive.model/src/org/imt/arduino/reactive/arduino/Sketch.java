/**
 */
package org.imt.arduino.reactive.arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.imt.arduino.reactive.arduino.Sketch#getProject <em>Project</em>}</li>
 *   <li>{@link org.imt.arduino.reactive.arduino.Sketch#getBlock <em>Block</em>}</li>
 *   <li>{@link org.imt.arduino.reactive.arduino.Sketch#getBoard <em>Board</em>}</li>
 * </ul>
 *
 * @see org.imt.arduino.reactive.arduino.ArduinoPackage#getSketch()
 * @model
 * @generated
 */
public interface Sketch extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.imt.arduino.reactive.arduino.Project#getSketches <em>Sketches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see org.imt.arduino.reactive.arduino.ArduinoPackage#getSketch_Project()
	 * @see org.imt.arduino.reactive.arduino.Project#getSketches
	 * @model opposite="sketches" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.imt.arduino.reactive.arduino.Sketch#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(Block)
	 * @see org.imt.arduino.reactive.arduino.ArduinoPackage#getSketch_Block()
	 * @model containment="true"
	 * @generated
	 */
	Block getBlock();

	/**
	 * Sets the value of the '{@link org.imt.arduino.reactive.arduino.Sketch#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' reference.
	 * @see #setBoard(Board)
	 * @see org.imt.arduino.reactive.arduino.ArduinoPackage#getSketch_Board()
	 * @model
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link org.imt.arduino.reactive.arduino.Sketch#getBoard <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

} // Sketch
