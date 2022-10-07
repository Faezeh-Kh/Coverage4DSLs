package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.PeriodicBehaviour;

@SuppressWarnings("all")
public class PeriodicBehaviourAspectPeriodicBehaviourAspectContext {
  public static final PeriodicBehaviourAspectPeriodicBehaviourAspectContext INSTANCE = new PeriodicBehaviourAspectPeriodicBehaviourAspectContext();

  public static PeriodicBehaviourAspectPeriodicBehaviourAspectProperties getSelf(final PeriodicBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.PeriodicBehaviourAspectPeriodicBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<PeriodicBehaviour, PeriodicBehaviourAspectPeriodicBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.PeriodicBehaviour, org.imt.k3tdl.k3dsa.PeriodicBehaviourAspectPeriodicBehaviourAspectProperties>();

  public Map<PeriodicBehaviour, PeriodicBehaviourAspectPeriodicBehaviourAspectProperties> getMap() {
    return map;
  }
}
