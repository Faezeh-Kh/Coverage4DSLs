package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.BooleanValue;
import org.imt.minijava.xminiJava.InferiorOrEqual;
import org.imt.minijava.xminiJava.IntegerValue;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = InferiorOrEqual.class)
@SuppressWarnings("all")
public class InferiorOrEqualAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final InferiorOrEqual _self, final State state) {
    final org.imt.xminijava.interpreter.InferiorOrEqualAspectInferiorOrEqualAspectProperties _self_ = org.imt.xminijava.interpreter.InferiorOrEqualAspectInferiorOrEqualAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.InferiorOrEqual){
    	result = org.imt.xminijava.interpreter.InferiorOrEqualAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.InferiorOrEqual)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final InferiorOrEqual _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final InferiorOrEqualAspectInferiorOrEqualAspectProperties _self_, final InferiorOrEqual _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getLeft(), state);
    final int left = ((IntegerValue) _evaluateExpression).getValue();
    Value _evaluateExpression_1 = ExpressionAspect.evaluateExpression(_self.getRight(), state);
    final int right = ((IntegerValue) _evaluateExpression_1).getValue();
    BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
    final Procedure1<BooleanValue> _function = (BooleanValue it) -> {
      it.setValue((left <= right));
    };
    return ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
  }
}
