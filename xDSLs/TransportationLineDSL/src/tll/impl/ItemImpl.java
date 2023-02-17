/**
 */
package tll.impl;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import tll.Area;
import tll.Component;
import tll.Item;
import tll.TllPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tll.impl.ItemImpl#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link tll.impl.ItemImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link tll.impl.ItemImpl#isIsProcessed <em>Is Processed</em>}</li>
 *   <li>{@link tll.impl.ItemImpl#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends NamedElementImpl implements Item {
	/**
	 * The cached value of the '{@link #getStartLocation() <em>Start Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLocation()
	 * @generated
	 * @ordered
	 */
	protected Component startLocation;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Component location;

	/**
	 * The default value of the '{@link #isIsProcessed() <em>Is Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProcessed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROCESSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProcessed() <em>Is Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProcessed()
	 * @generated
	 * @ordered
	 */
	protected boolean isProcessed = IS_PROCESSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> history;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TllPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getStartLocation() {
		if (startLocation != null && startLocation.eIsProxy()) {
			InternalEObject oldStartLocation = (InternalEObject)startLocation;
			startLocation = (Component)eResolveProxy(oldStartLocation);
			if (startLocation != oldStartLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TllPackage.ITEM__START_LOCATION, oldStartLocation, startLocation));
			}
		}
		return startLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetStartLocation() {
		return startLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLocation(Component newStartLocation) {
		Component oldStartLocation = startLocation;
		startLocation = newStartLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.ITEM__START_LOCATION, oldStartLocation, startLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Component)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TllPackage.ITEM__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public NotificationChain basicSetLocation(Component newLocation, NotificationChain msgs) {
		Component oldLocation = location;
		location = newLocation;
		
		if(newLocation != null){
			//System.out.println(this.getId() + " is at " + newLocation.getId());
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-ms-SSS");
			String dateString = format.format( new Date() );
			tll.System sys = ((tll.System)EcoreUtil.getRootContainer(this));
			Area area = ((Area)this.getLocation().eContainer());
//			sys.getLog().add("entered-/"+ sys.getId() + "/" + area.getId()
//					+ "/" +newLocation.getId()+","+dateString+",0.0.0.0,"+this.getId()+",1,GET");
			String x = "Component.setHostedItem()-/"+ sys.getId() + "/" + area.getId()
			+ "/" +newLocation.getId()+","+this.getId()+","+dateString;
			area.getLog().add(x.toString());
		}else
			//System.out.println(this.getId() + " is at store");

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TllPackage.ITEM__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Component newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, TllPackage.COMPONENT__HOSTS, Component.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, TllPackage.COMPONENT__HOSTS, Component.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.ITEM__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProcessed() {
		return isProcessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProcessed(boolean newIsProcessed) {
		boolean oldIsProcessed = isProcessed;
		isProcessed = newIsProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.ITEM__IS_PROCESSED, oldIsProcessed, isProcessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getHistory() {
		if (history == null) {
			history = new EObjectResolvingEList<Component>(Component.class, this, TllPackage.ITEM__HISTORY);
		}
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TllPackage.ITEM__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, TllPackage.COMPONENT__HOSTS, Component.class, msgs);
				return basicSetLocation((Component)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TllPackage.ITEM__LOCATION:
				return basicSetLocation(null, msgs);
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
			case TllPackage.ITEM__START_LOCATION:
				if (resolve) return getStartLocation();
				return basicGetStartLocation();
			case TllPackage.ITEM__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case TllPackage.ITEM__IS_PROCESSED:
				return isIsProcessed();
			case TllPackage.ITEM__HISTORY:
				return getHistory();
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
			case TllPackage.ITEM__START_LOCATION:
				setStartLocation((Component)newValue);
				return;
			case TllPackage.ITEM__LOCATION:
				setLocation((Component)newValue);
				return;
			case TllPackage.ITEM__IS_PROCESSED:
				setIsProcessed((Boolean)newValue);
				return;
			case TllPackage.ITEM__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends Component>)newValue);
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
			case TllPackage.ITEM__START_LOCATION:
				setStartLocation((Component)null);
				return;
			case TllPackage.ITEM__LOCATION:
				setLocation((Component)null);
				return;
			case TllPackage.ITEM__IS_PROCESSED:
				setIsProcessed(IS_PROCESSED_EDEFAULT);
				return;
			case TllPackage.ITEM__HISTORY:
				getHistory().clear();
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
			case TllPackage.ITEM__START_LOCATION:
				return startLocation != null;
			case TllPackage.ITEM__LOCATION:
				return location != null;
			case TllPackage.ITEM__IS_PROCESSED:
				return isProcessed != IS_PROCESSED_EDEFAULT;
			case TllPackage.ITEM__HISTORY:
				return history != null && !history.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isProcessed: ");
		result.append(isProcessed);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
