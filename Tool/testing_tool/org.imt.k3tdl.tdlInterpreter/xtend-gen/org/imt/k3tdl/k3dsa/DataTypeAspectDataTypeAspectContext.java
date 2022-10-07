package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.DataType;

@SuppressWarnings("all")
public class DataTypeAspectDataTypeAspectContext {
  public static final DataTypeAspectDataTypeAspectContext INSTANCE = new DataTypeAspectDataTypeAspectContext();

  public static DataTypeAspectDataTypeAspectProperties getSelf(final DataType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DataType, DataTypeAspectDataTypeAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.DataType, org.imt.k3tdl.k3dsa.DataTypeAspectDataTypeAspectProperties>();

  public Map<DataType, DataTypeAspectDataTypeAspectProperties> getMap() {
    return map;
  }
}
