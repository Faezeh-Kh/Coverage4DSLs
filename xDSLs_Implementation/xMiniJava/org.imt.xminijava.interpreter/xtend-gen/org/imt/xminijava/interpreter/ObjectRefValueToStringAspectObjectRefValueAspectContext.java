package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.ObjectRefValue;

@SuppressWarnings("all")
public class ObjectRefValueToStringAspectObjectRefValueAspectContext {
  public static final ObjectRefValueToStringAspectObjectRefValueAspectContext INSTANCE = new ObjectRefValueToStringAspectObjectRefValueAspectContext();
  
  public static ObjectRefValueToStringAspectObjectRefValueAspectProperties getSelf(final ObjectRefValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ObjectRefValueToStringAspectObjectRefValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ObjectRefValue, ObjectRefValueToStringAspectObjectRefValueAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.ObjectRefValue, org.imt.xminijava.interpreter.ObjectRefValueToStringAspectObjectRefValueAspectProperties>();
  
  public Map<ObjectRefValue, ObjectRefValueToStringAspectObjectRefValueAspectProperties> getMap() {
    return map;
  }
}
