package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import xminiJava.Method;
import xminiJava.State;

@Aspect(className = Method.class)
@SuppressWarnings("all")
public class MethodSortofStatementAspect {
  @Step
  public static void call(final Method _self, final State state) {
    final minijava.semantics.MethodSortofStatementAspectMethodAspectProperties _self_ = minijava.semantics.MethodSortofStatementAspectMethodAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void call(State)
    if (_self instanceof xminiJava.Method){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			minijava.semantics.MethodSortofStatementAspect._privk3_call(_self_, (xminiJava.Method)_self,state);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {state}, command, "Method", "call");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  protected static void _privk3_call(final MethodSortofStatementAspectMethodAspectProperties _self_, final Method _self, final State state) {
    BlockAspect.evaluateStatement(_self.getBody(), state);
  }
}
