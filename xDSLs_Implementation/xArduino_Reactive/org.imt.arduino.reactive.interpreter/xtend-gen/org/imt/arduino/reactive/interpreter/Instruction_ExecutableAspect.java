package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.arduino.reactive.arduino.Instruction;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_ExecutableAspect extends Instruction_UtilitesAspect {
  public static void execute(final Instruction _self) {
    final org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.ModuleInstruction){
    			org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.ModuleInstruction)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.ModuleInstruction_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.ModuleAssignment_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.ModuleAssignment){
    			org.imt.arduino.reactive.interpreter.ModuleAssignment_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.ModuleAssignment)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.ModuleAssignment_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.If_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.If){
    			org.imt.arduino.reactive.interpreter.If_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.If)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.If_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.Utilities){
    			org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.Utilities)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    			org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.WaitFor)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.VariableDeclaration_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.VariableDeclaration){
    			org.imt.arduino.reactive.interpreter.VariableDeclaration_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.VariableDeclaration)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.VariableDeclaration_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.While_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.While){
    			org.imt.arduino.reactive.interpreter.While_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.While)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.While_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Delay_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.Delay){
    			org.imt.arduino.reactive.interpreter.Delay_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.Delay)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Delay_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.Repeat){
    			org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.Repeat)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.VariableAssignment_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.VariableAssignment){
    			org.imt.arduino.reactive.interpreter.VariableAssignment_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.VariableAssignment)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.VariableAssignment_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Control_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.Control){
    			org.imt.arduino.reactive.interpreter.Control_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.Control)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Control_ExecutableAspect
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.Instruction){
    	org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.Instruction)_self);
    };
  }
  
  public static void finalize(final Instruction _self) {
    final org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void finalize() from org.imt.arduino.reactive.interpreter.Repeat_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.Repeat){
    			org.imt.arduino.reactive.interpreter.Repeat_EvaluableAspect.finalize((org.imt.arduino.reactive.arduino.Repeat)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect#void finalize() from org.imt.arduino.reactive.interpreter.Repeat_EvaluableAspect
    // #DispatchPointCut_before# void finalize()
    if (_self instanceof org.imt.arduino.reactive.arduino.Instruction){
    	org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect._privk3_finalize(_self_, (org.imt.arduino.reactive.arduino.Instruction)_self);
    };
  }
  
  protected static void _privk3_execute(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
  
  protected static void _privk3_finalize(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
}
