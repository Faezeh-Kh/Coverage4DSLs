package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import xminiJava.BooleanValue;
import xminiJava.State;
import xminiJava.WhileStatement;

@Aspect(className = WhileStatement.class)
@SuppressWarnings("all")
public class WhileStatementAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final WhileStatement _self, final State state) {
    final minijava.semantics.WhileStatementAspectWhileStatementAspectProperties _self_ = minijava.semantics.WhileStatementAspectWhileStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof xminiJava.WhileStatement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			minijava.semantics.WhileStatementAspect._privk3_evaluateStatement(_self_, (xminiJava.WhileStatement)_self,state);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {state}, command, "WhileStatement", "evaluateStatement");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static void super_evaluateStatement(final WhileStatement _self, final State state) {
    final minijava.semantics.StatementAspectStatementAspectProperties _self_ = minijava.semantics.StatementAspectStatementAspectContext.getSelf(_self);
     minijava.semantics.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }

  protected static void _privk3_evaluateStatement(final WhileStatementAspectWhileStatementAspectProperties _self_, final WhileStatement _self, final State state) {
    while (((BooleanValue) ExpressionAspect.evaluateExpression(_self.getCondition(), state)).isValue()) {
      BlockAspect.evaluateStatement(_self.getBlock(), state);
    }
  }
}
