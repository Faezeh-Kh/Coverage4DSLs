package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.ParameterBinding;

@SuppressWarnings("all")
public class ParameterBindingAspectParameterBindingAspectContext {
  public static final ParameterBindingAspectParameterBindingAspectContext INSTANCE = new ParameterBindingAspectParameterBindingAspectContext();

  public static ParameterBindingAspectParameterBindingAspectProperties getSelf(final ParameterBinding _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.ParameterBindingAspectParameterBindingAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ParameterBinding, ParameterBindingAspectParameterBindingAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.ParameterBinding, org.imt.k3tdl.k3dsa.ParameterBindingAspectParameterBindingAspectProperties>();

  public Map<ParameterBinding, ParameterBindingAspectParameterBindingAspectProperties> getMap() {
    return map;
  }
}
