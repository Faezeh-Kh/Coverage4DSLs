package arduino.semantics;

import arduino.Instruction;
import java.util.Map;

@SuppressWarnings("all")
public class Instruction_UtilitesAspectInstructionAspectContext {
  public static final Instruction_UtilitesAspectInstructionAspectContext INSTANCE = new Instruction_UtilitesAspectInstructionAspectContext();

  public static Instruction_UtilitesAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Instruction_UtilitesAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Instruction, Instruction_UtilitesAspectInstructionAspectProperties> map = new java.util.WeakHashMap<arduino.Instruction, arduino.semantics.Instruction_UtilitesAspectInstructionAspectProperties>();

  public Map<Instruction, Instruction_UtilitesAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
