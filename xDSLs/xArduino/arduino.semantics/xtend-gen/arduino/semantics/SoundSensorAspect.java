package arduino.semantics;

import arduino.SoundSensor;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = SoundSensor.class)
@SuppressWarnings("all")
public class SoundSensorAspect extends ModuleAspect {
  @Step
  public static void detect(final SoundSensor _self) {
    final arduino.semantics.SoundSensorAspectSoundSensorAspectProperties _self_ = arduino.semantics.SoundSensorAspectSoundSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void detect()
    if (_self instanceof arduino.SoundSensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.SoundSensorAspect._privk3_detect(_self_, (arduino.SoundSensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "SoundSensor", "detect");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static void _privk3_detect(final SoundSensorAspectSoundSensorAspectProperties _self_, final SoundSensor _self) {
    String _name = _self.getName();
    String _plus = ("Sensor " + _name);
    String _plus_1 = (_plus + " detected");
    InputOutput.<String>println(_plus_1);
    Project_ExecutableAspect.execute(ModuleAspect.getProject(_self));
  }
}
