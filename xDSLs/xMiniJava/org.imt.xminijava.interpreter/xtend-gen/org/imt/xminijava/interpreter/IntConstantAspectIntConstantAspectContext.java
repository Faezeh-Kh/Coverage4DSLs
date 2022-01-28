package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.IntConstant;

@SuppressWarnings("all")
public class IntConstantAspectIntConstantAspectContext {
  public static final IntConstantAspectIntConstantAspectContext INSTANCE = new IntConstantAspectIntConstantAspectContext();
  
  public static IntConstantAspectIntConstantAspectProperties getSelf(final IntConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.IntConstantAspectIntConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntConstant, IntConstantAspectIntConstantAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.IntConstant, org.imt.xminijava.interpreter.IntConstantAspectIntConstantAspectProperties>();
  
  public Map<IntConstant, IntConstantAspectIntConstantAspectProperties> getMap() {
    return map;
  }
}
