package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue;

@SuppressWarnings("all")
public class BooleanAttributeValueAspectBooleanAttributeValueAspectContext {
  public static final BooleanAttributeValueAspectBooleanAttributeValueAspectContext INSTANCE = new BooleanAttributeValueAspectBooleanAttributeValueAspectContext();
  
  public static BooleanAttributeValueAspectBooleanAttributeValueAspectProperties getSelf(final BooleanAttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanAttributeValue, BooleanAttributeValueAspectBooleanAttributeValueAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue, org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties>();
  
  public Map<BooleanAttributeValue, BooleanAttributeValueAspectBooleanAttributeValueAspectProperties> getMap() {
    return map;
  }
}
