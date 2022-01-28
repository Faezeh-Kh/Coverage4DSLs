package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.imt.minijava.xminiJava.Frame;
import org.imt.minijava.xminiJava.Return;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Value;

@Aspect(className = Return.class)
@SuppressWarnings("all")
public class ReturnAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final Return _self, final State state) {
    final org.imt.xminijava.interpreter.ReturnAspectReturnAspectProperties _self_ = org.imt.xminijava.interpreter.ReturnAspectReturnAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof org.imt.minijava.xminiJava.Return){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.xminijava.interpreter.ReturnAspect._privk3_evaluateStatement(_self_, (org.imt.minijava.xminiJava.Return)_self,state);
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
    final org.imt.xminijava.interpreter.StatementAspectStatementAspectProperties _self_ = org.imt.xminijava.interpreter.StatementAspectStatementAspectContext.getSelf(_self);
     org.imt.xminijava.interpreter.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }
  
  protected static void _privk3_evaluateStatement(final ReturnAspectReturnAspectProperties _self_, final Return _self, final State state) {
    final Value value = ExpressionAspect.evaluateExpression(_self.getExpression(), state);
    Frame _findCurrentFrame = StateAspect.findCurrentFrame(state);
    _findCurrentFrame.setReturnValue(value);
  }
}
