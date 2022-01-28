package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.arduino.reactive.arduino.Pin;
import org.imt.arduino.reactive.arduino.PushButton;

@Aspect(className = PushButton.class)
@SuppressWarnings("all")
public class PushButtonAspect extends ModuleAspect {
  @Step
  public static void press(final PushButton _self) {
    final org.imt.arduino.reactive.interpreter.PushButtonAspectPushButtonAspectProperties _self_ = org.imt.arduino.reactive.interpreter.PushButtonAspectPushButtonAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void press()
    if (_self instanceof org.imt.arduino.reactive.arduino.PushButton){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.PushButtonAspect._privk3_press(_self_, (org.imt.arduino.reactive.arduino.PushButton)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "PushButton", "press");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void release(final PushButton _self) {
    final org.imt.arduino.reactive.interpreter.PushButtonAspectPushButtonAspectProperties _self_ = org.imt.arduino.reactive.interpreter.PushButtonAspectPushButtonAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void release()
    if (_self instanceof org.imt.arduino.reactive.arduino.PushButton){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.PushButtonAspect._privk3_release(_self_, (org.imt.arduino.reactive.arduino.PushButton)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "PushButton", "release");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_press(final PushButtonAspectPushButtonAspectProperties _self_, final PushButton _self) {
    Pin _pin = ModuleAspect.getPin(_self);
    _pin.setLevel(1);
    Project_ExecutableAspect.execute(ModuleAspect.getProject(_self));
  }
  
  protected static void _privk3_release(final PushButtonAspectPushButtonAspectProperties _self_, final PushButton _self) {
    Pin _pin = ModuleAspect.getPin(_self);
    _pin.setLevel(0);
    Project_ExecutableAspect.execute(ModuleAspect.getProject(_self));
  }
}
