package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.minijava.xminiJava.BooleanValue;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.WhileStatement;

@Aspect(className = WhileStatement.class)
@SuppressWarnings("all")
public class WhileStatementAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final WhileStatement _self, final State state) {
    final org.imt.xminijava.interpreter.WhileStatementAspectWhileStatementAspectProperties _self_ = org.imt.xminijava.interpreter.WhileStatementAspectWhileStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof org.imt.minijava.xminiJava.WhileStatement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.xminijava.interpreter.WhileStatementAspect._privk3_evaluateStatement(_self_, (org.imt.minijava.xminiJava.WhileStatement)_self,state);
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
    final org.imt.xminijava.interpreter.StatementAspectStatementAspectProperties _self_ = org.imt.xminijava.interpreter.StatementAspectStatementAspectContext.getSelf(_self);
     org.imt.xminijava.interpreter.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }
  
  protected static void _privk3_evaluateStatement(final WhileStatementAspectWhileStatementAspectProperties _self_, final WhileStatement _self, final State state) {
    while (((BooleanValue) ExpressionAspect.evaluateExpression(_self.getCondition(), state)).isValue()) {
      BlockAspect.evaluateStatement(_self.getBlock(), state);
    }
  }
}
