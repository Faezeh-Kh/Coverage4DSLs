package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.BoolConstant;

@SuppressWarnings("all")
public class BoolConstantAspectBoolConstantAspectContext {
  public static final BoolConstantAspectBoolConstantAspectContext INSTANCE = new BoolConstantAspectBoolConstantAspectContext();
  
  public static BoolConstantAspectBoolConstantAspectProperties getSelf(final BoolConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.BoolConstantAspectBoolConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BoolConstant, BoolConstantAspectBoolConstantAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.BoolConstant, org.imt.xminijava.interpreter.BoolConstantAspectBoolConstantAspectProperties>();
  
  public Map<BoolConstant, BoolConstantAspectBoolConstantAspectProperties> getMap() {
    return map;
  }
}
