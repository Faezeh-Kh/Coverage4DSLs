package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.arduino.reactive.arduino.BooleanVariable;
import org.imt.arduino.reactive.arduino.IntegerVariable;
import org.imt.arduino.reactive.arduino.Project;
import org.imt.arduino.reactive.arduino.Sketch;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class Project_ExecutableAspect {
  public static void execute(final Project _self) {
    final org.imt.arduino.reactive.interpreter.Project_ExecutableAspectProjectAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.Project){
    	org.imt.arduino.reactive.interpreter.Project_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.Project)_self);
    };
  }
  
  @Main
  public static void main(final Project _self) {
    final org.imt.arduino.reactive.interpreter.Project_ExecutableAspectProjectAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof org.imt.arduino.reactive.arduino.Project){
    	org.imt.arduino.reactive.interpreter.Project_ExecutableAspect._privk3_main(_self_, (org.imt.arduino.reactive.arduino.Project)_self);
    };
  }
  
  @Step
  public static void setup(final Project _self) {
    final org.imt.arduino.reactive.interpreter.Project_ExecutableAspectProjectAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setup()
    if (_self instanceof org.imt.arduino.reactive.arduino.Project){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.Project_ExecutableAspect._privk3_setup(_self_, (org.imt.arduino.reactive.arduino.Project)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Project", "setup");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @InitializeModel
  public static void initializeModel(final Project _self, final EList<String> args) {
    final org.imt.arduino.reactive.interpreter.Project_ExecutableAspectProjectAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initializeModel(EList<String>)
    if (_self instanceof org.imt.arduino.reactive.arduino.Project){
    	org.imt.arduino.reactive.interpreter.Project_ExecutableAspect._privk3_initializeModel(_self_, (org.imt.arduino.reactive.arduino.Project)_self,args);
    };
  }
  
  protected static void _privk3_execute(final Project_ExecutableAspectProjectAspectProperties _self_, final Project _self) {
    final EList<Sketch> sketches = _self.getSketches();
    final Consumer<Sketch> _function = (Sketch s) -> {
      Block_ExecutableAspect.execute(s.getBlock());
    };
    sketches.forEach(_function);
  }
  
  protected static void _privk3_main(final Project_ExecutableAspectProjectAspectProperties _self_, final Project _self) {
    final long start = System.nanoTime();
    Project_ExecutableAspect.execute(_self);
    final long stop = System.nanoTime();
  }
  
  protected static void _privk3_setup(final Project_ExecutableAspectProjectAspectProperties _self_, final Project _self) {
    final Procedure1<EObject> _function = (EObject o) -> {
      if ((o instanceof IntegerVariable)) {
        IntegerVariable_EvaluableAspect.value(((IntegerVariable)o), Integer.valueOf(((IntegerVariable)o).getInitialValue()));
      } else {
        if ((o instanceof BooleanVariable)) {
          BooleanVariable_EvaluableAspect.value(((BooleanVariable)o), Boolean.valueOf(((BooleanVariable)o).isInitialValue()));
        }
      }
    };
    IteratorExtensions.<EObject>forEach(_self.eAllContents(), _function);
  }
  
  protected static void _privk3_initializeModel(final Project_ExecutableAspectProjectAspectProperties _self_, final Project _self, final EList<String> args) {
    Project_ExecutableAspect.setup(_self);
  }
}
