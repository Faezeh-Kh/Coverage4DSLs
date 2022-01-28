package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.MethodCall;

@SuppressWarnings("all")
public class MethodCallExpressionAspectMethodCallAspectContext {
  public static final MethodCallExpressionAspectMethodCallAspectContext INSTANCE = new MethodCallExpressionAspectMethodCallAspectContext();
  
  public static MethodCallExpressionAspectMethodCallAspectProperties getSelf(final MethodCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.MethodCallExpressionAspectMethodCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MethodCall, MethodCallExpressionAspectMethodCallAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.MethodCall, org.imt.xminijava.interpreter.MethodCallExpressionAspectMethodCallAspectProperties>();
  
  public Map<MethodCall, MethodCallExpressionAspectMethodCallAspectProperties> getMap() {
    return map;
  }
}
