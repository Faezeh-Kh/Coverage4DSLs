package pssm.semantics;

import java.util.Map;
import statemachines.AttributeValue;

@SuppressWarnings("all")
public class AttributeValueAspectAttributeValueAspectContext {
  public static final AttributeValueAspectAttributeValueAspectContext INSTANCE = new AttributeValueAspectAttributeValueAspectContext();

  public static AttributeValueAspectAttributeValueAspectProperties getSelf(final AttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.AttributeValueAspectAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<AttributeValue, AttributeValueAspectAttributeValueAspectProperties> map = new java.util.WeakHashMap<statemachines.AttributeValue, pssm.semantics.AttributeValueAspectAttributeValueAspectProperties>();

  public Map<AttributeValue, AttributeValueAspectAttributeValueAspectProperties> getMap() {
    return map;
  }
}
