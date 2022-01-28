package org.imt.pssm.reactive.interpreter;

import java.util.Map;
import org.imt.pssm.reactive.model.statemachines.BooleanConstraint;

@SuppressWarnings("all")
public class BooleanConstraintAspectBooleanConstraintAspectContext {
  public static final BooleanConstraintAspectBooleanConstraintAspectContext INSTANCE = new BooleanConstraintAspectBooleanConstraintAspectContext();
  
  public static BooleanConstraintAspectBooleanConstraintAspectProperties getSelf(final BooleanConstraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.pssm.reactive.interpreter.BooleanConstraintAspectBooleanConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanConstraint, BooleanConstraintAspectBooleanConstraintAspectProperties> map = new java.util.WeakHashMap<org.imt.pssm.reactive.model.statemachines.BooleanConstraint, org.imt.pssm.reactive.interpreter.BooleanConstraintAspectBooleanConstraintAspectProperties>();
  
  public Map<BooleanConstraint, BooleanConstraintAspectBooleanConstraintAspectProperties> getMap() {
    return map;
  }
}
