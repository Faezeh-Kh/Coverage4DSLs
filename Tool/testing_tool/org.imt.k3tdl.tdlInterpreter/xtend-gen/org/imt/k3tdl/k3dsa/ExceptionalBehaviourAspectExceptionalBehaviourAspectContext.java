package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.ExceptionalBehaviour;

@SuppressWarnings("all")
public class ExceptionalBehaviourAspectExceptionalBehaviourAspectContext {
  public static final ExceptionalBehaviourAspectExceptionalBehaviourAspectContext INSTANCE = new ExceptionalBehaviourAspectExceptionalBehaviourAspectContext();

  public static ExceptionalBehaviourAspectExceptionalBehaviourAspectProperties getSelf(final ExceptionalBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspectExceptionalBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ExceptionalBehaviour, ExceptionalBehaviourAspectExceptionalBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.ExceptionalBehaviour, org.imt.k3tdl.k3dsa.ExceptionalBehaviourAspectExceptionalBehaviourAspectProperties>();

  public Map<ExceptionalBehaviour, ExceptionalBehaviourAspectExceptionalBehaviourAspectProperties> getMap() {
    return map;
  }
}
