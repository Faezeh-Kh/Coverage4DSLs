package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.arduino.reactive.arduino.InfraRedSensor;
import org.imt.arduino.reactive.arduino.Pin;

@Aspect(className = InfraRedSensor.class)
@SuppressWarnings("all")
public class InfraRedSensorAspect extends ModuleAspect {
  @Step
  public static void detect(final InfraRedSensor _self) {
    final org.imt.arduino.reactive.interpreter.InfraRedSensorAspectInfraRedSensorAspectProperties _self_ = org.imt.arduino.reactive.interpreter.InfraRedSensorAspectInfraRedSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void detect()
    if (_self instanceof org.imt.arduino.reactive.arduino.InfraRedSensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.InfraRedSensorAspect._privk3_detect(_self_, (org.imt.arduino.reactive.arduino.InfraRedSensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "InfraRedSensor", "detect");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void notDetect(final InfraRedSensor _self) {
    final org.imt.arduino.reactive.interpreter.InfraRedSensorAspectInfraRedSensorAspectProperties _self_ = org.imt.arduino.reactive.interpreter.InfraRedSensorAspectInfraRedSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void notDetect()
    if (_self instanceof org.imt.arduino.reactive.arduino.InfraRedSensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.InfraRedSensorAspect._privk3_notDetect(_self_, (org.imt.arduino.reactive.arduino.InfraRedSensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "InfraRedSensor", "notDetect");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_detect(final InfraRedSensorAspectInfraRedSensorAspectProperties _self_, final InfraRedSensor _self) {
    Pin _pin = ModuleAspect.getPin(_self);
    _pin.setLevel(1);
    Project_ExecutableAspect.execute(ModuleAspect.getProject(_self));
  }
  
  protected static void _privk3_notDetect(final InfraRedSensorAspectInfraRedSensorAspectProperties _self_, final InfraRedSensor _self) {
    Pin _pin = ModuleAspect.getPin(_self);
    _pin.setLevel(0);
    Project_ExecutableAspect.execute(ModuleAspect.getProject(_self));
  }
}
