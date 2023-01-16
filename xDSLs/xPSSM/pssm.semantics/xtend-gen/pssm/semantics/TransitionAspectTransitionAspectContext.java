package pssm.semantics;

import java.util.Map;
import statemachines.Transition;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public static final TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();

  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<statemachines.Transition, pssm.semantics.TransitionAspectTransitionAspectProperties>();

  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
