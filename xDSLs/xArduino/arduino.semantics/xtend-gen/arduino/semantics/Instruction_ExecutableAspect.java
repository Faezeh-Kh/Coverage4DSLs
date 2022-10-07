package arduino.semantics;

import arduino.Instruction;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Instruction.class)
@SuppressWarnings("all")
public class Instruction_ExecutableAspect extends Instruction_UtilitesAspect {
  public static void execute(final Instruction _self) {
    final arduino.semantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = arduino.semantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.VariableDeclaration_ExecutableAspect
    		if (_self instanceof arduino.VariableDeclaration){
    			arduino.semantics.VariableDeclaration_ExecutableAspect.execute((arduino.VariableDeclaration)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.VariableDeclaration_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.While_ExecutableAspect
    		if (_self instanceof arduino.While){
    			arduino.semantics.While_ExecutableAspect.execute((arduino.While)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.While_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.VariableAssignment_ExecutableAspect
    		if (_self instanceof arduino.VariableAssignment){
    			arduino.semantics.VariableAssignment_ExecutableAspect.execute((arduino.VariableAssignment)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.VariableAssignment_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.WaitFor_ExecutableAspect
    		if (_self instanceof arduino.WaitFor){
    			arduino.semantics.WaitFor_ExecutableAspect.execute((arduino.WaitFor)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.WaitFor_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.Utilities_ExecutableAspect
    		if (_self instanceof arduino.Utilities){
    			arduino.semantics.Utilities_ExecutableAspect.execute((arduino.Utilities)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.Utilities_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.Repeat_ExecutableAspect
    		if (_self instanceof arduino.Repeat){
    			arduino.semantics.Repeat_ExecutableAspect.execute((arduino.Repeat)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.Repeat_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.ModuleInstruction_ExecutableAspect
    		if (_self instanceof arduino.ModuleInstruction){
    			arduino.semantics.ModuleInstruction_ExecutableAspect.execute((arduino.ModuleInstruction)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.ModuleInstruction_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.Delay_ExecutableAspect
    		if (_self instanceof arduino.Delay){
    			arduino.semantics.Delay_ExecutableAspect.execute((arduino.Delay)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.Delay_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.Control_ExecutableAspect
    		if (_self instanceof arduino.Control){
    			arduino.semantics.Control_ExecutableAspect.execute((arduino.Control)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.Control_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.ModuleAssignment_ExecutableAspect
    		if (_self instanceof arduino.ModuleAssignment){
    			arduino.semantics.ModuleAssignment_ExecutableAspect.execute((arduino.ModuleAssignment)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.ModuleAssignment_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.If_ExecutableAspect
    		if (_self instanceof arduino.If){
    			arduino.semantics.If_ExecutableAspect.execute((arduino.If)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void execute() from arduino.semantics.If_ExecutableAspect
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.Instruction){
    	arduino.semantics.Instruction_ExecutableAspect._privk3_execute(_self_, (arduino.Instruction)_self);
    };
  }

  public static void finalize(final Instruction _self) {
    final arduino.semantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = arduino.semantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
    	// BeginInjectInto arduino.semantics.Instruction_ExecutableAspect#void finalize() from arduino.semantics.Repeat_EvaluableAspect
    		if (_self instanceof arduino.Repeat){
    			arduino.semantics.Repeat_EvaluableAspect.finalize((arduino.Repeat)_self);
    		} else
    		// EndInjectInto arduino.semantics.Instruction_ExecutableAspect#void finalize() from arduino.semantics.Repeat_EvaluableAspect
    // #DispatchPointCut_before# void finalize()
    if (_self instanceof arduino.Instruction){
    	arduino.semantics.Instruction_ExecutableAspect._privk3_finalize(_self_, (arduino.Instruction)_self);
    };
  }

  protected static void _privk3_execute(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }

  protected static void _privk3_finalize(final Instruction_ExecutableAspectInstructionAspectProperties _self_, final Instruction _self) {
  }
}
