package arduino.semantics;

import arduino.Expression;
import java.util.Map;

@SuppressWarnings("all")
public class Expression_EvaluableAspectExpressionAspectContext {
  public static final Expression_EvaluableAspectExpressionAspectContext INSTANCE = new Expression_EvaluableAspectExpressionAspectContext();

  public static Expression_EvaluableAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Expression_EvaluableAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Expression, Expression_EvaluableAspectExpressionAspectProperties> map = new java.util.WeakHashMap<arduino.Expression, arduino.semantics.Expression_EvaluableAspectExpressionAspectProperties>();

  public Map<Expression, Expression_EvaluableAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
