package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.DataInstance;

@SuppressWarnings("all")
public class DataInstanceAspectDataInstanceAspectContext {
  public static final DataInstanceAspectDataInstanceAspectContext INSTANCE = new DataInstanceAspectDataInstanceAspectContext();

  public static DataInstanceAspectDataInstanceAspectProperties getSelf(final DataInstance _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DataInstance, DataInstanceAspectDataInstanceAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.DataInstance, org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectProperties>();

  public Map<DataInstance, DataInstanceAspectDataInstanceAspectProperties> getMap() {
    return map;
  }
}
