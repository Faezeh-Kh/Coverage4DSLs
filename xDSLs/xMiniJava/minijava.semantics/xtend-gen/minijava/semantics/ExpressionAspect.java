package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import xminiJava.Expression;
import xminiJava.State;
import xminiJava.Value;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Value evaluateExpression(final Expression _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.SymbolRefAspect
    		if (_self instanceof xminiJava.SymbolRef){
    			result = minijava.semantics.SymbolRefAspect.evaluateExpression((xminiJava.SymbolRef)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.SymbolRefAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.NegAspect
    		if (_self instanceof xminiJava.Neg){
    			result = minijava.semantics.NegAspect.evaluateExpression((xminiJava.Neg)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.NegAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.AndAspect
    		if (_self instanceof xminiJava.And){
    			result = minijava.semantics.AndAspect.evaluateExpression((xminiJava.And)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.AndAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.InferiorAspect
    		if (_self instanceof xminiJava.Inferior){
    			result = minijava.semantics.InferiorAspect.evaluateExpression((xminiJava.Inferior)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.InferiorAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.StringConstantAspect
    		if (_self instanceof xminiJava.StringConstant){
    			result = minijava.semantics.StringConstantAspect.evaluateExpression((xminiJava.StringConstant)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.StringConstantAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.ArrayLengthAspect
    		if (_self instanceof xminiJava.ArrayLength){
    			result = minijava.semantics.ArrayLengthAspect.evaluateExpression((xminiJava.ArrayLength)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.ArrayLengthAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.NewArrayAspect
    		if (_self instanceof xminiJava.NewArray){
    			result = minijava.semantics.NewArrayAspect.evaluateExpression((xminiJava.NewArray)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.NewArrayAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.BoolConstantAspect
    		if (_self instanceof xminiJava.BoolConstant){
    			result = minijava.semantics.BoolConstantAspect.evaluateExpression((xminiJava.BoolConstant)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.BoolConstantAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.ThisAspect
    		if (_self instanceof xminiJava.This){
    			result = minijava.semantics.ThisAspect.evaluateExpression((xminiJava.This)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.ThisAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.MinusAspect
    		if (_self instanceof xminiJava.Minus){
    			result = minijava.semantics.MinusAspect.evaluateExpression((xminiJava.Minus)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.MinusAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.MethodCallExpressionAspect
    		if (_self instanceof xminiJava.MethodCall){
    			result = minijava.semantics.MethodCallExpressionAspect.evaluateExpression((xminiJava.MethodCall)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.MethodCallExpressionAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.IntConstantAspect
    		if (_self instanceof xminiJava.IntConstant){
    			result = minijava.semantics.IntConstantAspect.evaluateExpression((xminiJava.IntConstant)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.IntConstantAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.OrAspect
    		if (_self instanceof xminiJava.Or){
    			result = minijava.semantics.OrAspect.evaluateExpression((xminiJava.Or)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.OrAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.InequalityAspect
    		if (_self instanceof xminiJava.Inequality){
    			result = minijava.semantics.InequalityAspect.evaluateExpression((xminiJava.Inequality)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.InequalityAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.InferiorOrEqualAspect
    		if (_self instanceof xminiJava.InferiorOrEqual){
    			result = minijava.semantics.InferiorOrEqualAspect.evaluateExpression((xminiJava.InferiorOrEqual)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.InferiorOrEqualAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.NotAspect
    		if (_self instanceof xminiJava.Not){
    			result = minijava.semantics.NotAspect.evaluateExpression((xminiJava.Not)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.NotAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.NullAspect
    		if (_self instanceof xminiJava.Null){
    			result = minijava.semantics.NullAspect.evaluateExpression((xminiJava.Null)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.NullAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.EqualityAspect
    		if (_self instanceof xminiJava.Equality){
    			result = minijava.semantics.EqualityAspect.evaluateExpression((xminiJava.Equality)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.EqualityAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.DivisionAspect
    		if (_self instanceof xminiJava.Division){
    			result = minijava.semantics.DivisionAspect.evaluateExpression((xminiJava.Division)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.DivisionAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.NewObjectAspect
    		if (_self instanceof xminiJava.NewObject){
    			result = minijava.semantics.NewObjectAspect.evaluateExpression((xminiJava.NewObject)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.NewObjectAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.MultiplicationAspect
    		if (_self instanceof xminiJava.Multiplication){
    			result = minijava.semantics.MultiplicationAspect.evaluateExpression((xminiJava.Multiplication)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.MultiplicationAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.SuperiorAspect
    		if (_self instanceof xminiJava.Superior){
    			result = minijava.semantics.SuperiorAspect.evaluateExpression((xminiJava.Superior)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.SuperiorAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.FieldAccessAspect
    		if (_self instanceof xminiJava.FieldAccess){
    			result = minijava.semantics.FieldAccessAspect.evaluateExpression((xminiJava.FieldAccess)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.FieldAccessAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.SuperiorOrEqualAspect
    		if (_self instanceof xminiJava.SuperiorOrEqual){
    			result = minijava.semantics.SuperiorOrEqualAspect.evaluateExpression((xminiJava.SuperiorOrEqual)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.SuperiorOrEqualAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.ArrayAccessAspect
    		if (_self instanceof xminiJava.ArrayAccess){
    			result = minijava.semantics.ArrayAccessAspect.evaluateExpression((xminiJava.ArrayAccess)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.ArrayAccessAspect
    	// BeginInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.PlusAspect
    		if (_self instanceof xminiJava.Plus){
    			result = minijava.semantics.PlusAspect.evaluateExpression((xminiJava.Plus)_self,state);
    		} else
    		// EndInjectInto minijava.semantics.ExpressionAspect#Value evaluateExpression(State) from minijava.semantics.PlusAspect
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.Expression){
    	result = minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, (xminiJava.Expression)_self,state);
    };
    return (xminiJava.Value)result;
  }

  protected static Value _privk3_evaluateExpression(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final State state) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("evaluate should be overriden for type ");
    String _name = _self.getClass().getName();
    _builder.append(_name);
    throw new RuntimeException(_builder.toString());
  }
}
