package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtend2.lib.StringConcatenation;
import xminiJava.State;
import xminiJava.Statement;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public class StatementAspect {
  @Step
  public static void evaluateStatement(final Statement _self, final State state) {
    final minijava.semantics.StatementAspectStatementAspectProperties _self_ = minijava.semantics.StatementAspectStatementAspectContext.getSelf(_self);
    	// BeginInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.IfStatementAspect
    		if (_self instanceof xminiJava.IfStatement){
    			minijava.semantics.IfStatementAspect.evaluateStatement((xminiJava.IfStatement)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.IfStatementAspect
    	// BeginInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.ExpressionStatementAspect
    		if (_self instanceof xminiJava.Expression){
    			minijava.semantics.ExpressionStatementAspect.evaluateStatement((xminiJava.Expression)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.ExpressionStatementAspect
    	// BeginInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.ForStatementAspect
    		if (_self instanceof xminiJava.ForStatement){
    			minijava.semantics.ForStatementAspect.evaluateStatement((xminiJava.ForStatement)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.ForStatementAspect
    	// BeginInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.PrintStatementAspect
    		if (_self instanceof xminiJava.PrintStatement){
    			minijava.semantics.PrintStatementAspect.evaluateStatement((xminiJava.PrintStatement)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.PrintStatementAspect
    	// BeginInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.AssigmentAspect
    		if (_self instanceof xminiJava.Assignment){
    			minijava.semantics.AssigmentAspect.evaluateStatement((xminiJava.Assignment)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.AssigmentAspect
    	// BeginInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.WhileStatementAspect
    		if (_self instanceof xminiJava.WhileStatement){
    			minijava.semantics.WhileStatementAspect.evaluateStatement((xminiJava.WhileStatement)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.WhileStatementAspect
    	// BeginInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.ReturnAspect
    		if (_self instanceof xminiJava.Return){
    			minijava.semantics.ReturnAspect.evaluateStatement((xminiJava.Return)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.ReturnAspect
    	// BeginInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.BlockAspect
    		if (_self instanceof xminiJava.Block){
    			minijava.semantics.BlockAspect.evaluateStatement((xminiJava.Block)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.StatementAspect#void evaluateStatement(State) from minijava.semantics.BlockAspect
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof xminiJava.Statement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			minijava.semantics.StatementAspect._privk3_evaluateStatement(_self_, (xminiJava.Statement)_self,state);
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
