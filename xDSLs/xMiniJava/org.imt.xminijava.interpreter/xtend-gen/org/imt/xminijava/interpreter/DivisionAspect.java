package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.Division;
import org.imt.minijava.xminiJava.IntegerValue;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = Division.class)
@SuppressWarnings("all")
public class DivisionAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Division _self, final State state) {
    final org.imt.xminijava.interpreter.DivisionAspectDivisionAspectProperties _self_ = org.imt.xminijava.interpreter.DivisionAspectDivisionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.Division){
    	result = org.imt.xminijava.interpreter.DivisionAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.Division)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final Division _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final DivisionAspectDivisionAspectProperties _self_, final Division _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getLeft(), state);
    final int left = ((IntegerValue) _evaluateExpression).getValue();
    Value _evaluateExpression_1 = ExpressionAspect.evaluateExpression(_self.getRight(), state);
    final int right = ((IntegerValue) _evaluateExpression_1).getValue();
    IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = (IntegerValue it) -> {
      it.setValue((left / right));
    };
    return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
  }
}
