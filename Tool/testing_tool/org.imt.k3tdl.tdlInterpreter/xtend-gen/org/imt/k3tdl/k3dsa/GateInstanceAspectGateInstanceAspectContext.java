package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.GateInstance;

@SuppressWarnings("all")
public class GateInstanceAspectGateInstanceAspectContext {
  public static final GateInstanceAspectGateInstanceAspectContext INSTANCE = new GateInstanceAspectGateInstanceAspectContext();

  public static GateInstanceAspectGateInstanceAspectProperties getSelf(final GateInstance _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<GateInstance, GateInstanceAspectGateInstanceAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.GateInstance, org.imt.k3tdl.k3dsa.GateInstanceAspectGateInstanceAspectProperties>();

  public Map<GateInstance, GateInstanceAspectGateInstanceAspectProperties> getMap() {
    return map;
  }
}
