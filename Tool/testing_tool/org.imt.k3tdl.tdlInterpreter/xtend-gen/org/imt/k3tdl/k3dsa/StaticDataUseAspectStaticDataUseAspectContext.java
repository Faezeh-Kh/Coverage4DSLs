package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.StaticDataUse;

@SuppressWarnings("all")
public class StaticDataUseAspectStaticDataUseAspectContext {
  public static final StaticDataUseAspectStaticDataUseAspectContext INSTANCE = new StaticDataUseAspectStaticDataUseAspectContext();

  public static StaticDataUseAspectStaticDataUseAspectProperties getSelf(final StaticDataUse _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StaticDataUse, StaticDataUseAspectStaticDataUseAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.StaticDataUse, org.imt.k3tdl.k3dsa.StaticDataUseAspectStaticDataUseAspectProperties>();

  public Map<StaticDataUse, StaticDataUseAspectStaticDataUseAspectProperties> getMap() {
    return map;
  }
}
