package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.minijava.xminiJava.PrintStatement;
import org.imt.minijava.xminiJava.State;

@Aspect(className = PrintStatement.class)
@SuppressWarnings("all")
public class PrintStatementAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final PrintStatement _self, final State state) {
    final org.imt.xminijava.interpreter.PrintStatementAspectPrintStatementAspectProperties _self_ = org.imt.xminijava.interpreter.PrintStatementAspectPrintStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof org.imt.minijava.xminiJava.PrintStatement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.xminijava.interpreter.PrintStatementAspect._privk3_evaluateStatement(_self_, (org.imt.minijava.xminiJava.PrintStatement)_self,state);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {state}, command, "PrintStatement", "evaluateStatement");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_evaluateStatement(final PrintStatement _self, final State state) {
    final org.imt.xminijava.interpreter.StatementAspectStatementAspectProperties _self_ = org.imt.xminijava.interpreter.StatementAspectStatementAspectContext.getSelf(_self);
     org.imt.xminijava.interpreter.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }
  
  protected static void _privk3_evaluateStatement(final PrintStatementAspectPrintStatementAspectProperties _self_, final PrintStatement _self, final State state) {
    final String string = ValueToStringAspect.customToString(ExpressionAspect.evaluateExpression(_self.getExpression(), state));
    StateAspect.println(state, string);
  }
}
