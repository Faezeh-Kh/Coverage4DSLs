package pssm.semantics;

import java.util.Map;
import statemachines.FinalState;

@SuppressWarnings("all")
public class FinalStateAspectFinalStateAspectContext {
  public static final FinalStateAspectFinalStateAspectContext INSTANCE = new FinalStateAspectFinalStateAspectContext();

  public static FinalStateAspectFinalStateAspectProperties getSelf(final FinalState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.FinalStateAspectFinalStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<FinalState, FinalStateAspectFinalStateAspectProperties> map = new java.util.WeakHashMap<statemachines.FinalState, pssm.semantics.FinalStateAspectFinalStateAspectProperties>();

  public Map<FinalState, FinalStateAspectFinalStateAspectProperties> getMap() {
    return map;
  }
}
