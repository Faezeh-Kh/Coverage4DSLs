package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.minijava.xminiJava.Expression;
import org.imt.minijava.xminiJava.State;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionStatementAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final Expression _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionStatementAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionStatementAspectExpressionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof org.imt.minijava.xminiJava.Expression){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.xminijava.interpreter.ExpressionStatementAspect._privk3_evaluateStatement(_self_, (org.imt.minijava.xminiJava.Expression)_self,state);
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
    final org.imt.xminijava.interpreter.StatementAspectStatementAspectProperties _self_ = org.imt.xminijava.interpreter.StatementAspectStatementAspectContext.getSelf(_self);
     org.imt.xminijava.interpreter.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }
  
  protected static void _privk3_evaluateStatement(final ExpressionStatementAspectExpressionAspectProperties _self_, final Expression _self, final State state) {
    ExpressionAspect.evaluateExpression(_self, state);
  }
}
