package minijava.semantics;

import java.util.Map;
import xminiJava.MethodCall;

@SuppressWarnings("all")
public class MethodCallExpressionAspectMethodCallAspectContext {
  public static final MethodCallExpressionAspectMethodCallAspectContext INSTANCE = new MethodCallExpressionAspectMethodCallAspectContext();

  public static MethodCallExpressionAspectMethodCallAspectProperties getSelf(final MethodCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.MethodCallExpressionAspectMethodCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<MethodCall, MethodCallExpressionAspectMethodCallAspectProperties> map = new java.util.WeakHashMap<xminiJava.MethodCall, minijava.semantics.MethodCallExpressionAspectMethodCallAspectProperties>();

  public Map<MethodCall, MethodCallExpressionAspectMethodCallAspectProperties> getMap() {
    return map;
  }
}
