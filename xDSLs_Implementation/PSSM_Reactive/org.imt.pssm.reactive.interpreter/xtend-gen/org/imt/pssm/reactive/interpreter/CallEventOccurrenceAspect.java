package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.pssm.reactive.model.statemachines.CallEventOccurrence;

@Aspect(className = CallEventOccurrence.class)
@SuppressWarnings("all")
public class CallEventOccurrenceAspect extends EventOccurrenceAspect {
  @OverrideAspectMethod
  protected static String getParameters(final CallEventOccurrence _self) {
    final org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspectCallEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getParameters()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.CallEventOccurrence){
    	result = org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspect._privk3_getParameters(_self_, (org.imt.pssm.reactive.model.statemachines.CallEventOccurrence)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String getOutValues(final CallEventOccurrence _self) {
    final org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties _self_ = org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspectCallEventOccurrenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getOutValues()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.CallEventOccurrence){
    	result = org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspect._privk3_getOutValues(_self_, (org.imt.pssm.reactive.model.statemachines.CallEventOccurrence)_self);
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
