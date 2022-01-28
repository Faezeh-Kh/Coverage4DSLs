package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.arduino.reactive.arduino.BooleanVariableRef;
import org.imt.arduino.reactive.arduino.IntegerVariableRef;
import org.imt.arduino.reactive.arduino.VariableRef;

@Aspect(className = VariableRef.class)
@SuppressWarnings("all")
public class VariableRef_EvaluableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final VariableRef _self) {
    final org.imt.arduino.reactive.interpreter.VariableRef_EvaluableAspectVariableRefAspectProperties _self_ = org.imt.arduino.reactive.interpreter.VariableRef_EvaluableAspectVariableRefAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof org.imt.arduino.reactive.arduino.VariableRef){
    	result = org.imt.arduino.reactive.interpreter.VariableRef_EvaluableAspect._privk3_evaluate(_self_, (org.imt.arduino.reactive.arduino.VariableRef)_self);
    };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final VariableRef _self) {
    final org.imt.arduino.reactive.interpreter.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.arduino.reactive.interpreter.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final VariableRef_EvaluableAspectVariableRefAspectProperties _self_, final VariableRef _self) {
    boolean _matched = false;
    if (_self instanceof BooleanVariableRef) {
      _matched=true;
      return BooleanVariable_EvaluableAspect.evaluate(((BooleanVariableRef) _self).getVariable());
    }
    if (!_matched) {
      if (_self instanceof IntegerVariableRef) {
        _matched=true;
        return IntegerVariable_EvaluableAspect.evaluate(((IntegerVariableRef) _self).getVariable());
      }
    }
    String _name = _self.eClass().getName();
    String _plus = ("type not expected: " + _name);
    throw new ClassCastException(_plus);
  }
}
