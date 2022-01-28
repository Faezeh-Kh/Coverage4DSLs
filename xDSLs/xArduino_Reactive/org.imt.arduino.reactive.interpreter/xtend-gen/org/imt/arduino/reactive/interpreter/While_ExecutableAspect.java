package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.arduino.reactive.arduino.While;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_ExecutableAspect extends Control_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final While _self) {
    final org.imt.arduino.reactive.interpreter.While_ExecutableAspectWhileAspectProperties _self_ = org.imt.arduino.reactive.interpreter.While_ExecutableAspectWhileAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.While){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.While_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.While)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "While", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_execute(final While _self) {
    final org.imt.arduino.reactive.interpreter.Control_ExecutableAspectControlAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Control_ExecutableAspectControlAspectContext.getSelf(_self);
     org.imt.arduino.reactive.interpreter.Control_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final While_ExecutableAspectWhileAspectProperties _self_, final While _self) {
    while ((Control_EvaluableAspect.evaluate(_self)).booleanValue()) {
      Block_ExecutableAspect.execute(_self.getBlock());
    }
  }
}
