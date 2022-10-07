package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Timer;

@SuppressWarnings("all")
public class TimerAspectTimerAspectContext {
  public static final TimerAspectTimerAspectContext INSTANCE = new TimerAspectTimerAspectContext();

  public static TimerAspectTimerAspectProperties getSelf(final Timer _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.TimerAspectTimerAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Timer, TimerAspectTimerAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Timer, org.imt.k3tdl.k3dsa.TimerAspectTimerAspectProperties>();

  public Map<Timer, TimerAspectTimerAspectProperties> getMap() {
    return map;
  }
}
