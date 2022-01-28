package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.StringComparisonExpression;

@SuppressWarnings("all")
public class StringComparisonExpressionAspectStringComparisonExpressionAspectContext {
  public static final StringComparisonExpressionAspectStringComparisonExpressionAspectContext INSTANCE = new StringComparisonExpressionAspectStringComparisonExpressionAspectContext();
  
  public static StringComparisonExpressionAspectStringComparisonExpressionAspectProperties getSelf(final StringComparisonExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.StringComparisonExpressionAspectStringComparisonExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringComparisonExpression, StringComparisonExpressionAspectStringComparisonExpressionAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.StringComparisonExpression, org.imt.pssm.reactive.interpreter.StringComparisonExpressionAspectStringComparisonExpressionAspectProperties>();
  
  public Map<StringComparisonExpression, StringComparisonExpressionAspectStringComparisonExpressionAspectProperties> getMap() {
    return map;
  }
}
