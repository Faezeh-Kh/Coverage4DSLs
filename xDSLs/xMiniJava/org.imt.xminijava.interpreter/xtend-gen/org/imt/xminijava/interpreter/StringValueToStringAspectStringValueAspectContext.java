package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.StringValue;

@SuppressWarnings("all")
public class StringValueToStringAspectStringValueAspectContext {
  public static final StringValueToStringAspectStringValueAspectContext INSTANCE = new StringValueToStringAspectStringValueAspectContext();
  
  public static StringValueToStringAspectStringValueAspectProperties getSelf(final StringValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.StringValueToStringAspectStringValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringValue, StringValueToStringAspectStringValueAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.StringValue, org.imt.xminijava.interpreter.StringValueToStringAspectStringValueAspectProperties>();
  
  public Map<StringValue, StringValueToStringAspectStringValueAspectProperties> getMap() {
    return map;
  }
}
