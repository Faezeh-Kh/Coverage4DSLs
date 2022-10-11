package arduino.semantics;

import arduino.BooleanVariable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = BooleanVariable.class)
@SuppressWarnings("all")
public class BooleanVariable_EvaluableAspect extends Variable_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BooleanVariable _self) {
    final arduino.semantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_ = arduino.semantics.BooleanVariable_EvaluableAspectBooleanVariableAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof arduino.BooleanVariable){
    	result = arduino.semantics.BooleanVariable_EvaluableAspect._privk3_evaluate(_self_, (arduino.BooleanVariable)_self);
    };
    return (java.lang.Object)result;
  }

  public static Boolean value(final BooleanVariable _self) {
    final arduino.semantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_ = arduino.semantics.BooleanVariable_EvaluableAspectBooleanVariableAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean value()
    if (_self instanceof arduino.BooleanVariable){
    	result = arduino.semantics.BooleanVariable_EvaluableAspect._privk3_value(_self_, (arduino.BooleanVariable)_self);
    };
    return (java.lang.Boolean)result;
  }

  public static void value(final BooleanVariable _self, final Boolean value) {
    final arduino.semantics.BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_ = arduino.semantics.BooleanVariable_EvaluableAspectBooleanVariableAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void value(Boolean)
    if (_self instanceof arduino.BooleanVariable){
    	arduino.semantics.BooleanVariable_EvaluableAspect._privk3_value(_self_, (arduino.BooleanVariable)_self,value);
    };
  }

  protected static Object _privk3_evaluate(final BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    return BooleanVariable_EvaluableAspect.value(_self);
  }

  protected static Boolean _privk3_value(final BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Boolean) ret;
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

  protected static void _privk3_value(final BooleanVariable_EvaluableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self, final Boolean value) {
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