package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.AlternativeBehaviour;

@SuppressWarnings("all")
public class AlternativeBehaviourAspectAlternativeBehaviourAspectContext {
  public static final AlternativeBehaviourAspectAlternativeBehaviourAspectContext INSTANCE = new AlternativeBehaviourAspectAlternativeBehaviourAspectContext();

  public static AlternativeBehaviourAspectAlternativeBehaviourAspectProperties getSelf(final AlternativeBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.AlternativeBehaviourAspectAlternativeBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<AlternativeBehaviour, AlternativeBehaviourAspectAlternativeBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.AlternativeBehaviour, org.imt.k3tdl.k3dsa.AlternativeBehaviourAspectAlternativeBehaviourAspectProperties>();

  public Map<AlternativeBehaviour, AlternativeBehaviourAspectAlternativeBehaviourAspectProperties> getMap() {
    return map;
  }
}
