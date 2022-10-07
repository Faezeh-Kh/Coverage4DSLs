package minijava.semantics;

import java.util.Map;
import xminiJava.Parameter;

@SuppressWarnings("all")
public class ParameterAspectParameterAspectContext {
  public static final ParameterAspectParameterAspectContext INSTANCE = new ParameterAspectParameterAspectContext();

  public static ParameterAspectParameterAspectProperties getSelf(final Parameter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ParameterAspectParameterAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Parameter, ParameterAspectParameterAspectProperties> map = new java.util.WeakHashMap<xminiJava.Parameter, minijava.semantics.ParameterAspectParameterAspectProperties>();

  public Map<Parameter, ParameterAspectParameterAspectProperties> getMap() {
    return map;
  }
}
