/**
 */
package shipyardV4.impl;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;
import jsonMetaschemaMM.impl.JsonMetaschemaMMPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import shipyardV4.Metadata;
import shipyardV4.MetadataName;
import shipyardV4.MetadataPropertiesAbstract;
import shipyardV4.Selector;
import shipyardV4.SelectorMatch;
import shipyardV4.SelectorMatchPatternProperties0;
import shipyardV4.SelectorMatchPropertiesAbstract;
import shipyardV4.SelectorPropertiesAbstract;
import shipyardV4.Sequence;
import shipyardV4.SequenceName;
import shipyardV4.SequencePropertiesAbstract;
import shipyardV4.SequenceTasks;
import shipyardV4.SequenceTasksItems;
import shipyardV4.SequenceTriggeredOn;
import shipyardV4.SequenceTriggeredOnItems;
import shipyardV4.Shipyard;
import shipyardV4.ShipyardApiVersion;
import shipyardV4.ShipyardKind;
import shipyardV4.ShipyardMetadata;
import shipyardV4.ShipyardPropertiesAbstract;
import shipyardV4.ShipyardSpec;
import shipyardV4.ShipyardSpec1;
import shipyardV4.ShipyardSpecPropertiesAbstract;
import shipyardV4.ShipyardSpecStages;
import shipyardV4.ShipyardSpecStagesItems;
import shipyardV4.ShipyardV4Factory;
import shipyardV4.ShipyardV4Package;
import shipyardV4.ShipyardV4Root;
import shipyardV4.Stage;
import shipyardV4.StageName;
import shipyardV4.StagePropertiesAbstract;
import shipyardV4.StageSequences;
import shipyardV4.StageSequencesItems;
import shipyardV4.Task;
import shipyardV4.TaskName;
import shipyardV4.TaskProperties;
import shipyardV4.TaskPropertiesAbstract;
import shipyardV4.TaskPropertiesAdditionalProperties;
import shipyardV4.TaskPropertiesPropertiesAbstract;
import shipyardV4.Trigger;
import shipyardV4.TriggerEvent;
import shipyardV4.TriggerPropertiesAbstract;
import shipyardV4.TriggerSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShipyardV4PackageImpl extends EPackageImpl implements ShipyardV4Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardV4RootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTriggeredOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTasksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardApiVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardSpec1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardSpecStagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageSequencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorMatchPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskPropertiesAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTriggeredOnItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTasksItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardSpecStagesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageSequencesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequencePropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardSpecPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stagePropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorMatchPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskPropertiesPropertiesAbstractEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see shipyardV4.ShipyardV4Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ShipyardV4PackageImpl() {
		super(eNS_URI, ShipyardV4Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ShipyardV4Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ShipyardV4Package init() {
		if (isInited) return (ShipyardV4Package)EPackage.Registry.INSTANCE.getEPackage(ShipyardV4Package.eNS_URI);

		// Obtain or create and register package
		Object registeredShipyardV4Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		ShipyardV4PackageImpl theShipyardV4Package = registeredShipyardV4Package instanceof ShipyardV4PackageImpl ? (ShipyardV4PackageImpl)registeredShipyardV4Package : new ShipyardV4PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JsonMetaschemaMMPackage.eNS_URI);
		JsonMetaschemaMMPackageImpl theJsonMetaschemaMMPackage = (JsonMetaschemaMMPackageImpl)(registeredPackage instanceof JsonMetaschemaMMPackageImpl ? registeredPackage : JsonMetaschemaMMPackage.eINSTANCE);

		// Create package meta-data objects
		theShipyardV4Package.createPackageContents();
		theJsonMetaschemaMMPackage.createPackageContents();

		// Initialize created meta-data
		theShipyardV4Package.initializePackageContents();
		theJsonMetaschemaMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theShipyardV4Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ShipyardV4Package.eNS_URI, theShipyardV4Package);
		return theShipyardV4Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardV4Root() {
		return shipyardV4RootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipyardV4Root_ShipyardV4Root() {
		return (EReference)shipyardV4RootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipyardV4Root_InitialSequence() {
		return (EReference)shipyardV4RootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Metadata() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelector() {
		return selectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelector_Selector() {
		return (EReference)selectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Sequence() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequence_SimulatedResult() {
		return (EAttribute)sequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyard() {
		return shipyardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipyard_Shipyard() {
		return (EReference)shipyardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardSpec() {
		return shipyardSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipyardSpec_ShipyardSpec() {
		return (EReference)shipyardSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_Stage() {
		return (EReference)stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Task() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_SimulatedResult() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Trigger() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataName() {
		return metadataNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataName_Name() {
		return (EAttribute)metadataNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectorMatch() {
		return selectorMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectorMatch_Match() {
		return (EReference)selectorMatchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceName() {
		return sequenceNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceName_Name() {
		return (EAttribute)sequenceNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceTriggeredOn() {
		return sequenceTriggeredOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceTriggeredOn_TriggeredOn() {
		return (EReference)sequenceTriggeredOnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceTasks() {
		return sequenceTasksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceTasks_Tasks() {
		return (EReference)sequenceTasksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardApiVersion() {
		return shipyardApiVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShipyardApiVersion_ApiVersion() {
		return (EAttribute)shipyardApiVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardKind() {
		return shipyardKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShipyardKind_Kind() {
		return (EAttribute)shipyardKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardMetadata() {
		return shipyardMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipyardMetadata_Metadata() {
		return (EReference)shipyardMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardSpec1() {
		return shipyardSpec1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipyardSpec1_Spec() {
		return (EReference)shipyardSpec1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardSpecStages() {
		return shipyardSpecStagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipyardSpecStages_Stages() {
		return (EReference)shipyardSpecStagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStageName() {
		return stageNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStageName_Name() {
		return (EAttribute)stageNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStageSequences() {
		return stageSequencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStageSequences_Sequences() {
		return (EReference)stageSequencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskName() {
		return taskNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskName_Name() {
		return (EAttribute)taskNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskProperties() {
		return taskPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskProperties_Properties() {
		return (EReference)taskPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerEvent() {
		return triggerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerEvent_Event() {
		return (EAttribute)triggerEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerSelector() {
		return triggerSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerSelector_Selector() {
		return (EReference)triggerSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectorMatchPatternProperties0() {
		return selectorMatchPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectorMatchPatternProperties0_Key() {
		return (EAttribute)selectorMatchPatternProperties0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectorMatchPatternProperties0_PatternProperties0() {
		return (EAttribute)selectorMatchPatternProperties0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskPropertiesAdditionalProperties() {
		return taskPropertiesAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskPropertiesAdditionalProperties_Key() {
		return (EAttribute)taskPropertiesAdditionalPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskPropertiesAdditionalProperties_AdditionalProperties() {
		return (EReference)taskPropertiesAdditionalPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceTriggeredOnItems() {
		return sequenceTriggeredOnItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceTriggeredOnItems_Items() {
		return (EReference)sequenceTriggeredOnItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceTasksItems() {
		return sequenceTasksItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceTasksItems_Items() {
		return (EReference)sequenceTasksItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardSpecStagesItems() {
		return shipyardSpecStagesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipyardSpecStagesItems_Items() {
		return (EReference)shipyardSpecStagesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStageSequencesItems() {
		return stageSequencesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStageSequencesItems_Items() {
		return (EReference)stageSequencesItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataPropertiesAbstract() {
		return metadataPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectorPropertiesAbstract() {
		return selectorPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequencePropertiesAbstract() {
		return sequencePropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardPropertiesAbstract() {
		return shipyardPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardSpecPropertiesAbstract() {
		return shipyardSpecPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStagePropertiesAbstract() {
		return stagePropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskPropertiesAbstract() {
		return taskPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerPropertiesAbstract() {
		return triggerPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectorMatchPropertiesAbstract() {
		return selectorMatchPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskPropertiesPropertiesAbstract() {
		return taskPropertiesPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardV4Factory getShipyardV4Factory() {
		return (ShipyardV4Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		shipyardV4RootEClass = createEClass(SHIPYARD_V4_ROOT);
		createEReference(shipyardV4RootEClass, SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT);
		createEReference(shipyardV4RootEClass, SHIPYARD_V4_ROOT__INITIAL_SEQUENCE);

		metadataEClass = createEClass(METADATA);
		createEReference(metadataEClass, METADATA__METADATA);

		selectorEClass = createEClass(SELECTOR);
		createEReference(selectorEClass, SELECTOR__SELECTOR);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__SEQUENCE);
		createEAttribute(sequenceEClass, SEQUENCE__SIMULATED_RESULT);

		shipyardEClass = createEClass(SHIPYARD);
		createEReference(shipyardEClass, SHIPYARD__SHIPYARD);

		shipyardSpecEClass = createEClass(SHIPYARD_SPEC);
		createEReference(shipyardSpecEClass, SHIPYARD_SPEC__SHIPYARD_SPEC);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__STAGE);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__TASK);
		createEAttribute(taskEClass, TASK__SIMULATED_RESULT);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__TRIGGER);

		metadataNameEClass = createEClass(METADATA_NAME);
		createEAttribute(metadataNameEClass, METADATA_NAME__NAME);

		selectorMatchEClass = createEClass(SELECTOR_MATCH);
		createEReference(selectorMatchEClass, SELECTOR_MATCH__MATCH);

		sequenceNameEClass = createEClass(SEQUENCE_NAME);
		createEAttribute(sequenceNameEClass, SEQUENCE_NAME__NAME);

		sequenceTriggeredOnEClass = createEClass(SEQUENCE_TRIGGERED_ON);
		createEReference(sequenceTriggeredOnEClass, SEQUENCE_TRIGGERED_ON__TRIGGERED_ON);

		sequenceTasksEClass = createEClass(SEQUENCE_TASKS);
		createEReference(sequenceTasksEClass, SEQUENCE_TASKS__TASKS);

		shipyardApiVersionEClass = createEClass(SHIPYARD_API_VERSION);
		createEAttribute(shipyardApiVersionEClass, SHIPYARD_API_VERSION__API_VERSION);

		shipyardKindEClass = createEClass(SHIPYARD_KIND);
		createEAttribute(shipyardKindEClass, SHIPYARD_KIND__KIND);

		shipyardMetadataEClass = createEClass(SHIPYARD_METADATA);
		createEReference(shipyardMetadataEClass, SHIPYARD_METADATA__METADATA);

		shipyardSpec1EClass = createEClass(SHIPYARD_SPEC1);
		createEReference(shipyardSpec1EClass, SHIPYARD_SPEC1__SPEC);

		shipyardSpecStagesEClass = createEClass(SHIPYARD_SPEC_STAGES);
		createEReference(shipyardSpecStagesEClass, SHIPYARD_SPEC_STAGES__STAGES);

		stageNameEClass = createEClass(STAGE_NAME);
		createEAttribute(stageNameEClass, STAGE_NAME__NAME);

		stageSequencesEClass = createEClass(STAGE_SEQUENCES);
		createEReference(stageSequencesEClass, STAGE_SEQUENCES__SEQUENCES);

		taskNameEClass = createEClass(TASK_NAME);
		createEAttribute(taskNameEClass, TASK_NAME__NAME);

		taskPropertiesEClass = createEClass(TASK_PROPERTIES);
		createEReference(taskPropertiesEClass, TASK_PROPERTIES__PROPERTIES);

		triggerEventEClass = createEClass(TRIGGER_EVENT);
		createEAttribute(triggerEventEClass, TRIGGER_EVENT__EVENT);

		triggerSelectorEClass = createEClass(TRIGGER_SELECTOR);
		createEReference(triggerSelectorEClass, TRIGGER_SELECTOR__SELECTOR);

		selectorMatchPatternProperties0EClass = createEClass(SELECTOR_MATCH_PATTERN_PROPERTIES0);
		createEAttribute(selectorMatchPatternProperties0EClass, SELECTOR_MATCH_PATTERN_PROPERTIES0__KEY);
		createEAttribute(selectorMatchPatternProperties0EClass, SELECTOR_MATCH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0);

		taskPropertiesAdditionalPropertiesEClass = createEClass(TASK_PROPERTIES_ADDITIONAL_PROPERTIES);
		createEAttribute(taskPropertiesAdditionalPropertiesEClass, TASK_PROPERTIES_ADDITIONAL_PROPERTIES__KEY);
		createEReference(taskPropertiesAdditionalPropertiesEClass, TASK_PROPERTIES_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES);

		sequenceTriggeredOnItemsEClass = createEClass(SEQUENCE_TRIGGERED_ON_ITEMS);
		createEReference(sequenceTriggeredOnItemsEClass, SEQUENCE_TRIGGERED_ON_ITEMS__ITEMS);

		sequenceTasksItemsEClass = createEClass(SEQUENCE_TASKS_ITEMS);
		createEReference(sequenceTasksItemsEClass, SEQUENCE_TASKS_ITEMS__ITEMS);

		shipyardSpecStagesItemsEClass = createEClass(SHIPYARD_SPEC_STAGES_ITEMS);
		createEReference(shipyardSpecStagesItemsEClass, SHIPYARD_SPEC_STAGES_ITEMS__ITEMS);

		stageSequencesItemsEClass = createEClass(STAGE_SEQUENCES_ITEMS);
		createEReference(stageSequencesItemsEClass, STAGE_SEQUENCES_ITEMS__ITEMS);

		metadataPropertiesAbstractEClass = createEClass(METADATA_PROPERTIES_ABSTRACT);

		selectorPropertiesAbstractEClass = createEClass(SELECTOR_PROPERTIES_ABSTRACT);

		sequencePropertiesAbstractEClass = createEClass(SEQUENCE_PROPERTIES_ABSTRACT);

		shipyardPropertiesAbstractEClass = createEClass(SHIPYARD_PROPERTIES_ABSTRACT);

		shipyardSpecPropertiesAbstractEClass = createEClass(SHIPYARD_SPEC_PROPERTIES_ABSTRACT);

		stagePropertiesAbstractEClass = createEClass(STAGE_PROPERTIES_ABSTRACT);

		taskPropertiesAbstractEClass = createEClass(TASK_PROPERTIES_ABSTRACT);

		triggerPropertiesAbstractEClass = createEClass(TRIGGER_PROPERTIES_ABSTRACT);

		selectorMatchPropertiesAbstractEClass = createEClass(SELECTOR_MATCH_PROPERTIES_ABSTRACT);

		taskPropertiesPropertiesAbstractEClass = createEClass(TASK_PROPERTIES_PROPERTIES_ABSTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		JsonMetaschemaMMPackage theJsonMetaschemaMMPackage = (JsonMetaschemaMMPackage)EPackage.Registry.INSTANCE.getEPackage(JsonMetaschemaMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		metadataNameEClass.getESuperTypes().add(this.getMetadataPropertiesAbstract());
		selectorMatchEClass.getESuperTypes().add(this.getSelectorPropertiesAbstract());
		sequenceNameEClass.getESuperTypes().add(this.getSequencePropertiesAbstract());
		sequenceTriggeredOnEClass.getESuperTypes().add(this.getSequencePropertiesAbstract());
		sequenceTasksEClass.getESuperTypes().add(this.getSequencePropertiesAbstract());
		shipyardApiVersionEClass.getESuperTypes().add(this.getShipyardPropertiesAbstract());
		shipyardKindEClass.getESuperTypes().add(this.getShipyardPropertiesAbstract());
		shipyardMetadataEClass.getESuperTypes().add(this.getShipyardPropertiesAbstract());
		shipyardSpec1EClass.getESuperTypes().add(this.getShipyardPropertiesAbstract());
		shipyardSpecStagesEClass.getESuperTypes().add(this.getShipyardSpecPropertiesAbstract());
		stageNameEClass.getESuperTypes().add(this.getStagePropertiesAbstract());
		stageSequencesEClass.getESuperTypes().add(this.getStagePropertiesAbstract());
		taskNameEClass.getESuperTypes().add(this.getTaskPropertiesAbstract());
		taskPropertiesEClass.getESuperTypes().add(this.getTaskPropertiesAbstract());
		triggerEventEClass.getESuperTypes().add(this.getTriggerPropertiesAbstract());
		triggerSelectorEClass.getESuperTypes().add(this.getTriggerPropertiesAbstract());
		selectorMatchPatternProperties0EClass.getESuperTypes().add(this.getSelectorMatchPropertiesAbstract());
		taskPropertiesAdditionalPropertiesEClass.getESuperTypes().add(this.getTaskPropertiesPropertiesAbstract());

		// Initialize classes, features, and operations; add parameters
		initEClass(shipyardV4RootEClass, ShipyardV4Root.class, "ShipyardV4Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipyardV4Root_ShipyardV4Root(), this.getShipyard(), null, "shipyardV4Root", null, 1, 1, ShipyardV4Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipyardV4Root_InitialSequence(), this.getSequence(), null, "initialSequence", null, 0, 1, ShipyardV4Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadata_Metadata(), this.getMetadataPropertiesAbstract(), null, "Metadata", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelector_Selector(), this.getSelectorPropertiesAbstract(), null, "Selector", null, 0, -1, Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Sequence(), this.getSequencePropertiesAbstract(), null, "Sequence", null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequence_SimulatedResult(), ecorePackage.getEString(), "simulatedResult", null, 0, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipyardEClass, Shipyard.class, "Shipyard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipyard_Shipyard(), this.getShipyardPropertiesAbstract(), null, "Shipyard", null, 0, -1, Shipyard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipyardSpecEClass, ShipyardSpec.class, "ShipyardSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipyardSpec_ShipyardSpec(), this.getShipyardSpecPropertiesAbstract(), null, "ShipyardSpec", null, 0, -1, ShipyardSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_Stage(), this.getStagePropertiesAbstract(), null, "Stage", null, 0, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Task(), this.getTaskPropertiesAbstract(), null, "Task", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_SimulatedResult(), ecorePackage.getEString(), "simulatedResult", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Trigger(), this.getTriggerPropertiesAbstract(), null, "Trigger", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataNameEClass, MetadataName.class, "MetadataName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadataName_Name(), ecorePackage.getEString(), "name", null, 1, 1, MetadataName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorMatchEClass, SelectorMatch.class, "SelectorMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectorMatch_Match(), this.getSelectorMatchPropertiesAbstract(), null, "match", null, 0, -1, SelectorMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceNameEClass, SequenceName.class, "SequenceName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceName_Name(), ecorePackage.getEString(), "name", null, 1, 1, SequenceName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTriggeredOnEClass, SequenceTriggeredOn.class, "SequenceTriggeredOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceTriggeredOn_TriggeredOn(), this.getSequenceTriggeredOnItems(), null, "triggeredOn", null, 0, -1, SequenceTriggeredOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTasksEClass, SequenceTasks.class, "SequenceTasks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceTasks_Tasks(), this.getSequenceTasksItems(), null, "tasks", null, 0, -1, SequenceTasks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipyardApiVersionEClass, ShipyardApiVersion.class, "ShipyardApiVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipyardApiVersion_ApiVersion(), ecorePackage.getEString(), "apiVersion", null, 1, 1, ShipyardApiVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipyardKindEClass, ShipyardKind.class, "ShipyardKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipyardKind_Kind(), ecorePackage.getEString(), "kind", null, 1, 1, ShipyardKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipyardMetadataEClass, ShipyardMetadata.class, "ShipyardMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipyardMetadata_Metadata(), this.getMetadata(), null, "metadata", null, 1, 1, ShipyardMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipyardSpec1EClass, ShipyardSpec1.class, "ShipyardSpec1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipyardSpec1_Spec(), this.getShipyardSpec(), null, "spec", null, 1, 1, ShipyardSpec1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipyardSpecStagesEClass, ShipyardSpecStages.class, "ShipyardSpecStages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipyardSpecStages_Stages(), this.getShipyardSpecStagesItems(), null, "stages", null, 0, -1, ShipyardSpecStages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageNameEClass, StageName.class, "StageName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStageName_Name(), ecorePackage.getEString(), "name", null, 1, 1, StageName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageSequencesEClass, StageSequences.class, "StageSequences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStageSequences_Sequences(), this.getStageSequencesItems(), null, "sequences", null, 0, -1, StageSequences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskNameEClass, TaskName.class, "TaskName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskName_Name(), ecorePackage.getEString(), "name", null, 1, 1, TaskName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskPropertiesEClass, TaskProperties.class, "TaskProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskProperties_Properties(), this.getTaskPropertiesPropertiesAbstract(), null, "properties", null, 0, -1, TaskProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEventEClass, TriggerEvent.class, "TriggerEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerEvent_Event(), ecorePackage.getEString(), "event", null, 1, 1, TriggerEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerSelectorEClass, TriggerSelector.class, "TriggerSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggerSelector_Selector(), this.getSelector(), null, "selector", null, 1, 1, TriggerSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorMatchPatternProperties0EClass, SelectorMatchPatternProperties0.class, "SelectorMatchPatternProperties0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectorMatchPatternProperties0_Key(), ecorePackage.getEString(), "key", null, 1, 1, SelectorMatchPatternProperties0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectorMatchPatternProperties0_PatternProperties0(), ecorePackage.getEString(), "patternProperties0", null, 1, 1, SelectorMatchPatternProperties0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskPropertiesAdditionalPropertiesEClass, TaskPropertiesAdditionalProperties.class, "TaskPropertiesAdditionalProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskPropertiesAdditionalProperties_Key(), ecorePackage.getEString(), "key", null, 1, 1, TaskPropertiesAdditionalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskPropertiesAdditionalProperties_AdditionalProperties(), theJsonMetaschemaMMPackage.getJsonDocument(), null, "additionalProperties", null, 0, 1, TaskPropertiesAdditionalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTriggeredOnItemsEClass, SequenceTriggeredOnItems.class, "SequenceTriggeredOnItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceTriggeredOnItems_Items(), this.getTrigger(), null, "items", null, 1, 1, SequenceTriggeredOnItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTasksItemsEClass, SequenceTasksItems.class, "SequenceTasksItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceTasksItems_Items(), this.getTask(), null, "items", null, 1, 1, SequenceTasksItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipyardSpecStagesItemsEClass, ShipyardSpecStagesItems.class, "ShipyardSpecStagesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipyardSpecStagesItems_Items(), this.getStage(), null, "items", null, 1, 1, ShipyardSpecStagesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageSequencesItemsEClass, StageSequencesItems.class, "StageSequencesItems", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStageSequencesItems_Items(), this.getSequence(), null, "items", null, 1, 1, StageSequencesItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataPropertiesAbstractEClass, MetadataPropertiesAbstract.class, "MetadataPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectorPropertiesAbstractEClass, SelectorPropertiesAbstract.class, "SelectorPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequencePropertiesAbstractEClass, SequencePropertiesAbstract.class, "SequencePropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shipyardPropertiesAbstractEClass, ShipyardPropertiesAbstract.class, "ShipyardPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shipyardSpecPropertiesAbstractEClass, ShipyardSpecPropertiesAbstract.class, "ShipyardSpecPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stagePropertiesAbstractEClass, StagePropertiesAbstract.class, "StagePropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskPropertiesAbstractEClass, TaskPropertiesAbstract.class, "TaskPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerPropertiesAbstractEClass, TriggerPropertiesAbstract.class, "TriggerPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectorMatchPropertiesAbstractEClass, SelectorMatchPropertiesAbstract.class, "SelectorMatchPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskPropertiesPropertiesAbstractEClass, TaskPropertiesPropertiesAbstract.class, "TaskPropertiesPropertiesAbstract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";
		addAnnotation
		  (getShipyardV4Root_InitialSequence(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSequence_SimulatedResult(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTask_SimulatedResult(),
		   source,
		   new String[] {
		   });
	}

} //ShipyardV4PackageImpl
