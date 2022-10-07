package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import xminiJava.PrintStatement;
import xminiJava.State;

@Aspect(className = PrintStatement.class)
@SuppressWarnings("all")
public class PrintStatementAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final PrintStatement _self, final State state) {
    final minijava.semantics.PrintStatementAspectPrintStatementAspectProperties _self_ = minijava.semantics.PrintStatementAspectPrintStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof xminiJava.PrintStatement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			minijava.semantics.PrintStatementAspect._privk3_evaluateStatement(_self_, (xminiJava.PrintStatement)_self,state);
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
    final minijava.semantics.StatementAspectStatementAspectProperties _self_ = minijava.semantics.StatementAspectStatementAspectContext.getSelf(_self);
     minijava.semantics.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }

  protected static void _privk3_evaluateStatement(final PrintStatementAspectPrintStatementAspectProperties _self_, final PrintStatement _self, final State state) {
    final String string = ValueToStringAspect.customToString(ExpressionAspect.evaluateExpression(_self.getExpression(), state));
    StateAspect.println(state, string);
  }
}
