package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.InterruptBehaviour;

@SuppressWarnings("all")
public class InterruptBehaviourAspectInterruptBehaviourAspectContext {
  public static final InterruptBehaviourAspectInterruptBehaviourAspectContext INSTANCE = new InterruptBehaviourAspectInterruptBehaviourAspectContext();

  public static InterruptBehaviourAspectInterruptBehaviourAspectProperties getSelf(final InterruptBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.InterruptBehaviourAspectInterruptBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<InterruptBehaviour, InterruptBehaviourAspectInterruptBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.InterruptBehaviour, org.imt.k3tdl.k3dsa.InterruptBehaviourAspectInterruptBehaviourAspectProperties>();

  public Map<InterruptBehaviour, InterruptBehaviourAspectInterruptBehaviourAspectProperties> getMap() {
    return map;
  }
}
