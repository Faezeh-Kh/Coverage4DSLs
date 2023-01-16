package pssm.semantics;

import java.util.Map;
import statemachines.StringAttributeValue;

@SuppressWarnings("all")
public class StringAttributeValueAspectStringAttributeValueAspectContext {
  public static final StringAttributeValueAspectStringAttributeValueAspectContext INSTANCE = new StringAttributeValueAspectStringAttributeValueAspectContext();

  public static StringAttributeValueAspectStringAttributeValueAspectProperties getSelf(final StringAttributeValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.StringAttributeValueAspectStringAttributeValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StringAttributeValue, StringAttributeValueAspectStringAttributeValueAspectProperties> map = new java.util.WeakHashMap<statemachines.StringAttributeValue, pssm.semantics.StringAttributeValueAspectStringAttributeValueAspectProperties>();

  public Map<StringAttributeValue, StringAttributeValueAspectStringAttributeValueAspectProperties> getMap() {
    return map;
  }
}
