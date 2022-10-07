package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import xminiJava.Expression;
import xminiJava.State;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionStatementAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final Expression _self, final State state) {
    final minijava.semantics.ExpressionStatementAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionStatementAspectExpressionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof xminiJava.Expression){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			minijava.semantics.ExpressionStatementAspect._privk3_evaluateStatement(_self_, (xminiJava.Expression)_self,state);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {state}, command, "Expression", "evaluateStatement");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static void super_evaluateStatement(final Expression _self, final State state) {
    final minijava.semantics.StatementAspectStatementAspectProperties _self_ = minijava.semantics.StatementAspectStatementAspectContext.getSelf(_self);
     minijava.semantics.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }

  protected static void _privk3_evaluateStatement(final ExpressionStatementAspectExpressionAspectProperties _self_, final Expression _self, final State state) {
    ExpressionAspect.evaluateExpression(_self, state);
  }
}
