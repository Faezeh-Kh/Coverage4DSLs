package org.imt.pssm.reactive.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;
import org.imt.pssm.reactive.model.statemachines.Pseudostate;
import org.imt.pssm.reactive.model.statemachines.PseudostateKind;
import org.imt.pssm.reactive.model.statemachines.Region;
import org.imt.pssm.reactive.model.statemachines.State;
import org.imt.pssm.reactive.model.statemachines.Transition;

@Aspect(className = Pseudostate.class)
@SuppressWarnings("all")
public class PseudostateAspect extends VertexAspect {
  @OverrideAspectMethod
  protected static void enter(final Pseudostate _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectProperties _self_ = org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enter(Transition,EventOccurrence,Region)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    	org.imt.pssm.reactive.interpreter.PseudostateAspect._privk3_enter(_self_, (org.imt.pssm.reactive.model.statemachines.Pseudostate)_self,enteringTransition,eventOccurrence,leastCommonAncestor);
    };
  }
  
  @OverrideAspectMethod
  protected static void exit(final Pseudostate _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectProperties _self_ = org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exit(Transition,EventOccurrence,Region)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    	org.imt.pssm.reactive.interpreter.PseudostateAspect._privk3_exit(_self_, (org.imt.pssm.reactive.model.statemachines.Pseudostate)_self,exitingTransition,eventOccurrence,leastCommonAncestor);
    };
  }
  
  @OverrideAspectMethod
  protected static boolean isEnterable(final Pseudostate _self, final Transition enteringTransition) {
    final org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectProperties _self_ = org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isEnterable(Transition)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    	result = org.imt.pssm.reactive.interpreter.PseudostateAspect._privk3_isEnterable(_self_, (org.imt.pssm.reactive.model.statemachines.Pseudostate)_self,enteringTransition);
    };
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  protected static boolean isExitable(final Pseudostate _self, final Transition exitingTransition) {
    final org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectProperties _self_ = org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isExitable(Transition)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    	result = org.imt.pssm.reactive.interpreter.PseudostateAspect._privk3_isExitable(_self_, (org.imt.pssm.reactive.model.statemachines.Pseudostate)_self,exitingTransition);
    };
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  protected static boolean isActive(final Pseudostate _self) {
    final org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectProperties _self_ = org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isActive()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    	result = org.imt.pssm.reactive.interpreter.PseudostateAspect._privk3_isActive(_self_, (org.imt.pssm.reactive.model.statemachines.Pseudostate)_self);
    };
    return (boolean)result;
  }
  
  @OverrideAspectMethod
  protected static Region getContainingRegion(final Pseudostate _self) {
    final org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectProperties _self_ = org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Region getContainingRegion()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    	result = org.imt.pssm.reactive.interpreter.PseudostateAspect._privk3_getContainingRegion(_self_, (org.imt.pssm.reactive.model.statemachines.Pseudostate)_self);
    };
    return (org.imt.pssm.reactive.model.statemachines.Region)result;
  }
  
  @OverrideAspectMethod
  protected static State getParentState(final Pseudostate _self) {
    final org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectProperties _self_ = org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State getParentState()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.Pseudostate){
    	result = org.imt.pssm.reactive.interpreter.PseudostateAspect._privk3_getParentState(_self_, (org.imt.pssm.reactive.model.statemachines.Pseudostate)_self);
    };
    return (org.imt.pssm.reactive.model.statemachines.State)result;
  }
  
  private static void super_enter(final Pseudostate _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
     org.imt.pssm.reactive.interpreter.VertexAspect._privk3_enter(_self_, _self,enteringTransition,eventOccurrence,leastCommonAncestor);
  }
  
  protected static void _privk3_enter(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self, final Transition enteringTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    PseudostateKind _kind = _self.getKind();
    if (_kind != null) {
      switch (_kind) {
        case INITIAL:
          Region _container = _self.getContainer();
          _container.setCurrentVertex(_self);
          int _size = _self.getOutgoingTransitions().size();
          boolean _equals = (_size == 1);
          if (_equals) {
            TransitionAspect.fire(IterableExtensions.<Transition>head(_self.getOutgoingTransitions()), eventOccurrence);
          }
          break;
        case FORK:
          PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
          final Consumer<Transition> _function = (Transition it) -> {
            TransitionAspect.fire(it, eventOccurrence);
          };
          _self.getOutgoingTransitions().forEach(_function);
          break;
        case JOIN:
          PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
          TransitionAspect.fire(IterableExtensions.<Transition>head(_self.getOutgoingTransitions()), eventOccurrence);
          break;
        case TERMINATE:
          PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
          StateMachineAspect.terminate(RegionAspect.getContainingStateMachine(_self.getContainer()));
          PseudostateAspect.exit(_self, null, null, null);
          break;
        case ENTRYPOINT:
          StateAspect.enter(_self.getState(), enteringTransition, eventOccurrence, leastCommonAncestor);
          Region _container_1 = _self.getState().getContainer();
          _container_1.setCurrentVertex(_self);
          StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(_self.getState().getContainer())).add(_self);
          int _size_1 = _self.getState().getRegions().size();
          boolean _greaterThan = (_size_1 > 1);
          if (_greaterThan) {
            final Consumer<Transition> _function_1 = (Transition it) -> {
              TransitionAspect.fire(it, eventOccurrence);
            };
            _self.getOutgoingTransitions().forEach(_function_1);
          } else {
            Transition _head = IterableExtensions.<Transition>head(_self.getOutgoingTransitions());
            if (_head!=null) {
              TransitionAspect.fire(_head, eventOccurrence);
            }
          }
          break;
        case EXITPOINT:
          int _size_2 = _self.getOutgoingTransitions().size();
          boolean _greaterThan_1 = (_size_2 > 0);
          if (_greaterThan_1) {
            Transition selectedTransition = IterableExtensions.<Transition>head(_self.getOutgoingTransitions());
            PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, null);
            StateAspect.exit(_self.getState(), enteringTransition, eventOccurrence, null);
            TransitionAspect.fire(selectedTransition, eventOccurrence);
          }
          break;
        default:
          PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
          break;
      }
    } else {
      PseudostateAspect.super_enter(_self, enteringTransition, eventOccurrence, leastCommonAncestor);
    }
  }
  
  private static void super_exit(final Pseudostate _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
     org.imt.pssm.reactive.interpreter.VertexAspect._privk3_exit(_self_, _self,exitingTransition,eventOccurrence,leastCommonAncestor);
  }
  
  protected static void _privk3_exit(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self, final Transition exitingTransition, final EventOccurrence eventOccurrence, final Region leastCommonAncestor) {
    PseudostateKind _kind = _self.getKind();
    boolean _equals = Objects.equal(_kind, PseudostateKind.ENTRYPOINT);
    if (_equals) {
      PseudostateAspect.super_exit(_self, exitingTransition, eventOccurrence, null);
    } else {
      PseudostateAspect.super_exit(_self, exitingTransition, eventOccurrence, leastCommonAncestor);
    }
  }
  
  private static boolean super_isEnterable(final Pseudostate _self, final Transition enteringTransition) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.imt.pssm.reactive.interpreter.VertexAspect._privk3_isEnterable(_self_, _self,enteringTransition);
  }
  
  protected static boolean _privk3_isEnterable(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self, final Transition enteringTransition) {
    PseudostateKind _kind = _self.getKind();
    if (_kind != null) {
      switch (_kind) {
        case JOIN:
          final Function1<Transition, Boolean> _function = (Transition it) -> {
            return Boolean.valueOf((!Objects.equal(it, enteringTransition)));
          };
          final Function1<Transition, Boolean> _function_1 = (Transition it) -> {
            return Boolean.valueOf(TransitionAspect.traversed(it));
          };
          return IterableExtensions.<Transition>forall(IterableExtensions.<Transition>filter(_self.getIncomingTransitions(), _function), _function_1);
        case EXITPOINT:
          final Function1<Transition, Boolean> _function_2 = (Transition it) -> {
            return Boolean.valueOf((!Objects.equal(it, enteringTransition)));
          };
          final Function1<Transition, Boolean> _function_3 = (Transition it) -> {
            return Boolean.valueOf(TransitionAspect.traversed(it));
          };
          return IterableExtensions.<Transition>forall(IterableExtensions.<Transition>filter(_self.getIncomingTransitions(), _function_2), _function_3);
        default:
          return PseudostateAspect.super_isEnterable(_self, enteringTransition);
      }
    } else {
      return PseudostateAspect.super_isEnterable(_self, enteringTransition);
    }
  }
  
  private static boolean super_isExitable(final Pseudostate _self, final Transition exitingTransition) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.imt.pssm.reactive.interpreter.VertexAspect._privk3_isExitable(_self_, _self,exitingTransition);
  }
  
  protected static boolean _privk3_isExitable(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self, final Transition exitingTransition) {
    PseudostateKind _kind = _self.getKind();
    if (_kind != null) {
      switch (_kind) {
        case FORK:
          final Function1<Transition, Boolean> _function = (Transition it) -> {
            return Boolean.valueOf((!Objects.equal(it, exitingTransition)));
          };
          final Function1<Transition, Boolean> _function_1 = (Transition it) -> {
            return Boolean.valueOf(TransitionAspect.traversed(it));
          };
          return IterableExtensions.<Transition>forall(IterableExtensions.<Transition>filter(_self.getOutgoingTransitions(), _function), _function_1);
        case ENTRYPOINT:
          final Function1<Transition, Boolean> _function_2 = (Transition it) -> {
            return Boolean.valueOf((!Objects.equal(it, exitingTransition)));
          };
          final Function1<Transition, Boolean> _function_3 = (Transition it) -> {
            return Boolean.valueOf(TransitionAspect.traversed(it));
          };
          return IterableExtensions.<Transition>forall(IterableExtensions.<Transition>filter(_self.getOutgoingTransitions(), _function_2), _function_3);
        default:
          return PseudostateAspect.super_isExitable(_self, exitingTransition);
      }
    } else {
      return PseudostateAspect.super_isExitable(_self, exitingTransition);
    }
  }
  
  private static boolean super_isActive(final Pseudostate _self) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.imt.pssm.reactive.interpreter.VertexAspect._privk3_isActive(_self_, _self);
  }
  
  protected static boolean _privk3_isActive(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self) {
    if ((Objects.equal(_self.getKind(), PseudostateKind.ENTRYPOINT) || Objects.equal(_self.getKind(), PseudostateKind.EXITPOINT))) {
      return StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(_self.getState().getContainer())).contains(_self);
    } else {
      return PseudostateAspect.super_isActive(_self);
    }
  }
  
  private static Region super_getContainingRegion(final Pseudostate _self) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.imt.pssm.reactive.interpreter.VertexAspect._privk3_getContainingRegion(_self_, _self);
  }
  
  protected static Region _privk3_getContainingRegion(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self) {
    State _state = _self.getState();
    boolean _tripleNotEquals = (_state != null);
    if (_tripleNotEquals) {
      return _self.getState().getContainer();
    }
    return _self.getContainer();
  }
  
  private static State super_getParentState(final Pseudostate _self) {
    final org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectProperties _self_ = org.imt.pssm.reactive.interpreter.VertexAspectVertexAspectContext.getSelf(_self);
    return  org.imt.pssm.reactive.interpreter.VertexAspect._privk3_getParentState(_self_, _self);
  }
  
  protected static State _privk3_getParentState(final PseudostateAspectPseudostateAspectProperties _self_, final Pseudostate _self) {
    State _state = _self.getState();
    boolean _tripleNotEquals = (_state != null);
    if (_tripleNotEquals) {
      return _self.getState();
    }
    return _self.getContainer().getState();
  }
}
