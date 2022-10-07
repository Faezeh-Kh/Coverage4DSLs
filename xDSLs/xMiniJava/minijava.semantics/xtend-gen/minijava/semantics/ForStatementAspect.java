package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import xminiJava.BooleanValue;
import xminiJava.ForStatement;
import xminiJava.State;
import xminiJava.Value;

@Aspect(className = ForStatement.class)
@SuppressWarnings("all")
public class ForStatementAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final ForStatement _self, final State state) {
    final minijava.semantics.ForStatementAspectForStatementAspectProperties _self_ = minijava.semantics.ForStatementAspectForStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof xminiJava.ForStatement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			minijava.semantics.ForStatementAspect._privk3_evaluateStatement(_self_, (xminiJava.ForStatement)_self,state);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {state}, command, "ForStatement", "evaluateStatement");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static void super_evaluateStatement(final ForStatement _self, final State state) {
    final minijava.semantics.StatementAspectStatementAspectProperties _self_ = minijava.semantics.StatementAspectStatementAspectContext.getSelf(_self);
     minijava.semantics.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }

  protected static void _privk3_evaluateStatement(final ForStatementAspectForStatementAspectProperties _self_, final ForStatement _self, final State state) {
    StateAspect.pushNewContext(state);
    {
      StatementAspect.evaluateStatement(_self.getDeclaration(), state);
      Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getCondition(), state);
      boolean _isValue = ((BooleanValue) _evaluateExpression).isValue();
      boolean _while = _isValue;
      while (_while) {
        BlockAspect.evaluateStatement(_self.getBlock(), state);
        StatementAspect.evaluateStatement(_self.getProgression(), state);
        Value _evaluateExpression_1 = ExpressionAspect.evaluateExpression(_self.getCondition(), state);
        boolean _isValue_1 = ((BooleanValue) _evaluateExpression_1).isValue();
        _while = _isValue_1;
      }
    }
    StateAspect.popCurrentContext(state);
  }
}
