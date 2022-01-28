package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.IntegerConstraint;

@SuppressWarnings("all")
public class IntegerConstraintAspectIntegerConstraintAspectContext {
  public static final IntegerConstraintAspectIntegerConstraintAspectContext INSTANCE = new IntegerConstraintAspectIntegerConstraintAspectContext();
  
  public static IntegerConstraintAspectIntegerConstraintAspectProperties getSelf(final IntegerConstraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.IntegerConstraintAspectIntegerConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerConstraint, IntegerConstraintAspectIntegerConstraintAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.IntegerConstraint, org.imt.pssm.reactive.interpreter.IntegerConstraintAspectIntegerConstraintAspectProperties>();
  
  public Map<IntegerConstraint, IntegerConstraintAspectIntegerConstraintAspectProperties> getMap() {
    return map;
  }
}
