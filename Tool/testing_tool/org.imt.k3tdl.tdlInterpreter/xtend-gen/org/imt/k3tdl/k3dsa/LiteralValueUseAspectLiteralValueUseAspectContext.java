package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.LiteralValueUse;

@SuppressWarnings("all")
public class LiteralValueUseAspectLiteralValueUseAspectContext {
  public static final LiteralValueUseAspectLiteralValueUseAspectContext INSTANCE = new LiteralValueUseAspectLiteralValueUseAspectContext();

  public static LiteralValueUseAspectLiteralValueUseAspectProperties getSelf(final LiteralValueUse _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.LiteralValueUseAspectLiteralValueUseAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<LiteralValueUse, LiteralValueUseAspectLiteralValueUseAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.LiteralValueUse, org.imt.k3tdl.k3dsa.LiteralValueUseAspectLiteralValueUseAspectProperties>();

  public Map<LiteralValueUse, LiteralValueUseAspectLiteralValueUseAspectProperties> getMap() {
    return map;
  }
}
