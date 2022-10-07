package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import xminiJava.Block;
import xminiJava.BooleanValue;
import xminiJava.IfStatement;
import xminiJava.State;
import xminiJava.Value;

@Aspect(className = IfStatement.class)
@SuppressWarnings("all")
public class IfStatementAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final IfStatement _self, final State state) {
    final minijava.semantics.IfStatementAspectIfStatementAspectProperties _self_ = minijava.semantics.IfStatementAspectIfStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof xminiJava.IfStatement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			minijava.semantics.IfStatementAspect._privk3_evaluateStatement(_self_, (xminiJava.IfStatement)_self,state);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {state}, command, "IfStatement", "evaluateStatement");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static void super_evaluateStatement(final IfStatement _self, final State state) {
    final minijava.semantics.StatementAspectStatementAspectProperties _self_ = minijava.semantics.StatementAspectStatementAspectContext.getSelf(_self);
     minijava.semantics.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }

  protected static void _privk3_evaluateStatement(final IfStatementAspectIfStatementAspectProperties _self_, final IfStatement _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getExpression(), state);
    boolean _isValue = ((BooleanValue) _evaluateExpression).isValue();
    if (_isValue) {
      BlockAspect.evaluateStatement(_self.getThenBlock(), state);
    } else {
      Block _elseBlock = _self.getElseBlock();
      boolean _tripleNotEquals = (_elseBlock != null);
      if (_tripleNotEquals) {
        BlockAspect.evaluateStatement(_self.getElseBlock(), state);
      }
    }
  }
}
