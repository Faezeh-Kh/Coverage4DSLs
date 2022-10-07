package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.TimerStart;

@SuppressWarnings("all")
public class TimerStartAspectTimerStartAspectContext {
  public static final TimerStartAspectTimerStartAspectContext INSTANCE = new TimerStartAspectTimerStartAspectContext();

  public static TimerStartAspectTimerStartAspectProperties getSelf(final TimerStart _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.TimerStartAspectTimerStartAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TimerStart, TimerStartAspectTimerStartAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.TimerStart, org.imt.k3tdl.k3dsa.TimerStartAspectTimerStartAspectProperties>();

  public Map<TimerStart, TimerStartAspectTimerStartAspectProperties> getMap() {
    return map;
  }
}
