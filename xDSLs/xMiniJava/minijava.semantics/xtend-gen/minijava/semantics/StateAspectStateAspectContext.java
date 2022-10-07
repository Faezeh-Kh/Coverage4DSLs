package minijava.semantics;

import java.util.Map;
import xminiJava.State;

@SuppressWarnings("all")
public class StateAspectStateAspectContext {
  public static final StateAspectStateAspectContext INSTANCE = new StateAspectStateAspectContext();

  public static StateAspectStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.StateAspectStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<State, StateAspectStateAspectProperties> map = new java.util.WeakHashMap<xminiJava.State, minijava.semantics.StateAspectStateAspectProperties>();

  public Map<State, StateAspectStateAspectProperties> getMap() {
    return map;
  }
}
