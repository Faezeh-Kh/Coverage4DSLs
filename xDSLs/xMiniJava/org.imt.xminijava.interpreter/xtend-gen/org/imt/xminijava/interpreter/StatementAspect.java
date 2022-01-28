package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Statement;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public class StatementAspect {
  @Step
  public static void evaluateStatement(final Statement _self, final State state) {
    final org.imt.xminijava.interpreter.StatementAspectStatementAspectProperties _self_ = org.imt.xminijava.interpreter.StatementAspectStatementAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.PrintStatementAspect
    		if (_self instanceof org.imt.minijava.xminiJava.PrintStatement){
    			org.imt.xminijava.interpreter.PrintStatementAspect.evaluateStatement((org.imt.minijava.xminiJava.PrintStatement)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.PrintStatementAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.WhileStatementAspect
    		if (_self instanceof org.imt.minijava.xminiJava.WhileStatement){
    			org.imt.xminijava.interpreter.WhileStatementAspect.evaluateStatement((org.imt.minijava.xminiJava.WhileStatement)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.WhileStatementAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.AssigmentAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Assignment){
    			org.imt.xminijava.interpreter.AssigmentAspect.evaluateStatement((org.imt.minijava.xminiJava.Assignment)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.AssigmentAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.ReturnAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Return){
    			org.imt.xminijava.interpreter.ReturnAspect.evaluateStatement((org.imt.minijava.xminiJava.Return)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.ReturnAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.ExpressionStatementAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Expression){
    			org.imt.xminijava.interpreter.ExpressionStatementAspect.evaluateStatement((org.imt.minijava.xminiJava.Expression)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.ExpressionStatementAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.ForStatementAspect
    		if (_self instanceof org.imt.minijava.xminiJava.ForStatement){
    			org.imt.xminijava.interpreter.ForStatementAspect.evaluateStatement((org.imt.minijava.xminiJava.ForStatement)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.ForStatementAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.IfStatementAspect
    		if (_self instanceof org.imt.minijava.xminiJava.IfStatement){
    			org.imt.xminijava.interpreter.IfStatementAspect.evaluateStatement((org.imt.minijava.xminiJava.IfStatement)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.IfStatementAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.BlockAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Block){
    			org.imt.xminijava.interpreter.BlockAspect.evaluateStatement((org.imt.minijava.xminiJava.Block)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.StatementAspect#void evaluateStatement(State) from org.imt.xminijava.interpreter.BlockAspect
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof org.imt.minijava.xminiJava.Statement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.xminijava.interpreter.StatementAspect._privk3_evaluateStatement(_self_, (org.imt.minijava.xminiJava.Statement)_self,state);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {state}, command, "Statement", "evaluateStatement");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_evaluateStatement(final StatementAspectStatementAspectProperties _self_, final Statement _self, final State state) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("evaluate should be overriden for type ");
    String _name = _self.getClass().getName();
    _builder.append(_name);
    throw new RuntimeException(_builder.toString());
  }
}
