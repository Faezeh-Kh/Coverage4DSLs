package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.Pseudostate;

@SuppressWarnings("all")
public class PseudostateAspectPseudostateAspectContext {
  public static final PseudostateAspectPseudostateAspectContext INSTANCE = new PseudostateAspectPseudostateAspectContext();
  
  public static PseudostateAspectPseudostateAspectProperties getSelf(final Pseudostate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Pseudostate, PseudostateAspectPseudostateAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.Pseudostate, org.imt.pssm.reactive.interpreter.PseudostateAspectPseudostateAspectProperties>();
  
  public Map<Pseudostate, PseudostateAspectPseudostateAspectProperties> getMap() {
    return map;
  }
}
