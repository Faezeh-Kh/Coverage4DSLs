package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.PrintStatement;

@SuppressWarnings("all")
public class PrintStatementAspectPrintStatementAspectContext {
  public static final PrintStatementAspectPrintStatementAspectContext INSTANCE = new PrintStatementAspectPrintStatementAspectContext();
  
  public static PrintStatementAspectPrintStatementAspectProperties getSelf(final PrintStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.PrintStatementAspectPrintStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PrintStatement, PrintStatementAspectPrintStatementAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.PrintStatement, org.imt.xminijava.interpreter.PrintStatementAspectPrintStatementAspectProperties>();
  
  public Map<PrintStatement, PrintStatementAspectPrintStatementAspectProperties> getMap() {
    return map;
  }
}
