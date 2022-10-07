package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import xminiJava.Frame;
import xminiJava.Return;
import xminiJava.State;
import xminiJava.Value;

@Aspect(className = Return.class)
@SuppressWarnings("all")
public class ReturnAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final Return _self, final State state) {
    final minijava.semantics.ReturnAspectReturnAspectProperties _self_ = minijava.semantics.ReturnAspectReturnAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof xminiJava.Return){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			minijava.semantics.ReturnAspect._privk3_evaluateStatement(_self_, (xminiJava.Return)_self,state);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {state}, command, "Return", "evaluateStatement");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static void super_evaluateStatement(final Return _self, final State state) {
    final minijava.semantics.StatementAspectStatementAspectProperties _self_ = minijava.semantics.StatementAspectStatementAspectContext.getSelf(_self);
     minijava.semantics.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }

  protected static void _privk3_evaluateStatement(final ReturnAspectReturnAspectProperties _self_, final Return _self, final State state) {
    final Value value = ExpressionAspect.evaluateExpression(_self.getExpression(), state);
    Frame _findCurrentFrame = StateAspect.findCurrentFrame(state);
    _findCurrentFrame.setReturnValue(value);
  }
}
