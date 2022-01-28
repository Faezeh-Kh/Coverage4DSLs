package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Value;

@SuppressWarnings("all")
public class ValueToStringAspectValueAspectContext {
  public static final ValueToStringAspectValueAspectContext INSTANCE = new ValueToStringAspectValueAspectContext();
  
  public static ValueToStringAspectValueAspectProperties getSelf(final Value _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ValueToStringAspectValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Value, ValueToStringAspectValueAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Value, org.imt.xminijava.interpreter.ValueToStringAspectValueAspectProperties>();
  
  public Map<Value, ValueToStringAspectValueAspectProperties> getMap() {
    return map;
  }
}
