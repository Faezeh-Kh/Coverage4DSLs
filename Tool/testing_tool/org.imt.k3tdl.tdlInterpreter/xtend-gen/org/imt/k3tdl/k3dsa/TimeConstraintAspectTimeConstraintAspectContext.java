package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.TimeConstraint;

@SuppressWarnings("all")
public class TimeConstraintAspectTimeConstraintAspectContext {
  public static final TimeConstraintAspectTimeConstraintAspectContext INSTANCE = new TimeConstraintAspectTimeConstraintAspectContext();

  public static TimeConstraintAspectTimeConstraintAspectProperties getSelf(final TimeConstraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.TimeConstraintAspectTimeConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TimeConstraint, TimeConstraintAspectTimeConstraintAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.TimeConstraint, org.imt.k3tdl.k3dsa.TimeConstraintAspectTimeConstraintAspectProperties>();

  public Map<TimeConstraint, TimeConstraintAspectTimeConstraintAspectProperties> getMap() {
    return map;
  }
}
