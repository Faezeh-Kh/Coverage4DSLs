package arduino.semantics;

import arduino.Pin;
import arduino.PushButton;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = PushButton.class)
@SuppressWarnings("all")
public class PushButtonAspect extends ModuleAspect {
  @Step
  public static void press(final PushButton _self) {
    final arduino.semantics.PushButtonAspectPushButtonAspectProperties _self_ = arduino.semantics.PushButtonAspectPushButtonAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void press()
    if (_self instanceof arduino.PushButton){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.PushButtonAspect._privk3_press(_self_, (arduino.PushButton)_self);
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
    final arduino.semantics.PushButtonAspectPushButtonAspectProperties _self_ = arduino.semantics.PushButtonAspectPushButtonAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void release()
    if (_self instanceof arduino.PushButton){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.PushButtonAspect._privk3_release(_self_, (arduino.PushButton)_self);
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
    String _name = _self.getName();
    String _plus = ("Button " + _name);
    String _plus_1 = (_plus + " pressed");
    InputOutput.<String>println(_plus_1);
    Pin _pin = ModuleAspect.getPin(_self);
    _pin.setLevel(1);
    Project_ExecutableAspect.execute(ModuleAspect.getProject(_self));
  }

  protected static void _privk3_release(final PushButtonAspectPushButtonAspectProperties _self_, final PushButton _self) {
    String _name = _self.getName();
    String _plus = ("Button " + _name);
    String _plus_1 = (_plus + " released");
    InputOutput.<String>println(_plus_1);
    Pin _pin = ModuleAspect.getPin(_self);
    _pin.setLevel(0);
    Project_ExecutableAspect.execute(ModuleAspect.getProject(_self));
  }
}
