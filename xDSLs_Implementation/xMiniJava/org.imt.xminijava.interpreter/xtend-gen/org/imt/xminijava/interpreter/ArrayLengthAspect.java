package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.ArrayLength;
import org.imt.minijava.xminiJava.ArrayRefValue;
import org.imt.minijava.xminiJava.IntegerValue;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = ArrayLength.class)
@SuppressWarnings("all")
public class ArrayLengthAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final ArrayLength _self, final State state) {
    final org.imt.xminijava.interpreter.ArrayLengthAspectArrayLengthAspectProperties _self_ = org.imt.xminijava.interpreter.ArrayLengthAspectArrayLengthAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.ArrayLength){
    	result = org.imt.xminijava.interpreter.ArrayLengthAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.ArrayLength)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final ArrayLength _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final ArrayLengthAspectArrayLengthAspectProperties _self_, final ArrayLength _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getArray(), state);
    final ArrayRefValue arrayRef = ((ArrayRefValue) _evaluateExpression);
    final int size = arrayRef.getInstance().getSize();
    IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = (IntegerValue it) -> {
      it.setValue(size);
    };
    return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
  }
}
