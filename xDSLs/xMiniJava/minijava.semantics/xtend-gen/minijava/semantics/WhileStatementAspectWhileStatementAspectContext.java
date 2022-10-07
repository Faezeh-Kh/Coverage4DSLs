package minijava.semantics;

import java.util.Map;
import xminiJava.WhileStatement;

@SuppressWarnings("all")
public class WhileStatementAspectWhileStatementAspectContext {
  public static final WhileStatementAspectWhileStatementAspectContext INSTANCE = new WhileStatementAspectWhileStatementAspectContext();

  public static WhileStatementAspectWhileStatementAspectProperties getSelf(final WhileStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.WhileStatementAspectWhileStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<WhileStatement, WhileStatementAspectWhileStatementAspectProperties> map = new java.util.WeakHashMap<xminiJava.WhileStatement, minijava.semantics.WhileStatementAspectWhileStatementAspectProperties>();

  public Map<WhileStatement, WhileStatementAspectWhileStatementAspectProperties> getMap() {
    return map;
  }
}
