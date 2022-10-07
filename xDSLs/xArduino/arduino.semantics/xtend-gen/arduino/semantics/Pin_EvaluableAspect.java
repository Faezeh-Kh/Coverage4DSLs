package arduino.semantics;

import arduino.Pin;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Pin.class)
@SuppressWarnings("all")
public class Pin_EvaluableAspect {
  public static final Integer LOW = Integer.valueOf(0);

  public static final Integer HIGH = Integer.valueOf(1023);

  @Step
  public static void changeLevel(final Pin _self) {
    final arduino.semantics.Pin_EvaluableAspectPinAspectProperties _self_ = arduino.semantics.Pin_EvaluableAspectPinAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void changeLevel()
    if (_self instanceof arduino.Pin){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.Pin_EvaluableAspect._privk3_changeLevel(_self_, (arduino.Pin)_self);
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
    String _name = _self.getName();
    String _plus = ("The level of " + _name);
    String _plus_1 = (_plus + " pin changed to ");
    int _level = _self.getLevel();
    String _plus_2 = (_plus_1 + Integer.valueOf(_level));
    InputOutput.<String>println(_plus_2);
  }
}
