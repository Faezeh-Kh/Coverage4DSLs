package pssm.semantics;

import java.util.Map;
import statemachines.IntegerAttributeValue;

@SuppressWarnings("all")
public class IntegerAttributeValueAspectIntegerAttributeValueAspectContext {
  public static final IntegerAttributeValueAspectIntegerAttributeValueAspectContext INSTANCE = new IntegerAttributeValueAspectIntegerAttributeValueAspectContext();
  
  public static IntegerAttributeValueAspectIntegerAttributeValueAspectProperties getSelf(final IntegerAttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerAttributeValue, IntegerAttributeValueAspectIntegerAttributeValueAspectProperties> map = new java.util.WeakHashMap<statemachines.IntegerAttributeValue, pssm.semantics.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties>();
  
  public Map<IntegerAttributeValue, IntegerAttributeValueAspectIntegerAttributeValueAspectProperties> getMap() {
    return map;
  }
}
