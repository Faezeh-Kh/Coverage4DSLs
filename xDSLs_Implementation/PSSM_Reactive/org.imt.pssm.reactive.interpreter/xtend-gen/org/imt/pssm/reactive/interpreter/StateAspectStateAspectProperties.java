package org.imt.pssm.reactive.interpreter;

import java.util.ArrayList;
import java.util.List;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;

@SuppressWarnings("all")
public class StateAspectStateAspectProperties {
  public boolean isEntryCompleted;
  
  public boolean isDoActivityCompleted;
  
  public boolean isExitCompleted;
  
  public List<EventOccurrence> deferredEvents = new ArrayList<EventOccurrence>();
}
