package pssm.semantics;

import java.util.Map;
import statemachines.Pseudostate;

@SuppressWarnings("all")
public class PseudostateAspectPseudostateAspectContext {
  public static final PseudostateAspectPseudostateAspectContext INSTANCE = new PseudostateAspectPseudostateAspectContext();

  public static PseudostateAspectPseudostateAspectProperties getSelf(final Pseudostate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.PseudostateAspectPseudostateAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Pseudostate, PseudostateAspectPseudostateAspectProperties> map = new java.util.WeakHashMap<statemachines.Pseudostate, pssm.semantics.PseudostateAspectPseudostateAspectProperties>();

  public Map<Pseudostate, PseudostateAspectPseudostateAspectProperties> getMap() {
    return map;
  }
}
