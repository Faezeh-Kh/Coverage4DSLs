/**
 */
package tll.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tll.Area;
import tll.Conveyor;
import tll.Item;
import tll.ItemGenerator;
import tll.Machine;
import tll.NamedElement;
import tll.SimConfig;
import tll.StorageQueue;
import tll.TllFactory;
import tll.TllPackage;
import tll.Turntable;
import tll.WaitingQueue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TllFactoryImpl extends EFactoryImpl implements TllFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TllFactory init() {
		try {
			TllFactory theTllFactory = (TllFactory)EPackage.Registry.INSTANCE.getEFactory(TllPackage.eNS_URI);
			if (theTllFactory != null) {
				return theTllFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TllFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TllFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TllPackage.SYSTEM: return createSystem();
			case TllPackage.AREA: return createArea();
			case TllPackage.TURNTABLE: return createTurntable();
			case TllPackage.CONVEYOR: return createConveyor();
			case TllPackage.MACHINE: return createMachine();
			case TllPackage.NAMED_ELEMENT: return createNamedElement();
			case TllPackage.ITEM: return createItem();
			case TllPackage.ITEM_GENERATOR: return createItemGenerator();
			case TllPackage.WAITING_QUEUE: return createWaitingQueue();
			case TllPackage.STORAGE_QUEUE: return createStorageQueue();
			case TllPackage.SIM_CONFIG: return createSimConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tll.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Turntable createTurntable() {
		TurntableImpl turntable = new TurntableImpl();
		return turntable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemGenerator createItemGenerator() {
		ItemGeneratorImpl itemGenerator = new ItemGeneratorImpl();
		return itemGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WaitingQueue createWaitingQueue() {
		WaitingQueueImpl waitingQueue = new WaitingQueueImpl();
		return waitingQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageQueue createStorageQueue() {
		StorageQueueImpl storageQueue = new StorageQueueImpl();
		return storageQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimConfig createSimConfig() {
		SimConfigImpl simConfig = new SimConfigImpl();
		return simConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TllPackage getTllPackage() {
		return (TllPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TllPackage getPackage() {
		return TllPackage.eINSTANCE;
	}

} //TllFactoryImpl
