package arduino.semantics;

import arduino.BinaryIntegerExpression;
import java.util.Map;

@SuppressWarnings("all")
public class BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext {
  public static final BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext INSTANCE = new BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext();

  public static BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties getSelf(final BinaryIntegerExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BinaryIntegerExpression, BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties> map = new java.util.WeakHashMap<arduino.BinaryIntegerExpression, arduino.semantics.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties>();

  public Map<BinaryIntegerExpression, BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties> getMap() {
    return map;
  }
}
