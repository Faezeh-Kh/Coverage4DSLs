package pssm.semantics;

import java.util.Map;
import statemachines.StringComparisonExpression;

@SuppressWarnings("all")
public class StringComparisonExpressionAspectStringComparisonExpressionAspectContext {
  public static final StringComparisonExpressionAspectStringComparisonExpressionAspectContext INSTANCE = new StringComparisonExpressionAspectStringComparisonExpressionAspectContext();

  public static StringComparisonExpressionAspectStringComparisonExpressionAspectProperties getSelf(final StringComparisonExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.StringComparisonExpressionAspectStringComparisonExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StringComparisonExpression, StringComparisonExpressionAspectStringComparisonExpressionAspectProperties> map = new java.util.WeakHashMap<statemachines.StringComparisonExpression, pssm.semantics.StringComparisonExpressionAspectStringComparisonExpressionAspectProperties>();

  public Map<StringComparisonExpression, StringComparisonExpressionAspectStringComparisonExpressionAspectProperties> getMap() {
    return map;
  }
}
