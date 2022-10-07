package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Interaction;

@SuppressWarnings("all")
public class InteractoinAspectInteractionAspectContext {
  public static final InteractoinAspectInteractionAspectContext INSTANCE = new InteractoinAspectInteractionAspectContext();

  public static InteractoinAspectInteractionAspectProperties getSelf(final Interaction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.InteractoinAspectInteractionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Interaction, InteractoinAspectInteractionAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Interaction, org.imt.k3tdl.k3dsa.InteractoinAspectInteractionAspectProperties>();

  public Map<Interaction, InteractoinAspectInteractionAspectProperties> getMap() {
    return map;
  }
}
