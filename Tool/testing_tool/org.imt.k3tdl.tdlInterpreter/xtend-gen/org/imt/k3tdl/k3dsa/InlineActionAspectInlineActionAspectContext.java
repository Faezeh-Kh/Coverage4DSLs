package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.InlineAction;

@SuppressWarnings("all")
public class InlineActionAspectInlineActionAspectContext {
  public static final InlineActionAspectInlineActionAspectContext INSTANCE = new InlineActionAspectInlineActionAspectContext();

  public static InlineActionAspectInlineActionAspectProperties getSelf(final InlineAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.InlineActionAspectInlineActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<InlineAction, InlineActionAspectInlineActionAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.InlineAction, org.imt.k3tdl.k3dsa.InlineActionAspectInlineActionAspectProperties>();

  public Map<InlineAction, InlineActionAspectInlineActionAspectProperties> getMap() {
    return map;
  }
}
