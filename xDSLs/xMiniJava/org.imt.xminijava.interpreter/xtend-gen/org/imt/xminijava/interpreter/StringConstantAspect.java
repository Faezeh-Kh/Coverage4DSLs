package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.StringConstant;
import org.imt.minijava.xminiJava.StringValue;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = StringConstant.class)
@SuppressWarnings("all")
public class StringConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final StringConstant _self, final State state) {
    final org.imt.xminijava.interpreter.StringConstantAspectStringConstantAspectProperties _self_ = org.imt.xminijava.interpreter.StringConstantAspectStringConstantAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.StringConstant){
    	result = org.imt.xminijava.interpreter.StringConstantAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.StringConstant)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final StringConstant _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final StringConstantAspectStringConstantAspectProperties _self_, final StringConstant _self, final State state) {
    StringValue _createStringValue = XminiJavaFactory.eINSTANCE.createStringValue();
    final Procedure1<StringValue> _function = (StringValue it) -> {
      it.setValue(_self.getValue());
    };
    return ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function);
  }
}
