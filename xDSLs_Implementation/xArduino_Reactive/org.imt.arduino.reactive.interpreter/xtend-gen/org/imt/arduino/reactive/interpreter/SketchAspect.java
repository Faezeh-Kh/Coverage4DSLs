package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.arduino.reactive.arduino.Sketch;

@Aspect(className = Sketch.class)
@SuppressWarnings("all")
public class SketchAspect {
  @Step
  public static void execute(final Sketch _self) {
    final org.imt.arduino.reactive.interpreter.SketchAspectSketchAspectProperties _self_ = org.imt.arduino.reactive.interpreter.SketchAspectSketchAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.Sketch){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.SketchAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.Sketch)_self);
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
