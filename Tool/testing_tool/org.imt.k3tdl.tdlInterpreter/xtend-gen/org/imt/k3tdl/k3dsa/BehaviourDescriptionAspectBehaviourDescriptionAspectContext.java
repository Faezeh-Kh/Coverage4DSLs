package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.BehaviourDescription;

@SuppressWarnings("all")
public class BehaviourDescriptionAspectBehaviourDescriptionAspectContext {
  public static final BehaviourDescriptionAspectBehaviourDescriptionAspectContext INSTANCE = new BehaviourDescriptionAspectBehaviourDescriptionAspectContext();

  public static BehaviourDescriptionAspectBehaviourDescriptionAspectProperties getSelf(final BehaviourDescription _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.BehaviourDescriptionAspectBehaviourDescriptionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BehaviourDescription, BehaviourDescriptionAspectBehaviourDescriptionAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.BehaviourDescription, org.imt.k3tdl.k3dsa.BehaviourDescriptionAspectBehaviourDescriptionAspectProperties>();

  public Map<BehaviourDescription, BehaviourDescriptionAspectBehaviourDescriptionAspectProperties> getMap() {
    return map;
  }
}
