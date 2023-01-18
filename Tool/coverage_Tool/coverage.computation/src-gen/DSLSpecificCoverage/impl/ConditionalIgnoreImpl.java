/**
 */
package DSLSpecificCoverage.impl;

import DSLSpecificCoverage.ConditionType;
import DSLSpecificCoverage.ConditionalIgnore;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Ignore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSLSpecificCoverage.impl.ConditionalIgnoreImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link DSLSpecificCoverage.impl.ConditionalIgnoreImpl#getContainerType <em>Container Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalIgnoreImpl extends ExclusionRuleImpl implements ConditionalIgnore {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final ConditionType CONDITION_EDEFAULT = ConditionType.CONTAINED_BY;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ConditionType condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainerType() <em>Container Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerType()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> containerType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalIgnoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSLSpecificCoveragePackage.Literals.CONDITIONAL_IGNORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ConditionType newCondition) {
		ConditionType oldCondition = condition;
		condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLSpecificCoveragePackage.CONDITIONAL_IGNORE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getContainerType() {
		if (containerType == null) {
			containerType = new EObjectResolvingEList<EClass>(EClass.class, this, DSLSpecificCoveragePackage.CONDITIONAL_IGNORE__CONTAINER_TYPE);
		}
		return containerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSLSpecificCoveragePackage.CONDITIONAL_IGNORE__CONDITION:
				return getCondition();
			case DSLSpecificCoveragePackage.CONDITIONAL_IGNORE__CONTAINER_TYPE:
				return getContainerType();
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
			case DSLSpecificCoveragePackage.CONDITIONAL_IGNORE__CONDITION:
				setCondition((ConditionType)newValue);
				return;
			case DSLSpecificCoveragePackage.CONDITIONAL_IGNORE__CONTAINER_TYPE:
				getContainerType().clear();
				getContainerType().addAll((Collection<? extends EClass>)newValue);
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
			case DSLSpecificCoveragePackage.CONDITIONAL_IGNORE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DSLSpecificCoveragePackage.CONDITIONAL_IGNORE__CONTAINER_TYPE:
				getContainerType().clear();
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
			case DSLSpecificCoveragePackage.CONDITIONAL_IGNORE__CONDITION:
				return condition != CONDITION_EDEFAULT;
			case DSLSpecificCoveragePackage.CONDITIONAL_IGNORE__CONTAINER_TYPE:
				return containerType != null && !containerType.isEmpty();
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //ConditionalIgnoreImpl
