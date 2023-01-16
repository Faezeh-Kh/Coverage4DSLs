package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import statemachines.Behavior;
import statemachines.EventOccurrence;
import statemachines.State;
import statemachines.StateMachine;
import statemachines.Transition;

@Aspect(className = Behavior.class)
@SuppressWarnings("all")
public class BehaviorAspect {
  @Step
  protected static void execute(final Behavior _self, final EventOccurrence eventOccurrence) {
    final pssm.semantics.BehaviorAspectBehaviorAspectProperties _self_ = pssm.semantics.BehaviorAspectBehaviorAspectContext.getSelf(_self);
    	// BeginInjectInto pssm.semantics.BehaviorAspect#void execute(EventOccurrence) from pssm.semantics.OperationBehaviorAspect
    		if (_self instanceof statemachines.OperationBehavior){
    			pssm.semantics.OperationBehaviorAspect.execute((statemachines.OperationBehavior)_self,eventOccurrence);
    		} else
    		// EndInjectInto pssm.semantics.BehaviorAspect#void execute(EventOccurrence) from pssm.semantics.OperationBehaviorAspect
    // #DispatchPointCut_before# void execute(EventOccurrence)
    if (_self instanceof statemachines.Behavior){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			pssm.semantics.BehaviorAspect._privk3_execute(_self_, (statemachines.Behavior)_self,eventOccurrence);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {eventOccurrence}, command, "Behavior", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static void _privk3_execute(final BehaviorAspectBehaviorAspectProperties _self_, final Behavior _self, final EventOccurrence eventOccurrence) {
    InputOutput.<String>println(_self.getName());
    StateMachine containerSM = null;
    EObject _eContainer = _self.eContainer();
    if ((_eContainer instanceof State)) {
      EObject _eContainer_1 = _self.eContainer();
      containerSM = RegionAspect.getContainingStateMachine(VertexAspect.getContainingRegion(((State) _eContainer_1)));
    } else {
      EObject _eContainer_2 = _self.eContainer();
      if ((_eContainer_2 instanceof Transition)) {
        EObject _eContainer_3 = _self.eContainer();
        containerSM = RegionAspect.getContainingStateMachine(((Transition) _eContainer_3).getContainer());
      }
    }
    int _size = _self.getEmittedSignals().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      StateMachineAspect.eventOccurrenceReceived(containerSM, _self.getEmittedSignals().get((i).intValue()));
    }
  }
}
