package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import statemachines.SignalEventOccurrence;

@Aspect(className = SignalEventOccurrence.class)
@SuppressWarnings("all")
public class SignalEventOccurrenceAspect extends EventOccurrenceAspect {
  @OverrideAspectMethod
  protected static String getParameters(final SignalEventOccurrence _self) {
    final pssm.semantics.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_ = pssm.semantics.SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getParameters()
    if (_self instanceof statemachines.SignalEventOccurrence){
    	result = pssm.semantics.SignalEventOccurrenceAspect._privk3_getParameters(_self_, (statemachines.SignalEventOccurrence)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getParameters(final SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties _self_, final SignalEventOccurrence _self) {
    return "";
  }
}
