package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.StringConstraint;

@SuppressWarnings("all")
public class StringConstraintAspectStringConstraintAspectContext {
  public static final StringConstraintAspectStringConstraintAspectContext INSTANCE = new StringConstraintAspectStringConstraintAspectContext();
  
  public static StringConstraintAspectStringConstraintAspectProperties getSelf(final StringConstraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.StringConstraintAspectStringConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringConstraint, StringConstraintAspectStringConstraintAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.StringConstraint, org.imt.pssm.reactive.interpreter.StringConstraintAspectStringConstraintAspectProperties>();
  
  public Map<StringConstraint, StringConstraintAspectStringConstraintAspectProperties> getMap() {
    return map;
  }
}
