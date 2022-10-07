package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.StructuredDataInstance;

@SuppressWarnings("all")
public class StructuredDataInstanceAspectStructuredDataInstanceAspectContext {
  public static final StructuredDataInstanceAspectStructuredDataInstanceAspectContext INSTANCE = new StructuredDataInstanceAspectStructuredDataInstanceAspectContext();

  public static StructuredDataInstanceAspectStructuredDataInstanceAspectProperties getSelf(final StructuredDataInstance _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.StructuredDataInstanceAspectStructuredDataInstanceAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StructuredDataInstance, StructuredDataInstanceAspectStructuredDataInstanceAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.StructuredDataInstance, org.imt.k3tdl.k3dsa.StructuredDataInstanceAspectStructuredDataInstanceAspectProperties>();

  public Map<StructuredDataInstance, StructuredDataInstanceAspectStructuredDataInstanceAspectProperties> getMap() {
    return map;
  }
}
