/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.DSLSpecificCoveragePackage;
import DSLSpecificCoverage.ExplicitBranch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.impl.ExplicitBranchImpl#getOCLQuery <em>OCL Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplicitBranchImpl extends BranchImpl implements ExplicitBranch {
	/**
	 * The default value of the '{@link #getOCLQuery() <em>OCL Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOCLQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String OCL_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOCLQuery() <em>OCL Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOCLQuery()
	 * @generated
	 * @ordered
	 */
	protected String oclQuery = OCL_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplicitBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLSpecificCoveragePackage.Literals.EXPLICIT_BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOCLQuery() {
		return oclQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOCLQuery(String newOCLQuery) {
		String oldOCLQuery = oclQuery;
		oclQuery = newOCLQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLSpecificCoveragePackage.EXPLICIT_BRANCH__OCL_QUERY, oldOCLQuery, oclQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.EXPLICIT_BRANCH__OCL_QUERY:
				return getOCLQuery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.EXPLICIT_BRANCH__OCL_QUERY:
				setOCLQuery((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.EXPLICIT_BRANCH__OCL_QUERY:
				setOCLQuery(OCL_QUERY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.EXPLICIT_BRANCH__OCL_QUERY:
				return OCL_QUERY_EDEFAULT == null ? oclQuery != null : !OCL_QUERY_EDEFAULT.equals(oclQuery);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (OCLQuery: ");
		result.append(oclQuery);
		result.append(')');
		return result.toString();
	}

} //ExplicitBranchImpl
