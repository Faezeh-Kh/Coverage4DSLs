package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.BoolConstant;
import org.imt.minijava.xminiJava.BooleanValue;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = BoolConstant.class)
@SuppressWarnings("all")
public class BoolConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final BoolConstant _self, final State state) {
    final org.imt.xminijava.interpreter.BoolConstantAspectBoolConstantAspectProperties _self_ = org.imt.xminijava.interpreter.BoolConstantAspectBoolConstantAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.BoolConstant){
    	result = org.imt.xminijava.interpreter.BoolConstantAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.BoolConstant)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final BoolConstant _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final BoolConstantAspectBoolConstantAspectProperties _self_, final BoolConstant _self, final State state) {
    BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
    final Procedure1<BooleanValue> _function = (BooleanValue it) -> {
      it.setValue(_self.getValue().equalsIgnoreCase("true"));
    };
    return ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
  }
}
