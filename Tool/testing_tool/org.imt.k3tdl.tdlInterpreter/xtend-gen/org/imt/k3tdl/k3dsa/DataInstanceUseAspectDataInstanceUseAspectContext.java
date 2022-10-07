package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.DataInstanceUse;

@SuppressWarnings("all")
public class DataInstanceUseAspectDataInstanceUseAspectContext {
  public static final DataInstanceUseAspectDataInstanceUseAspectContext INSTANCE = new DataInstanceUseAspectDataInstanceUseAspectContext();

  public static DataInstanceUseAspectDataInstanceUseAspectProperties getSelf(final DataInstanceUse _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DataInstanceUse, DataInstanceUseAspectDataInstanceUseAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.DataInstanceUse, org.imt.k3tdl.k3dsa.DataInstanceUseAspectDataInstanceUseAspectProperties>();

  public Map<DataInstanceUse, DataInstanceUseAspectDataInstanceUseAspectProperties> getMap() {
    return map;
  }
}
