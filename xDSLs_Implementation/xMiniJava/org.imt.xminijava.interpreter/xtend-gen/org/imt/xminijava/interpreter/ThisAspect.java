package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.ObjectInstance;
import org.imt.minijava.xminiJava.ObjectRefValue;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.This;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = This.class)
@SuppressWarnings("all")
public class ThisAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final This _self, final State state) {
    final org.imt.xminijava.interpreter.ThisAspectThisAspectProperties _self_ = org.imt.xminijava.interpreter.ThisAspectThisAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.This){
    	result = org.imt.xminijava.interpreter.ThisAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.This)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final This _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final ThisAspectThisAspectProperties _self_, final This _self, final State state) {
    final ObjectInstance currentInstance = StateAspect.findCurrentFrame(state).getInstance();
    if ((currentInstance == null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"this\" is not valid in the current context");
      throw new RuntimeException(_builder.toString());
    } else {
      ObjectRefValue _createObjectRefValue = XminiJavaFactory.eINSTANCE.createObjectRefValue();
      final Procedure1<ObjectRefValue> _function = (ObjectRefValue it) -> {
        it.setInstance(currentInstance);
      };
      return ObjectExtensions.<ObjectRefValue>operator_doubleArrow(_createObjectRefValue, _function);
    }
  }
}
