/**
 */
package shipyardV4.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import shipyardV4.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShipyardV4FactoryImpl extends EFactoryImpl implements ShipyardV4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShipyardV4Factory init() {
		try {
			ShipyardV4Factory theShipyardV4Factory = (ShipyardV4Factory)EPackage.Registry.INSTANCE.getEFactory(ShipyardV4Package.eNS_URI);
			if (theShipyardV4Factory != null) {
				return theShipyardV4Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShipyardV4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardV4FactoryImpl() {
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
			case ShipyardV4Package.SHIPYARD_V4_ROOT: return createShipyardV4Root();
			case ShipyardV4Package.METADATA: return createMetadata();
			case ShipyardV4Package.SELECTOR: return createSelector();
			case ShipyardV4Package.SEQUENCE: return createSequence();
			case ShipyardV4Package.SHIPYARD: return createShipyard();
			case ShipyardV4Package.SHIPYARD_SPEC: return createShipyardSpec();
			case ShipyardV4Package.STAGE: return createStage();
			case ShipyardV4Package.TASK: return createTask();
			case ShipyardV4Package.TRIGGER: return createTrigger();
			case ShipyardV4Package.METADATA_NAME: return createMetadataName();
			case ShipyardV4Package.SELECTOR_MATCH: return createSelectorMatch();
			case ShipyardV4Package.SEQUENCE_NAME: return createSequenceName();
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON: return createSequenceTriggeredOn();
			case ShipyardV4Package.SEQUENCE_TASKS: return createSequenceTasks();
			case ShipyardV4Package.SHIPYARD_API_VERSION: return createShipyardApiVersion();
			case ShipyardV4Package.SHIPYARD_KIND: return createShipyardKind();
			case ShipyardV4Package.SHIPYARD_METADATA: return createShipyardMetadata();
			case ShipyardV4Package.SHIPYARD_SPEC1: return createShipyardSpec1();
			case ShipyardV4Package.SHIPYARD_SPEC_STAGES: return createShipyardSpecStages();
			case ShipyardV4Package.STAGE_NAME: return createStageName();
			case ShipyardV4Package.STAGE_SEQUENCES: return createStageSequences();
			case ShipyardV4Package.TASK_NAME: return createTaskName();
			case ShipyardV4Package.TASK_PROPERTIES: return createTaskProperties();
			case ShipyardV4Package.TRIGGER_EVENT: return createTriggerEvent();
			case ShipyardV4Package.TRIGGER_SELECTOR: return createTriggerSelector();
			case ShipyardV4Package.SELECTOR_MATCH_PATTERN_PROPERTIES0: return createSelectorMatchPatternProperties0();
			case ShipyardV4Package.TASK_PROPERTIES_ADDITIONAL_PROPERTIES: return createTaskPropertiesAdditionalProperties();
			case ShipyardV4Package.SEQUENCE_TRIGGERED_ON_ITEMS: return createSequenceTriggeredOnItems();
			case ShipyardV4Package.SEQUENCE_TASKS_ITEMS: return createSequenceTasksItems();
			case ShipyardV4Package.SHIPYARD_SPEC_STAGES_ITEMS: return createShipyardSpecStagesItems();
			case ShipyardV4Package.STAGE_SEQUENCES_ITEMS: return createStageSequencesItems();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardV4Root createShipyardV4Root() {
		ShipyardV4RootImpl shipyardV4Root = new ShipyardV4RootImpl();
		return shipyardV4Root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selector createSelector() {
		SelectorImpl selector = new SelectorImpl();
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipyard createShipyard() {
		ShipyardImpl shipyard = new ShipyardImpl();
		return shipyard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardSpec createShipyardSpec() {
		ShipyardSpecImpl shipyardSpec = new ShipyardSpecImpl();
		return shipyardSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataName createMetadataName() {
		MetadataNameImpl metadataName = new MetadataNameImpl();
		return metadataName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorMatch createSelectorMatch() {
		SelectorMatchImpl selectorMatch = new SelectorMatchImpl();
		return selectorMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceName createSequenceName() {
		SequenceNameImpl sequenceName = new SequenceNameImpl();
		return sequenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTriggeredOn createSequenceTriggeredOn() {
		SequenceTriggeredOnImpl sequenceTriggeredOn = new SequenceTriggeredOnImpl();
		return sequenceTriggeredOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTasks createSequenceTasks() {
		SequenceTasksImpl sequenceTasks = new SequenceTasksImpl();
		return sequenceTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardApiVersion createShipyardApiVersion() {
		ShipyardApiVersionImpl shipyardApiVersion = new ShipyardApiVersionImpl();
		return shipyardApiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardKind createShipyardKind() {
		ShipyardKindImpl shipyardKind = new ShipyardKindImpl();
		return shipyardKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardMetadata createShipyardMetadata() {
		ShipyardMetadataImpl shipyardMetadata = new ShipyardMetadataImpl();
		return shipyardMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardSpec1 createShipyardSpec1() {
		ShipyardSpec1Impl shipyardSpec1 = new ShipyardSpec1Impl();
		return shipyardSpec1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardSpecStages createShipyardSpecStages() {
		ShipyardSpecStagesImpl shipyardSpecStages = new ShipyardSpecStagesImpl();
		return shipyardSpecStages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageName createStageName() {
		StageNameImpl stageName = new StageNameImpl();
		return stageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageSequences createStageSequences() {
		StageSequencesImpl stageSequences = new StageSequencesImpl();
		return stageSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskName createTaskName() {
		TaskNameImpl taskName = new TaskNameImpl();
		return taskName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskProperties createTaskProperties() {
		TaskPropertiesImpl taskProperties = new TaskPropertiesImpl();
		return taskProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent createTriggerEvent() {
		TriggerEventImpl triggerEvent = new TriggerEventImpl();
		return triggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerSelector createTriggerSelector() {
		TriggerSelectorImpl triggerSelector = new TriggerSelectorImpl();
		return triggerSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorMatchPatternProperties0 createSelectorMatchPatternProperties0() {
		SelectorMatchPatternProperties0Impl selectorMatchPatternProperties0 = new SelectorMatchPatternProperties0Impl();
		return selectorMatchPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPropertiesAdditionalProperties createTaskPropertiesAdditionalProperties() {
		TaskPropertiesAdditionalPropertiesImpl taskPropertiesAdditionalProperties = new TaskPropertiesAdditionalPropertiesImpl();
		return taskPropertiesAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTriggeredOnItems createSequenceTriggeredOnItems() {
		SequenceTriggeredOnItemsImpl sequenceTriggeredOnItems = new SequenceTriggeredOnItemsImpl();
		return sequenceTriggeredOnItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceTasksItems createSequenceTasksItems() {
		SequenceTasksItemsImpl sequenceTasksItems = new SequenceTasksItemsImpl();
		return sequenceTasksItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardSpecStagesItems createShipyardSpecStagesItems() {
		ShipyardSpecStagesItemsImpl shipyardSpecStagesItems = new ShipyardSpecStagesItemsImpl();
		return shipyardSpecStagesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageSequencesItems createStageSequencesItems() {
		StageSequencesItemsImpl stageSequencesItems = new StageSequencesItemsImpl();
		return stageSequencesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardV4Package getShipyardV4Package() {
		return (ShipyardV4Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShipyardV4Package getPackage() {
		return ShipyardV4Package.eINSTANCE;
	}

} //ShipyardV4FactoryImpl
