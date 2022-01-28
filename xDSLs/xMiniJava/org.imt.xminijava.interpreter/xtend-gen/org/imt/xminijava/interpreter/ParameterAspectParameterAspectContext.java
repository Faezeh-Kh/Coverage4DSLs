package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Parameter;

@SuppressWarnings("all")
public class ParameterAspectParameterAspectContext {
  public static final ParameterAspectParameterAspectContext INSTANCE = new ParameterAspectParameterAspectContext();
  
  public static ParameterAspectParameterAspectProperties getSelf(final Parameter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ParameterAspectParameterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Parameter, ParameterAspectParameterAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Parameter, org.imt.xminijava.interpreter.ParameterAspectParameterAspectProperties>();
  
  public Map<Parameter, ParameterAspectParameterAspectProperties> getMap() {
    return map;
  }
}
