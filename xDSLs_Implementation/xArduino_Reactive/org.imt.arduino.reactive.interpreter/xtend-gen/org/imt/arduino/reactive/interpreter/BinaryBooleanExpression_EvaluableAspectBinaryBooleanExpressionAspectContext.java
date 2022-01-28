package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.BinaryBooleanExpression;

@SuppressWarnings("all")
public class BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext {
  public static final BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext INSTANCE = new BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectContext();
  
  public static BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties getSelf(final BinaryBooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryBooleanExpression, BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.BinaryBooleanExpression, org.imt.arduino.reactive.interpreter.BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties>();
  
  public Map<BinaryBooleanExpression, BinaryBooleanExpression_EvaluableAspectBinaryBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}
