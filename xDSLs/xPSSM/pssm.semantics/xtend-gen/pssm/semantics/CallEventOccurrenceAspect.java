package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import statemachines.CallEventOccurrence;

@Aspect(className = CallEventOccurrence.class)
@SuppressWarnings("all")
public class CallEventOccurrenceAspect extends EventOccurrenceAspect {
  @OverrideAspectMethod
  protected static String getParameters(final CallEventOccurrence _self) {
    final pssm.semantics.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = pssm.semantics.CallEventOccurrenceAspectCallEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getParameters()
    if (_self instanceof statemachines.CallEventOccurrence){
    	result = pssm.semantics.CallEventOccurrenceAspect._privk3_getParameters(_self_, (statemachines.CallEventOccurrence)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String getOutValues(final CallEventOccurrence _self) {
    final pssm.semantics.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = pssm.semantics.CallEventOccurrenceAspectCallEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getOutValues()
    if (_self instanceof statemachines.CallEventOccurrence){
    	result = pssm.semantics.CallEventOccurrenceAspect._privk3_getOutValues(_self_, (statemachines.CallEventOccurrence)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_getParameters(final CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_, final CallEventOccurrence _self) {
    return null;
  }
  
  protected static String _privk3_getOutValues(final CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_, final CallEventOccurrence _self) {
    return null;
  }
}
