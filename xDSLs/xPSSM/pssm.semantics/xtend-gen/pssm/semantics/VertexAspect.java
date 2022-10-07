package pssm.semantics;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import statemachines.EventOccurrence;
import statemachines.Region;
import statemachines.State;
import statemachines.Transition;
import statemachines.Vertex;

@Aspect(className = Vertex.class)
@SuppressWarnings("all")
public class VertexAspect {
  protected static void enter(final Vertex _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final pssm.semantics.VertexAspectVertexAspectProperties _self_ = pssm.semantics.VertexAspectVertexAspectContext.getSelf(_self);
    	// BeginInjectInto pssm.semantics.VertexAspect#void enter(Transition,EventOccurrence,Region) from pssm.semantics.PseudostateAspect
    		if (_self instanceof statemachines.Pseudostate){
    			pssm.semantics.PseudostateAspect.enter((statemachines.Pseudostate)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#void enter(Transition,EventOccurrence,Region) from pssm.semantics.PseudostateAspect
    	// BeginInjectInto pssm.semantics.VertexAspect#void enter(Transition,EventOccurrence,Region) from pssm.semantics.StateAspect
    		if (_self instanceof statemachines.State){
    			pssm.semantics.StateAspect.enter((statemachines.State)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#void enter(Transition,EventOccurrence,Region) from pssm.semantics.StateAspect
    	// BeginInjectInto pssm.semantics.VertexAspect#void enter(Transition,EventOccurrence,Region) from pssm.semantics.FinalStateAspect
    		if (_self instanceof statemachines.FinalState){
    			pssm.semantics.FinalStateAspect.enter((statemachines.FinalState)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#void enter(Transition,EventOccurrence,Region) from pssm.semantics.FinalStateAspect
    // #DispatchPointCut_before# void enter(Transition,EventOccurrence,Region)
    if (_self instanceof statemachines.Vertex){
    	pssm.semantics.VertexAspect._privk3_enter(_self_, (statemachines.Vertex)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    };
  }
  
  protected static void exit(final Vertex _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final pssm.semantics.VertexAspectVertexAspectProperties _self_ = pssm.semantics.VertexAspectVertexAspectContext.getSelf(_self);
    	// BeginInjectInto pssm.semantics.VertexAspect#void exit(Transition,EventOccurrence,Region) from pssm.semantics.PseudostateAspect
    		if (_self instanceof statemachines.Pseudostate){
    			pssm.semantics.PseudostateAspect.exit((statemachines.Pseudostate)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#void exit(Transition,EventOccurrence,Region) from pssm.semantics.PseudostateAspect
    	// BeginInjectInto pssm.semantics.VertexAspect#void exit(Transition,EventOccurrence,Region) from pssm.semantics.StateAspect
    		if (_self instanceof statemachines.State){
    			pssm.semantics.StateAspect.exit((statemachines.State)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#void exit(Transition,EventOccurrence,Region) from pssm.semantics.StateAspect
    // #DispatchPointCut_before# void exit(Transition,EventOccurrence,Region)
    if (_self instanceof statemachines.Vertex){
    	pssm.semantics.VertexAspect._privk3_exit(_self_, (statemachines.Vertex)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    };
  }
  
  protected static void terminate(final Vertex _self) {
    final pssm.semantics.VertexAspectVertexAspectProperties _self_ = pssm.semantics.VertexAspectVertexAspectContext.getSelf(_self);
    	// BeginInjectInto pssm.semantics.VertexAspect#void terminate() from pssm.semantics.StateAspect
    		if (_self instanceof statemachines.State){
    			pssm.semantics.StateAspect.terminate((statemachines.State)_self);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#void terminate() from pssm.semantics.StateAspect
    // #DispatchPointCut_before# void terminate()
    if (_self instanceof statemachines.Vertex){
    	pssm.semantics.VertexAspect._privk3_terminate(_self_, (statemachines.Vertex)_self);
    };
  }
  
  protected static boolean isActive(final Vertex _self) {
    final pssm.semantics.VertexAspectVertexAspectProperties _self_ = pssm.semantics.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.VertexAspect#boolean isActive() from pssm.semantics.PseudostateAspect
    		if (_self instanceof statemachines.Pseudostate){
    			result = pssm.semantics.PseudostateAspect.isActive((statemachines.Pseudostate)_self);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#boolean isActive() from pssm.semantics.PseudostateAspect
    // #DispatchPointCut_before# boolean isActive()
    if (_self instanceof statemachines.Vertex){
    	result = pssm.semantics.VertexAspect._privk3_isActive(_self_, (statemachines.Vertex)_self);
    };
    return (boolean)result;
  }
  
  protected static boolean isEnterable(final Vertex _self, final Transition enteringTransition) {
    final pssm.semantics.VertexAspectVertexAspectProperties _self_ = pssm.semantics.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.VertexAspect#boolean isEnterable(Transition) from pssm.semantics.PseudostateAspect
    		if (_self instanceof statemachines.Pseudostate){
    			result = pssm.semantics.PseudostateAspect.isEnterable((statemachines.Pseudostate)_self,enteringTransition);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#boolean isEnterable(Transition) from pssm.semantics.PseudostateAspect
    	// BeginInjectInto pssm.semantics.VertexAspect#boolean isEnterable(Transition) from pssm.semantics.StateAspect
    		if (_self instanceof statemachines.State){
    			result = pssm.semantics.StateAspect.isEnterable((statemachines.State)_self,enteringTransition);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#boolean isEnterable(Transition) from pssm.semantics.StateAspect
    // #DispatchPointCut_before# boolean isEnterable(Transition)
    if (_self instanceof statemachines.Vertex){
    	result = pssm.semantics.VertexAspect._privk3_isEnterable(_self_, (statemachines.Vertex)_self,enteringTransition);
    };
    return (boolean)result;
  }
  
  protected static boolean isExitable(final Vertex _self, final Transition exitingTransition) {
    final pssm.semantics.VertexAspectVertexAspectProperties _self_ = pssm.semantics.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.VertexAspect#boolean isExitable(Transition) from pssm.semantics.StateAspect
    		if (_self instanceof statemachines.State){
    			result = pssm.semantics.StateAspect.isExitable((statemachines.State)_self,exitingTransition);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#boolean isExitable(Transition) from pssm.semantics.StateAspect
    	// BeginInjectInto pssm.semantics.VertexAspect#boolean isExitable(Transition) from pssm.semantics.PseudostateAspect
    		if (_self instanceof statemachines.Pseudostate){
    			result = pssm.semantics.PseudostateAspect.isExitable((statemachines.Pseudostate)_self,exitingTransition);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#boolean isExitable(Transition) from pssm.semantics.PseudostateAspect
    // #DispatchPointCut_before# boolean isExitable(Transition)
    if (_self instanceof statemachines.Vertex){
    	result = pssm.semantics.VertexAspect._privk3_isExitable(_self_, (statemachines.Vertex)_self,exitingTransition);
    };
    return (boolean)result;
  }
  
  protected static boolean contains(final Vertex _self, final Vertex vertex) {
    final pssm.semantics.VertexAspectVertexAspectProperties _self_ = pssm.semantics.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.VertexAspect#boolean contains(Vertex) from pssm.semantics.StateAspect
    		if (_self instanceof statemachines.State){
    			result = pssm.semantics.StateAspect.contains((statemachines.State)_self,vertex);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#boolean contains(Vertex) from pssm.semantics.StateAspect
    // #DispatchPointCut_before# boolean contains(Vertex)
    if (_self instanceof statemachines.Vertex){
    	result = pssm.semantics.VertexAspect._privk3_contains(_self_, (statemachines.Vertex)_self,vertex);
    };
    return (boolean)result;
  }
  
  protected static Region getContainingRegion(final Vertex _self) {
    final pssm.semantics.VertexAspectVertexAspectProperties _self_ = pssm.semantics.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.VertexAspect#Region getContainingRegion() from pssm.semantics.PseudostateAspect
    		if (_self instanceof statemachines.Pseudostate){
    			result = pssm.semantics.PseudostateAspect.getContainingRegion((statemachines.Pseudostate)_self);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#Region getContainingRegion() from pssm.semantics.PseudostateAspect
    // #DispatchPointCut_before# Region getContainingRegion()
    if (_self instanceof statemachines.Vertex){
    	result = pssm.semantics.VertexAspect._privk3_getContainingRegion(_self_, (statemachines.Vertex)_self);
    };
    return (statemachines.Region)result;
  }
  
  protected static State getParentState(final Vertex _self) {
    final pssm.semantics.VertexAspectVertexAspectProperties _self_ = pssm.semantics.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.VertexAspect#State getParentState() from pssm.semantics.PseudostateAspect
    		if (_self instanceof statemachines.Pseudostate){
    			result = pssm.semantics.PseudostateAspect.getParentState((statemachines.Pseudostate)_self);
    		} else
    		// EndInjectInto pssm.semantics.VertexAspect#State getParentState() from pssm.semantics.PseudostateAspect
    // #DispatchPointCut_before# State getParentState()
    if (_self instanceof statemachines.Vertex){
    	result = pssm.semantics.VertexAspect._privk3_getParentState(_self_, (statemachines.Vertex)_self);
    };
    return (statemachines.State)result;
  }
  
  protected static void _privk3_enter(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    if ((((leastCommonAncestor != null) && (_self.getContainer() != null)) && (!Objects.equal(_self.getContainer(), leastCommonAncestor)))) {
      State containingState = _self.getContainer().getState();
      if ((containingState != null)) {
        StateAspect.enter(containingState, enteringTransition, eventOccurrence, leastCommonAncestor);
      }
    }
    Region _containingRegion = VertexAspect.getContainingRegion(_self);
    _containingRegion.setCurrentVertex(_self);
    StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(VertexAspect.getContainingRegion(_self))).add(_self);
  }
  
  protected static void _privk3_exit(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    Region _containingRegion = VertexAspect.getContainingRegion(_self);
    _containingRegion.setCurrentVertex(null);
    StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(VertexAspect.getContainingRegion(_self))).remove(_self);
    if ((((leastCommonAncestor != null) && (_self.getContainer() != null)) && (!Objects.equal(leastCommonAncestor, _self.getContainer())))) {
      State containingState = _self.getContainer().getState();
      if ((containingState != null)) {
        StateAspect.exit(containingState, exitingTransition, eventOccurrence, leastCommonAncestor);
      }
    }
  }
  
  protected static void _privk3_terminate(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    return;
  }
  
  protected static boolean _privk3_isActive(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    return StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(_self.getContainer())).contains(_self);
  }
  
  protected static boolean _privk3_isEnterable(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition enteringTransition) {
    return true;
  }
  
  protected static boolean _privk3_isExitable(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Transition exitingTransition) {
    return true;
  }
  
  protected static boolean _privk3_contains(final VertexAspectVertexAspectProperties _self_, final Vertex _self, final Vertex vertex) {
    return false;
  }
  
  protected static Region _privk3_getContainingRegion(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    return _self.getContainer();
  }
  
  protected static State _privk3_getParentState(final VertexAspectVertexAspectProperties _self_, final Vertex _self) {
    return _self.getContainer().getState();
  }
}
