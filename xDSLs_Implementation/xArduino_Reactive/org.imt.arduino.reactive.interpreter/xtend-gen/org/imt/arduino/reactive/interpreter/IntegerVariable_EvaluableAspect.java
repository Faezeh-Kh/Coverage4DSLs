package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.arduino.reactive.arduino.IntegerVariable;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariable_EvaluableAspect extends Variable_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerVariable _self) {
    final org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_ = org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspectIntegerVariableAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof org.imt.arduino.reactive.arduino.IntegerVariable){
    	result = org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspect._privk3_evaluate(_self_, (org.imt.arduino.reactive.arduino.IntegerVariable)_self);
    };
    return (java.lang.Object)result;
  }
  
  public static Integer value(final IntegerVariable _self) {
    final org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_ = org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspectIntegerVariableAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Integer value()
    if (_self instanceof org.imt.arduino.reactive.arduino.IntegerVariable){
    	result = org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspect._privk3_value(_self_, (org.imt.arduino.reactive.arduino.IntegerVariable)_self);
    };
    return (java.lang.Integer)result;
  }
  
  public static void value(final IntegerVariable _self, final Integer value) {
    final org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_ = org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspectIntegerVariableAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void value(Integer)
    if (_self instanceof org.imt.arduino.reactive.arduino.IntegerVariable){
    	org.imt.arduino.reactive.interpreter.IntegerVariable_EvaluableAspect._privk3_value(_self_, (org.imt.arduino.reactive.arduino.IntegerVariable)_self,value);
    };
  }
  
  protected static Object _privk3_evaluate(final IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    return IntegerVariable_EvaluableAspect.value(_self);
  }
  
  protected static Integer _privk3_value(final IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Integer) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final IntegerVariable_EvaluableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self, final Integer value) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.value = value;
    }
  }
}
