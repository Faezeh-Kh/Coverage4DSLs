package minijava.semantics;

import java.util.Map;
import xminiJava.Statement;

@SuppressWarnings("all")
public class StatementAspectStatementAspectContext {
  public static final StatementAspectStatementAspectContext INSTANCE = new StatementAspectStatementAspectContext();

  public static StatementAspectStatementAspectProperties getSelf(final Statement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.StatementAspectStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Statement, StatementAspectStatementAspectProperties> map = new java.util.WeakHashMap<xminiJava.Statement, minijava.semantics.StatementAspectStatementAspectProperties>();

  public Map<Statement, StatementAspectStatementAspectProperties> getMap() {
    return map;
  }
}
