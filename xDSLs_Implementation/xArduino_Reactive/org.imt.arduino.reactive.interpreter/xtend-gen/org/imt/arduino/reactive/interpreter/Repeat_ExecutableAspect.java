package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.arduino.reactive.arduino.Repeat;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class Repeat_ExecutableAspect extends Control_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final Repeat _self) {
    final org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspectRepeatAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspectRepeatAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.Repeat){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.Repeat_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.Repeat)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Repeat", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_execute(final Repeat _self) {
    final org.imt.arduino.reactive.interpreter.Control_ExecutableAspectControlAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.imt.arduino.reactive.interpreter.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Repeat_ExecutableAspectRepeatAspectProperties _self_, final Repeat _self) {
    while ((Control_EvaluableAspect.evaluate(_self)).booleanValue()) {
      Block_ExecutableAspect.execute(_self.getBlock());
    }
    Instruction_ExecutableAspect.finalize(_self);
  }
}
