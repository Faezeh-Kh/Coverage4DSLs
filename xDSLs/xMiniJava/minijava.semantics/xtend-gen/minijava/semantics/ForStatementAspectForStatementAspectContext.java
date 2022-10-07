package minijava.semantics;

import java.util.Map;
import xminiJava.ForStatement;

@SuppressWarnings("all")
public class ForStatementAspectForStatementAspectContext {
  public static final ForStatementAspectForStatementAspectContext INSTANCE = new ForStatementAspectForStatementAspectContext();

  public static ForStatementAspectForStatementAspectProperties getSelf(final ForStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ForStatementAspectForStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ForStatement, ForStatementAspectForStatementAspectProperties> map = new java.util.WeakHashMap<xminiJava.ForStatement, minijava.semantics.ForStatementAspectForStatementAspectProperties>();

  public Map<ForStatement, ForStatementAspectForStatementAspectProperties> getMap() {
    return map;
  }
}
