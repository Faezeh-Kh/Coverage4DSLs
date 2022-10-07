package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Wait;

@SuppressWarnings("all")
public class WaitAspectWaitAspectContext {
  public static final WaitAspectWaitAspectContext INSTANCE = new WaitAspectWaitAspectContext();

  public static WaitAspectWaitAspectProperties getSelf(final Wait _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.WaitAspectWaitAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Wait, WaitAspectWaitAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Wait, org.imt.k3tdl.k3dsa.WaitAspectWaitAspectProperties>();

  public Map<Wait, WaitAspectWaitAspectProperties> getMap() {
    return map;
  }
}
