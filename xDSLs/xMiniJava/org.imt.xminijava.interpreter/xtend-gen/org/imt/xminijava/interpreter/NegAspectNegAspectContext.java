package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Neg;

@SuppressWarnings("all")
public class NegAspectNegAspectContext {
  public static final NegAspectNegAspectContext INSTANCE = new NegAspectNegAspectContext();
  
  public static NegAspectNegAspectProperties getSelf(final Neg _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.NegAspectNegAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Neg, NegAspectNegAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Neg, org.imt.xminijava.interpreter.NegAspectNegAspectProperties>();
  
  public Map<Neg, NegAspectNegAspectProperties> getMap() {
    return map;
  }
}
