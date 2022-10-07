package minijava.semantics;

import java.util.Map;
import xminiJava.Program;

@SuppressWarnings("all")
public class ProgramAspectProgramAspectContext {
  public static final ProgramAspectProgramAspectContext INSTANCE = new ProgramAspectProgramAspectContext();

  public static ProgramAspectProgramAspectProperties getSelf(final Program _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.ProgramAspectProgramAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Program, ProgramAspectProgramAspectProperties> map = new java.util.WeakHashMap<xminiJava.Program, minijava.semantics.ProgramAspectProgramAspectProperties>();

  public Map<Program, ProgramAspectProgramAspectProperties> getMap() {
    return map;
  }
}
