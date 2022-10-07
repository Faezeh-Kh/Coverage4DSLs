package minijava.semantics;

import java.util.Map;
import xminiJava.IfStatement;

@SuppressWarnings("all")
public class IfStatementAspectIfStatementAspectContext {
  public static final IfStatementAspectIfStatementAspectContext INSTANCE = new IfStatementAspectIfStatementAspectContext();

  public static IfStatementAspectIfStatementAspectProperties getSelf(final IfStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.IfStatementAspectIfStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IfStatement, IfStatementAspectIfStatementAspectProperties> map = new java.util.WeakHashMap<xminiJava.IfStatement, minijava.semantics.IfStatementAspectIfStatementAspectProperties>();

  public Map<IfStatement, IfStatementAspectIfStatementAspectProperties> getMap() {
    return map;
  }
}
