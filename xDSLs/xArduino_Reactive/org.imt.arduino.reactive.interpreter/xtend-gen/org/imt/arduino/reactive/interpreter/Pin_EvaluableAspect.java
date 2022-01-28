package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.arduino.reactive.arduino.Pin;

@Aspect(className = Pin.class)
@SuppressWarnings("all")
public class Pin_EvaluableAspect {
  public static final Integer LOW = Integer.valueOf(0);
  
  public static final Integer HIGH = Integer.valueOf(1023);
  
  @Step
  public static void changeLevel(final Pin _self) {
    final org.imt.arduino.reactive.interpreter.Pin_EvaluableAspectPinAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Pin_EvaluableAspectPinAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void changeLevel()
    if (_self instanceof org.imt.arduino.reactive.arduino.Pin){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.Pin_EvaluableAspect._privk3_changeLevel(_self_, (org.imt.arduino.reactive.arduino.Pin)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Pin", "changeLevel");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_changeLevel(final Pin_EvaluableAspectPinAspectProperties _self_, final Pin _self) {
  }
}
