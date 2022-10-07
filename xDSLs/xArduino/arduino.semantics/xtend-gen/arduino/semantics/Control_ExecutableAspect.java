package arduino.semantics;

import arduino.Control;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Control _self) {
    final arduino.semantics.Control_ExecutableAspectControlAspectProperties _self_ = arduino.semantics.Control_ExecutableAspectControlAspectContext.getSelf(_self);
    	// BeginInjectInto arduino.semantics.Control_ExecutableAspect#void execute() from arduino.semantics.While_ExecutableAspect
    		if (_self instanceof arduino.While){
    			arduino.semantics.While_ExecutableAspect.execute((arduino.While)_self);
    		} else
    		// EndInjectInto arduino.semantics.Control_ExecutableAspect#void execute() from arduino.semantics.While_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Control_ExecutableAspect#void execute() from arduino.semantics.Repeat_ExecutableAspect
    		if (_self instanceof arduino.Repeat){
    			arduino.semantics.Repeat_ExecutableAspect.execute((arduino.Repeat)_self);
    		} else
    		// EndInjectInto arduino.semantics.Control_ExecutableAspect#void execute() from arduino.semantics.Repeat_ExecutableAspect
    	// BeginInjectInto arduino.semantics.Control_ExecutableAspect#void execute() from arduino.semantics.If_ExecutableAspect
    		if (_self instanceof arduino.If){
    			arduino.semantics.If_ExecutableAspect.execute((arduino.If)_self);
    		} else
    		// EndInjectInto arduino.semantics.Control_ExecutableAspect#void execute() from arduino.semantics.If_ExecutableAspect
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.Control){
    	arduino.semantics.Control_ExecutableAspect._privk3_execute(_self_, (arduino.Control)_self);
    };
  }

  private static void super_execute(final Control _self) {
    final arduino.semantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = arduino.semantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     arduino.semantics.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final Control_ExecutableAspectControlAspectProperties _self_, final Control _self) {
  }
}
