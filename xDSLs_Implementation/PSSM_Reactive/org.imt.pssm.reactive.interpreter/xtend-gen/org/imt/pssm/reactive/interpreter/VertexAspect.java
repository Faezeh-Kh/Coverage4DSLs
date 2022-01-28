package org.imt.pssm.reactive.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;
import org.imt.pssm.reactive.model.statemachines.Region;
import org.imt.pssm.reactive.model.statemachines.State;
import org.imt.pssm.reactive.model.statemachines.Transition;
import org.imt.pssm.reactive.model.statemachines.Vertex;

@Aspect(className = Vertex.class)
@SuppressWarnings("all")
public class VertexAspect {
  protected static void enter(final Vertex _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.imt.pssm.reactive.interpreter.StateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.State){
    			org.imt.pssm.reactive.interpreter.StateAspect.enter((org.imt.pssm.reactive.model.statemachines.State)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.imt.pssm.reactive.interpreter.StateAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.imt.pssm.reactive.interpreter.FinalStateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.FinalState){
    			org.imt.pssm.reactive.interpreter.FinalStateAspect.enter((org.imt.pssm.reactive.model.statemachines.FinalState)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.imt.pssm.reactive.interpreter.FinalStateAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.imt.pssm.reactive.interpreter.PseudostateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    			org.imt.pssm.reactive.interpreter.PseudostateAspect.enter((org.imt.pssm.reactive.model.statemachines.Pseudostate)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void enter(Transition,EventOccurrence,Region) from org.imt.pssm.reactive.interpreter.PseudostateAspect
    // #DispatchPointCut_before# void enter(Transition,EventOccurrence,Region)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Vertex){
    	org.imt.pssm.reactive.interpreter.VertexAspect._privk3_enter(_self_, (org.imt.pssm.reactive.model.statemachines.Vertex)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    };
  }
  
  protected static void exit(final Vertex _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void exit(Transition,EventOccurrence,Region) from org.imt.pssm.reactive.interpreter.PseudostateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    			org.imt.pssm.reactive.interpreter.PseudostateAspect.exit((org.imt.pssm.reactive.model.statemachines.Pseudostate)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void exit(Transition,EventOccurrence,Region) from org.imt.pssm.reactive.interpreter.PseudostateAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void exit(Transition,EventOccurrence,Region) from org.imt.pssm.reactive.interpreter.StateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.State){
    			org.imt.pssm.reactive.interpreter.StateAspect.exit((org.imt.pssm.reactive.model.statemachines.State)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void exit(Transition,EventOccurrence,Region) from org.imt.pssm.reactive.interpreter.StateAspect
    // #DispatchPointCut_before# void exit(Transition,EventOccurrence,Region)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Vertex){
    	org.imt.pssm.reactive.interpreter.VertexAspect._privk3_exit(_self_, (org.imt.pssm.reactive.model.statemachines.Vertex)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    };
  }
  
  protected static void terminate(final Vertex _self) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void terminate() from org.imt.pssm.reactive.interpreter.StateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.State){
    			org.imt.pssm.reactive.interpreter.StateAspect.terminate((org.imt.pssm.reactive.model.statemachines.State)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#void terminate() from org.imt.pssm.reactive.interpreter.StateAspect
    // #DispatchPointCut_before# void terminate()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Vertex){
    	org.imt.pssm.reactive.interpreter.VertexAspect._privk3_terminate(_self_, (org.imt.pssm.reactive.model.statemachines.Vertex)_self);
    };
  }
  
  protected static boolean isActive(final Vertex _self) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean isActive() from org.imt.pssm.reactive.interpreter.PseudostateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    			result = org.imt.pssm.reactive.interpreter.PseudostateAspect.isActive((org.imt.pssm.reactive.model.statemachines.Pseudostate)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean isActive() from org.imt.pssm.reactive.interpreter.PseudostateAspect
    // #DispatchPointCut_before# boolean isActive()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Vertex){
    	result = org.imt.pssm.reactive.interpreter.VertexAspect._privk3_isActive(_self_, (org.imt.pssm.reactive.model.statemachines.Vertex)_self);
    };
    return (boolean)result;
  }
  
  protected static boolean isEnterable(final Vertex _self, final Transition enteringTransition) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean isEnterable(Transition) from org.imt.pssm.reactive.interpreter.PseudostateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    			result = org.imt.pssm.reactive.interpreter.PseudostateAspect.isEnterable((org.imt.pssm.reactive.model.statemachines.Pseudostate)_self,enteringTransition);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean isEnterable(Transition) from org.imt.pssm.reactive.interpreter.PseudostateAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean isEnterable(Transition) from org.imt.pssm.reactive.interpreter.StateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.State){
    			result = org.imt.pssm.reactive.interpreter.StateAspect.isEnterable((org.imt.pssm.reactive.model.statemachines.State)_self,enteringTransition);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean isEnterable(Transition) from org.imt.pssm.reactive.interpreter.StateAspect
    // #DispatchPointCut_before# boolean isEnterable(Transition)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Vertex){
    	result = org.imt.pssm.reactive.interpreter.VertexAspect._privk3_isEnterable(_self_, (org.imt.pssm.reactive.model.statemachines.Vertex)_self,enteringTransition);
    };
    return (boolean)result;
  }
  
  protected static boolean isExitable(final Vertex _self, final Transition exitingTransition) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean isExitable(Transition) from org.imt.pssm.reactive.interpreter.PseudostateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    			result = org.imt.pssm.reactive.interpreter.PseudostateAspect.isExitable((org.imt.pssm.reactive.model.statemachines.Pseudostate)_self,exitingTransition);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean isExitable(Transition) from org.imt.pssm.reactive.interpreter.PseudostateAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean isExitable(Transition) from org.imt.pssm.reactive.interpreter.StateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.State){
    			result = org.imt.pssm.reactive.interpreter.StateAspect.isExitable((org.imt.pssm.reactive.model.statemachines.State)_self,exitingTransition);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean isExitable(Transition) from org.imt.pssm.reactive.interpreter.StateAspect
    // #DispatchPointCut_before# boolean isExitable(Transition)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Vertex){
    	result = org.imt.pssm.reactive.interpreter.VertexAspect._privk3_isExitable(_self_, (org.imt.pssm.reactive.model.statemachines.Vertex)_self,exitingTransition);
    };
    return (boolean)result;
  }
  
  protected static boolean contains(final Vertex _self, final Vertex vertex) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean contains(Vertex) from org.imt.pssm.reactive.interpreter.StateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.State){
    			result = org.imt.pssm.reactive.interpreter.StateAspect.contains((org.imt.pssm.reactive.model.statemachines.State)_self,vertex);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#boolean contains(Vertex) from org.imt.pssm.reactive.interpreter.StateAspect
    // #DispatchPointCut_before# boolean contains(Vertex)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Vertex){
    	result = org.imt.pssm.reactive.interpreter.VertexAspect._privk3_contains(_self_, (org.imt.pssm.reactive.model.statemachines.Vertex)_self,vertex);
    };
    return (boolean)result;
  }
  
  protected static Region getContainingRegion(final Vertex _self) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#Region getContainingRegion() from org.imt.pssm.reactive.interpreter.PseudostateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    			result = org.imt.pssm.reactive.interpreter.PseudostateAspect.getContainingRegion((org.imt.pssm.reactive.model.statemachines.Pseudostate)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#Region getContainingRegion() from org.imt.pssm.reactive.interpreter.PseudostateAspect
    // #DispatchPointCut_before# Region getContainingRegion()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Vertex){
    	result = org.imt.pssm.reactive.interpreter.VertexAspect._privk3_getContainingRegion(_self_, (org.imt.pssm.reactive.model.statemachines.Vertex)_self);
    };
    return (org.imt.pssm.reactive.model.statemachines.Region)result;
  }
  
  protected static State getParentState(final Vertex _self) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#State getParentState() from org.imt.pssm.reactive.interpreter.PseudostateAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    			result = org.imt.pssm.reactive.interpreter.PseudostateAspect.getParentState((org.imt.pssm.reactive.model.statemachines.Pseudostate)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.VertexAspect#State getParentState() from org.imt.pssm.reactive.interpreter.PseudostateAspect
    // #DispatchPointCut_before# State getParentState()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Vertex){
    	result = org.imt.pssm.reactive.interpreter.VertexAspect._privk3_getParentState(_self_, (org.imt.pssm.reactive.model.statemachines.Vertex)_self);
    };
    return (org.imt.pssm.reactive.model.statemachines.State)result;
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
