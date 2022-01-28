package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.imt.pssm.reactive.model.statemachines.Behavior;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;
import org.imt.pssm.reactive.model.statemachines.State;
import org.imt.pssm.reactive.model.statemachines.StateMachine;
import org.imt.pssm.reactive.model.statemachines.Transition;

@Aspect(className = Behavior.class)
@SuppressWarnings("all")
public class BehaviorAspect {
  @Step
  protected static void execute(final Behavior _self, final EventOccurrence eventOccurrence) {
    final org.imt.pssm.reactive.interpreter.BehaviorAspectBehaviorAspectProperties _self_ = org.imt.pssm.reactive.interpreter.BehaviorAspectBehaviorAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.BehaviorAspect#void execute(EventOccurrence) from org.imt.pssm.reactive.interpreter.OperationBehaviorAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.OperationBehavior){
    			org.imt.pssm.reactive.interpreter.OperationBehaviorAspect.execute((org.imt.pssm.reactive.model.statemachines.OperationBehavior)_self,eventOccurrence);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.BehaviorAspect#void execute(EventOccurrence) from org.imt.pssm.reactive.interpreter.OperationBehaviorAspect
    // #DispatchPointCut_before# void execute(EventOccurrence)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Behavior){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.pssm.reactive.interpreter.BehaviorAspect._privk3_execute(_self_, (org.imt.pssm.reactive.model.statemachines.Behavior)_self,eventOccurrence);
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
