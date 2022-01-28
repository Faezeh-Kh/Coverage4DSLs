package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue;

@SuppressWarnings("all")
public class IntegerAttributeValueAspectIntegerAttributeValueAspectContext {
  public static final IntegerAttributeValueAspectIntegerAttributeValueAspectContext INSTANCE = new IntegerAttributeValueAspectIntegerAttributeValueAspectContext();
  
  public static IntegerAttributeValueAspectIntegerAttributeValueAspectProperties getSelf(final IntegerAttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerAttributeValue, IntegerAttributeValueAspectIntegerAttributeValueAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue, org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties>();
  
  public Map<IntegerAttributeValue, IntegerAttributeValueAspectIntegerAttributeValueAspectProperties> getMap() {
    return map;
  }
}
