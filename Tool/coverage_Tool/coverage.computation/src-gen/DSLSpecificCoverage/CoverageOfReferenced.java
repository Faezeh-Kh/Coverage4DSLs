/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Of Referenced</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.CoverageOfReferenced#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getCoverageOfReferenced()
 * @model
 * @generated
 */
public interface CoverageOfReferenced extends InclusionRule {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference list.
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getCoverageOfReferenced_Reference()
	 * @model required="true"
	 * @generated
	 */
	EList<EReference> getReference();

} // CoverageOfReferenced
