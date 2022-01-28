package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.minijava.xminiJava.Block;
import org.imt.minijava.xminiJava.BooleanValue;
import org.imt.minijava.xminiJava.IfStatement;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Value;

@Aspect(className = IfStatement.class)
@SuppressWarnings("all")
public class IfStatementAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final IfStatement _self, final State state) {
    final org.imt.xminijava.interpreter.IfStatementAspectIfStatementAspectProperties _self_ = org.imt.xminijava.interpreter.IfStatementAspectIfStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof org.imt.minijava.xminiJava.IfStatement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.xminijava.interpreter.IfStatementAspect._privk3_evaluateStatement(_self_, (org.imt.minijava.xminiJava.IfStatement)_self,state);
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
    final org.imt.xminijava.interpreter.StatementAspectStatementAspectProperties _self_ = org.imt.xminijava.interpreter.StatementAspectStatementAspectContext.getSelf(_self);
     org.imt.xminijava.interpreter.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
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
