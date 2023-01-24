/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.DSLSpecificCoveragePackage;
import DSLSpecificCoverage.LimitationType;
import DSLSpecificCoverage.LimitedIgnore;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limited Ignore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.impl.LimitedIgnoreImpl#getType <em>Type</em>}</li>
 *   <li>{@link DSLSpecificCoverage.impl.LimitedIgnoreImpl#getContainerMetaclass <em>Container Metaclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimitedIgnoreImpl extends ExclusionRuleImpl implements LimitedIgnore {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LimitationType TYPE_EDEFAULT = LimitationType.CONTAINED_BY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LimitationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainerMetaclass() <em>Container Metaclass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerMetaclass()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> containerMetaclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimitedIgnoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLSpecificCoveragePackage.Literals.LIMITED_IGNORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LimitationType newType) {
		LimitationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLSpecificCoveragePackage.LIMITED_IGNORE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getContainerMetaclass() {
		if (containerMetaclass == null) {
			containerMetaclass = new EObjectResolvingEList<EClass>(EClass.class, this, DSLSpecificCoveragePackage.LIMITED_IGNORE__CONTAINER_METACLASS);
		}
		return containerMetaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.LIMITED_IGNORE__TYPE:
				return getType();
			case DSLSpecificCoveragePackage.LIMITED_IGNORE__CONTAINER_METACLASS:
				return getContainerMetaclass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.LIMITED_IGNORE__TYPE:
				setType((LimitationType)newValue);
				return;
			case DSLSpecificCoveragePackage.LIMITED_IGNORE__CONTAINER_METACLASS:
				getContainerMetaclass().clear();
				getContainerMetaclass().addAll((Collection<? extends EClass>)newValue);
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
			case DSLSpecificCoveragePackage.LIMITED_IGNORE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DSLSpecificCoveragePackage.LIMITED_IGNORE__CONTAINER_METACLASS:
				getContainerMetaclass().clear();
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
			case DSLSpecificCoveragePackage.LIMITED_IGNORE__TYPE:
				return type != TYPE_EDEFAULT;
			case DSLSpecificCoveragePackage.LIMITED_IGNORE__CONTAINER_METACLASS:
				return containerMetaclass != null && !containerMetaclass.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LimitedIgnoreImpl
