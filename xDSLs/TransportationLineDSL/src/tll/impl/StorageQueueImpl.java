/**
 */
package tll.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tll.Item;
import tll.StorageQueue;
import tll.TllPackage;
import tll.Turntable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tll.impl.StorageQueueImpl#getFinalItems <em>Final Items</em>}</li>
 *   <li>{@link tll.impl.StorageQueueImpl#getExit <em>Exit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageQueueImpl extends ComponentImpl implements StorageQueue {
	/**
	 * The cached value of the '{@link #getFinalItems() <em>Final Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> finalItems;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Turntable exit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TllPackage.Literals.STORAGE_QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public EList<Item> getFinalItems() {
		if (finalItems == null) {
			finalItems = new EObjectContainmentEList<Item>(Item.class, this, TllPackage.STORAGE_QUEUE__FINAL_ITEMS);
		}
	
		
		return finalItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Turntable getExit() {
		if (exit != null && exit.eIsProxy()) {
			InternalEObject oldExit = (InternalEObject)exit;
			exit = (Turntable)eResolveProxy(oldExit);
			if (exit != oldExit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TllPackage.STORAGE_QUEUE__EXIT, oldExit, exit));
			}
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turntable basicGetExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExit(Turntable newExit) {
		Turntable oldExit = exit;
		exit = newExit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.STORAGE_QUEUE__EXIT, oldExit, exit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TllPackage.STORAGE_QUEUE__FINAL_ITEMS:
				return ((InternalEList<?>)getFinalItems()).basicRemove(otherEnd, msgs);
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
			case TllPackage.STORAGE_QUEUE__FINAL_ITEMS:
				return getFinalItems();
			case TllPackage.STORAGE_QUEUE__EXIT:
				if (resolve) return getExit();
				return basicGetExit();
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
			case TllPackage.STORAGE_QUEUE__FINAL_ITEMS:
				getFinalItems().clear();
				getFinalItems().addAll((Collection<? extends Item>)newValue);
				return;
			case TllPackage.STORAGE_QUEUE__EXIT:
				setExit((Turntable)newValue);
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
			case TllPackage.STORAGE_QUEUE__FINAL_ITEMS:
				getFinalItems().clear();
				return;
			case TllPackage.STORAGE_QUEUE__EXIT:
				setExit((Turntable)null);
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
			case TllPackage.STORAGE_QUEUE__FINAL_ITEMS:
				return finalItems != null && !finalItems.isEmpty();
			case TllPackage.STORAGE_QUEUE__EXIT:
				return exit != null;
		}
		return super.eIsSet(featureID);
	}
	

} //StorageQueueImpl
