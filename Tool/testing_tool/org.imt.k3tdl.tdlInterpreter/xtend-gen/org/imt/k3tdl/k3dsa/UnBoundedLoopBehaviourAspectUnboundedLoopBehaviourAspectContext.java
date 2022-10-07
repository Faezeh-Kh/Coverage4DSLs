package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.UnboundedLoopBehaviour;

@SuppressWarnings("all")
public class UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectContext {
  public static final UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectContext INSTANCE = new UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectContext();

  public static UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectProperties getSelf(final UnboundedLoopBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<UnboundedLoopBehaviour, UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.UnboundedLoopBehaviour, org.imt.k3tdl.k3dsa.UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectProperties>();

  public Map<UnboundedLoopBehaviour, UnBoundedLoopBehaviourAspectUnboundedLoopBehaviourAspectProperties> getMap() {
    return map;
  }
}
