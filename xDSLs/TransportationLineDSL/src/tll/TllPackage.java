/**
 */
package tll;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tll.TllFactory
 * @model kind="package"
 * @generated
 */
public interface TllPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tll";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tll";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tll";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TllPackage eINSTANCE = tll.impl.TllPackageImpl.init();

	/**
	 * The meta object id for the '{@link tll.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.NamedElementImpl
	 * @see tll.impl.TllPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tll.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.SystemImpl
	 * @see tll.impl.TllPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__AREA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simconfig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SIMCONFIG = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LOG = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Simulate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM___SIMULATE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tll.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.AreaImpl
	 * @see tll.impl.TllPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__COMPONENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ITEM_GEN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__STORE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__BUFFER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__ITEM = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__LOG = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA___START = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tll.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.ComponentImpl
	 * @see tll.impl.TllPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HOSTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROCESSING_TIME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UNCERTAINTY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___DO_ = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tll.impl.TurntableImpl <em>Turntable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.TurntableImpl
	 * @see tll.impl.TllPackageImpl#getTurntable()
	 * @generated
	 */
	int TURNTABLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__HOSTS = COMPONENT__HOSTS;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__PROCESSING_TIME = COMPONENT__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__UNCERTAINTY = COMPONENT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Neighbour</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__NEIGHBOUR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turntable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE___DO_ = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Turntable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tll.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.ConveyorImpl
	 * @see tll.impl.TllPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__HOSTS = COMPONENT__HOSTS;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PROCESSING_TIME = COMPONENT__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__UNCERTAINTY = COMPONENT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Neighbour</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NEIGHBOUR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR___DO_ = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tll.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.MachineImpl
	 * @see tll.impl.TllPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__HOSTS = COMPONENT__HOSTS;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__PROCESSING_TIME = COMPONENT__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__UNCERTAINTY = COMPONENT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Neighbour</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NEIGHBOUR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE___DO_ = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link tll.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.ItemImpl
	 * @see tll.impl.TllPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__START_LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_PROCESSED = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>History</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__HISTORY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link tll.impl.ItemGeneratorImpl <em>Item Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.ItemGeneratorImpl
	 * @see tll.impl.TllPackageImpl#getItemGenerator()
	 * @generated
	 */
	int ITEM_GENERATOR = 8;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__FREQUENCY = 0;

	/**
	 * The number of structural features of the '<em>Item Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Gen Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR___GEN_ITEM = 0;

	/**
	 * The number of operations of the '<em>Item Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tll.impl.WaitingQueueImpl <em>Waiting Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.WaitingQueueImpl
	 * @see tll.impl.TllPackageImpl#getWaitingQueue()
	 * @generated
	 */
	int WAITING_QUEUE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_QUEUE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_QUEUE__HOSTS = COMPONENT__HOSTS;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_QUEUE__PROCESSING_TIME = COMPONENT__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_QUEUE__UNCERTAINTY = COMPONENT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Buffered Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_QUEUE__BUFFERED_ITEMS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_QUEUE__ENTRY = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Waiting Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_QUEUE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_QUEUE___DO_ = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Waiting Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAITING_QUEUE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link tll.impl.StorageQueueImpl <em>Storage Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.StorageQueueImpl
	 * @see tll.impl.TllPackageImpl#getStorageQueue()
	 * @generated
	 */
	int STORAGE_QUEUE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_QUEUE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_QUEUE__HOSTS = COMPONENT__HOSTS;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_QUEUE__PROCESSING_TIME = COMPONENT__PROCESSING_TIME;

	/**
	 * The feature id for the '<em><b>Uncertainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_QUEUE__UNCERTAINTY = COMPONENT__UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Final Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_QUEUE__FINAL_ITEMS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_QUEUE__EXIT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Storage Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_QUEUE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Do </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_QUEUE___DO_ = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_QUEUE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link tll.impl.SimConfigImpl <em>Sim Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tll.impl.SimConfigImpl
	 * @see tll.impl.TllPackageImpl#getSimConfig()
	 * @generated
	 */
	int SIM_CONFIG = 11;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIG__TIMEOUT = 0;

	/**
	 * The number of structural features of the '<em>Sim Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sim Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_CONFIG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tll.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see tll.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link tll.System#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area</em>'.
	 * @see tll.System#getArea()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Area();

	/**
	 * Returns the meta object for the containment reference '{@link tll.System#getSimconfig <em>Simconfig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simconfig</em>'.
	 * @see tll.System#getSimconfig()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Simconfig();

	/**
	 * Returns the meta object for the attribute list '{@link tll.System#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Log</em>'.
	 * @see tll.System#getLog()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Log();

	/**
	 * Returns the meta object for the '{@link tll.System#simulate() <em>Simulate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Simulate</em>' operation.
	 * @see tll.System#simulate()
	 * @generated
	 */
	EOperation getSystem__Simulate();

	/**
	 * Returns the meta object for class '{@link tll.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see tll.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link tll.Area#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see tll.Area#getComponent()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Component();

	/**
	 * Returns the meta object for the containment reference '{@link tll.Area#getItemGen <em>Item Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Gen</em>'.
	 * @see tll.Area#getItemGen()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_ItemGen();

	/**
	 * Returns the meta object for the reference '{@link tll.Area#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store</em>'.
	 * @see tll.Area#getStore()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Store();

	/**
	 * Returns the meta object for the reference '{@link tll.Area#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buffer</em>'.
	 * @see tll.Area#getBuffer()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Buffer();

	/**
	 * Returns the meta object for the containment reference list '{@link tll.Area#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see tll.Area#getItem()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Item();

	/**
	 * Returns the meta object for the attribute list '{@link tll.Area#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Log</em>'.
	 * @see tll.Area#getLog()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Log();

	/**
	 * Returns the meta object for the '{@link tll.Area#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see tll.Area#start()
	 * @generated
	 */
	EOperation getArea__Start();

	/**
	 * Returns the meta object for class '{@link tll.Turntable <em>Turntable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turntable</em>'.
	 * @see tll.Turntable
	 * @generated
	 */
	EClass getTurntable();

	/**
	 * Returns the meta object for the reference list '{@link tll.Turntable#getNeighbour <em>Neighbour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbour</em>'.
	 * @see tll.Turntable#getNeighbour()
	 * @see #getTurntable()
	 * @generated
	 */
	EReference getTurntable_Neighbour();

	/**
	 * Returns the meta object for the '{@link tll.Turntable#do_() <em>Do </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do </em>' operation.
	 * @see tll.Turntable#do_()
	 * @generated
	 */
	EOperation getTurntable__Do_();

	/**
	 * Returns the meta object for class '{@link tll.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see tll.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for the reference list '{@link tll.Conveyor#getNeighbour <em>Neighbour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbour</em>'.
	 * @see tll.Conveyor#getNeighbour()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Neighbour();

	/**
	 * Returns the meta object for the '{@link tll.Conveyor#do_() <em>Do </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do </em>' operation.
	 * @see tll.Conveyor#do_()
	 * @generated
	 */
	EOperation getConveyor__Do_();

	/**
	 * Returns the meta object for class '{@link tll.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see tll.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the reference list '{@link tll.Machine#getNeighbour <em>Neighbour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbour</em>'.
	 * @see tll.Machine#getNeighbour()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Neighbour();

	/**
	 * Returns the meta object for the '{@link tll.Machine#do_() <em>Do </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do </em>' operation.
	 * @see tll.Machine#do_()
	 * @generated
	 */
	EOperation getMachine__Do_();

	/**
	 * Returns the meta object for class '{@link tll.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see tll.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link tll.Component#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hosts</em>'.
	 * @see tll.Component#getHosts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Hosts();

	/**
	 * Returns the meta object for the attribute '{@link tll.Component#getProcessingTime <em>Processing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Time</em>'.
	 * @see tll.Component#getProcessingTime()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ProcessingTime();

	/**
	 * Returns the meta object for the attribute '{@link tll.Component#getUncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncertainty</em>'.
	 * @see tll.Component#getUncertainty()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Uncertainty();

	/**
	 * Returns the meta object for the '{@link tll.Component#do_() <em>Do </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do </em>' operation.
	 * @see tll.Component#do_()
	 * @generated
	 */
	EOperation getComponent__Do_();

	/**
	 * Returns the meta object for class '{@link tll.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see tll.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link tll.NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tll.NamedElement#getId()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Id();

	/**
	 * Returns the meta object for class '{@link tll.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see tll.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference '{@link tll.Item#getStartLocation <em>Start Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Location</em>'.
	 * @see tll.Item#getStartLocation()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_StartLocation();

	/**
	 * Returns the meta object for the reference '{@link tll.Item#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see tll.Item#getLocation()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Location();

	/**
	 * Returns the meta object for the attribute '{@link tll.Item#isIsProcessed <em>Is Processed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Processed</em>'.
	 * @see tll.Item#isIsProcessed()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IsProcessed();

	/**
	 * Returns the meta object for the reference list '{@link tll.Item#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>History</em>'.
	 * @see tll.Item#getHistory()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_History();

	/**
	 * Returns the meta object for class '{@link tll.ItemGenerator <em>Item Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Generator</em>'.
	 * @see tll.ItemGenerator
	 * @generated
	 */
	EClass getItemGenerator();

	/**
	 * Returns the meta object for the attribute '{@link tll.ItemGenerator#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see tll.ItemGenerator#getFrequency()
	 * @see #getItemGenerator()
	 * @generated
	 */
	EAttribute getItemGenerator_Frequency();

	/**
	 * Returns the meta object for the '{@link tll.ItemGenerator#genItem() <em>Gen Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gen Item</em>' operation.
	 * @see tll.ItemGenerator#genItem()
	 * @generated
	 */
	EOperation getItemGenerator__GenItem();

	/**
	 * Returns the meta object for class '{@link tll.WaitingQueue <em>Waiting Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waiting Queue</em>'.
	 * @see tll.WaitingQueue
	 * @generated
	 */
	EClass getWaitingQueue();

	/**
	 * Returns the meta object for the containment reference list '{@link tll.WaitingQueue#getBufferedItems <em>Buffered Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buffered Items</em>'.
	 * @see tll.WaitingQueue#getBufferedItems()
	 * @see #getWaitingQueue()
	 * @generated
	 */
	EReference getWaitingQueue_BufferedItems();

	/**
	 * Returns the meta object for the reference '{@link tll.WaitingQueue#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry</em>'.
	 * @see tll.WaitingQueue#getEntry()
	 * @see #getWaitingQueue()
	 * @generated
	 */
	EReference getWaitingQueue_Entry();

	/**
	 * Returns the meta object for the '{@link tll.WaitingQueue#do_() <em>Do </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do </em>' operation.
	 * @see tll.WaitingQueue#do_()
	 * @generated
	 */
	EOperation getWaitingQueue__Do_();

	/**
	 * Returns the meta object for class '{@link tll.StorageQueue <em>Storage Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Queue</em>'.
	 * @see tll.StorageQueue
	 * @generated
	 */
	EClass getStorageQueue();

	/**
	 * Returns the meta object for the containment reference list '{@link tll.StorageQueue#getFinalItems <em>Final Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Final Items</em>'.
	 * @see tll.StorageQueue#getFinalItems()
	 * @see #getStorageQueue()
	 * @generated
	 */
	EReference getStorageQueue_FinalItems();

	/**
	 * Returns the meta object for the reference '{@link tll.StorageQueue#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exit</em>'.
	 * @see tll.StorageQueue#getExit()
	 * @see #getStorageQueue()
	 * @generated
	 */
	EReference getStorageQueue_Exit();

	/**
	 * Returns the meta object for the '{@link tll.StorageQueue#do_() <em>Do </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do </em>' operation.
	 * @see tll.StorageQueue#do_()
	 * @generated
	 */
	EOperation getStorageQueue__Do_();

	/**
	 * Returns the meta object for class '{@link tll.SimConfig <em>Sim Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Config</em>'.
	 * @see tll.SimConfig
	 * @generated
	 */
	EClass getSimConfig();

	/**
	 * Returns the meta object for the attribute '{@link tll.SimConfig#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see tll.SimConfig#getTimeout()
	 * @see #getSimConfig()
	 * @generated
	 */
	EAttribute getSimConfig_Timeout();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TllFactory getTllFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tll.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.SystemImpl
		 * @see tll.impl.TllPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__AREA = eINSTANCE.getSystem_Area();

		/**
		 * The meta object literal for the '<em><b>Simconfig</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SIMCONFIG = eINSTANCE.getSystem_Simconfig();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__LOG = eINSTANCE.getSystem_Log();

		/**
		 * The meta object literal for the '<em><b>Simulate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYSTEM___SIMULATE = eINSTANCE.getSystem__Simulate();

		/**
		 * The meta object literal for the '{@link tll.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.AreaImpl
		 * @see tll.impl.TllPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__COMPONENT = eINSTANCE.getArea_Component();

		/**
		 * The meta object literal for the '<em><b>Item Gen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__ITEM_GEN = eINSTANCE.getArea_ItemGen();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__STORE = eINSTANCE.getArea_Store();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__BUFFER = eINSTANCE.getArea_Buffer();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__ITEM = eINSTANCE.getArea_Item();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__LOG = eINSTANCE.getArea_Log();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AREA___START = eINSTANCE.getArea__Start();

		/**
		 * The meta object literal for the '{@link tll.impl.TurntableImpl <em>Turntable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.TurntableImpl
		 * @see tll.impl.TllPackageImpl#getTurntable()
		 * @generated
		 */
		EClass TURNTABLE = eINSTANCE.getTurntable();

		/**
		 * The meta object literal for the '<em><b>Neighbour</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNTABLE__NEIGHBOUR = eINSTANCE.getTurntable_Neighbour();

		/**
		 * The meta object literal for the '<em><b>Do </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TURNTABLE___DO_ = eINSTANCE.getTurntable__Do_();

		/**
		 * The meta object literal for the '{@link tll.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.ConveyorImpl
		 * @see tll.impl.TllPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '<em><b>Neighbour</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__NEIGHBOUR = eINSTANCE.getConveyor_Neighbour();

		/**
		 * The meta object literal for the '<em><b>Do </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVEYOR___DO_ = eINSTANCE.getConveyor__Do_();

		/**
		 * The meta object literal for the '{@link tll.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.MachineImpl
		 * @see tll.impl.TllPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Neighbour</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__NEIGHBOUR = eINSTANCE.getMachine_Neighbour();

		/**
		 * The meta object literal for the '<em><b>Do </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MACHINE___DO_ = eINSTANCE.getMachine__Do_();

		/**
		 * The meta object literal for the '{@link tll.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.ComponentImpl
		 * @see tll.impl.TllPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__HOSTS = eINSTANCE.getComponent_Hosts();

		/**
		 * The meta object literal for the '<em><b>Processing Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__PROCESSING_TIME = eINSTANCE.getComponent_ProcessingTime();

		/**
		 * The meta object literal for the '<em><b>Uncertainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__UNCERTAINTY = eINSTANCE.getComponent_Uncertainty();

		/**
		 * The meta object literal for the '<em><b>Do </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___DO_ = eINSTANCE.getComponent__Do_();

		/**
		 * The meta object literal for the '{@link tll.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.NamedElementImpl
		 * @see tll.impl.TllPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement_Id();

		/**
		 * The meta object literal for the '{@link tll.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.ItemImpl
		 * @see tll.impl.TllPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Start Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__START_LOCATION = eINSTANCE.getItem_StartLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__LOCATION = eINSTANCE.getItem_Location();

		/**
		 * The meta object literal for the '<em><b>Is Processed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IS_PROCESSED = eINSTANCE.getItem_IsProcessed();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__HISTORY = eINSTANCE.getItem_History();

		/**
		 * The meta object literal for the '{@link tll.impl.ItemGeneratorImpl <em>Item Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.ItemGeneratorImpl
		 * @see tll.impl.TllPackageImpl#getItemGenerator()
		 * @generated
		 */
		EClass ITEM_GENERATOR = eINSTANCE.getItemGenerator();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_GENERATOR__FREQUENCY = eINSTANCE.getItemGenerator_Frequency();

		/**
		 * The meta object literal for the '<em><b>Gen Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM_GENERATOR___GEN_ITEM = eINSTANCE.getItemGenerator__GenItem();

		/**
		 * The meta object literal for the '{@link tll.impl.WaitingQueueImpl <em>Waiting Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.WaitingQueueImpl
		 * @see tll.impl.TllPackageImpl#getWaitingQueue()
		 * @generated
		 */
		EClass WAITING_QUEUE = eINSTANCE.getWaitingQueue();

		/**
		 * The meta object literal for the '<em><b>Buffered Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAITING_QUEUE__BUFFERED_ITEMS = eINSTANCE.getWaitingQueue_BufferedItems();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAITING_QUEUE__ENTRY = eINSTANCE.getWaitingQueue_Entry();

		/**
		 * The meta object literal for the '<em><b>Do </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WAITING_QUEUE___DO_ = eINSTANCE.getWaitingQueue__Do_();

		/**
		 * The meta object literal for the '{@link tll.impl.StorageQueueImpl <em>Storage Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.StorageQueueImpl
		 * @see tll.impl.TllPackageImpl#getStorageQueue()
		 * @generated
		 */
		EClass STORAGE_QUEUE = eINSTANCE.getStorageQueue();

		/**
		 * The meta object literal for the '<em><b>Final Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_QUEUE__FINAL_ITEMS = eINSTANCE.getStorageQueue_FinalItems();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_QUEUE__EXIT = eINSTANCE.getStorageQueue_Exit();

		/**
		 * The meta object literal for the '<em><b>Do </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORAGE_QUEUE___DO_ = eINSTANCE.getStorageQueue__Do_();

		/**
		 * The meta object literal for the '{@link tll.impl.SimConfigImpl <em>Sim Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tll.impl.SimConfigImpl
		 * @see tll.impl.TllPackageImpl#getSimConfig()
		 * @generated
		 */
		EClass SIM_CONFIG = eINSTANCE.getSimConfig();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIM_CONFIG__TIMEOUT = eINSTANCE.getSimConfig_Timeout();

	}

} //TllPackage
