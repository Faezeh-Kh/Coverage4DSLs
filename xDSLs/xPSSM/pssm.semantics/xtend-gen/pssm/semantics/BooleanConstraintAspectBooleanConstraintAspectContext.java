package pssm.semantics;

import java.util.Map;
import statemachines.BooleanConstraint;

@SuppressWarnings("all")
public class BooleanConstraintAspectBooleanConstraintAspectContext {
  public static final BooleanConstraintAspectBooleanConstraintAspectContext INSTANCE = new BooleanConstraintAspectBooleanConstraintAspectContext();

  public static BooleanConstraintAspectBooleanConstraintAspectProperties getSelf(final BooleanConstraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.BooleanConstraintAspectBooleanConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanConstraint, BooleanConstraintAspectBooleanConstraintAspectProperties> map = new java.util.WeakHashMap<statemachines.BooleanConstraint, pssm.semantics.BooleanConstraintAspectBooleanConstraintAspectProperties>();

  public Map<BooleanConstraint, BooleanConstraintAspectBooleanConstraintAspectProperties> getMap() {
    return map;
  }
}
