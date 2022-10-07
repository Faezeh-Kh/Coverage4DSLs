package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.AtomicBehaviour;

@SuppressWarnings("all")
public class AtomicBehaviourAspectAtomicBehaviourAspectContext {
  public static final AtomicBehaviourAspectAtomicBehaviourAspectContext INSTANCE = new AtomicBehaviourAspectAtomicBehaviourAspectContext();

  public static AtomicBehaviourAspectAtomicBehaviourAspectProperties getSelf(final AtomicBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<AtomicBehaviour, AtomicBehaviourAspectAtomicBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.AtomicBehaviour, org.imt.k3tdl.k3dsa.AtomicBehaviourAspectAtomicBehaviourAspectProperties>();

  public Map<AtomicBehaviour, AtomicBehaviourAspectAtomicBehaviourAspectProperties> getMap() {
    return map;
  }
}
