package pssm.semantics;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import statemachines.EventOccurrence;
import statemachines.Pseudostate;
import statemachines.PseudostateKind;
import statemachines.Region;
import statemachines.State;
import statemachines.StateMachine;
import statemachines.Transition;
import statemachines.Vertex;

@Aspect(className = Region.class)
@SuppressWarnings("all")
public class RegionAspect {
  protected static void enter(final Region _self, final Transition enteringTransition, final EventOccurrence eventOccurrence) {
    final pssm.semantics.RegionAspectRegionAspectProperties _self_ = pssm.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enter(Transition,EventOccurrence)
    if (_self instanceof statemachines.Region){
    	pssm.semantics.RegionAspect._privk3_enter(_self_, (statemachines.Region)_self,enteringTransition,eventOccurrence);
    };
  }
  
  protected static void exit(final Region _self, final Transition exitingTransition, final EventOccurrence eventOccurrence) {
    final pssm.semantics.RegionAspectRegionAspectProperties _self_ = pssm.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exit(Transition,EventOccurrence)
    if (_self instanceof statemachines.Region){
    	pssm.semantics.RegionAspect._privk3_exit(_self_, (statemachines.Region)_self,exitingTransition,eventOccurrence);
    };
  }
  
  protected static void terminate(final Region _self) {
    final pssm.semantics.RegionAspectRegionAspectProperties _self_ = pssm.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void terminate()
    if (_self instanceof statemachines.Region){
    	pssm.semantics.RegionAspect._privk3_terminate(_self_, (statemachines.Region)_self);
    };
  }
  
  protected static StateMachine getContainingStateMachine(final Region _self) {
    final pssm.semantics.RegionAspectRegionAspectProperties _self_ = pssm.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# StateMachine getContainingStateMachine()
    if (_self instanceof statemachines.Region){
    	result = pssm.semantics.RegionAspect._privk3_getContainingStateMachine(_self_, (statemachines.Region)_self);
    };
    return (statemachines.StateMachine)result;
  }
  
  protected static Iterable<Vertex> getActiveVertice(final Region _self) {
    final pssm.semantics.RegionAspectRegionAspectProperties _self_ = pssm.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Iterable<Vertex> getActiveVertice()
    if (_self instanceof statemachines.Region){
    	result = pssm.semantics.RegionAspect._privk3_getActiveVertice(_self_, (statemachines.Region)_self);
    };
    return (java.lang.Iterable<statemachines.Vertex>)result;
  }
  
  protected static boolean contains(final Region _self, final Vertex vertex) {
    final pssm.semantics.RegionAspectRegionAspectProperties _self_ = pssm.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean contains(Vertex)
    if (_self instanceof statemachines.Region){
    	result = pssm.semantics.RegionAspect._privk3_contains(_self_, (statemachines.Region)_self,vertex);
    };
    return (boolean)result;
  }
  
  protected static boolean completed(final Region _self) {
    final pssm.semantics.RegionAspectRegionAspectProperties _self_ = pssm.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean completed()
    if (_self instanceof statemachines.Region){
    	result = pssm.semantics.RegionAspect._privk3_completed(_self_, (statemachines.Region)_self);
    };
    return (boolean)result;
  }
  
  protected static void completed(final Region _self, final boolean completed) {
    final pssm.semantics.RegionAspectRegionAspectProperties _self_ = pssm.semantics.RegionAspectRegionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void completed(boolean)
    if (_self instanceof statemachines.Region){
    	pssm.semantics.RegionAspect._privk3_completed(_self_, (statemachines.Region)_self,completed);
    };
  }
  
  protected static void _privk3_enter(final RegionAspectRegionAspectProperties _self_, final Region _self, final Transition enteringTransition, final EventOccurrence eventOccurrence) {
    if (((enteringTransition == null) || (!RegionAspect.contains(_self, enteringTransition.getTarget())))) {
      final Function1<Pseudostate, Boolean> _function = new Function1<Pseudostate, Boolean>() {
        public Boolean apply(final Pseudostate it) {
          PseudostateKind _kind = it.getKind();
          return Boolean.valueOf(Objects.equal(_kind, PseudostateKind.INITIAL));
        }
      };
      final Pseudostate initialState = IterableExtensions.<Pseudostate>findFirst(Iterables.<Pseudostate>filter(_self.getVertice(), Pseudostate.class), _function);
      if ((initialState != null)) {
        VertexAspect.enter(initialState, enteringTransition, eventOccurrence, null);
      } else {
        RegionAspect.completed(_self, true);
        if (((_self.getState() != null) && StateAspect.hasCompleted(_self.getState()))) {
          StateAspect.complete(_self.getState());
        }
      }
    }
  }
  
  protected static void _privk3_exit(final RegionAspectRegionAspectProperties _self_, final Region _self, final Transition exitingTransition, final EventOccurrence eventOccurrence) {
    final Function1<Vertex, Boolean> _function = new Function1<Vertex, Boolean>() {
      public Boolean apply(final Vertex v) {
        return Boolean.valueOf(VertexAspect.isExitable(v, exitingTransition));
      }
    };
    final Consumer<Vertex> _function_1 = new Consumer<Vertex>() {
      public void accept(final Vertex it) {
        VertexAspect.exit(it, exitingTransition, eventOccurrence, null);
      }
    };
    IterableExtensions.<Vertex>filter(_self.getVertice(), _function).forEach(_function_1);
  }
  
  protected static void _privk3_terminate(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    final Consumer<Vertex> _function = new Consumer<Vertex>() {
      public void accept(final Vertex it) {
        VertexAspect.terminate(it);
      }
    };
    _self.getVertice().forEach(_function);
  }
  
  protected static StateMachine _privk3_getContainingStateMachine(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    State _state = _self.getState();
    boolean _tripleNotEquals = (_state != null);
    if (_tripleNotEquals) {
      return RegionAspect.getContainingStateMachine(_self.getState().getContainer());
    }
    return _self.getStateMachine();
  }
  
  protected static Iterable<Vertex> _privk3_getActiveVertice(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    List<Vertex> _activeVertice = StateMachineAspect.activeVertice(RegionAspect.getContainingStateMachine(_self));
    final ArrayList<Vertex> result = new ArrayList<Vertex>(_activeVertice);
    result.retainAll(_self.getVertice());
    final Function1<State, List<Vertex>> _function = new Function1<State, List<Vertex>>() {
      public List<Vertex> apply(final State it) {
        return StateAspect.getActiveVertice(it);
      }
    };
    Iterables.<Vertex>addAll(result, Iterables.<Vertex>concat(IterableExtensions.<State, List<Vertex>>map(Iterables.<State>filter(_self.getVertice(), State.class), _function)));
    return result;
  }
  
  protected static boolean _privk3_contains(final RegionAspectRegionAspectProperties _self_, final Region _self, final Vertex vertex) {
    final Function1<Vertex, Boolean> _function = new Function1<Vertex, Boolean>() {
      public Boolean apply(final Vertex it) {
        return Boolean.valueOf(VertexAspect.contains(it, vertex));
      }
    };
    return IterableExtensions.<Vertex>exists(_self.getVertice(), _function);
  }
  
  protected static boolean _privk3_completed(final RegionAspectRegionAspectProperties _self_, final Region _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isCompleted") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.completed;
  }
  
  protected static void _privk3_completed(final RegionAspectRegionAspectProperties _self_, final Region _self, final boolean completed) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCompleted")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, completed);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.completed = completed;
    }
  }
}
