package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import statemachines.EventOccurrence;

@Aspect(className = EventOccurrence.class)
@SuppressWarnings("all")
public abstract class EventOccurrenceAspect {
  @Abstract
  protected static String getParameters(final EventOccurrence _self) {
    final pssm.semantics.EventOccurrenceAspectEventOccurrenceAspectProperties _self_ = pssm.semantics.EventOccurrenceAspectEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.EventOccurrenceAspect#String getParameters() from pssm.semantics.SignalEventOccurrenceAspect
    		if (_self instanceof statemachines.SignalEventOccurrence){
    			result = pssm.semantics.SignalEventOccurrenceAspect.getParameters((statemachines.SignalEventOccurrence)_self);
    		} else
    		// EndInjectInto pssm.semantics.EventOccurrenceAspect#String getParameters() from pssm.semantics.SignalEventOccurrenceAspect
    	// BeginInjectInto pssm.semantics.EventOccurrenceAspect#String getParameters() from pssm.semantics.CallEventOccurrenceAspect
    		if (_self instanceof statemachines.CallEventOccurrence){
    			result = pssm.semantics.CallEventOccurrenceAspect.getParameters((statemachines.CallEventOccurrence)_self);
    		} else
    		// EndInjectInto pssm.semantics.EventOccurrenceAspect#String getParameters() from pssm.semantics.CallEventOccurrenceAspect
    // #DispatchPointCut_before# String getParameters()
    if (_self instanceof statemachines.EventOccurrence){
    	result = pssm.semantics.EventOccurrenceAspect._privk3_getParameters(_self_, (statemachines.EventOccurrence)_self);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_getParameters(final EventOccurrenceAspectEventOccurrenceAspectProperties _self_, final EventOccurrence _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
