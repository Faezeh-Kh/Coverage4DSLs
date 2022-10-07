package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.ParallelBehaviour;

@SuppressWarnings("all")
public class ParallelBehaviourAspectParallelBehaviourAspectContext {
  public static final ParallelBehaviourAspectParallelBehaviourAspectContext INSTANCE = new ParallelBehaviourAspectParallelBehaviourAspectContext();

  public static ParallelBehaviourAspectParallelBehaviourAspectProperties getSelf(final ParallelBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.ParallelBehaviourAspectParallelBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ParallelBehaviour, ParallelBehaviourAspectParallelBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.ParallelBehaviour, org.imt.k3tdl.k3dsa.ParallelBehaviourAspectParallelBehaviourAspectProperties>();

  public Map<ParallelBehaviour, ParallelBehaviourAspectParallelBehaviourAspectProperties> getMap() {
    return map;
  }
}
