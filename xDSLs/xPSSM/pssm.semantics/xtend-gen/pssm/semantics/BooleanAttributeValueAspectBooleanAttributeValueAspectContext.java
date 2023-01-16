package pssm.semantics;

import java.util.Map;
import statemachines.BooleanAttributeValue;

@SuppressWarnings("all")
public class BooleanAttributeValueAspectBooleanAttributeValueAspectContext {
  public static final BooleanAttributeValueAspectBooleanAttributeValueAspectContext INSTANCE = new BooleanAttributeValueAspectBooleanAttributeValueAspectContext();

  public static BooleanAttributeValueAspectBooleanAttributeValueAspectProperties getSelf(final BooleanAttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanAttributeValue, BooleanAttributeValueAspectBooleanAttributeValueAspectProperties> map = new java.util.WeakHashMap<statemachines.BooleanAttributeValue, pssm.semantics.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties>();

  public Map<BooleanAttributeValue, BooleanAttributeValueAspectBooleanAttributeValueAspectProperties> getMap() {
    return map;
  }
}
