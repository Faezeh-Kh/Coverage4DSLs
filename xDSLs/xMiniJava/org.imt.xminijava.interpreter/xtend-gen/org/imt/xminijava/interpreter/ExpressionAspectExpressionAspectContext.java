package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Expression;

@SuppressWarnings("all")
public class ExpressionAspectExpressionAspectContext {
  public static final ExpressionAspectExpressionAspectContext INSTANCE = new ExpressionAspectExpressionAspectContext();
  
  public static ExpressionAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression, ExpressionAspectExpressionAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Expression, org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties>();
  
  public Map<Expression, ExpressionAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
