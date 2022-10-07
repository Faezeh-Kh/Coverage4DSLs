package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.TimeLabel;

@SuppressWarnings("all")
public class TimeLabelAspectTimeLabelAspectContext {
  public static final TimeLabelAspectTimeLabelAspectContext INSTANCE = new TimeLabelAspectTimeLabelAspectContext();

  public static TimeLabelAspectTimeLabelAspectProperties getSelf(final TimeLabel _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.TimeLabelAspectTimeLabelAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TimeLabel, TimeLabelAspectTimeLabelAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.TimeLabel, org.imt.k3tdl.k3dsa.TimeLabelAspectTimeLabelAspectProperties>();

  public Map<TimeLabel, TimeLabelAspectTimeLabelAspectProperties> getMap() {
    return map;
  }
}
