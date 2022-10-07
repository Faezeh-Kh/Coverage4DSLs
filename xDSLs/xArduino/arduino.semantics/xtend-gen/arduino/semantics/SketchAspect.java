package arduino.semantics;

import arduino.Sketch;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;

@Aspect(className = Sketch.class)
@SuppressWarnings("all")
public class SketchAspect {
  @Step
  public static void execute(final Sketch _self) {
    final arduino.semantics.SketchAspectSketchAspectProperties _self_ = arduino.semantics.SketchAspectSketchAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.Sketch){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.SketchAspect._privk3_execute(_self_, (arduino.Sketch)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Sketch", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static void _privk3_execute(final SketchAspectSketchAspectProperties _self_, final Sketch _self) {
    Block_ExecutableAspect.execute(_self.getBlock());
  }
}
