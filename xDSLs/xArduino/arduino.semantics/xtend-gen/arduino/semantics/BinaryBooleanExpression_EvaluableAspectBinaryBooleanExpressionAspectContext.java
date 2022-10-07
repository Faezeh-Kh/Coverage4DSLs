package arduino.semantics;

import arduino.BinaryBooleanExpression;
import java.util.Map;

@SuppressWarnings("all")
public class BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext {
  public static final BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext INSTANCE = new BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext();

  public static BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties getSelf(final BinaryBooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BinaryBooleanExpression, BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<arduino.BinaryBooleanExpression, arduino.semantics.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties>();

  public Map<BinaryBooleanExpression, BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}
