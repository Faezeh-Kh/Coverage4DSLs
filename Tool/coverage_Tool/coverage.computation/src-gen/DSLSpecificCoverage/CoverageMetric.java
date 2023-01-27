/**
 */
package DSLSpecificCoverage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.CoverageMetric#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getCoverageMetric()
 * @model abstract="true"
 * @generated
 */
public interface CoverageMetric extends EObject {
	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link DSLSpecificCoverage.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getCoverageMetric_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

} // CoverageMetric
