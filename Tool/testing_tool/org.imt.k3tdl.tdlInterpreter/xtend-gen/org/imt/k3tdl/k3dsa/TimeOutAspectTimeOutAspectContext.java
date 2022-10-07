package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.TimeOut;

@SuppressWarnings("all")
public class TimeOutAspectTimeOutAspectContext {
  public static final TimeOutAspectTimeOutAspectContext INSTANCE = new TimeOutAspectTimeOutAspectContext();

  public static TimeOutAspectTimeOutAspectProperties getSelf(final TimeOut _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.TimeOutAspectTimeOutAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TimeOut, TimeOutAspectTimeOutAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.TimeOut, org.imt.k3tdl.k3dsa.TimeOutAspectTimeOutAspectProperties>();

  public Map<TimeOut, TimeOutAspectTimeOutAspectProperties> getMap() {
    return map;
  }
}
