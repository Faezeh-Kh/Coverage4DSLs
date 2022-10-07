package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.SimpleDataInstance;

@SuppressWarnings("all")
public class SimpleDataInstanceAspectSimpleDataInstanceAspectContext {
  public static final SimpleDataInstanceAspectSimpleDataInstanceAspectContext INSTANCE = new SimpleDataInstanceAspectSimpleDataInstanceAspectContext();

  public static SimpleDataInstanceAspectSimpleDataInstanceAspectProperties getSelf(final SimpleDataInstance _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.SimpleDataInstanceAspectSimpleDataInstanceAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<SimpleDataInstance, SimpleDataInstanceAspectSimpleDataInstanceAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.SimpleDataInstance, org.imt.k3tdl.k3dsa.SimpleDataInstanceAspectSimpleDataInstanceAspectProperties>();

  public Map<SimpleDataInstance, SimpleDataInstanceAspectSimpleDataInstanceAspectProperties> getMap() {
    return map;
  }
}
