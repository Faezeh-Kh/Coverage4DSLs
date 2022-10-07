package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.ConditionalBehaviour;

@SuppressWarnings("all")
public class ConditionalBehaviourAspectConditionalBehaviourAspectContext {
  public static final ConditionalBehaviourAspectConditionalBehaviourAspectContext INSTANCE = new ConditionalBehaviourAspectConditionalBehaviourAspectContext();

  public static ConditionalBehaviourAspectConditionalBehaviourAspectProperties getSelf(final ConditionalBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.ConditionalBehaviourAspectConditionalBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ConditionalBehaviour, ConditionalBehaviourAspectConditionalBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.ConditionalBehaviour, org.imt.k3tdl.k3dsa.ConditionalBehaviourAspectConditionalBehaviourAspectProperties>();

  public Map<ConditionalBehaviour, ConditionalBehaviourAspectConditionalBehaviourAspectProperties> getMap() {
    return map;
  }
}
