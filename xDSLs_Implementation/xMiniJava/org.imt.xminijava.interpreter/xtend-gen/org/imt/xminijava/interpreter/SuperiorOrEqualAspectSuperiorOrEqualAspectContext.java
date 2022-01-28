package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.SuperiorOrEqual;

@SuppressWarnings("all")
public class SuperiorOrEqualAspectSuperiorOrEqualAspectContext {
  public static final SuperiorOrEqualAspectSuperiorOrEqualAspectContext INSTANCE = new SuperiorOrEqualAspectSuperiorOrEqualAspectContext();
  
  public static SuperiorOrEqualAspectSuperiorOrEqualAspectProperties getSelf(final SuperiorOrEqual _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.SuperiorOrEqualAspectSuperiorOrEqualAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SuperiorOrEqual, SuperiorOrEqualAspectSuperiorOrEqualAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.SuperiorOrEqual, org.imt.xminijava.interpreter.SuperiorOrEqualAspectSuperiorOrEqualAspectProperties>();
  
  public Map<SuperiorOrEqual, SuperiorOrEqualAspectSuperiorOrEqualAspectProperties> getMap() {
    return map;
  }
}
