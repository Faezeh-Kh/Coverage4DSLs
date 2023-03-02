/**
 */
package shipyardV4;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see shipyardV4.ShipyardV4Factory
 * @model kind="package"
 * @generated
 */
public interface ShipyardV4Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shipyardV4";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jku.bise.at/shipyardV4";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shipyardV4";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShipyardV4Package eINSTANCE = shipyardV4.impl.ShipyardV4PackageImpl.init();

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardV4RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardV4RootImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardV4Root()
	 * @generated
	 */
	int SHIPYARD_V4_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Shipyard V4 Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Initial Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_V4_ROOT__INITIAL_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_V4_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_V4_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.MetadataImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__METADATA = 0;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SelectorImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSelector()
	 * @generated
	 */
	int SELECTOR = 2;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__SELECTOR = 0;

	/**
	 * The number of structural features of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SequenceImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 3;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Simulated Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SIMULATED_RESULT = 1;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardImpl <em>Shipyard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyard()
	 * @generated
	 */
	int SHIPYARD = 4;

	/**
	 * The feature id for the '<em><b>Shipyard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD__SHIPYARD = 0;

	/**
	 * The number of structural features of the '<em>Shipyard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Shipyard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardSpecImpl <em>Shipyard Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardSpecImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardSpec()
	 * @generated
	 */
	int SHIPYARD_SPEC = 5;

	/**
	 * The feature id for the '<em><b>Shipyard Spec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC__SHIPYARD_SPEC = 0;

	/**
	 * The number of structural features of the '<em>Shipyard Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Shipyard Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.StageImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 6;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__STAGE = 0;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.TaskImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTask()
	 * @generated
	 */
	int TASK = 7;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK = 0;

	/**
	 * The feature id for the '<em><b>Simulated Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SIMULATED_RESULT = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.TriggerImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 8;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TRIGGER = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.MetadataPropertiesAbstractImpl <em>Metadata Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.MetadataPropertiesAbstractImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getMetadataPropertiesAbstract()
	 * @generated
	 */
	int METADATA_PROPERTIES_ABSTRACT = 31;

	/**
	 * The number of structural features of the '<em>Metadata Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Metadata Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.MetadataNameImpl <em>Metadata Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.MetadataNameImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getMetadataName()
	 * @generated
	 */
	int METADATA_NAME = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_NAME__NAME = METADATA_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metadata Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_NAME_FEATURE_COUNT = METADATA_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Metadata Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_NAME_OPERATION_COUNT = METADATA_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SelectorPropertiesAbstractImpl <em>Selector Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SelectorPropertiesAbstractImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSelectorPropertiesAbstract()
	 * @generated
	 */
	int SELECTOR_PROPERTIES_ABSTRACT = 32;

	/**
	 * The number of structural features of the '<em>Selector Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Selector Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SelectorMatchImpl <em>Selector Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SelectorMatchImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSelectorMatch()
	 * @generated
	 */
	int SELECTOR_MATCH = 10;

	/**
	 * The feature id for the '<em><b>Match</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_MATCH__MATCH = SELECTOR_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selector Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_MATCH_FEATURE_COUNT = SELECTOR_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Selector Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_MATCH_OPERATION_COUNT = SELECTOR_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SequencePropertiesAbstractImpl <em>Sequence Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SequencePropertiesAbstractImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequencePropertiesAbstract()
	 * @generated
	 */
	int SEQUENCE_PROPERTIES_ABSTRACT = 33;

	/**
	 * The number of structural features of the '<em>Sequence Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sequence Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SequenceNameImpl <em>Sequence Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SequenceNameImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequenceName()
	 * @generated
	 */
	int SEQUENCE_NAME = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NAME__NAME = SEQUENCE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NAME_FEATURE_COUNT = SEQUENCE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NAME_OPERATION_COUNT = SEQUENCE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SequenceTriggeredOnImpl <em>Sequence Triggered On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SequenceTriggeredOnImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequenceTriggeredOn()
	 * @generated
	 */
	int SEQUENCE_TRIGGERED_ON = 12;

	/**
	 * The feature id for the '<em><b>Triggered On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TRIGGERED_ON__TRIGGERED_ON = SEQUENCE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Triggered On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TRIGGERED_ON_FEATURE_COUNT = SEQUENCE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence Triggered On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TRIGGERED_ON_OPERATION_COUNT = SEQUENCE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SequenceTasksImpl <em>Sequence Tasks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SequenceTasksImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequenceTasks()
	 * @generated
	 */
	int SEQUENCE_TASKS = 13;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TASKS__TASKS = SEQUENCE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TASKS_FEATURE_COUNT = SEQUENCE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TASKS_OPERATION_COUNT = SEQUENCE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardPropertiesAbstractImpl <em>Shipyard Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardPropertiesAbstractImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardPropertiesAbstract()
	 * @generated
	 */
	int SHIPYARD_PROPERTIES_ABSTRACT = 34;

	/**
	 * The number of structural features of the '<em>Shipyard Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Shipyard Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardApiVersionImpl <em>Shipyard Api Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardApiVersionImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardApiVersion()
	 * @generated
	 */
	int SHIPYARD_API_VERSION = 14;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_API_VERSION__API_VERSION = SHIPYARD_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shipyard Api Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_API_VERSION_FEATURE_COUNT = SHIPYARD_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shipyard Api Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_API_VERSION_OPERATION_COUNT = SHIPYARD_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardKindImpl <em>Shipyard Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardKindImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardKind()
	 * @generated
	 */
	int SHIPYARD_KIND = 15;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_KIND__KIND = SHIPYARD_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shipyard Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_KIND_FEATURE_COUNT = SHIPYARD_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shipyard Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_KIND_OPERATION_COUNT = SHIPYARD_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardMetadataImpl <em>Shipyard Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardMetadataImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardMetadata()
	 * @generated
	 */
	int SHIPYARD_METADATA = 16;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_METADATA__METADATA = SHIPYARD_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shipyard Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_METADATA_FEATURE_COUNT = SHIPYARD_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shipyard Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_METADATA_OPERATION_COUNT = SHIPYARD_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardSpec1Impl <em>Shipyard Spec1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardSpec1Impl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardSpec1()
	 * @generated
	 */
	int SHIPYARD_SPEC1 = 17;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC1__SPEC = SHIPYARD_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shipyard Spec1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC1_FEATURE_COUNT = SHIPYARD_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shipyard Spec1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC1_OPERATION_COUNT = SHIPYARD_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardSpecPropertiesAbstractImpl <em>Shipyard Spec Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardSpecPropertiesAbstractImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardSpecPropertiesAbstract()
	 * @generated
	 */
	int SHIPYARD_SPEC_PROPERTIES_ABSTRACT = 35;

	/**
	 * The number of structural features of the '<em>Shipyard Spec Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Shipyard Spec Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardSpecStagesImpl <em>Shipyard Spec Stages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardSpecStagesImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardSpecStages()
	 * @generated
	 */
	int SHIPYARD_SPEC_STAGES = 18;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC_STAGES__STAGES = SHIPYARD_SPEC_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shipyard Spec Stages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC_STAGES_FEATURE_COUNT = SHIPYARD_SPEC_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shipyard Spec Stages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC_STAGES_OPERATION_COUNT = SHIPYARD_SPEC_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.StagePropertiesAbstractImpl <em>Stage Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.StagePropertiesAbstractImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getStagePropertiesAbstract()
	 * @generated
	 */
	int STAGE_PROPERTIES_ABSTRACT = 36;

	/**
	 * The number of structural features of the '<em>Stage Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stage Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.StageNameImpl <em>Stage Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.StageNameImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getStageName()
	 * @generated
	 */
	int STAGE_NAME = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_NAME__NAME = STAGE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stage Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_NAME_FEATURE_COUNT = STAGE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stage Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_NAME_OPERATION_COUNT = STAGE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.StageSequencesImpl <em>Stage Sequences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.StageSequencesImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getStageSequences()
	 * @generated
	 */
	int STAGE_SEQUENCES = 20;

	/**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_SEQUENCES__SEQUENCES = STAGE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stage Sequences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_SEQUENCES_FEATURE_COUNT = STAGE_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stage Sequences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_SEQUENCES_OPERATION_COUNT = STAGE_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.TaskPropertiesAbstractImpl <em>Task Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.TaskPropertiesAbstractImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTaskPropertiesAbstract()
	 * @generated
	 */
	int TASK_PROPERTIES_ABSTRACT = 37;

	/**
	 * The number of structural features of the '<em>Task Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Task Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.TaskNameImpl <em>Task Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.TaskNameImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTaskName()
	 * @generated
	 */
	int TASK_NAME = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NAME__NAME = TASK_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NAME_FEATURE_COUNT = TASK_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_NAME_OPERATION_COUNT = TASK_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.TaskPropertiesImpl <em>Task Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.TaskPropertiesImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTaskProperties()
	 * @generated
	 */
	int TASK_PROPERTIES = 22;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES__PROPERTIES = TASK_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES_FEATURE_COUNT = TASK_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES_OPERATION_COUNT = TASK_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.TriggerPropertiesAbstractImpl <em>Trigger Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.TriggerPropertiesAbstractImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTriggerPropertiesAbstract()
	 * @generated
	 */
	int TRIGGER_PROPERTIES_ABSTRACT = 38;

	/**
	 * The number of structural features of the '<em>Trigger Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trigger Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.TriggerEventImpl <em>Trigger Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.TriggerEventImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTriggerEvent()
	 * @generated
	 */
	int TRIGGER_EVENT = 23;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EVENT__EVENT = TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EVENT_FEATURE_COUNT = TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trigger Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_EVENT_OPERATION_COUNT = TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.TriggerSelectorImpl <em>Trigger Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.TriggerSelectorImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTriggerSelector()
	 * @generated
	 */
	int TRIGGER_SELECTOR = 24;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_SELECTOR__SELECTOR = TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_SELECTOR_FEATURE_COUNT = TRIGGER_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trigger Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_SELECTOR_OPERATION_COUNT = TRIGGER_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SelectorMatchPropertiesAbstractImpl <em>Selector Match Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SelectorMatchPropertiesAbstractImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSelectorMatchPropertiesAbstract()
	 * @generated
	 */
	int SELECTOR_MATCH_PROPERTIES_ABSTRACT = 39;

	/**
	 * The number of structural features of the '<em>Selector Match Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_MATCH_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Selector Match Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_MATCH_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SelectorMatchPatternProperties0Impl <em>Selector Match Pattern Properties0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SelectorMatchPatternProperties0Impl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSelectorMatchPatternProperties0()
	 * @generated
	 */
	int SELECTOR_MATCH_PATTERN_PROPERTIES0 = 25;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_MATCH_PATTERN_PROPERTIES0__KEY = SELECTOR_MATCH_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern Properties0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_MATCH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0 = SELECTOR_MATCH_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Selector Match Pattern Properties0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_MATCH_PATTERN_PROPERTIES0_FEATURE_COUNT = SELECTOR_MATCH_PROPERTIES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Selector Match Pattern Properties0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_MATCH_PATTERN_PROPERTIES0_OPERATION_COUNT = SELECTOR_MATCH_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.TaskPropertiesPropertiesAbstractImpl <em>Task Properties Properties Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.TaskPropertiesPropertiesAbstractImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTaskPropertiesPropertiesAbstract()
	 * @generated
	 */
	int TASK_PROPERTIES_PROPERTIES_ABSTRACT = 40;

	/**
	 * The number of structural features of the '<em>Task Properties Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES_PROPERTIES_ABSTRACT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Task Properties Properties Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES_PROPERTIES_ABSTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.TaskPropertiesAdditionalPropertiesImpl <em>Task Properties Additional Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.TaskPropertiesAdditionalPropertiesImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTaskPropertiesAdditionalProperties()
	 * @generated
	 */
	int TASK_PROPERTIES_ADDITIONAL_PROPERTIES = 26;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES_ADDITIONAL_PROPERTIES__KEY = TASK_PROPERTIES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES = TASK_PROPERTIES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Properties Additional Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES_ADDITIONAL_PROPERTIES_FEATURE_COUNT = TASK_PROPERTIES_PROPERTIES_ABSTRACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Properties Additional Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPERTIES_ADDITIONAL_PROPERTIES_OPERATION_COUNT = TASK_PROPERTIES_PROPERTIES_ABSTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SequenceTriggeredOnItemsImpl <em>Sequence Triggered On Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SequenceTriggeredOnItemsImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequenceTriggeredOnItems()
	 * @generated
	 */
	int SEQUENCE_TRIGGERED_ON_ITEMS = 27;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TRIGGERED_ON_ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Sequence Triggered On Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TRIGGERED_ON_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sequence Triggered On Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TRIGGERED_ON_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.SequenceTasksItemsImpl <em>Sequence Tasks Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.SequenceTasksItemsImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequenceTasksItems()
	 * @generated
	 */
	int SEQUENCE_TASKS_ITEMS = 28;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TASKS_ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Sequence Tasks Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TASKS_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sequence Tasks Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TASKS_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.ShipyardSpecStagesItemsImpl <em>Shipyard Spec Stages Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.ShipyardSpecStagesItemsImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardSpecStagesItems()
	 * @generated
	 */
	int SHIPYARD_SPEC_STAGES_ITEMS = 29;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC_STAGES_ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Shipyard Spec Stages Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC_STAGES_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Shipyard Spec Stages Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_SPEC_STAGES_ITEMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shipyardV4.impl.StageSequencesItemsImpl <em>Stage Sequences Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shipyardV4.impl.StageSequencesItemsImpl
	 * @see shipyardV4.impl.ShipyardV4PackageImpl#getStageSequencesItems()
	 * @generated
	 */
	int STAGE_SEQUENCES_ITEMS = 30;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_SEQUENCES_ITEMS__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Stage Sequences Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_SEQUENCES_ITEMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stage Sequences Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_SEQUENCES_ITEMS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link shipyardV4.ShipyardV4Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see shipyardV4.ShipyardV4Root
	 * @generated
	 */
	EClass getShipyardV4Root();

	/**
	 * Returns the meta object for the containment reference '{@link shipyardV4.ShipyardV4Root#getShipyardV4Root <em>Shipyard V4 Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shipyard V4 Root</em>'.
	 * @see shipyardV4.ShipyardV4Root#getShipyardV4Root()
	 * @see #getShipyardV4Root()
	 * @generated
	 */
	EReference getShipyardV4Root_ShipyardV4Root();

	/**
	 * Returns the meta object for the reference '{@link shipyardV4.ShipyardV4Root#getInitialSequence <em>Initial Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Sequence</em>'.
	 * @see shipyardV4.ShipyardV4Root#getInitialSequence()
	 * @see #getShipyardV4Root()
	 * @generated
	 */
	EReference getShipyardV4Root_InitialSequence();

	/**
	 * Returns the meta object for class '{@link shipyardV4.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see shipyardV4.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.Metadata#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see shipyardV4.Metadata#getMetadata()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Metadata();

	/**
	 * Returns the meta object for class '{@link shipyardV4.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see shipyardV4.Selector
	 * @generated
	 */
	EClass getSelector();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.Selector#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selector</em>'.
	 * @see shipyardV4.Selector#getSelector()
	 * @see #getSelector()
	 * @generated
	 */
	EReference getSelector_Selector();

	/**
	 * Returns the meta object for class '{@link shipyardV4.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see shipyardV4.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.Sequence#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see shipyardV4.Sequence#getSequence()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.Sequence#getSimulatedResult <em>Simulated Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulated Result</em>'.
	 * @see shipyardV4.Sequence#getSimulatedResult()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_SimulatedResult();

	/**
	 * Returns the meta object for class '{@link shipyardV4.Shipyard <em>Shipyard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard</em>'.
	 * @see shipyardV4.Shipyard
	 * @generated
	 */
	EClass getShipyard();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.Shipyard#getShipyard <em>Shipyard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shipyard</em>'.
	 * @see shipyardV4.Shipyard#getShipyard()
	 * @see #getShipyard()
	 * @generated
	 */
	EReference getShipyard_Shipyard();

	/**
	 * Returns the meta object for class '{@link shipyardV4.ShipyardSpec <em>Shipyard Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard Spec</em>'.
	 * @see shipyardV4.ShipyardSpec
	 * @generated
	 */
	EClass getShipyardSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.ShipyardSpec#getShipyardSpec <em>Shipyard Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shipyard Spec</em>'.
	 * @see shipyardV4.ShipyardSpec#getShipyardSpec()
	 * @see #getShipyardSpec()
	 * @generated
	 */
	EReference getShipyardSpec_ShipyardSpec();

	/**
	 * Returns the meta object for class '{@link shipyardV4.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see shipyardV4.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.Stage#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stage</em>'.
	 * @see shipyardV4.Stage#getStage()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Stage();

	/**
	 * Returns the meta object for class '{@link shipyardV4.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see shipyardV4.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.Task#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see shipyardV4.Task#getTask()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Task();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.Task#getSimulatedResult <em>Simulated Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulated Result</em>'.
	 * @see shipyardV4.Task#getSimulatedResult()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_SimulatedResult();

	/**
	 * Returns the meta object for class '{@link shipyardV4.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see shipyardV4.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.Trigger#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see shipyardV4.Trigger#getTrigger()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Trigger();

	/**
	 * Returns the meta object for class '{@link shipyardV4.MetadataName <em>Metadata Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Name</em>'.
	 * @see shipyardV4.MetadataName
	 * @generated
	 */
	EClass getMetadataName();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.MetadataName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shipyardV4.MetadataName#getName()
	 * @see #getMetadataName()
	 * @generated
	 */
	EAttribute getMetadataName_Name();

	/**
	 * Returns the meta object for class '{@link shipyardV4.SelectorMatch <em>Selector Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector Match</em>'.
	 * @see shipyardV4.SelectorMatch
	 * @generated
	 */
	EClass getSelectorMatch();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.SelectorMatch#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Match</em>'.
	 * @see shipyardV4.SelectorMatch#getMatch()
	 * @see #getSelectorMatch()
	 * @generated
	 */
	EReference getSelectorMatch_Match();

	/**
	 * Returns the meta object for class '{@link shipyardV4.SequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Name</em>'.
	 * @see shipyardV4.SequenceName
	 * @generated
	 */
	EClass getSequenceName();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.SequenceName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shipyardV4.SequenceName#getName()
	 * @see #getSequenceName()
	 * @generated
	 */
	EAttribute getSequenceName_Name();

	/**
	 * Returns the meta object for class '{@link shipyardV4.SequenceTriggeredOn <em>Sequence Triggered On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Triggered On</em>'.
	 * @see shipyardV4.SequenceTriggeredOn
	 * @generated
	 */
	EClass getSequenceTriggeredOn();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.SequenceTriggeredOn#getTriggeredOn <em>Triggered On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggered On</em>'.
	 * @see shipyardV4.SequenceTriggeredOn#getTriggeredOn()
	 * @see #getSequenceTriggeredOn()
	 * @generated
	 */
	EReference getSequenceTriggeredOn_TriggeredOn();

	/**
	 * Returns the meta object for class '{@link shipyardV4.SequenceTasks <em>Sequence Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Tasks</em>'.
	 * @see shipyardV4.SequenceTasks
	 * @generated
	 */
	EClass getSequenceTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.SequenceTasks#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see shipyardV4.SequenceTasks#getTasks()
	 * @see #getSequenceTasks()
	 * @generated
	 */
	EReference getSequenceTasks_Tasks();

	/**
	 * Returns the meta object for class '{@link shipyardV4.ShipyardApiVersion <em>Shipyard Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard Api Version</em>'.
	 * @see shipyardV4.ShipyardApiVersion
	 * @generated
	 */
	EClass getShipyardApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.ShipyardApiVersion#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see shipyardV4.ShipyardApiVersion#getApiVersion()
	 * @see #getShipyardApiVersion()
	 * @generated
	 */
	EAttribute getShipyardApiVersion_ApiVersion();

	/**
	 * Returns the meta object for class '{@link shipyardV4.ShipyardKind <em>Shipyard Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard Kind</em>'.
	 * @see shipyardV4.ShipyardKind
	 * @generated
	 */
	EClass getShipyardKind();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.ShipyardKind#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see shipyardV4.ShipyardKind#getKind()
	 * @see #getShipyardKind()
	 * @generated
	 */
	EAttribute getShipyardKind_Kind();

	/**
	 * Returns the meta object for class '{@link shipyardV4.ShipyardMetadata <em>Shipyard Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard Metadata</em>'.
	 * @see shipyardV4.ShipyardMetadata
	 * @generated
	 */
	EClass getShipyardMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link shipyardV4.ShipyardMetadata#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see shipyardV4.ShipyardMetadata#getMetadata()
	 * @see #getShipyardMetadata()
	 * @generated
	 */
	EReference getShipyardMetadata_Metadata();

	/**
	 * Returns the meta object for class '{@link shipyardV4.ShipyardSpec1 <em>Shipyard Spec1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard Spec1</em>'.
	 * @see shipyardV4.ShipyardSpec1
	 * @generated
	 */
	EClass getShipyardSpec1();

	/**
	 * Returns the meta object for the containment reference '{@link shipyardV4.ShipyardSpec1#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spec</em>'.
	 * @see shipyardV4.ShipyardSpec1#getSpec()
	 * @see #getShipyardSpec1()
	 * @generated
	 */
	EReference getShipyardSpec1_Spec();

	/**
	 * Returns the meta object for class '{@link shipyardV4.ShipyardSpecStages <em>Shipyard Spec Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard Spec Stages</em>'.
	 * @see shipyardV4.ShipyardSpecStages
	 * @generated
	 */
	EClass getShipyardSpecStages();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.ShipyardSpecStages#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see shipyardV4.ShipyardSpecStages#getStages()
	 * @see #getShipyardSpecStages()
	 * @generated
	 */
	EReference getShipyardSpecStages_Stages();

	/**
	 * Returns the meta object for class '{@link shipyardV4.StageName <em>Stage Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage Name</em>'.
	 * @see shipyardV4.StageName
	 * @generated
	 */
	EClass getStageName();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.StageName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shipyardV4.StageName#getName()
	 * @see #getStageName()
	 * @generated
	 */
	EAttribute getStageName_Name();

	/**
	 * Returns the meta object for class '{@link shipyardV4.StageSequences <em>Stage Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage Sequences</em>'.
	 * @see shipyardV4.StageSequences
	 * @generated
	 */
	EClass getStageSequences();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.StageSequences#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see shipyardV4.StageSequences#getSequences()
	 * @see #getStageSequences()
	 * @generated
	 */
	EReference getStageSequences_Sequences();

	/**
	 * Returns the meta object for class '{@link shipyardV4.TaskName <em>Task Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Name</em>'.
	 * @see shipyardV4.TaskName
	 * @generated
	 */
	EClass getTaskName();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.TaskName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shipyardV4.TaskName#getName()
	 * @see #getTaskName()
	 * @generated
	 */
	EAttribute getTaskName_Name();

	/**
	 * Returns the meta object for class '{@link shipyardV4.TaskProperties <em>Task Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Properties</em>'.
	 * @see shipyardV4.TaskProperties
	 * @generated
	 */
	EClass getTaskProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link shipyardV4.TaskProperties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see shipyardV4.TaskProperties#getProperties()
	 * @see #getTaskProperties()
	 * @generated
	 */
	EReference getTaskProperties_Properties();

	/**
	 * Returns the meta object for class '{@link shipyardV4.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Event</em>'.
	 * @see shipyardV4.TriggerEvent
	 * @generated
	 */
	EClass getTriggerEvent();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.TriggerEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see shipyardV4.TriggerEvent#getEvent()
	 * @see #getTriggerEvent()
	 * @generated
	 */
	EAttribute getTriggerEvent_Event();

	/**
	 * Returns the meta object for class '{@link shipyardV4.TriggerSelector <em>Trigger Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Selector</em>'.
	 * @see shipyardV4.TriggerSelector
	 * @generated
	 */
	EClass getTriggerSelector();

	/**
	 * Returns the meta object for the containment reference '{@link shipyardV4.TriggerSelector#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see shipyardV4.TriggerSelector#getSelector()
	 * @see #getTriggerSelector()
	 * @generated
	 */
	EReference getTriggerSelector_Selector();

	/**
	 * Returns the meta object for class '{@link shipyardV4.SelectorMatchPatternProperties0 <em>Selector Match Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector Match Pattern Properties0</em>'.
	 * @see shipyardV4.SelectorMatchPatternProperties0
	 * @generated
	 */
	EClass getSelectorMatchPatternProperties0();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.SelectorMatchPatternProperties0#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see shipyardV4.SelectorMatchPatternProperties0#getKey()
	 * @see #getSelectorMatchPatternProperties0()
	 * @generated
	 */
	EAttribute getSelectorMatchPatternProperties0_Key();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.SelectorMatchPatternProperties0#getPatternProperties0 <em>Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Properties0</em>'.
	 * @see shipyardV4.SelectorMatchPatternProperties0#getPatternProperties0()
	 * @see #getSelectorMatchPatternProperties0()
	 * @generated
	 */
	EAttribute getSelectorMatchPatternProperties0_PatternProperties0();

	/**
	 * Returns the meta object for class '{@link shipyardV4.TaskPropertiesAdditionalProperties <em>Task Properties Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Properties Additional Properties</em>'.
	 * @see shipyardV4.TaskPropertiesAdditionalProperties
	 * @generated
	 */
	EClass getTaskPropertiesAdditionalProperties();

	/**
	 * Returns the meta object for the attribute '{@link shipyardV4.TaskPropertiesAdditionalProperties#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see shipyardV4.TaskPropertiesAdditionalProperties#getKey()
	 * @see #getTaskPropertiesAdditionalProperties()
	 * @generated
	 */
	EAttribute getTaskPropertiesAdditionalProperties_Key();

	/**
	 * Returns the meta object for the reference '{@link shipyardV4.TaskPropertiesAdditionalProperties#getAdditionalProperties <em>Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additional Properties</em>'.
	 * @see shipyardV4.TaskPropertiesAdditionalProperties#getAdditionalProperties()
	 * @see #getTaskPropertiesAdditionalProperties()
	 * @generated
	 */
	EReference getTaskPropertiesAdditionalProperties_AdditionalProperties();

	/**
	 * Returns the meta object for class '{@link shipyardV4.SequenceTriggeredOnItems <em>Sequence Triggered On Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Triggered On Items</em>'.
	 * @see shipyardV4.SequenceTriggeredOnItems
	 * @generated
	 */
	EClass getSequenceTriggeredOnItems();

	/**
	 * Returns the meta object for the containment reference '{@link shipyardV4.SequenceTriggeredOnItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see shipyardV4.SequenceTriggeredOnItems#getItems()
	 * @see #getSequenceTriggeredOnItems()
	 * @generated
	 */
	EReference getSequenceTriggeredOnItems_Items();

	/**
	 * Returns the meta object for class '{@link shipyardV4.SequenceTasksItems <em>Sequence Tasks Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Tasks Items</em>'.
	 * @see shipyardV4.SequenceTasksItems
	 * @generated
	 */
	EClass getSequenceTasksItems();

	/**
	 * Returns the meta object for the containment reference '{@link shipyardV4.SequenceTasksItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see shipyardV4.SequenceTasksItems#getItems()
	 * @see #getSequenceTasksItems()
	 * @generated
	 */
	EReference getSequenceTasksItems_Items();

	/**
	 * Returns the meta object for class '{@link shipyardV4.ShipyardSpecStagesItems <em>Shipyard Spec Stages Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard Spec Stages Items</em>'.
	 * @see shipyardV4.ShipyardSpecStagesItems
	 * @generated
	 */
	EClass getShipyardSpecStagesItems();

	/**
	 * Returns the meta object for the containment reference '{@link shipyardV4.ShipyardSpecStagesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see shipyardV4.ShipyardSpecStagesItems#getItems()
	 * @see #getShipyardSpecStagesItems()
	 * @generated
	 */
	EReference getShipyardSpecStagesItems_Items();

	/**
	 * Returns the meta object for class '{@link shipyardV4.StageSequencesItems <em>Stage Sequences Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage Sequences Items</em>'.
	 * @see shipyardV4.StageSequencesItems
	 * @generated
	 */
	EClass getStageSequencesItems();

	/**
	 * Returns the meta object for the containment reference '{@link shipyardV4.StageSequencesItems#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see shipyardV4.StageSequencesItems#getItems()
	 * @see #getStageSequencesItems()
	 * @generated
	 */
	EReference getStageSequencesItems_Items();

	/**
	 * Returns the meta object for class '{@link shipyardV4.MetadataPropertiesAbstract <em>Metadata Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Properties Abstract</em>'.
	 * @see shipyardV4.MetadataPropertiesAbstract
	 * @generated
	 */
	EClass getMetadataPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link shipyardV4.SelectorPropertiesAbstract <em>Selector Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector Properties Abstract</em>'.
	 * @see shipyardV4.SelectorPropertiesAbstract
	 * @generated
	 */
	EClass getSelectorPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link shipyardV4.SequencePropertiesAbstract <em>Sequence Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Properties Abstract</em>'.
	 * @see shipyardV4.SequencePropertiesAbstract
	 * @generated
	 */
	EClass getSequencePropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link shipyardV4.ShipyardPropertiesAbstract <em>Shipyard Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard Properties Abstract</em>'.
	 * @see shipyardV4.ShipyardPropertiesAbstract
	 * @generated
	 */
	EClass getShipyardPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link shipyardV4.ShipyardSpecPropertiesAbstract <em>Shipyard Spec Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard Spec Properties Abstract</em>'.
	 * @see shipyardV4.ShipyardSpecPropertiesAbstract
	 * @generated
	 */
	EClass getShipyardSpecPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link shipyardV4.StagePropertiesAbstract <em>Stage Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage Properties Abstract</em>'.
	 * @see shipyardV4.StagePropertiesAbstract
	 * @generated
	 */
	EClass getStagePropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link shipyardV4.TaskPropertiesAbstract <em>Task Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Properties Abstract</em>'.
	 * @see shipyardV4.TaskPropertiesAbstract
	 * @generated
	 */
	EClass getTaskPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link shipyardV4.TriggerPropertiesAbstract <em>Trigger Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Properties Abstract</em>'.
	 * @see shipyardV4.TriggerPropertiesAbstract
	 * @generated
	 */
	EClass getTriggerPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link shipyardV4.SelectorMatchPropertiesAbstract <em>Selector Match Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector Match Properties Abstract</em>'.
	 * @see shipyardV4.SelectorMatchPropertiesAbstract
	 * @generated
	 */
	EClass getSelectorMatchPropertiesAbstract();

	/**
	 * Returns the meta object for class '{@link shipyardV4.TaskPropertiesPropertiesAbstract <em>Task Properties Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Properties Properties Abstract</em>'.
	 * @see shipyardV4.TaskPropertiesPropertiesAbstract
	 * @generated
	 */
	EClass getTaskPropertiesPropertiesAbstract();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShipyardV4Factory getShipyardV4Factory();

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
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardV4RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardV4RootImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardV4Root()
		 * @generated
		 */
		EClass SHIPYARD_V4_ROOT = eINSTANCE.getShipyardV4Root();

		/**
		 * The meta object literal for the '<em><b>Shipyard V4 Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT = eINSTANCE.getShipyardV4Root_ShipyardV4Root();

		/**
		 * The meta object literal for the '<em><b>Initial Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPYARD_V4_ROOT__INITIAL_SEQUENCE = eINSTANCE.getShipyardV4Root_InitialSequence();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.MetadataImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__METADATA = eINSTANCE.getMetadata_Metadata();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SelectorImpl <em>Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SelectorImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSelector()
		 * @generated
		 */
		EClass SELECTOR = eINSTANCE.getSelector();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTOR__SELECTOR = eINSTANCE.getSelector_Selector();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SequenceImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__SEQUENCE = eINSTANCE.getSequence_Sequence();

		/**
		 * The meta object literal for the '<em><b>Simulated Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__SIMULATED_RESULT = eINSTANCE.getSequence_SimulatedResult();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardImpl <em>Shipyard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyard()
		 * @generated
		 */
		EClass SHIPYARD = eINSTANCE.getShipyard();

		/**
		 * The meta object literal for the '<em><b>Shipyard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPYARD__SHIPYARD = eINSTANCE.getShipyard_Shipyard();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardSpecImpl <em>Shipyard Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardSpecImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardSpec()
		 * @generated
		 */
		EClass SHIPYARD_SPEC = eINSTANCE.getShipyardSpec();

		/**
		 * The meta object literal for the '<em><b>Shipyard Spec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPYARD_SPEC__SHIPYARD_SPEC = eINSTANCE.getShipyardSpec_ShipyardSpec();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.StageImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__STAGE = eINSTANCE.getStage_Stage();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.TaskImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TASK = eINSTANCE.getTask_Task();

		/**
		 * The meta object literal for the '<em><b>Simulated Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SIMULATED_RESULT = eINSTANCE.getTask_SimulatedResult();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.TriggerImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TRIGGER = eINSTANCE.getTrigger_Trigger();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.MetadataNameImpl <em>Metadata Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.MetadataNameImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getMetadataName()
		 * @generated
		 */
		EClass METADATA_NAME = eINSTANCE.getMetadataName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_NAME__NAME = eINSTANCE.getMetadataName_Name();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SelectorMatchImpl <em>Selector Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SelectorMatchImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSelectorMatch()
		 * @generated
		 */
		EClass SELECTOR_MATCH = eINSTANCE.getSelectorMatch();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTOR_MATCH__MATCH = eINSTANCE.getSelectorMatch_Match();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SequenceNameImpl <em>Sequence Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SequenceNameImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequenceName()
		 * @generated
		 */
		EClass SEQUENCE_NAME = eINSTANCE.getSequenceName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_NAME__NAME = eINSTANCE.getSequenceName_Name();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SequenceTriggeredOnImpl <em>Sequence Triggered On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SequenceTriggeredOnImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequenceTriggeredOn()
		 * @generated
		 */
		EClass SEQUENCE_TRIGGERED_ON = eINSTANCE.getSequenceTriggeredOn();

		/**
		 * The meta object literal for the '<em><b>Triggered On</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TRIGGERED_ON__TRIGGERED_ON = eINSTANCE.getSequenceTriggeredOn_TriggeredOn();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SequenceTasksImpl <em>Sequence Tasks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SequenceTasksImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequenceTasks()
		 * @generated
		 */
		EClass SEQUENCE_TASKS = eINSTANCE.getSequenceTasks();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TASKS__TASKS = eINSTANCE.getSequenceTasks_Tasks();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardApiVersionImpl <em>Shipyard Api Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardApiVersionImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardApiVersion()
		 * @generated
		 */
		EClass SHIPYARD_API_VERSION = eINSTANCE.getShipyardApiVersion();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPYARD_API_VERSION__API_VERSION = eINSTANCE.getShipyardApiVersion_ApiVersion();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardKindImpl <em>Shipyard Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardKindImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardKind()
		 * @generated
		 */
		EClass SHIPYARD_KIND = eINSTANCE.getShipyardKind();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPYARD_KIND__KIND = eINSTANCE.getShipyardKind_Kind();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardMetadataImpl <em>Shipyard Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardMetadataImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardMetadata()
		 * @generated
		 */
		EClass SHIPYARD_METADATA = eINSTANCE.getShipyardMetadata();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPYARD_METADATA__METADATA = eINSTANCE.getShipyardMetadata_Metadata();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardSpec1Impl <em>Shipyard Spec1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardSpec1Impl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardSpec1()
		 * @generated
		 */
		EClass SHIPYARD_SPEC1 = eINSTANCE.getShipyardSpec1();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPYARD_SPEC1__SPEC = eINSTANCE.getShipyardSpec1_Spec();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardSpecStagesImpl <em>Shipyard Spec Stages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardSpecStagesImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardSpecStages()
		 * @generated
		 */
		EClass SHIPYARD_SPEC_STAGES = eINSTANCE.getShipyardSpecStages();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPYARD_SPEC_STAGES__STAGES = eINSTANCE.getShipyardSpecStages_Stages();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.StageNameImpl <em>Stage Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.StageNameImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getStageName()
		 * @generated
		 */
		EClass STAGE_NAME = eINSTANCE.getStageName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE_NAME__NAME = eINSTANCE.getStageName_Name();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.StageSequencesImpl <em>Stage Sequences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.StageSequencesImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getStageSequences()
		 * @generated
		 */
		EClass STAGE_SEQUENCES = eINSTANCE.getStageSequences();

		/**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE_SEQUENCES__SEQUENCES = eINSTANCE.getStageSequences_Sequences();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.TaskNameImpl <em>Task Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.TaskNameImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTaskName()
		 * @generated
		 */
		EClass TASK_NAME = eINSTANCE.getTaskName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_NAME__NAME = eINSTANCE.getTaskName_Name();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.TaskPropertiesImpl <em>Task Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.TaskPropertiesImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTaskProperties()
		 * @generated
		 */
		EClass TASK_PROPERTIES = eINSTANCE.getTaskProperties();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROPERTIES__PROPERTIES = eINSTANCE.getTaskProperties_Properties();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.TriggerEventImpl <em>Trigger Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.TriggerEventImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTriggerEvent()
		 * @generated
		 */
		EClass TRIGGER_EVENT = eINSTANCE.getTriggerEvent();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_EVENT__EVENT = eINSTANCE.getTriggerEvent_Event();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.TriggerSelectorImpl <em>Trigger Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.TriggerSelectorImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTriggerSelector()
		 * @generated
		 */
		EClass TRIGGER_SELECTOR = eINSTANCE.getTriggerSelector();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_SELECTOR__SELECTOR = eINSTANCE.getTriggerSelector_Selector();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SelectorMatchPatternProperties0Impl <em>Selector Match Pattern Properties0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SelectorMatchPatternProperties0Impl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSelectorMatchPatternProperties0()
		 * @generated
		 */
		EClass SELECTOR_MATCH_PATTERN_PROPERTIES0 = eINSTANCE.getSelectorMatchPatternProperties0();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR_MATCH_PATTERN_PROPERTIES0__KEY = eINSTANCE.getSelectorMatchPatternProperties0_Key();

		/**
		 * The meta object literal for the '<em><b>Pattern Properties0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR_MATCH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0 = eINSTANCE.getSelectorMatchPatternProperties0_PatternProperties0();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.TaskPropertiesAdditionalPropertiesImpl <em>Task Properties Additional Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.TaskPropertiesAdditionalPropertiesImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTaskPropertiesAdditionalProperties()
		 * @generated
		 */
		EClass TASK_PROPERTIES_ADDITIONAL_PROPERTIES = eINSTANCE.getTaskPropertiesAdditionalProperties();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROPERTIES_ADDITIONAL_PROPERTIES__KEY = eINSTANCE.getTaskPropertiesAdditionalProperties_Key();

		/**
		 * The meta object literal for the '<em><b>Additional Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES = eINSTANCE.getTaskPropertiesAdditionalProperties_AdditionalProperties();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SequenceTriggeredOnItemsImpl <em>Sequence Triggered On Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SequenceTriggeredOnItemsImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequenceTriggeredOnItems()
		 * @generated
		 */
		EClass SEQUENCE_TRIGGERED_ON_ITEMS = eINSTANCE.getSequenceTriggeredOnItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TRIGGERED_ON_ITEMS__ITEMS = eINSTANCE.getSequenceTriggeredOnItems_Items();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SequenceTasksItemsImpl <em>Sequence Tasks Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SequenceTasksItemsImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequenceTasksItems()
		 * @generated
		 */
		EClass SEQUENCE_TASKS_ITEMS = eINSTANCE.getSequenceTasksItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TASKS_ITEMS__ITEMS = eINSTANCE.getSequenceTasksItems_Items();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardSpecStagesItemsImpl <em>Shipyard Spec Stages Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardSpecStagesItemsImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardSpecStagesItems()
		 * @generated
		 */
		EClass SHIPYARD_SPEC_STAGES_ITEMS = eINSTANCE.getShipyardSpecStagesItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPYARD_SPEC_STAGES_ITEMS__ITEMS = eINSTANCE.getShipyardSpecStagesItems_Items();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.StageSequencesItemsImpl <em>Stage Sequences Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.StageSequencesItemsImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getStageSequencesItems()
		 * @generated
		 */
		EClass STAGE_SEQUENCES_ITEMS = eINSTANCE.getStageSequencesItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE_SEQUENCES_ITEMS__ITEMS = eINSTANCE.getStageSequencesItems_Items();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.MetadataPropertiesAbstractImpl <em>Metadata Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.MetadataPropertiesAbstractImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getMetadataPropertiesAbstract()
		 * @generated
		 */
		EClass METADATA_PROPERTIES_ABSTRACT = eINSTANCE.getMetadataPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SelectorPropertiesAbstractImpl <em>Selector Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SelectorPropertiesAbstractImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSelectorPropertiesAbstract()
		 * @generated
		 */
		EClass SELECTOR_PROPERTIES_ABSTRACT = eINSTANCE.getSelectorPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SequencePropertiesAbstractImpl <em>Sequence Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SequencePropertiesAbstractImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSequencePropertiesAbstract()
		 * @generated
		 */
		EClass SEQUENCE_PROPERTIES_ABSTRACT = eINSTANCE.getSequencePropertiesAbstract();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardPropertiesAbstractImpl <em>Shipyard Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardPropertiesAbstractImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardPropertiesAbstract()
		 * @generated
		 */
		EClass SHIPYARD_PROPERTIES_ABSTRACT = eINSTANCE.getShipyardPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.ShipyardSpecPropertiesAbstractImpl <em>Shipyard Spec Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.ShipyardSpecPropertiesAbstractImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getShipyardSpecPropertiesAbstract()
		 * @generated
		 */
		EClass SHIPYARD_SPEC_PROPERTIES_ABSTRACT = eINSTANCE.getShipyardSpecPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.StagePropertiesAbstractImpl <em>Stage Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.StagePropertiesAbstractImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getStagePropertiesAbstract()
		 * @generated
		 */
		EClass STAGE_PROPERTIES_ABSTRACT = eINSTANCE.getStagePropertiesAbstract();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.TaskPropertiesAbstractImpl <em>Task Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.TaskPropertiesAbstractImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTaskPropertiesAbstract()
		 * @generated
		 */
		EClass TASK_PROPERTIES_ABSTRACT = eINSTANCE.getTaskPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.TriggerPropertiesAbstractImpl <em>Trigger Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.TriggerPropertiesAbstractImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTriggerPropertiesAbstract()
		 * @generated
		 */
		EClass TRIGGER_PROPERTIES_ABSTRACT = eINSTANCE.getTriggerPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.SelectorMatchPropertiesAbstractImpl <em>Selector Match Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.SelectorMatchPropertiesAbstractImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getSelectorMatchPropertiesAbstract()
		 * @generated
		 */
		EClass SELECTOR_MATCH_PROPERTIES_ABSTRACT = eINSTANCE.getSelectorMatchPropertiesAbstract();

		/**
		 * The meta object literal for the '{@link shipyardV4.impl.TaskPropertiesPropertiesAbstractImpl <em>Task Properties Properties Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shipyardV4.impl.TaskPropertiesPropertiesAbstractImpl
		 * @see shipyardV4.impl.ShipyardV4PackageImpl#getTaskPropertiesPropertiesAbstract()
		 * @generated
		 */
		EClass TASK_PROPERTIES_PROPERTIES_ABSTRACT = eINSTANCE.getTaskPropertiesPropertiesAbstract();

	}

} //ShipyardV4Package
