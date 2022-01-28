package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Expression;

@SuppressWarnings("all")
public class ExpressionStatementAspectExpressionAspectContext {
  public static final ExpressionStatementAspectExpressionAspectContext INSTANCE = new ExpressionStatementAspectExpressionAspectContext();
  
  public static ExpressionStatementAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.ExpressionStatementAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression, ExpressionStatementAspectExpressionAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Expression, org.imt.xminijava.interpreter.ExpressionStatementAspectExpressionAspectProperties>();
  
  public Map<Expression, ExpressionStatementAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
