package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;

@Aspect(className = EventOccurrence.class)
@SuppressWarnings("all")
public abstract class EventOccurrenceAspect {
  @Abstract
  protected static String getParameters(final EventOccurrence _self) {
    final org.imt.pssm.reactive.interpreter.EventOccurrenceAspectEventOccurrenceAspectProperties _self_ = org.imt.pssm.reactive.interpreter.EventOccurrenceAspectEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.EventOccurrenceAspect#String getParameters() from org.imt.pssm.reactive.interpreter.SignalEventOccurrenceAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.SignalEventOccurrence){
    			result = org.imt.pssm.reactive.interpreter.SignalEventOccurrenceAspect.getParameters((org.imt.pssm.reactive.model.statemachines.SignalEventOccurrence)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.EventOccurrenceAspect#String getParameters() from org.imt.pssm.reactive.interpreter.SignalEventOccurrenceAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.EventOccurrenceAspect#String getParameters() from org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.CallEventOccurrence){
    			result = org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspect.getParameters((org.imt.pssm.reactive.model.statemachines.CallEventOccurrence)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.EventOccurrenceAspect#String getParameters() from org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspect
    // #DispatchPointCut_before# String getParameters()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.EventOccurrence){
    	result = org.imt.pssm.reactive.interpreter.EventOccurrenceAspect._privk3_getParameters(_self_, (org.imt.pssm.reactive.model.statemachines.EventOccurrence)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getParameters(final EventOccurrenceAspectEventOccurrenceAspectProperties _self_, final EventOccurrence _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
