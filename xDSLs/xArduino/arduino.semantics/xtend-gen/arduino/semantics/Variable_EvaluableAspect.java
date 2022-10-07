package arduino.semantics;

import arduino.Variable;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public abstract class Variable_EvaluableAspect {
  @Abstract
  public static Object evaluate(final Variable _self) {
    final arduino.semantics.Variable_EvaluableAspectVariableAspectProperties _self_ = arduino.semantics.Variable_EvaluableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto arduino.semantics.Variable_EvaluableAspect#Object evaluate() from arduino.semantics.BooleanVariable_EvaluableAspect
    		if (_self instanceof arduino.BooleanVariable){
    			result = arduino.semantics.BooleanVariable_EvaluableAspect.evaluate((arduino.BooleanVariable)_self);
    		} else
    		// EndInjectInto arduino.semantics.Variable_EvaluableAspect#Object evaluate() from arduino.semantics.BooleanVariable_EvaluableAspect
    	// BeginInjectInto arduino.semantics.Variable_EvaluableAspect#Object evaluate() from arduino.semantics.IntegerVariable_EvaluableAspect
    		if (_self instanceof arduino.IntegerVariable){
    			result = arduino.semantics.IntegerVariable_EvaluableAspect.evaluate((arduino.IntegerVariable)_self);
    		} else
    		// EndInjectInto arduino.semantics.Variable_EvaluableAspect#Object evaluate() from arduino.semantics.IntegerVariable_EvaluableAspect
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof arduino.Variable){
    	result = arduino.semantics.Variable_EvaluableAspect._privk3_evaluate(_self_, (arduino.Variable)_self);
    };
    return (java.lang.Object)result;
  }

  protected static Object _privk3_evaluate(final Variable_EvaluableAspectVariableAspectProperties _self_, final Variable _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
