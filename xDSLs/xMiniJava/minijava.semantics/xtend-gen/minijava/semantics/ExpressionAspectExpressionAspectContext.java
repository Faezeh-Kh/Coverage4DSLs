package minijava.semantics;

import java.util.Map;
import xminiJava.Expression;

@SuppressWarnings("all")
public class ExpressionAspectExpressionAspectContext {
  public static final ExpressionAspectExpressionAspectContext INSTANCE = new ExpressionAspectExpressionAspectContext();

  public static ExpressionAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ExpressionAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Expression, ExpressionAspectExpressionAspectProperties> map = new java.util.WeakHashMap<xminiJava.Expression, minijava.semantics.ExpressionAspectExpressionAspectProperties>();

  public Map<Expression, ExpressionAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
