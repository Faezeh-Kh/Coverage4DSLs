package arduino.semantics;

import arduino.ModuleInstruction;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = ModuleInstruction.class)
@SuppressWarnings("all")
public class ModuleInstruction_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final ModuleInstruction _self) {
    final arduino.semantics.ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_ = arduino.semantics.ModuleInstruction_ExecutableAspectModuleInstructionAspectContext.getSelf(_self);
    	// BeginInjectInto arduino.semantics.ModuleInstruction_ExecutableAspect#void execute() from arduino.semantics.ModuleAssignment_ExecutableAspect
    		if (_self instanceof arduino.ModuleAssignment){
    			arduino.semantics.ModuleAssignment_ExecutableAspect.execute((arduino.ModuleAssignment)_self);
    		} else
    		// EndInjectInto arduino.semantics.ModuleInstruction_ExecutableAspect#void execute() from arduino.semantics.ModuleAssignment_ExecutableAspect
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.ModuleInstruction){
    	arduino.semantics.ModuleInstruction_ExecutableAspect._privk3_execute(_self_, (arduino.ModuleInstruction)_self);
    };
  }

  private static void super_execute(final ModuleInstruction _self) {
    final arduino.semantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = arduino.semantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     arduino.semantics.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final ModuleInstruction_ExecutableAspectModuleInstructionAspectProperties _self_, final ModuleInstruction _self) {
  }
}
