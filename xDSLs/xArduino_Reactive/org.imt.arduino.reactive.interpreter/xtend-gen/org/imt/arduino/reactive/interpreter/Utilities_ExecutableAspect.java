package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.arduino.reactive.arduino.Utilities;

@Aspect(className = Utilities.class)
@SuppressWarnings("all")
public class Utilities_ExecutableAspect extends Instruction_ExecutableAspect {
  @OverrideAspectMethod
  public static void execute(final Utilities _self) {
    final org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspectUtilitiesAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.WaitFor){
    			org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.WaitFor)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.WaitFor_ExecutableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Delay_ExecutableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.Delay){
    			org.imt.arduino.reactive.interpreter.Delay_ExecutableAspect.execute((org.imt.arduino.reactive.arduino.Delay)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspect#void execute() from org.imt.arduino.reactive.interpreter.Delay_ExecutableAspect
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.Utilities){
    	org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.Utilities)_self);
    };
  }
  
  private static void super_execute(final Utilities _self) {
    final org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspectInstructionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     org.imt.arduino.reactive.interpreter.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Utilities_ExecutableAspectUtilitiesAspectProperties _self_, final Utilities _self) {
  }
}
