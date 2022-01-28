package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EObject;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;
import org.imt.pssm.reactive.model.statemachines.FinalState;
import org.imt.pssm.reactive.model.statemachines.Region;
import org.imt.pssm.reactive.model.statemachines.State;
import org.imt.pssm.reactive.model.statemachines.StateMachine;
import org.imt.pssm.reactive.model.statemachines.Transition;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  protected static void enter(final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.imt.pssm.reactive.interpreter.FinalStateAspectFinalStateAspectProperties _self_ = org.imt.pssm.reactive.interpreter.FinalStateAspectFinalStateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enter(Transition,EventOccurrence,Region)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.FinalState){
    	org.imt.pssm.reactive.interpreter.FinalStateAspect._privk3_enter(_self_, (org.imt.pssm.reactive.model.statemachines.FinalState)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    };
  }
  
  private static void super_enter(final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.imt.pssm.reactive.interpreter.StateAspectStateAspectProperties _self_ = org.imt.pssm.reactive.interpreter.StateAspectStateAspectContext.getSelf(_self);
     org.imt.pssm.reactive.interpreter.StateAspect._privk3_enter(_self_, _self,enteringTransition,eventOccurrence,leastCommonAncestor);
  }
  
  protected static void _privk3_enter(final FinalStateAspectFinalStateAspectProperties _self_, final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    Region _container = _self.getContainer();
    _container.setCurrentVertex(_self);
    Region _container_1 = _self.getContainer();
    RegionAspect.completed(_container_1, true);
    final State parentState = _self.getContainer().getState();
    if (((parentState != null) && StateAspect.hasCompleted(parentState))) {
      StateAspect.complete(parentState);
    }
    EObject _eContainer = _self.getContainer().eContainer();
    if ((_eContainer instanceof StateMachine)) {
      EObject _eContainer_1 = _self.getContainer().eContainer();
      StateMachineAspect.terminate(((StateMachine) _eContainer_1));
    }
  }
}
