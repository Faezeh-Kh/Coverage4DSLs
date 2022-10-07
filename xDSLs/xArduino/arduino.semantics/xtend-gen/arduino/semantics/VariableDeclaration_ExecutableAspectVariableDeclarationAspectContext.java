package arduino.semantics;

import arduino.VariableDeclaration;
import java.util.Map;

@SuppressWarnings("all")
public class VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext {
  public static final VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext INSTANCE = new VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext();

  public static VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties getSelf(final VariableDeclaration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<VariableDeclaration, VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties> map = new java.util.WeakHashMap<arduino.VariableDeclaration, arduino.semantics.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties>();

  public Map<VariableDeclaration, VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties> getMap() {
    return map;
  }
}
