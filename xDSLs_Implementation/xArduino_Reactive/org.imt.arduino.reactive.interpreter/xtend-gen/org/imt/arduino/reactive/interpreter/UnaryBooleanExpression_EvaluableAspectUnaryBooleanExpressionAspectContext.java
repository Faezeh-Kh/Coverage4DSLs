package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.UnaryBooleanExpression;

@SuppressWarnings("all")
public class UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectContext {
  public static final UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectContext INSTANCE = new UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectContext();
  
  public static UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties getSelf(final UnaryBooleanExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<UnaryBooleanExpression, UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.UnaryBooleanExpression, org.imt.arduino.reactive.interpreter.UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties>();
  
  public Map<UnaryBooleanExpression, UnaryBooleanExpression_EvaluableAspectUnaryBooleanExpressionAspectProperties> getMap() {
    return map;
  }
}
