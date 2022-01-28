package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.arduino.reactive.arduino.Control;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Control _self) {
    final org.imt.arduino.reactive.interpreter.Control_ExecutableAspectControlAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Control_ExecutableAspectControlAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Control_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.If_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.If){
    			org.imt.arduino.reactive.interpreter.If_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.If)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Control_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.If_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Control_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.While_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.While){
    			org.imt.arduino.reactive.interpreter.While_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.While)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Control_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.While_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Control_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.Repeat){
    			org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.Repeat)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Control_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspect
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.Control){
    	org.imt.arduino.reactive.interpreter.Control_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.Control)_self);
    };
  }
  
  private static void super_execute(final Control _self) {
    final org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Control_ExecutableAspectControlAspectProperties _self_, final Control _self) {
  }
}
