package pssm.semantics;

import java.util.ArrayList;
import java.util.List;
import statemachines.EventOccurrence;

@SuppressWarnings("all")
public class StateAspectStateAspectProperties {
  public boolean isEntryCompleted;

  public boolean isDoActivityCompleted;

  public boolean isExitCompleted;

  public List<EventOccurrence> deferredEvents = new ArrayList<EventOccurrence>();
}
