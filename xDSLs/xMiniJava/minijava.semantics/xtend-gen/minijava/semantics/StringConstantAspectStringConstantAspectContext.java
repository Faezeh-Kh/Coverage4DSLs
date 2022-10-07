package minijava.semantics;

import java.util.Map;
import xminiJava.StringConstant;

@SuppressWarnings("all")
public class StringConstantAspectStringConstantAspectContext {
  public static final StringConstantAspectStringConstantAspectContext INSTANCE = new StringConstantAspectStringConstantAspectContext();

  public static StringConstantAspectStringConstantAspectProperties getSelf(final StringConstant _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.StringConstantAspectStringConstantAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StringConstant, StringConstantAspectStringConstantAspectProperties> map = new java.util.WeakHashMap<xminiJava.StringConstant, minijava.semantics.StringConstantAspectStringConstantAspectProperties>();

  public Map<StringConstant, StringConstantAspectStringConstantAspectProperties> getMap() {
    return map;
  }
}
