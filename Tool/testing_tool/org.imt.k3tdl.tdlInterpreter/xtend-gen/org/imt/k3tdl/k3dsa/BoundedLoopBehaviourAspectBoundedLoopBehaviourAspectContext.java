package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.BoundedLoopBehaviour;

@SuppressWarnings("all")
public class BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectContext {
  public static final BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectContext INSTANCE = new BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectContext();

  public static BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectProperties getSelf(final BoundedLoopBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BoundedLoopBehaviour, BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.BoundedLoopBehaviour, org.imt.k3tdl.k3dsa.BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectProperties>();

  public Map<BoundedLoopBehaviour, BoundedLoopBehaviourAspectBoundedLoopBehaviourAspectProperties> getMap() {
    return map;
  }
}
