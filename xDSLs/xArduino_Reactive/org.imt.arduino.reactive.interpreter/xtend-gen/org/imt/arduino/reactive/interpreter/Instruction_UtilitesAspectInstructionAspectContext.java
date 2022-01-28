package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.Instruction;

@SuppressWarnings("all")
public class Instruction_UtilitesAspectInstructionAspectContext {
  public static final Instruction_UtilitesAspectInstructionAspectContext INSTANCE = new Instruction_UtilitesAspectInstructionAspectContext();
  
  public static Instruction_UtilitesAspectInstructionAspectProperties getSelf(final Instruction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.Instruction_UtilitesAspectInstructionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Instruction, Instruction_UtilitesAspectInstructionAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Instruction, org.imt.arduino.reactive.interpreter.Instruction_UtilitesAspectInstructionAspectProperties>();
  
  public Map<Instruction, Instruction_UtilitesAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
