package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Break;

@SuppressWarnings("all")
public class BreakAspectBreakAspectContext {
  public static final BreakAspectBreakAspectContext INSTANCE = new BreakAspectBreakAspectContext();

  public static BreakAspectBreakAspectProperties getSelf(final Break _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.BreakAspectBreakAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Break, BreakAspectBreakAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Break, org.imt.k3tdl.k3dsa.BreakAspectBreakAspectProperties>();

  public Map<Break, BreakAspectBreakAspectProperties> getMap() {
    return map;
  }
}
