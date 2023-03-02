/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.Condition#getOCLConstraint <em>OCL Constraint</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>OCL Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OCL Constraint</em>' attribute.
	 * @see #setOCLConstraint(String)
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getCondition_OCLConstraint()
	 * @model required="true"
	 * @generated
	 */
	String getOCLConstraint();

	/**
	 * Sets the value of the '{@link DSLSpecificCoverage.Condition#getOCLConstraint <em>OCL Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OCL Constraint</em>' attribute.
	 * @see #getOCLConstraint()
	 * @generated
	 */
	void setOCLConstraint(String value);

} // Condition
