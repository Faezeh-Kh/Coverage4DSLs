package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Superior;

@SuppressWarnings("all")
public class SuperiorAspectSuperiorAspectContext {
  public static final SuperiorAspectSuperiorAspectContext INSTANCE = new SuperiorAspectSuperiorAspectContext();
  
  public static SuperiorAspectSuperiorAspectProperties getSelf(final Superior _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.SuperiorAspectSuperiorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Superior, SuperiorAspectSuperiorAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Superior, org.imt.xminijava.interpreter.SuperiorAspectSuperiorAspectProperties>();
  
  public Map<Superior, SuperiorAspectSuperiorAspectProperties> getMap() {
    return map;
  }
}
