package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.SingleCombinedBehaviour;

@SuppressWarnings("all")
public class SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectContext {
  public static final SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectContext INSTANCE = new SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectContext();

  public static SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties getSelf(final SingleCombinedBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<SingleCombinedBehaviour, SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.SingleCombinedBehaviour, org.imt.k3tdl.k3dsa.SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties>();

  public Map<SingleCombinedBehaviour, SingleCombinedBehaviourAspectSingleCombinedBehaviourAspectProperties> getMap() {
    return map;
  }
}
