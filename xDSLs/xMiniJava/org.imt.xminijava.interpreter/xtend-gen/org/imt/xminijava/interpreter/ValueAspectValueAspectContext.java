package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Value;

@SuppressWarnings("all")
public class ValueAspectValueAspectContext {
  public static final ValueAspectValueAspectContext INSTANCE = new ValueAspectValueAspectContext();
  
  public static ValueAspectValueAspectProperties getSelf(final Value _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ValueAspectValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Value, ValueAspectValueAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Value, org.imt.xminijava.interpreter.ValueAspectValueAspectProperties>();
  
  public Map<Value, ValueAspectValueAspectProperties> getMap() {
    return map;
  }
}
