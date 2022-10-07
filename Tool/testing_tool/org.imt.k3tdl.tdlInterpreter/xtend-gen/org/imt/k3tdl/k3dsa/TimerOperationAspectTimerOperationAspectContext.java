package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.TimerOperation;

@SuppressWarnings("all")
public class TimerOperationAspectTimerOperationAspectContext {
  public static final TimerOperationAspectTimerOperationAspectContext INSTANCE = new TimerOperationAspectTimerOperationAspectContext();

  public static TimerOperationAspectTimerOperationAspectProperties getSelf(final TimerOperation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.TimerOperationAspectTimerOperationAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TimerOperation, TimerOperationAspectTimerOperationAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.TimerOperation, org.imt.k3tdl.k3dsa.TimerOperationAspectTimerOperationAspectProperties>();

  public Map<TimerOperation, TimerOperationAspectTimerOperationAspectProperties> getMap() {
    return map;
  }
}
