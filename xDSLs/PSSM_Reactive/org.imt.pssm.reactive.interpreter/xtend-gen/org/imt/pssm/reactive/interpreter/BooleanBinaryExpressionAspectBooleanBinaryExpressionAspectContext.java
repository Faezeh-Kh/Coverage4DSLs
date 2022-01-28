package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.BooleanBinaryExpression;

@SuppressWarnings("all")
public class BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext {
  public static final BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext INSTANCE = new BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext();
  
  public static BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties getSelf(final BooleanBinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanBinaryExpression, BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.BooleanBinaryExpression, org.imt.pssm.reactive.interpreter.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties>();
  
  public Map<BooleanBinaryExpression, BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}
