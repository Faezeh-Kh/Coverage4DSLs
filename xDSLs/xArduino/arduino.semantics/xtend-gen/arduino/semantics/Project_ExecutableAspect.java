package arduino.semantics;

import arduino.Project;
import arduino.Sketch;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Project.class)
@SuppressWarnings("all")
public class Project_ExecutableAspect {
  public static void execute(final Project _self) {
    final arduino.semantics.Project_ExecutableAspectProjectAspectProperties _self_ = arduino.semantics.Project_ExecutableAspectProjectAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.Project){
    	arduino.semantics.Project_ExecutableAspect._privk3_execute(_self_, (arduino.Project)_self);
    };
  }

  protected static void _privk3_execute(final Project_ExecutableAspectProjectAspectProperties _self_, final Project _self) {
    final EList<Sketch> sketches = _self.getSketches();
    final Consumer<Sketch> _function = (Sketch s) -> {
      Block_ExecutableAspect.execute(s.getBlock());
    };
    sketches.forEach(_function);
  }
}
