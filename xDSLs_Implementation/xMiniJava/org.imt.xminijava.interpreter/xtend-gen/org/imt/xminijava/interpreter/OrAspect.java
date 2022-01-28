package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.BooleanValue;
import org.imt.minijava.xminiJava.Or;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = Or.class)
@SuppressWarnings("all")
public class OrAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Or _self, final State state) {
    final org.imt.xminijava.interpreter.OrAspectOrAspectProperties _self_ = org.imt.xminijava.interpreter.OrAspectOrAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.Or){
    	result = org.imt.xminijava.interpreter.OrAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.Or)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final Or _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final OrAspectOrAspectProperties _self_, final Or _self, final State state) {
    final Value left = ExpressionAspect.evaluateExpression(_self.getLeft(), state);
    final Value right = ExpressionAspect.evaluateExpression(_self.getRight(), state);
    if ((left instanceof BooleanValue)) {
      if ((right instanceof BooleanValue)) {
        BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
        final Procedure1<BooleanValue> _function = (BooleanValue it) -> {
          it.setValue((((BooleanValue)left).isValue() || ((BooleanValue)right).isValue()));
        };
        return ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Unsupported or operands: ");
    _builder.append(left);
    _builder.append(" || ");
    _builder.append(right);
    _builder.append(".");
    throw new RuntimeException(_builder.toString());
  }
}
