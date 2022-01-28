package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.StringConstant;

@SuppressWarnings("all")
public class StringConstantAspectStringConstantAspectContext {
  public static final StringConstantAspectStringConstantAspectContext INSTANCE = new StringConstantAspectStringConstantAspectContext();
  
  public static StringConstantAspectStringConstantAspectProperties getSelf(final StringConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.StringConstantAspectStringConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringConstant, StringConstantAspectStringConstantAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.StringConstant, org.imt.xminijava.interpreter.StringConstantAspectStringConstantAspectProperties>();
  
  public Map<StringConstant, StringConstantAspectStringConstantAspectProperties> getMap() {
    return map;
  }
}
