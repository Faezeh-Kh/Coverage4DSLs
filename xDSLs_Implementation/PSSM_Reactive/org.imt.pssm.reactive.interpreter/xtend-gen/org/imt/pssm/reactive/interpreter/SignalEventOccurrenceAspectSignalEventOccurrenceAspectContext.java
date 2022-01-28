package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.SignalEventOccurrence;

@SuppressWarnings("all")
public class SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext {
  public static final SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext INSTANCE = new SignalEventOccurrenceAspectSignalEventOccurrenceAspectContext();
  
  public static SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties getSelf(final SignalEventOccurrence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SignalEventOccurrence, SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.SignalEventOccurrence, org.imt.pssm.reactive.interpreter.SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties>();
  
  public Map<SignalEventOccurrence, SignalEventOccurrenceAspectSignalEventOccurrenceAspectProperties> getMap() {
    return map;
  }
}
