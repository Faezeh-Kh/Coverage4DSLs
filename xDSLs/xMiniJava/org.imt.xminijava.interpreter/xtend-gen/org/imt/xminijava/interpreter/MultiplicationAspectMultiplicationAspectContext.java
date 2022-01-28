package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Multiplication;

@SuppressWarnings("all")
public class MultiplicationAspectMultiplicationAspectContext {
  public static final MultiplicationAspectMultiplicationAspectContext INSTANCE = new MultiplicationAspectMultiplicationAspectContext();
  
  public static MultiplicationAspectMultiplicationAspectProperties getSelf(final Multiplication _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.MultiplicationAspectMultiplicationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Multiplication, MultiplicationAspectMultiplicationAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Multiplication, org.imt.xminijava.interpreter.MultiplicationAspectMultiplicationAspectProperties>();
  
  public Map<Multiplication, MultiplicationAspectMultiplicationAspectProperties> getMap() {
    return map;
  }
}
