package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.WhileStatement;

@SuppressWarnings("all")
public class WhileStatementAspectWhileStatementAspectContext {
  public static final WhileStatementAspectWhileStatementAspectContext INSTANCE = new WhileStatementAspectWhileStatementAspectContext();
  
  public static WhileStatementAspectWhileStatementAspectProperties getSelf(final WhileStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.WhileStatementAspectWhileStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<WhileStatement, WhileStatementAspectWhileStatementAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.WhileStatement, org.imt.xminijava.interpreter.WhileStatementAspectWhileStatementAspectProperties>();
  
  public Map<WhileStatement, WhileStatementAspectWhileStatementAspectProperties> getMap() {
    return map;
  }
}
