package pssm.semantics;

import java.util.ArrayList;
import java.util.List;
import statemachines.CompletionEventOccurrence;
import statemachines.EventOccurrence;
import statemachines.Vertex;

@SuppressWarnings("all")
public class StateMachineAspectStateMachineAspectProperties {
  public final List<CompletionEventOccurrence> completionEvents = new ArrayList<CompletionEventOccurrence>();

  public final List<EventOccurrence> deferredEvents = new ArrayList<EventOccurrence>();

  public final List<Vertex> activeVertice = new ArrayList<Vertex>();

  public List<EventOccurrence> receivedEvents = new ArrayList<EventOccurrence>();
}
