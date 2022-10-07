package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.DefaultBehaviour;

@SuppressWarnings("all")
public class DefaultBehaviourAspectDefaultBehaviourAspectContext {
  public static final DefaultBehaviourAspectDefaultBehaviourAspectContext INSTANCE = new DefaultBehaviourAspectDefaultBehaviourAspectContext();

  public static DefaultBehaviourAspectDefaultBehaviourAspectProperties getSelf(final DefaultBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.DefaultBehaviourAspectDefaultBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DefaultBehaviour, DefaultBehaviourAspectDefaultBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.DefaultBehaviour, org.imt.k3tdl.k3dsa.DefaultBehaviourAspectDefaultBehaviourAspectProperties>();

  public Map<DefaultBehaviour, DefaultBehaviourAspectDefaultBehaviourAspectProperties> getMap() {
    return map;
  }
}
