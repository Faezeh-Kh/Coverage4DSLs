package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.NewArray;

@SuppressWarnings("all")
public class NewArrayAspectNewArrayAspectContext {
  public static final NewArrayAspectNewArrayAspectContext INSTANCE = new NewArrayAspectNewArrayAspectContext();
  
  public static NewArrayAspectNewArrayAspectProperties getSelf(final NewArray _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.NewArrayAspectNewArrayAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NewArray, NewArrayAspectNewArrayAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.NewArray, org.imt.xminijava.interpreter.NewArrayAspectNewArrayAspectProperties>();
  
  public Map<NewArray, NewArrayAspectNewArrayAspectProperties> getMap() {
    return map;
  }
}
