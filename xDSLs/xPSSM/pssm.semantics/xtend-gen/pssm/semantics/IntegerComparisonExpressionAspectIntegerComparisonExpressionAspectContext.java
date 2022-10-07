package pssm.semantics;

import java.util.Map;
import statemachines.IntegerComparisonExpression;

@SuppressWarnings("all")
public class IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext {
  public static final IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext INSTANCE = new IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectContext();
  
  public static IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties getSelf(final IntegerComparisonExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerComparisonExpression, IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties> map = new java.util.WeakHashMap<statemachines.IntegerComparisonExpression, pssm.semantics.IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties>();
  
  public Map<IntegerComparisonExpression, IntegerComparisonExpressionAspectIntegerComparisonExpressionAspectProperties> getMap() {
    return map;
  }
}
