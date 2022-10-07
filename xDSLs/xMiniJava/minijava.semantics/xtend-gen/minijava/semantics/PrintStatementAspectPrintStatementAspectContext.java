package minijava.semantics;

import java.util.Map;
import xminiJava.PrintStatement;

@SuppressWarnings("all")
public class PrintStatementAspectPrintStatementAspectContext {
  public static final PrintStatementAspectPrintStatementAspectContext INSTANCE = new PrintStatementAspectPrintStatementAspectContext();

  public static PrintStatementAspectPrintStatementAspectProperties getSelf(final PrintStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.PrintStatementAspectPrintStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<PrintStatement, PrintStatementAspectPrintStatementAspectProperties> map = new java.util.WeakHashMap<xminiJava.PrintStatement, minijava.semantics.PrintStatementAspectPrintStatementAspectProperties>();

  public Map<PrintStatement, PrintStatementAspectPrintStatementAspectProperties> getMap() {
    return map;
  }
}
