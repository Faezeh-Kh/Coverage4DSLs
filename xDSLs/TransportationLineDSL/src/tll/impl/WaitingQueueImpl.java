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
import tll.TllPackage;
import tll.Turntable;
import tll.WaitingQueue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waiting Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tll.impl.WaitingQueueImpl#getBufferedItems <em>Buffered Items</em>}</li>
 *   <li>{@link tll.impl.WaitingQueueImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaitingQueueImpl extends ComponentImpl implements WaitingQueue {
	/**
	 * The cached value of the '{@link #getBufferedItems() <em>Buffered Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> bufferedItems;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Turntable entry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitingQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TllPackage.Literals.WAITING_QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getBufferedItems() {
		if (bufferedItems == null) {
			bufferedItems = new EObjectContainmentEList<Item>(Item.class, this, TllPackage.WAITING_QUEUE__BUFFERED_ITEMS);
		}
		return bufferedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turntable getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject)entry;
			entry = (Turntable)eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TllPackage.WAITING_QUEUE__ENTRY, oldEntry, entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turntable basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Turntable newEntry) {
		Turntable oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.WAITING_QUEUE__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TllPackage.WAITING_QUEUE__BUFFERED_ITEMS:
				return ((InternalEList<?>)getBufferedItems()).basicRemove(otherEnd, msgs);
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
			case TllPackage.WAITING_QUEUE__BUFFERED_ITEMS:
				return getBufferedItems();
			case TllPackage.WAITING_QUEUE__ENTRY:
				if (resolve) return getEntry();
				return basicGetEntry();
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
			case TllPackage.WAITING_QUEUE__BUFFERED_ITEMS:
				getBufferedItems().clear();
				getBufferedItems().addAll((Collection<? extends Item>)newValue);
				return;
			case TllPackage.WAITING_QUEUE__ENTRY:
				setEntry((Turntable)newValue);
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
			case TllPackage.WAITING_QUEUE__BUFFERED_ITEMS:
				getBufferedItems().clear();
				return;
			case TllPackage.WAITING_QUEUE__ENTRY:
				setEntry((Turntable)null);
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
			case TllPackage.WAITING_QUEUE__BUFFERED_ITEMS:
				return bufferedItems != null && !bufferedItems.isEmpty();
			case TllPackage.WAITING_QUEUE__ENTRY:
				return entry != null;
		}
		return super.eIsSet(featureID);
	}

} //WaitingQueueImpl
