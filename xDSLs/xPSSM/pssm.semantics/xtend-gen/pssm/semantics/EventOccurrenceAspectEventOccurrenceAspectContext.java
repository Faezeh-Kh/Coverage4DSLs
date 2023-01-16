package pssm.semantics;

import java.util.Map;
import statemachines.EventOccurrence;

@SuppressWarnings("all")
public class EventOccurrenceAspectEventOccurrenceAspectContext {
  public static final EventOccurrenceAspectEventOccurrenceAspectContext INSTANCE = new EventOccurrenceAspectEventOccurrenceAspectContext();

  public static EventOccurrenceAspectEventOccurrenceAspectProperties getSelf(final EventOccurrence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.EventOccurrenceAspectEventOccurrenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<EventOccurrence, EventOccurrenceAspectEventOccurrenceAspectProperties> map = new java.util.WeakHashMap<statemachines.EventOccurrence, pssm.semantics.EventOccurrenceAspectEventOccurrenceAspectProperties>();

  public Map<EventOccurrence, EventOccurrenceAspectEventOccurrenceAspectProperties> getMap() {
    return map;
  }
}
