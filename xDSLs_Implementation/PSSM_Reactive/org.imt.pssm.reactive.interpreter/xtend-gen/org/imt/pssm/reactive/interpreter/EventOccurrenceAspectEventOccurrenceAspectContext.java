package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;

@SuppressWarnings("all")
public class EventOccurrenceAspectEventOccurrenceAspectContext {
  public static final EventOccurrenceAspectEventOccurrenceAspectContext INSTANCE = new EventOccurrenceAspectEventOccurrenceAspectContext();
  
  public static EventOccurrenceAspectEventOccurrenceAspectProperties getSelf(final EventOccurrence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.EventOccurrenceAspectEventOccurrenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EventOccurrence, EventOccurrenceAspectEventOccurrenceAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.EventOccurrence, org.imt.pssm.reactive.interpreter.EventOccurrenceAspectEventOccurrenceAspectProperties>();
  
  public Map<EventOccurrence, EventOccurrenceAspectEventOccurrenceAspectProperties> getMap() {
    return map;
  }
}
