/**
 */
package TestCoverage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Object Coverage Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestCoverage.ModelObjectCoverageStatus#getModelObject <em>Model Object</em>}</li>
 *   <li>{@link TestCoverage.ModelObjectCoverageStatus#getCoverageStatus <em>Coverage Status</em>}</li>
 * </ul>
 *
 * @see TestCoverage.TestCoveragePackage#getModelObjectCoverageStatus()
 * @model
 * @generated
 */
public interface ModelObjectCoverageStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Object</em>' reference.
	 * @see #setModelObject(EObject)
	 * @see TestCoverage.TestCoveragePackage#getModelObjectCoverageStatus_ModelObject()
	 * @model required="true"
	 * @generated
	 */
	EObject getModelObject();

	/**
	 * Sets the value of the '{@link TestCoverage.ModelObjectCoverageStatus#getModelObject <em>Model Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Object</em>' reference.
	 * @see #getModelObject()
	 * @generated
	 */
	void setModelObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Coverage Status</b></em>' attribute.
	 * The literals are from the enumeration {@link TestCoverage.CoverageStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Status</em>' attribute.
	 * @see TestCoverage.CoverageStatus
	 * @see #setCoverageStatus(CoverageStatus)
	 * @see TestCoverage.TestCoveragePackage#getModelObjectCoverageStatus_CoverageStatus()
	 * @model required="true"
	 * @generated
	 */
	CoverageStatus getCoverageStatus();

	/**
	 * Sets the value of the '{@link TestCoverage.ModelObjectCoverageStatus#getCoverageStatus <em>Coverage Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Status</em>' attribute.
	 * @see TestCoverage.CoverageStatus
	 * @see #getCoverageStatus()
	 * @generated
	 */
	void setCoverageStatus(CoverageStatus value);

} // ModelObjectCoverageStatus
