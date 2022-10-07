package arduino.semantics;

import arduino.InfraRedSensor;
import arduino.Pin;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = InfraRedSensor.class)
@SuppressWarnings("all")
public class InfraRedSensorAspect extends ModuleAspect {
  @Step
  public static void detect(final InfraRedSensor _self) {
    final arduino.semantics.InfraRedSensorAspectInfraRedSensorAspectProperties _self_ = arduino.semantics.InfraRedSensorAspectInfraRedSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void detect()
    if (_self instanceof arduino.InfraRedSensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.InfraRedSensorAspect._privk3_detect(_self_, (arduino.InfraRedSensor)_self);
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
    final arduino.semantics.InfraRedSensorAspectInfraRedSensorAspectProperties _self_ = arduino.semantics.InfraRedSensorAspectInfraRedSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void notDetect()
    if (_self instanceof arduino.InfraRedSensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.InfraRedSensorAspect._privk3_notDetect(_self_, (arduino.InfraRedSensor)_self);
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
    String _name = _self.getName();
    String _plus = ("Sensor " + _name);
    String _plus_1 = (_plus + " detected");
    InputOutput.<String>println(_plus_1);
    Pin _pin = ModuleAspect.getPin(_self);
    _pin.setLevel(1);
    Project_ExecutableAspect.execute(ModuleAspect.getProject(_self));
  }

  protected static void _privk3_notDetect(final InfraRedSensorAspectInfraRedSensorAspectProperties _self_, final InfraRedSensor _self) {
    String _name = _self.getName();
    String _plus = ("Sensor " + _name);
    String _plus_1 = (_plus + " not detected");
    InputOutput.<String>println(_plus_1);
    Pin _pin = ModuleAspect.getPin(_self);
    _pin.setLevel(0);
    Project_ExecutableAspect.execute(ModuleAspect.getProject(_self));
  }
}
