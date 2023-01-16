package pssm.semantics;

import java.util.Map;
import statemachines.StringConstraint;

@SuppressWarnings("all")
public class StringConstraintAspectStringConstraintAspectContext {
  public static final StringConstraintAspectStringConstraintAspectContext INSTANCE = new StringConstraintAspectStringConstraintAspectContext();

  public static StringConstraintAspectStringConstraintAspectProperties getSelf(final StringConstraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new pssm.semantics.StringConstraintAspectStringConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StringConstraint, StringConstraintAspectStringConstraintAspectProperties> map = new java.util.WeakHashMap<statemachines.StringConstraint, pssm.semantics.StringConstraintAspectStringConstraintAspectProperties>();

  public Map<StringConstraint, StringConstraintAspectStringConstraintAspectProperties> getMap() {
    return map;
  }
}
