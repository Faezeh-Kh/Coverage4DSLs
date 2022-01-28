package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.minijava.xminiJava.Null;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = Null.class)
@SuppressWarnings("all")
public class NullAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Null _self, final State state) {
    final org.imt.xminijava.interpreter.NullAspectNullAspectProperties _self_ = org.imt.xminijava.interpreter.NullAspectNullAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.Null){
    	result = org.imt.xminijava.interpreter.NullAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.Null)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final Null _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final NullAspectNullAspectProperties _self_, final Null _self, final State state) {
    return XminiJavaFactory.eINSTANCE.createNullValue();
  }
}
