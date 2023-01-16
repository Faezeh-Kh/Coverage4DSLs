package pssm.semantics;

import java.util.Map;
import statemachines.Region;

@SuppressWarnings("all")
public class RegionAspectRegionAspectContext {
  public static final RegionAspectRegionAspectContext INSTANCE = new RegionAspectRegionAspectContext();

  public static RegionAspectRegionAspectProperties getSelf(final Region _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.RegionAspectRegionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Region, RegionAspectRegionAspectProperties> map = new java.util.WeakHashMap<statemachines.Region, pssm.semantics.RegionAspectRegionAspectProperties>();

  public Map<Region, RegionAspectRegionAspectProperties> getMap() {
    return map;
  }
}
