/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.DSLSpecificCoveragePackage;
import DSLSpecificCoverage.Ignore;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ignore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.impl.IgnoreImpl#isIgnoreSubtypes <em>Ignore Subtypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IgnoreImpl extends ExclusionRuleImpl implements Ignore {
	/**
	 * The default value of the '{@link #isIgnoreSubtypes() <em>Ignore Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreSubtypes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_SUBTYPES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIgnoreSubtypes() <em>Ignore Subtypes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreSubtypes()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreSubtypes = IGNORE_SUBTYPES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IgnoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLSpecificCoveragePackage.Literals.IGNORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreSubtypes() {
		return ignoreSubtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreSubtypes(boolean newIgnoreSubtypes) {
		boolean oldIgnoreSubtypes = ignoreSubtypes;
		ignoreSubtypes = newIgnoreSubtypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLSpecificCoveragePackage.IGNORE__IGNORE_SUBTYPES, oldIgnoreSubtypes, ignoreSubtypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.IGNORE__IGNORE_SUBTYPES:
				return isIgnoreSubtypes();
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
			case DSLSpecificCoveragePackage.IGNORE__IGNORE_SUBTYPES:
				setIgnoreSubtypes((Boolean)newValue);
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
			case DSLSpecificCoveragePackage.IGNORE__IGNORE_SUBTYPES:
				setIgnoreSubtypes(IGNORE_SUBTYPES_EDEFAULT);
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
			case DSLSpecificCoveragePackage.IGNORE__IGNORE_SUBTYPES:
				return ignoreSubtypes != IGNORE_SUBTYPES_EDEFAULT;
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
		result.append(" (ignoreSubtypes: ");
		result.append(ignoreSubtypes);
		result.append(')');
		return result.toString();
	}

} //IgnoreImpl
