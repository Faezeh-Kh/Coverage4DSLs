package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.ActionBehaviour;

@SuppressWarnings("all")
public class ActionBehaviourAspectActionBehaviourAspectContext {
  public static final ActionBehaviourAspectActionBehaviourAspectContext INSTANCE = new ActionBehaviourAspectActionBehaviourAspectContext();

  public static ActionBehaviourAspectActionBehaviourAspectProperties getSelf(final ActionBehaviour _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.ActionBehaviourAspectActionBehaviourAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ActionBehaviour, ActionBehaviourAspectActionBehaviourAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.ActionBehaviour, org.imt.k3tdl.k3dsa.ActionBehaviourAspectActionBehaviourAspectProperties>();

  public Map<ActionBehaviour, ActionBehaviourAspectActionBehaviourAspectProperties> getMap() {
    return map;
  }
}
