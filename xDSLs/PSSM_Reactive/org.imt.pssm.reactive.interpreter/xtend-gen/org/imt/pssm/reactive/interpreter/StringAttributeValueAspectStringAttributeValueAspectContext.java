package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.StringAttributeValue;

@SuppressWarnings("all")
public class StringAttributeValueAspectStringAttributeValueAspectContext {
  public static final StringAttributeValueAspectStringAttributeValueAspectContext INSTANCE = new StringAttributeValueAspectStringAttributeValueAspectContext();
  
  public static StringAttributeValueAspectStringAttributeValueAspectProperties getSelf(final StringAttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.StringAttributeValueAspectStringAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringAttributeValue, StringAttributeValueAspectStringAttributeValueAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.StringAttributeValue, org.imt.pssm.reactive.interpreter.StringAttributeValueAspectStringAttributeValueAspectProperties>();
  
  public Map<StringAttributeValue, StringAttributeValueAspectStringAttributeValueAspectProperties> getMap() {
    return map;
  }
}
