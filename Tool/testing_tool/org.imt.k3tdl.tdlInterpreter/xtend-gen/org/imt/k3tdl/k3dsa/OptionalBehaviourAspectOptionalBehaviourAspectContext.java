package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.OptionalBehaviour;

@SuppressWarnings("all")
public class OptionalBehaviourAspectOptionalBehaviourAspectContext {
  public static final OptionalBehaviourAspectOptionalBehaviourAspectContext INSTANCE = new OptionalBehaviourAspectOptionalBehaviourAspectContext();

  public static OptionalBehaviourAspectOptionalBehaviourAspectProperties getSelf(final OptionalBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.OptionalBehaviourAspectOptionalBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<OptionalBehaviour, OptionalBehaviourAspectOptionalBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.OptionalBehaviour, org.imt.k3tdl.k3dsa.OptionalBehaviourAspectOptionalBehaviourAspectProperties>();

  public Map<OptionalBehaviour, OptionalBehaviourAspectOptionalBehaviourAspectProperties> getMap() {
    return map;
  }
}
