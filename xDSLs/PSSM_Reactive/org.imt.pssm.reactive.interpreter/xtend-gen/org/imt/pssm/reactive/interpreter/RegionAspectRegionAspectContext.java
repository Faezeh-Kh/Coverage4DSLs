package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.Region;

@SuppressWarnings("all")
public class RegionAspectRegionAspectContext {
  public static final RegionAspectRegionAspectContext INSTANCE = new RegionAspectRegionAspectContext();
  
  public static RegionAspectRegionAspectProperties getSelf(final Region _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.RegionAspectRegionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Region, RegionAspectRegionAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.Region, org.imt.pssm.reactive.interpreter.RegionAspectRegionAspectProperties>();
  
  public Map<Region, RegionAspectRegionAspectProperties> getMap() {
    return map;
  }
}
