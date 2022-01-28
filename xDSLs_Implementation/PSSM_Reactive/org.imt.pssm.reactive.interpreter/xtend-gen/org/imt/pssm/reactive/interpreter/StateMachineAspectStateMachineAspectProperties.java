package org.imt.pssm.reactive.interpreter;

import java.util.ArrayList;
import java.util.List;
import org.imt.pssm.reactive.model.statemachines.CompletionEventOccurrence;
import org.imt.pssm.reactive.model.statemachines.EventOccurrence;
import org.imt.pssm.reactive.model.statemachines.Vertex;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectProperties {
  public final List<CompletionEventOccurrence> completionEvents = new ArrayList<CompletionEventOccurrence>();
  
  public final List<EventOccurrence> deferredEvents = new ArrayList<EventOccurrence>();
  
  public final List<Vertex> activeVertice = new ArrayList<Vertex>();
  
  public List<EventOccurrence> receivedEvents = new ArrayList<EventOccurrence>();
}
