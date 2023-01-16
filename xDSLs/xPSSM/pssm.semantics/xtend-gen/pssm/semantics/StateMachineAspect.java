package pssm.semantics;

import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import statemachines.AttributeValue;
import statemachines.CallEventOccurrence;
import statemachines.CompletionEventOccurrence;
import statemachines.EventOccurrence;
import statemachines.Region;
import statemachines.State;
import statemachines.StateMachine;
import statemachines.Transition;
import statemachines.Vertex;

@Aspect(className = StateMachine.class)
@SuppressWarnings("all")
public class StateMachineAspect {
  @Step
  public static void run(final StateMachine _self) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void run()
    if (_self instanceof statemachines.StateMachine){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			pssm.semantics.StateMachineAspect._privk3_run(_self_, (statemachines.StateMachine)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "StateMachine", "run");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  @Step
  public static void eventOccurrenceReceived(final StateMachine _self, final EventOccurrence event) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void eventOccurrenceReceived(EventOccurrence)
    if (_self instanceof statemachines.StateMachine){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			pssm.semantics.StateMachineAspect._privk3_eventOccurrenceReceived(_self_, (statemachines.StateMachine)_self,event);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {event}, command, "StateMachine", "eventOccurrenceReceived");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static List<Transition> selectTransitions(final StateMachine _self, final EventOccurrence event) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# List<Transition> selectTransitions(EventOccurrence)
    if (_self instanceof statemachines.StateMachine){
    	result = pssm.semantics.StateMachineAspect._privk3_selectTransitions(_self_, (statemachines.StateMachine)_self,event);
    };
    return (java.util.List<statemachines.Transition>)result;
  }

  private static List<Transition> _selectTransitions(final StateMachine _self, final List<Vertex> vertice, final EventOccurrence event) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# List<Transition> _selectTransitions(List<Vertex>,EventOccurrence)
    if (_self instanceof statemachines.StateMachine){
    	result = pssm.semantics.StateMachineAspect._privk3__selectTransitions(_self_, (statemachines.StateMachine)_self,vertice,event);
    };
    return (java.util.List<statemachines.Transition>)result;
  }

  private static List<Transition> _selectTransitions(final StateMachine _self, final Vertex vertex, final EventOccurrence event) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# List<Transition> _selectTransitions(Vertex,EventOccurrence)
    if (_self instanceof statemachines.StateMachine){
    	result = pssm.semantics.StateMachineAspect._privk3__selectTransitions(_self_, (statemachines.StateMachine)_self,vertex,event);
    };
    return (java.util.List<statemachines.Transition>)result;
  }

  private static void dispatchEventOccurrence(final StateMachine _self, final EventOccurrence eventOccurrence) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void dispatchEventOccurrence(EventOccurrence)
    if (_self instanceof statemachines.StateMachine){
    	pssm.semantics.StateMachineAspect._privk3_dispatchEventOccurrence(_self_, (statemachines.StateMachine)_self,eventOccurrence);
    };
  }

  private static void dispatchCompletionEvents(final StateMachine _self) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void dispatchCompletionEvents()
    if (_self instanceof statemachines.StateMachine){
    	pssm.semantics.StateMachineAspect._privk3_dispatchCompletionEvents(_self_, (statemachines.StateMachine)_self);
    };
  }

  private static void dispatchDeferredEvents(final StateMachine _self) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void dispatchDeferredEvents()
    if (_self instanceof statemachines.StateMachine){
    	pssm.semantics.StateMachineAspect._privk3_dispatchDeferredEvents(_self_, (statemachines.StateMachine)_self);
    };
  }

  private static State getDeferringState(final StateMachine _self, final EventOccurrence event) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State getDeferringState(EventOccurrence)
    if (_self instanceof statemachines.StateMachine){
    	result = pssm.semantics.StateMachineAspect._privk3_getDeferringState(_self_, (statemachines.StateMachine)_self,event);
    };
    return (statemachines.State)result;
  }

  private static State _getDeferringState(final StateMachine _self, final EventOccurrence event, final State state) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State _getDeferringState(EventOccurrence,State)
    if (_self instanceof statemachines.StateMachine){
    	result = pssm.semantics.StateMachineAspect._privk3__getDeferringState(_self_, (statemachines.StateMachine)_self,event,state);
    };
    return (statemachines.State)result;
  }

  @Step
  protected static void terminate(final StateMachine _self) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void terminate()
    if (_self instanceof statemachines.StateMachine){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			pssm.semantics.StateMachineAspect._privk3_terminate(_self_, (statemachines.StateMachine)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "StateMachine", "terminate");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static List<CompletionEventOccurrence> completionEvents(final StateMachine _self) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# List<CompletionEventOccurrence> completionEvents()
    if (_self instanceof statemachines.StateMachine){
    	result = pssm.semantics.StateMachineAspect._privk3_completionEvents(_self_, (statemachines.StateMachine)_self);
    };
    return (java.util.List<statemachines.CompletionEventOccurrence>)result;
  }

  protected static List<EventOccurrence> deferredEvents(final StateMachine _self) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# List<EventOccurrence> deferredEvents()
    if (_self instanceof statemachines.StateMachine){
    	result = pssm.semantics.StateMachineAspect._privk3_deferredEvents(_self_, (statemachines.StateMachine)_self);
    };
    return (java.util.List<statemachines.EventOccurrence>)result;
  }

  protected static List<Vertex> activeVertice(final StateMachine _self) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# List<Vertex> activeVertice()
    if (_self instanceof statemachines.StateMachine){
    	result = pssm.semantics.StateMachineAspect._privk3_activeVertice(_self_, (statemachines.StateMachine)_self);
    };
    return (java.util.List<statemachines.Vertex>)result;
  }

  public static List<EventOccurrence> receivedEvents(final StateMachine _self) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# List<EventOccurrence> receivedEvents()
    if (_self instanceof statemachines.StateMachine){
    	result = pssm.semantics.StateMachineAspect._privk3_receivedEvents(_self_, (statemachines.StateMachine)_self);
    };
    return (java.util.List<statemachines.EventOccurrence>)result;
  }

  public static void receivedEvents(final StateMachine _self, final List<EventOccurrence> receivedEvents) {
    final pssm.semantics.StateMachineAspectStateMachineAspectProperties _self_ = pssm.semantics.StateMachineAspectStateMachineAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void receivedEvents(List<EventOccurrence>)
    if (_self instanceof statemachines.StateMachine){
    	pssm.semantics.StateMachineAspect._privk3_receivedEvents(_self_, (statemachines.StateMachine)_self,receivedEvents);
    };
  }

  protected static void _privk3_run(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    final Consumer<Region> _function = new Consumer<Region>() {
      public void accept(final Region it) {
        RegionAspect.enter(it, null, null);
      }
    };
    _self.getRegions().forEach(_function);
    StateMachineAspect.dispatchCompletionEvents(_self);
  }

  protected static void _privk3_eventOccurrenceReceived(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EventOccurrence event) {
    StateMachineAspect.receivedEvents(_self).add(event);
    StateMachineAspect.dispatchEventOccurrence(_self, event);
  }

  protected static List<Transition> _privk3_selectTransitions(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EventOccurrence event) {
    final Function1<Region, List<Transition>> _function = new Function1<Region, List<Transition>>() {
      public List<Transition> apply(final Region r) {
        return StateMachineAspect._selectTransitions(_self, r.getVertice(), event);
      }
    };
    return IterableExtensions.<Transition>toList(Iterables.<Transition>concat(ListExtensions.<Region, List<Transition>>map(_self.getRegions(), _function)));
  }

  protected static List<Transition> _privk3__selectTransitions(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final List<Vertex> vertice, final EventOccurrence event) {
    final Function1<Vertex, Boolean> _function = new Function1<Vertex, Boolean>() {
      public Boolean apply(final Vertex v) {
        return Boolean.valueOf(StateMachineAspect.activeVertice(_self).contains(v));
      }
    };
    final Function1<Vertex, List<Transition>> _function_1 = new Function1<Vertex, List<Transition>>() {
      public List<Transition> apply(final Vertex v) {
        return StateMachineAspect._selectTransitions(_self, v, event);
      }
    };
    return IterableExtensions.<Transition>toList(Iterables.<Transition>concat(IterableExtensions.<Vertex, List<Transition>>map(IterableExtensions.<Vertex>filter(vertice, _function), _function_1)));
  }

  protected static List<Transition> _privk3__selectTransitions(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final Vertex vertex, final EventOccurrence event) {
    final ArrayList<Transition> transitions = new ArrayList<Transition>();
    if ((vertex instanceof State)) {
      EList<Region> _regions = ((State)vertex).getRegions();
      boolean _tripleNotEquals = (_regions != null);
      if (_tripleNotEquals) {
        final Function1<Region, List<Transition>> _function = new Function1<Region, List<Transition>>() {
          public List<Transition> apply(final Region r) {
            return StateMachineAspect._selectTransitions(_self, r.getVertice(), event);
          }
        };
        Iterables.<Transition>addAll(transitions, Iterables.<Transition>concat(ListExtensions.<Region, List<Transition>>map(((State)vertex).getRegions(), _function)));
      }
    }
    boolean _isEmpty = transitions.isEmpty();
    if (_isEmpty) {
      final Function1<Transition, Boolean> _function_1 = new Function1<Transition, Boolean>() {
        public Boolean apply(final Transition it) {
          return Boolean.valueOf(TransitionAspect.canFireOn(it, event));
        }
      };
      Iterables.<Transition>addAll(transitions, IterableExtensions.<Transition>filter(vertex.getOutgoingTransitions(), _function_1));
      int _size = transitions.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        final Transition selectedTransition = IterableExtensions.<Transition>head(transitions);
        transitions.clear();
        transitions.add(selectedTransition);
      }
    }
    return transitions;
  }

  protected static void _privk3_dispatchEventOccurrence(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EventOccurrence eventOccurrence) {
    final State deferringState = StateMachineAspect.getDeferringState(_self, eventOccurrence);
    if ((deferringState == null)) {
      final Consumer<Transition> _function = new Consumer<Transition>() {
        public void accept(final Transition t) {
          TransitionAspect.fire(t, eventOccurrence);
        }
      };
      StateMachineAspect.selectTransitions(_self, eventOccurrence).forEach(_function);
      if (((eventOccurrence != null) && (eventOccurrence instanceof CallEventOccurrence))) {
        final EList<AttributeValue> out = ((CallEventOccurrence) eventOccurrence).getOutParameterValues();
        boolean _isEmpty = out.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
        }
      }
      StateMachineAspect.dispatchCompletionEvents(_self);
      StateMachineAspect.dispatchDeferredEvents(_self);
    } else {
      StateAspect.deferredEvents(deferringState).add(eventOccurrence);
    }
  }

  protected static void _privk3_dispatchCompletionEvents(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    while ((!StateMachineAspect.completionEvents(_self).isEmpty())) {
      {
        final CompletionEventOccurrence event = StateMachineAspect.completionEvents(_self).remove(0);
        boolean _contains = StateMachineAspect.activeVertice(_self).contains(event.getState());
        if (_contains) {
          final Function1<Transition, Boolean> _function = new Function1<Transition, Boolean>() {
            public Boolean apply(final Transition it) {
              return Boolean.valueOf(TransitionAspect.canFireOn(it, null));
            }
          };
          final Transition transition = IterableExtensions.<Transition>head(IterableExtensions.<Transition>filter(event.getState().getOutgoingTransitions(), _function));
          if ((transition != null)) {
            TransitionAspect.fire(transition, null);
          }
        }
      }
    }
  }

  protected static void _privk3_dispatchDeferredEvents(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    List<EventOccurrence> _deferredEvents = StateMachineAspect.deferredEvents(_self);
    final ArrayList<EventOccurrence> toDispatch = new ArrayList<EventOccurrence>(_deferredEvents);
    StateMachineAspect.deferredEvents(_self).clear();
    final Consumer<EventOccurrence> _function = new Consumer<EventOccurrence>() {
      public void accept(final EventOccurrence eventOccurrence) {
        StateMachineAspect.dispatchEventOccurrence(_self, eventOccurrence);
      }
    };
    toDispatch.forEach(_function);
  }

  protected static State _privk3_getDeferringState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EventOccurrence event) {
    final Function1<Region, EList<Vertex>> _function = new Function1<Region, EList<Vertex>>() {
      public EList<Vertex> apply(final Region it) {
        return it.getVertice();
      }
    };
    final Function1<State, Boolean> _function_1 = new Function1<State, Boolean>() {
      public Boolean apply(final State s) {
        return Boolean.valueOf(StateMachineAspect.activeVertice(_self).contains(s));
      }
    };
    final Function1<State, State> _function_2 = new Function1<State, State>() {
      public State apply(final State s) {
        return StateMachineAspect._getDeferringState(_self, event, s);
      }
    };
    return IterableExtensions.<State>head(IterableExtensions.<State>filterNull(IterableExtensions.<State, State>map(IterableExtensions.<State>filter(Iterables.<State>filter((Iterables.<Vertex>concat(ListExtensions.<Region, EList<Vertex>>map(_self.getRegions(), _function))), State.class), _function_1), _function_2)));
  }

  protected static State _privk3__getDeferringState(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final EventOccurrence event, final State state) {
    final Function1<Region, EList<Vertex>> _function = new Function1<Region, EList<Vertex>>() {
      public EList<Vertex> apply(final Region it) {
        return it.getVertice();
      }
    };
    final Function1<State, Boolean> _function_1 = new Function1<State, Boolean>() {
      public Boolean apply(final State s) {
        return Boolean.valueOf(StateMachineAspect.activeVertice(_self).contains(s));
      }
    };
    final Function1<State, State> _function_2 = new Function1<State, State>() {
      public State apply(final State s) {
        return StateMachineAspect._getDeferringState(_self, event, s);
      }
    };
    State deferred = IterableExtensions.<State>head(IterableExtensions.<State>filterNull(IterableExtensions.<State, State>map(IterableExtensions.<State>filter(Iterables.<State>filter((Iterables.<Vertex>concat(ListExtensions.<Region, EList<Vertex>>map(state.getRegions(), _function))), State.class), _function_1), _function_2)));
    if (((deferred == null) && StateAspect.canDefer(state, event))) {
      boolean _isEmpty = StateMachineAspect._selectTransitions(_self, state, event).isEmpty();
      if (_isEmpty) {
        deferred = state;
      }
    }
    return deferred;
  }

  protected static void _privk3_terminate(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    final Consumer<Region> _function = new Consumer<Region>() {
      public void accept(final Region it) {
        RegionAspect.terminate(it);
      }
    };
    _self.getRegions().forEach(_function);
  }

  protected static List<CompletionEventOccurrence> _privk3_completionEvents(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCompletionEvents") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.completionEvents;
  }

  protected static List<EventOccurrence> _privk3_deferredEvents(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDeferredEvents") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.deferredEvents;
  }

  protected static List<Vertex> _privk3_activeVertice(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getActiveVertice") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.activeVertice;
  }

  protected static List<EventOccurrence> _privk3_receivedEvents(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getReceivedEvents") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.receivedEvents;
  }

  protected static void _privk3_receivedEvents(final StateMachineAspectStateMachineAspectProperties _self_, final StateMachine _self, final List<EventOccurrence> receivedEvents) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setReceivedEvents")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, receivedEvents);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.receivedEvents = receivedEvents;
    }
  }
}
