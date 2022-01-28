package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.imt.arduino.reactive.arduino.Block;
import org.imt.arduino.reactive.arduino.Instruction;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class Block_ExecutableAspect {
  public static void execute(final Block _self) {
    final org.imt.arduino.reactive.interpreter.Block_ExecutableAspectBlockAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Block_ExecutableAspectBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.Block){
    	org.imt.arduino.reactive.interpreter.Block_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.Block)_self);
    };
  }
  
  protected static void _privk3_execute(final Block_ExecutableAspectBlockAspectProperties _self_, final Block _self) {
    EList<Instruction> _instructions = _self.getInstructions();
    for (final Instruction i : _instructions) {
      Instruction_ExecutableAspect.execute(i);
    }
  }
}
