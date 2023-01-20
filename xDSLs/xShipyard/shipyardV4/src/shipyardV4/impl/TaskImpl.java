/**
 */
package shipyardV4.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import shipyardV4.ShipyardV4Package;
import shipyardV4.Task;
import shipyardV4.TaskPropertiesAbstract;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.impl.TaskImpl#getTask <em>Task</em>}</li>
 *   <li>{@link shipyardV4.impl.TaskImpl#getSimulatedResult <em>Simulated Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskPropertiesAbstract> task;

	/**
	 * The default value of the '{@link #getSimulatedResult() <em>Simulated Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulatedResult()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMULATED_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimulatedResult() <em>Simulated Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulatedResult()
	 * @generated
	 * @ordered
	 */
	protected String simulatedResult = SIMULATED_RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardV4Package.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskPropertiesAbstract> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<TaskPropertiesAbstract>(TaskPropertiesAbstract.class, this, ShipyardV4Package.TASK__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimulatedResult() {
		return simulatedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulatedResult(String newSimulatedResult) {
		String oldSimulatedResult = simulatedResult;
		simulatedResult = newSimulatedResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShipyardV4Package.TASK__SIMULATED_RESULT, oldSimulatedResult, simulatedResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShipyardV4Package.TASK__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShipyardV4Package.TASK__TASK:
				return getTask();
			case ShipyardV4Package.TASK__SIMULATED_RESULT:
				return getSimulatedResult();
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
			case ShipyardV4Package.TASK__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends TaskPropertiesAbstract>)newValue);
				return;
			case ShipyardV4Package.TASK__SIMULATED_RESULT:
				setSimulatedResult((String)newValue);
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
			case ShipyardV4Package.TASK__TASK:
				getTask().clear();
				return;
			case ShipyardV4Package.TASK__SIMULATED_RESULT:
				setSimulatedResult(SIMULATED_RESULT_EDEFAULT);
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
			case ShipyardV4Package.TASK__TASK:
				return task != null && !task.isEmpty();
			case ShipyardV4Package.TASK__SIMULATED_RESULT:
				return SIMULATED_RESULT_EDEFAULT == null ? simulatedResult != null : !SIMULATED_RESULT_EDEFAULT.equals(simulatedResult);
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
		result.append(" (simulatedResult: ");
		result.append(simulatedResult);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
