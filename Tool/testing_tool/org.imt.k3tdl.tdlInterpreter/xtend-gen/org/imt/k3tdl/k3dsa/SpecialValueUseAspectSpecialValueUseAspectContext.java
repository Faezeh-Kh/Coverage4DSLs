package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.SpecialValueUse;

@SuppressWarnings("all")
public class SpecialValueUseAspectSpecialValueUseAspectContext {
  public static final SpecialValueUseAspectSpecialValueUseAspectContext INSTANCE = new SpecialValueUseAspectSpecialValueUseAspectContext();

  public static SpecialValueUseAspectSpecialValueUseAspectProperties getSelf(final SpecialValueUse _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.SpecialValueUseAspectSpecialValueUseAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<SpecialValueUse, SpecialValueUseAspectSpecialValueUseAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.SpecialValueUse, org.imt.k3tdl.k3dsa.SpecialValueUseAspectSpecialValueUseAspectProperties>();

  public Map<SpecialValueUse, SpecialValueUseAspectSpecialValueUseAspectProperties> getMap() {
    return map;
  }
}
