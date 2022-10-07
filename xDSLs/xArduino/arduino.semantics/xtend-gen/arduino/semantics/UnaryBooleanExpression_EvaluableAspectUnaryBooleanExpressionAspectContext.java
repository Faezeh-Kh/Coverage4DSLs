package arduino.semantics;

import arduino.UnaryBooleanExpression;
import java.util.Map;

@SuppressWarnings("all")
public class UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectContext {
  public static final UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectContext INSTANCE = new UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectContext();

  public static UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties getSelf(final UnaryBooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<UnaryBooleanExpression, UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<arduino.UnaryBooleanExpression, arduino.semantics.UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties>();

  public Map<UnaryBooleanExpression, UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}
