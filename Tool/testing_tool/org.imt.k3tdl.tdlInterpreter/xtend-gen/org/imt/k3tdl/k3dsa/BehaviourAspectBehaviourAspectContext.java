package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Behaviour;

@SuppressWarnings("all")
public class BehaviourAspectBehaviourAspectContext {
  public static final BehaviourAspectBehaviourAspectContext INSTANCE = new BehaviourAspectBehaviourAspectContext();

  public static BehaviourAspectBehaviourAspectProperties getSelf(final Behaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Behaviour, BehaviourAspectBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Behaviour, org.imt.k3tdl.k3dsa.BehaviourAspectBehaviourAspectProperties>();

  public Map<Behaviour, BehaviourAspectBehaviourAspectProperties> getMap() {
    return map;
  }
}
