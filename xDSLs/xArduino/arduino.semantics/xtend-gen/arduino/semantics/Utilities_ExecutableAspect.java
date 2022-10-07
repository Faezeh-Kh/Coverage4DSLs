package arduino.semantics;

import arduino.Utilities;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = Utilities.class)
@SuppressWarnings("all")
public class Utilities_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Utilities _self) {
    final arduino.semantics.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = arduino.semantics.Utilities_ExecutableAspectUtilitiesAspectContext.getSelf(_self);
    	// BeginInjectInto arduino.semantics.Utilities_ExecutableAspect#void execute() from arduino.semantics.Delay_ExecutableAspect
    		if (_self instanceof arduino.Delay){
    			arduino.semantics.Delay_ExecutableAspect.execute((arduino.Delay)_self);
    		} else
    		// EndInjectInto arduino.semantics.Utilities_ExecutableAspect#void execute() from arduino.semantics.Delay_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Utilities_ExecutableAspect#void execute() from arduino.semantics.WaitFor_ExecutableAspect
    		if (_self instanceof arduino.WaitFor){
    			arduino.semantics.WaitFor_ExecutableAspect.execute((arduino.WaitFor)_self);
    		} else
    		// EndInjectInto arduino.semantics.Utilities_ExecutableAspect#void execute() from arduino.semantics.WaitFor_ExecutableAspect
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.Utilities){
    	arduino.semantics.Utilities_ExecutableAspect._privk3_execute(_self_, (arduino.Utilities)_self);
    };
  }

  private static void super_execute(final Utilities _self) {
    final arduino.semantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = arduino.semantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     arduino.semantics.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final Utilities_ExecutableAspectUtilitiesAspectProperties _self_, final Utilities _self) {
  }
}
