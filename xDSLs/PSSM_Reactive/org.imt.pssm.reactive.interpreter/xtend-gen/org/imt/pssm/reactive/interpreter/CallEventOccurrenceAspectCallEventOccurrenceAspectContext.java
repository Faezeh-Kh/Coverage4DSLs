package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.CallEventOccurrence;

@SuppressWarnings("all")
public class CallEventOccurrenceAspectCallEventOccurrenceAspectContext {
  public static final CallEventOccurrenceAspectCallEventOccurrenceAspectContext INSTANCE = new CallEventOccurrenceAspectCallEventOccurrenceAspectContext();
  
  public static CallEventOccurrenceAspectCallEventOccurrenceAspectProperties getSelf(final CallEventOccurrence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CallEventOccurrence, CallEventOccurrenceAspectCallEventOccurrenceAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.CallEventOccurrence, org.imt.pssm.reactive.interpreter.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties>();
  
  public Map<CallEventOccurrence, CallEventOccurrenceAspectCallEventOccurrenceAspectProperties> getMap() {
    return map;
  }
}
