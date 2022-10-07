package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Stop;

@SuppressWarnings("all")
public class StopAspectStopAspectContext {
  public static final StopAspectStopAspectContext INSTANCE = new StopAspectStopAspectContext();

  public static StopAspectStopAspectProperties getSelf(final Stop _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.StopAspectStopAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Stop, StopAspectStopAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Stop, org.imt.k3tdl.k3dsa.StopAspectStopAspectProperties>();

  public Map<Stop, StopAspectStopAspectProperties> getMap() {
    return map;
  }
}
