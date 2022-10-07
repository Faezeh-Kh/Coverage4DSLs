package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.IntegerValue;
import xminiJava.Plus;
import xminiJava.State;
import xminiJava.StringValue;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = Plus.class)
@SuppressWarnings("all")
public class PlusAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Plus _self, final State state) {
    final minijava.semantics.PlusAspectPlusAspectProperties _self_ = minijava.semantics.PlusAspectPlusAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.Plus){
    	result = minijava.semantics.PlusAspect._privk3_evaluateExpression(_self_, (xminiJava.Plus)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final Plus _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final PlusAspectPlusAspectProperties _self_, final Plus _self, final State state) {
    final Value left = ExpressionAspect.evaluateExpression(_self.getLeft(), state);
    final Value right = ExpressionAspect.evaluateExpression(_self.getRight(), state);
    if (((left instanceof StringValue) || (right instanceof StringValue))) {
      StringValue _createStringValue = XminiJavaFactory.eINSTANCE.createStringValue();
      final Procedure1<StringValue> _function = new Procedure1<StringValue>() {
        public void apply(final StringValue it) {
          String _customToString = ValueToStringAspect.customToString(left);
          String _customToString_1 = ValueToStringAspect.customToString(right);
          String _plus = (_customToString + _customToString_1);
          it.setValue(_plus);
        }
      };
      return ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function);
    } else {
      if ((left instanceof IntegerValue)) {
        if ((right instanceof IntegerValue)) {
          IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
          final Procedure1<IntegerValue> _function_1 = new Procedure1<IntegerValue>() {
            public void apply(final IntegerValue it) {
              int _value = ((IntegerValue)left).getValue();
              int _value_1 = ((IntegerValue)right).getValue();
              int _plus = (_value + _value_1);
              it.setValue(_plus);
            }
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
