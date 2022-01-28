package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.NullValue;

@SuppressWarnings("all")
public class NullValueAspectNullValueAspectContext {
  public static final NullValueAspectNullValueAspectContext INSTANCE = new NullValueAspectNullValueAspectContext();
  
  public static NullValueAspectNullValueAspectProperties getSelf(final NullValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.NullValueAspectNullValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NullValue, NullValueAspectNullValueAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.NullValue, org.imt.xminijava.interpreter.NullValueAspectNullValueAspectProperties>();
  
  public Map<NullValue, NullValueAspectNullValueAspectProperties> getMap() {
    return map;
  }
}
