package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.imt.minijava.xminiJava.Expression;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Value;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Value evaluateExpression(final Expression _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.ArrayAccessAspect
    		if (_self instanceof org.imt.minijava.xminiJava.ArrayAccess){
    			result = org.imt.xminijava.interpreter.ArrayAccessAspect.evaluateExpression((org.imt.minijava.xminiJava.ArrayAccess)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.ArrayAccessAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.StringConstantAspect
    		if (_self instanceof org.imt.minijava.xminiJava.StringConstant){
    			result = org.imt.xminijava.interpreter.StringConstantAspect.evaluateExpression((org.imt.minijava.xminiJava.StringConstant)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.StringConstantAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.BoolConstantAspect
    		if (_self instanceof org.imt.minijava.xminiJava.BoolConstant){
    			result = org.imt.xminijava.interpreter.BoolConstantAspect.evaluateExpression((org.imt.minijava.xminiJava.BoolConstant)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.BoolConstantAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.InequalityAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Inequality){
    			result = org.imt.xminijava.interpreter.InequalityAspect.evaluateExpression((org.imt.minijava.xminiJava.Inequality)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.InequalityAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.OrAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Or){
    			result = org.imt.xminijava.interpreter.OrAspect.evaluateExpression((org.imt.minijava.xminiJava.Or)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.OrAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.IntConstantAspect
    		if (_self instanceof org.imt.minijava.xminiJava.IntConstant){
    			result = org.imt.xminijava.interpreter.IntConstantAspect.evaluateExpression((org.imt.minijava.xminiJava.IntConstant)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.IntConstantAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.NotAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Not){
    			result = org.imt.xminijava.interpreter.NotAspect.evaluateExpression((org.imt.minijava.xminiJava.Not)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.NotAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.DivisionAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Division){
    			result = org.imt.xminijava.interpreter.DivisionAspect.evaluateExpression((org.imt.minijava.xminiJava.Division)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.DivisionAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.SuperiorOrEqualAspect
    		if (_self instanceof org.imt.minijava.xminiJava.SuperiorOrEqual){
    			result = org.imt.xminijava.interpreter.SuperiorOrEqualAspect.evaluateExpression((org.imt.minijava.xminiJava.SuperiorOrEqual)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.SuperiorOrEqualAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.InferiorAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Inferior){
    			result = org.imt.xminijava.interpreter.InferiorAspect.evaluateExpression((org.imt.minijava.xminiJava.Inferior)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.InferiorAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.MinusAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Minus){
    			result = org.imt.xminijava.interpreter.MinusAspect.evaluateExpression((org.imt.minijava.xminiJava.Minus)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.MinusAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.NegAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Neg){
    			result = org.imt.xminijava.interpreter.NegAspect.evaluateExpression((org.imt.minijava.xminiJava.Neg)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.NegAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.InferiorOrEqualAspect
    		if (_self instanceof org.imt.minijava.xminiJava.InferiorOrEqual){
    			result = org.imt.xminijava.interpreter.InferiorOrEqualAspect.evaluateExpression((org.imt.minijava.xminiJava.InferiorOrEqual)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.InferiorOrEqualAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.ArrayLengthAspect
    		if (_self instanceof org.imt.minijava.xminiJava.ArrayLength){
    			result = org.imt.xminijava.interpreter.ArrayLengthAspect.evaluateExpression((org.imt.minijava.xminiJava.ArrayLength)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.ArrayLengthAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.PlusAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Plus){
    			result = org.imt.xminijava.interpreter.PlusAspect.evaluateExpression((org.imt.minijava.xminiJava.Plus)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.PlusAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.EqualityAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Equality){
    			result = org.imt.xminijava.interpreter.EqualityAspect.evaluateExpression((org.imt.minijava.xminiJava.Equality)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.EqualityAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.ThisAspect
    		if (_self instanceof org.imt.minijava.xminiJava.This){
    			result = org.imt.xminijava.interpreter.ThisAspect.evaluateExpression((org.imt.minijava.xminiJava.This)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.ThisAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.SuperiorAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Superior){
    			result = org.imt.xminijava.interpreter.SuperiorAspect.evaluateExpression((org.imt.minijava.xminiJava.Superior)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.SuperiorAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.NullAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Null){
    			result = org.imt.xminijava.interpreter.NullAspect.evaluateExpression((org.imt.minijava.xminiJava.Null)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.NullAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.AndAspect
    		if (_self instanceof org.imt.minijava.xminiJava.And){
    			result = org.imt.xminijava.interpreter.AndAspect.evaluateExpression((org.imt.minijava.xminiJava.And)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.AndAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.SymbolRefAspect
    		if (_self instanceof org.imt.minijava.xminiJava.SymbolRef){
    			result = org.imt.xminijava.interpreter.SymbolRefAspect.evaluateExpression((org.imt.minijava.xminiJava.SymbolRef)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.SymbolRefAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.NewObjectAspect
    		if (_self instanceof org.imt.minijava.xminiJava.NewObject){
    			result = org.imt.xminijava.interpreter.NewObjectAspect.evaluateExpression((org.imt.minijava.xminiJava.NewObject)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.NewObjectAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.NewArrayAspect
    		if (_self instanceof org.imt.minijava.xminiJava.NewArray){
    			result = org.imt.xminijava.interpreter.NewArrayAspect.evaluateExpression((org.imt.minijava.xminiJava.NewArray)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.NewArrayAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.MethodCallExpressionAspect
    		if (_self instanceof org.imt.minijava.xminiJava.MethodCall){
    			result = org.imt.xminijava.interpreter.MethodCallExpressionAspect.evaluateExpression((org.imt.minijava.xminiJava.MethodCall)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.MethodCallExpressionAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.MultiplicationAspect
    		if (_self instanceof org.imt.minijava.xminiJava.Multiplication){
    			result = org.imt.xminijava.interpreter.MultiplicationAspect.evaluateExpression((org.imt.minijava.xminiJava.Multiplication)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.MultiplicationAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.FieldAccessAspect
    		if (_self instanceof org.imt.minijava.xminiJava.FieldAccess){
    			result = org.imt.xminijava.interpreter.FieldAccessAspect.evaluateExpression((org.imt.minijava.xminiJava.FieldAccess)_self,state);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ExpressionAspect#Value evaluateExpression(State) from org.imt.xminijava.interpreter.FieldAccessAspect
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.Expression){
    	result = org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.Expression)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  protected static Value _privk3_evaluateExpression(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final State state) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("evaluate should be overriden for type ");
    String _name = _self.getClass().getName();
    _builder.append(_name);
    throw new RuntimeException(_builder.toString());
  }
}
