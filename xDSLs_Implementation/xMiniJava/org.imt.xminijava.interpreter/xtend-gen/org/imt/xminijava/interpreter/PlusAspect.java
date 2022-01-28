package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.IntegerValue;
import org.imt.minijava.xminiJava.Plus;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.StringValue;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = Plus.class)
@SuppressWarnings("all")
public class PlusAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Plus _self, final State state) {
    final org.imt.xminijava.interpreter.PlusAspectPlusAspectProperties _self_ = org.imt.xminijava.interpreter.PlusAspectPlusAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.Plus){
    	result = org.imt.xminijava.interpreter.PlusAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.Plus)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final Plus _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final PlusAspectPlusAspectProperties _self_, final Plus _self, final State state) {
    final Value left = ExpressionAspect.evaluateExpression(_self.getLeft(), state);
    final Value right = ExpressionAspect.evaluateExpression(_self.getRight(), state);
    if (((left instanceof StringValue) || (right instanceof StringValue))) {
      StringValue _createStringValue = XminiJavaFactory.eINSTANCE.createStringValue();
      final Procedure1<StringValue> _function = (StringValue it) -> {
        String _customToString = ValueToStringAspect.customToString(left);
        String _customToString_1 = ValueToStringAspect.customToString(right);
        String _plus = (_customToString + _customToString_1);
        it.setValue(_plus);
      };
      return ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function);
    } else {
      if ((left instanceof IntegerValue)) {
        if ((right instanceof IntegerValue)) {
          IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
          final Procedure1<IntegerValue> _function_1 = (IntegerValue it) -> {
            int _value = ((IntegerValue)left).getValue();
            int _value_1 = ((IntegerValue)right).getValue();
            int _plus = (_value + _value_1);
            it.setValue(_plus);
          };
          return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function_1);
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Unsupported plus operands: ");
    _builder.append(left);
    _builder.append(" + ");
    _builder.append(right);
    _builder.append(".");
    throw new RuntimeException(_builder.toString());
  }
}
