package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.BinaryIntegerExpression;

@SuppressWarnings("all")
public class BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext {
  public static final BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext INSTANCE = new BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectContext();
  
  public static BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties getSelf(final BinaryIntegerExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryIntegerExpression, BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.BinaryIntegerExpression, org.imt.arduino.reactive.interpreter.BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties>();
  
  public Map<BinaryIntegerExpression, BinaryIntegerExpression_EvaluableAspectBinaryIntegerExpressionAspectProperties> getMap() {
    return map;
  }
}
