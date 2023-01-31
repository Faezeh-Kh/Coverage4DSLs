/**
 */
package tll.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tll.Area;
import tll.Component;
import tll.Item;
import tll.ItemGenerator;
import tll.StorageQueue;
import tll.TllFactory;
import tll.TllPackage;
import tll.WaitingQueue;
import tll.time.TimeWatch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tll.impl.AreaImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link tll.impl.AreaImpl#getItemGen <em>Item Gen</em>}</li>
 *   <li>{@link tll.impl.AreaImpl#getStore <em>Store</em>}</li>
 *   <li>{@link tll.impl.AreaImpl#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link tll.impl.AreaImpl#getItem <em>Item</em>}</li>
 *   <li>{@link tll.impl.AreaImpl#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AreaImpl extends NamedElementImpl implements Area {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getItemGen() <em>Item Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemGen()
	 * @generated
	 * @ordered
	 */
	protected ItemGenerator itemGen;
	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected StorageQueue store;
	/**
	 * The cached value of the '{@link #getBuffer() <em>Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer()
	 * @generated
	 * @ordered
	 */
	protected WaitingQueue buffer;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> item;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected EList<String> log;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TllPackage.Literals.AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, TllPackage.AREA__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemGenerator getItemGen() {
		return itemGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemGen(ItemGenerator newItemGen, NotificationChain msgs) {
		ItemGenerator oldItemGen = itemGen;
		itemGen = newItemGen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TllPackage.AREA__ITEM_GEN, oldItemGen, newItemGen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemGen(ItemGenerator newItemGen) {
		if (newItemGen != itemGen) {
			NotificationChain msgs = null;
			if (itemGen != null)
				msgs = ((InternalEObject)itemGen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TllPackage.AREA__ITEM_GEN, null, msgs);
			if (newItemGen != null)
				msgs = ((InternalEObject)newItemGen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TllPackage.AREA__ITEM_GEN, null, msgs);
			msgs = basicSetItemGen(newItemGen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.AREA__ITEM_GEN, newItemGen, newItemGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageQueue getStore() {
		if (store != null && store.eIsProxy()) {
			InternalEObject oldStore = (InternalEObject)store;
			store = (StorageQueue)eResolveProxy(oldStore);
			if (store != oldStore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TllPackage.AREA__STORE, oldStore, store));
			}
		}
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageQueue basicGetStore() {
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStore(StorageQueue newStore) {
		StorageQueue oldStore = store;
		store = newStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.AREA__STORE, oldStore, store));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitingQueue getBuffer() {
		if (buffer != null && buffer.eIsProxy()) {
			InternalEObject oldBuffer = (InternalEObject)buffer;
			buffer = (WaitingQueue)eResolveProxy(oldBuffer);
			if (buffer != oldBuffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TllPackage.AREA__BUFFER, oldBuffer, buffer));
			}
		}
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitingQueue basicGetBuffer() {
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffer(WaitingQueue newBuffer) {
		WaitingQueue oldBuffer = buffer;
		buffer = newBuffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TllPackage.AREA__BUFFER, oldBuffer, buffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<Item>(Item.class, this, TllPackage.AREA__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLog() {
		if (log == null) {
			log = new EDataTypeUniqueEList<String>(String.class, this, TllPackage.AREA__LOG);
		}
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void start() {
		//System.out.println("Start Area " + this.getId());
		
		TimeWatch global_watch = TimeWatch.start();
		TimeWatch watch = TimeWatch.start();
		
		while(true){
			executeAssignment();
			
			this.itemGen(watch);
			
			if(this.getComponent().stream().filter(element -> element.getHosts() != null).count() == 0){
				if(!this.getBuffer().getBufferedItems().isEmpty()){
					Item item = this.getBuffer().getBufferedItems().get(0);
					item.setStartLocation(this.buffer.getEntry());
					this.buffer.getEntry().setHosts(item);
					this.getItem().add(item);
				}
			}
			
			if(global_watch.time() > ((tll.System)this.eContainer()).getSimconfig().getTimeout()){
				//System.out.println("Time is up");
				
				//System.out.println("Process assigned items");
				int i = 0;
				while(true && i < 500){
					i++;
					List<Component> assignedComponents = this.getComponent().stream()
						.filter(p -> p.getHosts() != null).collect(Collectors.toList());
					if(!assignedComponents.isEmpty()){
						executeAssignment();
					}
					else{break;}
				}
				
				break;
			}
		}
		//System.out.println("End Area" + this.getId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TllPackage.AREA__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case TllPackage.AREA__ITEM_GEN:
				return basicSetItemGen(null, msgs);
			case TllPackage.AREA__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case TllPackage.AREA__COMPONENT:
				return getComponent();
			case TllPackage.AREA__ITEM_GEN:
				return getItemGen();
			case TllPackage.AREA__STORE:
				if (resolve) return getStore();
				return basicGetStore();
			case TllPackage.AREA__BUFFER:
				if (resolve) return getBuffer();
				return basicGetBuffer();
			case TllPackage.AREA__ITEM:
				return getItem();
			case TllPackage.AREA__LOG:
				return getLog();
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
			case TllPackage.AREA__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case TllPackage.AREA__ITEM_GEN:
				setItemGen((ItemGenerator)newValue);
				return;
			case TllPackage.AREA__STORE:
				setStore((StorageQueue)newValue);
				return;
			case TllPackage.AREA__BUFFER:
				setBuffer((WaitingQueue)newValue);
				return;
			case TllPackage.AREA__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Item>)newValue);
				return;
			case TllPackage.AREA__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends String>)newValue);
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
			case TllPackage.AREA__COMPONENT:
				getComponent().clear();
				return;
			case TllPackage.AREA__ITEM_GEN:
				setItemGen((ItemGenerator)null);
				return;
			case TllPackage.AREA__STORE:
				setStore((StorageQueue)null);
				return;
			case TllPackage.AREA__BUFFER:
				setBuffer((WaitingQueue)null);
				return;
			case TllPackage.AREA__ITEM:
				getItem().clear();
				return;
			case TllPackage.AREA__LOG:
				getLog().clear();
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
			case TllPackage.AREA__COMPONENT:
				return component != null && !component.isEmpty();
			case TllPackage.AREA__ITEM_GEN:
				return itemGen != null;
			case TllPackage.AREA__STORE:
				return store != null;
			case TllPackage.AREA__BUFFER:
				return buffer != null;
			case TllPackage.AREA__ITEM:
				return item != null && !item.isEmpty();
			case TllPackage.AREA__LOG:
				return log != null && !log.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TllPackage.AREA___START:
				start();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (log: ");
		result.append(log);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	private void executeAssignment() {
		// find components with assigned items
		List<Component> assignedComponents = this.getComponent().stream()
				.filter(p -> p.getHosts() != null).collect(Collectors.toList());
		
		// try to move items
		assignedComponents.stream().forEach(element -> element.do_());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void itemGen(TimeWatch watch){

		long passedTimeInMs = watch.time();

		if(passedTimeInMs > this.getItemGen().getFrequency()){
			if(this.buffer.getEntry().getHosts() == null){
				if(this.buffer.getBufferedItems().isEmpty()){
					Item item = TllFactory.eINSTANCE.createItem();
					item.setIsProcessed(false);
					item.setId(UUID.randomUUID().toString());
					
					// LOG - creation of Items
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-ms-SSS");
					String dateString = format.format( new Date() );
					tll.System sys = ((tll.System)EcoreUtil.getRootContainer(this));
					String x = "InputBuffer.createItem()-/"+ sys.getId() + "/" + this.getId()
					+ "/" + this.getBuffer().getId() + "," +item.getId()+","+dateString;
					this.getLog().add(x.toString());
					
					this.getItem().add(item);
					this.buffer.getEntry().setHosts(item);
				}else{
					this.buffer.getEntry().setHosts(this.buffer.getBufferedItems().get(0));
					this.getItem().add(this.buffer.getBufferedItems().get(0));
				}
			}else{
				Item item = TllFactory.eINSTANCE.createItem();
				item.setIsProcessed(false);
				item.setId(UUID.randomUUID().toString());
				
				// LOG - creation of Items
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-ms-SSS");
				String dateString = format.format( new Date() );
				tll.System sys = ((tll.System)EcoreUtil.getRootContainer(this));
				String x = "InputBuffer.createItem()-/"+ sys.getId() + "/" + this.getId()
				+ "/" + this.getBuffer().getId() + "," +item.getId()+","+dateString;
				this.getLog().add(x.toString());
				
				this.buffer.getBufferedItems().add(item);
			}
			watch.reset();
		}
	}
	
} //AreaImpl
