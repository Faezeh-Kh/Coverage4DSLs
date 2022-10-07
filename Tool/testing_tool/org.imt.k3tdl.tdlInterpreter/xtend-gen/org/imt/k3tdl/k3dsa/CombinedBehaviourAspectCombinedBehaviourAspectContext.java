package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.CombinedBehaviour;

@SuppressWarnings("all")
public class CombinedBehaviourAspectCombinedBehaviourAspectContext {
  public static final CombinedBehaviourAspectCombinedBehaviourAspectContext INSTANCE = new CombinedBehaviourAspectCombinedBehaviourAspectContext();

  public static CombinedBehaviourAspectCombinedBehaviourAspectProperties getSelf(final CombinedBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.CombinedBehaviourAspectCombinedBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<CombinedBehaviour, CombinedBehaviourAspectCombinedBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.CombinedBehaviour, org.imt.k3tdl.k3dsa.CombinedBehaviourAspectCombinedBehaviourAspectProperties>();

  public Map<CombinedBehaviour, CombinedBehaviourAspectCombinedBehaviourAspectProperties> getMap() {
    return map;
  }
}
