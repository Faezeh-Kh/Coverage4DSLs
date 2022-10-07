package pssm.semantics;

import java.util.Map;
import statemachines.SignalEventOccurrence;

@SuppressWarnings("all")
public class SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext {
  public static final SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext INSTANCE = new SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext();
  
  public static SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties getSelf(final SignalEventOccurrence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SignalEventOccurrence, SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties> map = new java.util.WeakHashMap<statemachines.SignalEventOccurrence, pssm.semantics.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties>();
  
  public Map<SignalEventOccurrence, SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties> getMap() {
    return map;
  }
}
