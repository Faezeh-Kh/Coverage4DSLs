package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.LocalExpression;

@SuppressWarnings("all")
public class ExpressionAspectLocalExpressionAspectContext {
  public static final ExpressionAspectLocalExpressionAspectContext INSTANCE = new ExpressionAspectLocalExpressionAspectContext();

  public static ExpressionAspectLocalExpressionAspectProperties getSelf(final LocalExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.ExpressionAspectLocalExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<LocalExpression, ExpressionAspectLocalExpressionAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.LocalExpression, org.imt.k3tdl.k3dsa.ExpressionAspectLocalExpressionAspectProperties>();

  public Map<LocalExpression, ExpressionAspectLocalExpressionAspectProperties> getMap() {
    return map;
  }
}
