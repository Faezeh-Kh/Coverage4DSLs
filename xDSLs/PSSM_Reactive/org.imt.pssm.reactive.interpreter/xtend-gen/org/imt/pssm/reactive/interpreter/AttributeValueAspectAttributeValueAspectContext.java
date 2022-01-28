package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.AttributeValue;

@SuppressWarnings("all")
public class AttributeValueAspectAttributeValueAspectContext {
  public static final AttributeValueAspectAttributeValueAspectContext INSTANCE = new AttributeValueAspectAttributeValueAspectContext();
  
  public static AttributeValueAspectAttributeValueAspectProperties getSelf(final AttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.AttributeValueAspectAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AttributeValue, AttributeValueAspectAttributeValueAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.AttributeValue, org.imt.pssm.reactive.interpreter.AttributeValueAspectAttributeValueAspectProperties>();
  
  public Map<AttributeValue, AttributeValueAspectAttributeValueAspectProperties> getMap() {
    return map;
  }
}
