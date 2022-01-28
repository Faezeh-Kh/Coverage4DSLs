package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.arduino.reactive.arduino.ModuleInstruction;

@Aspect(className = ModuleInstruction.class)
@SuppressWarnings("all")
public class ModuleInstruction_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final ModuleInstruction _self) {
    final org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.ModuleAssignment_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.ModuleAssignment){
    			org.imt.arduino.reactive.interpreter.ModuleAssignment_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.ModuleAssignment)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.ModuleAssignment_ExecutableAspect
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.ModuleInstruction){
    	org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.ModuleInstruction)_self);
    };
  }
  
  private static void super_execute(final ModuleInstruction _self) {
    final org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_, final ModuleInstruction _self) {
  }
}
