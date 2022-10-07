package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.CompoundBehaviour;

@SuppressWarnings("all")
public class CompoundBehaviourAspectCompoundBehaviourAspectContext {
  public static final CompoundBehaviourAspectCompoundBehaviourAspectContext INSTANCE = new CompoundBehaviourAspectCompoundBehaviourAspectContext();

  public static CompoundBehaviourAspectCompoundBehaviourAspectProperties getSelf(final CompoundBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.CompoundBehaviourAspectCompoundBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<CompoundBehaviour, CompoundBehaviourAspectCompoundBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.CompoundBehaviour, org.imt.k3tdl.k3dsa.CompoundBehaviourAspectCompoundBehaviourAspectProperties>();

  public Map<CompoundBehaviour, CompoundBehaviourAspectCompoundBehaviourAspectProperties> getMap() {
    return map;
  }
}
