package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.arduino.reactive.arduino.Variable;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public abstract class Variable_EvaluableAspect {
  @Abstract
  public static Object evaluate(final Variable _self) {
    final org.imt.arduino.reactive.interpreter.Variable_EvaluableAspectVariableAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Variable_EvaluableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Variable_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.IntegerVariable){
    			result = org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspect.evaluate((org.imt.arduino.reactive.arduino.IntegerVariable)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Variable_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Variable_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.BooleanVariable_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.BooleanVariable){
    			result = org.imt.arduino.reactive.interpreter.BooleanVariable_EvaluableAspect.evaluate((org.imt.arduino.reactive.arduino.BooleanVariable)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Variable_EvaluableAspect#Object evaluate() from org.imt.arduino.reactive.interpreter.BooleanVariable_EvaluableAspect
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof org.imt.arduino.reactive.arduino.Variable){
    	result = org.imt.arduino.reactive.interpreter.Variable_EvaluableAspect._privk3_evaluate(_self_, (org.imt.arduino.reactive.arduino.Variable)_self);
    };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_evaluate(final Variable_EvaluableAspectVariableAspectProperties _self_, final Variable _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
