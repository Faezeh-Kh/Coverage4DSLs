package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.ActionReference;

@SuppressWarnings("all")
public class ActionReferenceAspectActionReferenceAspectContext {
  public static final ActionReferenceAspectActionReferenceAspectContext INSTANCE = new ActionReferenceAspectActionReferenceAspectContext();

  public static ActionReferenceAspectActionReferenceAspectProperties getSelf(final ActionReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.ActionReferenceAspectActionReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ActionReference, ActionReferenceAspectActionReferenceAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.ActionReference, org.imt.k3tdl.k3dsa.ActionReferenceAspectActionReferenceAspectProperties>();

  public Map<ActionReference, ActionReferenceAspectActionReferenceAspectProperties> getMap() {
    return map;
  }
}
