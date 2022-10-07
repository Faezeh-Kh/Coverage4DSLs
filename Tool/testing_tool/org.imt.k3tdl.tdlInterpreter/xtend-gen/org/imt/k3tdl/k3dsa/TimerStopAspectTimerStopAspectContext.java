package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.TimerStop;

@SuppressWarnings("all")
public class TimerStopAspectTimerStopAspectContext {
  public static final TimerStopAspectTimerStopAspectContext INSTANCE = new TimerStopAspectTimerStopAspectContext();

  public static TimerStopAspectTimerStopAspectProperties getSelf(final TimerStop _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.TimerStopAspectTimerStopAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TimerStop, TimerStopAspectTimerStopAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.TimerStop, org.imt.k3tdl.k3dsa.TimerStopAspectTimerStopAspectProperties>();

  public Map<TimerStop, TimerStopAspectTimerStopAspectProperties> getMap() {
    return map;
  }
}
