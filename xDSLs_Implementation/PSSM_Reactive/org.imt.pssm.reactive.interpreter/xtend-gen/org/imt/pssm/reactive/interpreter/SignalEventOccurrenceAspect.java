package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.pssm.reactive.model.statemachines.SignalEventOccurrence;

@Aspect(className = SignalEventOccurrence.class)
@SuppressWarnings("all")
public class SignalEventOccurrenceAspect extends EventOccurrenceAspect {
  @OverrideAspectMethod
  protected static String getParameters(final SignalEventOccurrence _self) {
    final org.imt.pssm.reactive.interpreter.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_ = org.imt.pssm.reactive.interpreter.SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getParameters()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.SignalEventOccurrence){
    	result = org.imt.pssm.reactive.interpreter.SignalEventOccurrenceAspect._privk3_getParameters(_self_, (org.imt.pssm.reactive.model.statemachines.SignalEventOccurrence)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getParameters(final SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_, final SignalEventOccurrence _self) {
    return "";
  }
}
