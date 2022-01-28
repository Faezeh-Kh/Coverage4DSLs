package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Statement;

@SuppressWarnings("all")
public class StatementAspectStatementAspectContext {
  public static final StatementAspectStatementAspectContext INSTANCE = new StatementAspectStatementAspectContext();
  
  public static StatementAspectStatementAspectProperties getSelf(final Statement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.StatementAspectStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement, StatementAspectStatementAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Statement, org.imt.xminijava.interpreter.StatementAspectStatementAspectProperties>();
  
  public Map<Statement, StatementAspectStatementAspectProperties> getMap() {
    return map;
  }
}
