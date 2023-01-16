package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EObject;
import statemachines.EventOccurrence;
import statemachines.FinalState;
import statemachines.Region;
import statemachines.State;
import statemachines.StateMachine;
import statemachines.Transition;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
  @OverrideAspectMethod
  protected static void enter(final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final pssm.semantics.FinalStateAspectFinalStateAspectProperties _self_ = pssm.semantics.FinalStateAspectFinalStateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enter(Transition,EventOccurrence,Region)
    if (_self instanceof statemachines.FinalState){
    	pssm.semantics.FinalStateAspect._privk3_enter(_self_, (statemachines.FinalState)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    };
  }

  private static void super_enter(final FinalState _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final pssm.semantics.StateAspectStateAspectProperties _self_ = pssm.semantics.StateAspectStateAspectContext.getSelf(_self);
     pssm.semantics.StateAspect._privk3_enter(_self_, _self,enteringTransition,eventOccurrence,leastCommonAncestor);
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
