package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.TimeOperation;

@SuppressWarnings("all")
public class TimeOperationAspectTimeOperationAspectContext {
  public static final TimeOperationAspectTimeOperationAspectContext INSTANCE = new TimeOperationAspectTimeOperationAspectContext();

  public static TimeOperationAspectTimeOperationAspectProperties getSelf(final TimeOperation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.TimeOperationAspectTimeOperationAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TimeOperation, TimeOperationAspectTimeOperationAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.TimeOperation, org.imt.k3tdl.k3dsa.TimeOperationAspectTimeOperationAspectProperties>();

  public Map<TimeOperation, TimeOperationAspectTimeOperationAspectProperties> getMap() {
    return map;
  }
}
