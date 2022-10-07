package pssm.semantics;

import java.util.Map;
import statemachines.IntegerConstraint;

@SuppressWarnings("all")
public class IntegerConstraintAspectIntegerConstraintAspectContext {
  public static final IntegerConstraintAspectIntegerConstraintAspectContext INSTANCE = new IntegerConstraintAspectIntegerConstraintAspectContext();
  
  public static IntegerConstraintAspectIntegerConstraintAspectProperties getSelf(final IntegerConstraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.IntegerConstraintAspectIntegerConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerConstraint, IntegerConstraintAspectIntegerConstraintAspectProperties> map = new java.util.WeakHashMap<statemachines.IntegerConstraint, pssm.semantics.IntegerConstraintAspectIntegerConstraintAspectProperties>();
  
  public Map<IntegerConstraint, IntegerConstraintAspectIntegerConstraintAspectProperties> getMap() {
    return map;
  }
}
