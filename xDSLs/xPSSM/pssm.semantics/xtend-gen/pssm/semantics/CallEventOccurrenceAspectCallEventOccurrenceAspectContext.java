package pssm.semantics;

import java.util.Map;
import statemachines.CallEventOccurrence;

@SuppressWarnings("all")
public class CallEventOccurrenceAspectCallEventOccurrenceAspectContext {
  public static final CallEventOccurrenceAspectCallEventOccurrenceAspectContext INSTANCE = new CallEventOccurrenceAspectCallEventOccurrenceAspectContext();
  
  public static CallEventOccurrenceAspectCallEventOccurrenceAspectProperties getSelf(final CallEventOccurrence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CallEventOccurrence, CallEventOccurrenceAspectCallEventOccurrenceAspectProperties> map = new java.util.WeakHashMap<statemachines.CallEventOccurrence, pssm.semantics.CallEventOccurrenceAspectCallEventOccurrenceAspectProperties>();
  
  public Map<CallEventOccurrence, CallEventOccurrenceAspectCallEventOccurrenceAspectProperties> getMap() {
    return map;
  }
}
