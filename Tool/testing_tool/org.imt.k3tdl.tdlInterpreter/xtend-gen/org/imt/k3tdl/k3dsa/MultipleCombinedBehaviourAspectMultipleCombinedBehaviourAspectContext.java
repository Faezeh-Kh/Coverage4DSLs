package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.MultipleCombinedBehaviour;

@SuppressWarnings("all")
public class MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectContext {
  public static final MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectContext INSTANCE = new MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectContext();

  public static MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectProperties getSelf(final MultipleCombinedBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<MultipleCombinedBehaviour, MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.MultipleCombinedBehaviour, org.imt.k3tdl.k3dsa.MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectProperties>();

  public Map<MultipleCombinedBehaviour, MultipleCombinedBehaviourAspectMultipleCombinedBehaviourAspectProperties> getMap() {
    return map;
  }
}
