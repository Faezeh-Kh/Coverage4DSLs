package minijava.semantics;

import java.util.Map;
import xminiJava.Expression;

@SuppressWarnings("all")
public class ExpressionStatementAspectExpressionAspectContext {
  public static final ExpressionStatementAspectExpressionAspectContext INSTANCE = new ExpressionStatementAspectExpressionAspectContext();

  public static ExpressionStatementAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ExpressionStatementAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Expression, ExpressionStatementAspectExpressionAspectProperties> map = new java.util.WeakHashMap<xminiJava.Expression, minijava.semantics.ExpressionStatementAspectExpressionAspectProperties>();

  public Map<Expression, ExpressionStatementAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
