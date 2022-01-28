package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.ArrayRefValue;
import org.imt.minijava.xminiJava.BooleanValue;
import org.imt.minijava.xminiJava.Field;
import org.imt.minijava.xminiJava.FieldAccess;
import org.imt.minijava.xminiJava.FieldBinding;
import org.imt.minijava.xminiJava.IntegerValue;
import org.imt.minijava.xminiJava.NullValue;
import org.imt.minijava.xminiJava.ObjectInstance;
import org.imt.minijava.xminiJava.ObjectRefValue;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.StringValue;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = FieldAccess.class)
@SuppressWarnings("all")
public class FieldAccessAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final FieldAccess _self, final State state) {
    final org.imt.xminijava.interpreter.FieldAccessAspectFieldAccessAspectProperties _self_ = org.imt.xminijava.interpreter.FieldAccessAspectFieldAccessAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.FieldAccess){
    	result = org.imt.xminijava.interpreter.FieldAccessAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.FieldAccess)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final FieldAccess _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final FieldAccessAspectFieldAccessAspectProperties _self_, final FieldAccess _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getReceiver(), state);
    ObjectInstance _instance = ((ObjectRefValue) _evaluateExpression).getInstance();
    final ObjectInstance realReceiver = ((ObjectInstance) _instance);
    final Function1<FieldBinding, Boolean> _function = (FieldBinding it) -> {
      Field _field = it.getField();
      Field _field_1 = _self.getField();
      return Boolean.valueOf((_field == _field_1));
    };
    final FieldBinding binding = IterableExtensions.<FieldBinding>findFirst(realReceiver.getFieldbindings(), _function);
    if ((binding == null)) {
      return null;
    } else {
      Value _value = binding.getValue();
      if ((_value instanceof NullValue)) {
        final NullValue nullValue = XminiJavaFactory.eINSTANCE.createNullValue();
        return nullValue;
      } else {
        Value _value_1 = binding.getValue();
        if ((_value_1 instanceof StringValue)) {
          StringValue _createStringValue = XminiJavaFactory.eINSTANCE.createStringValue();
          final Procedure1<StringValue> _function_1 = (StringValue it) -> {
            Value _value_2 = binding.getValue();
            it.setValue(((StringValue) _value_2).getValue());
          };
          final StringValue stringValue = ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function_1);
          return stringValue;
        } else {
          Value _value_2 = binding.getValue();
          if ((_value_2 instanceof IntegerValue)) {
            IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
            final Procedure1<IntegerValue> _function_2 = (IntegerValue it) -> {
              Value _value_3 = binding.getValue();
              it.setValue(((IntegerValue) _value_3).getValue());
            };
            final IntegerValue intValue = ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function_2);
            return intValue;
          } else {
            Value _value_3 = binding.getValue();
            if ((_value_3 instanceof BooleanValue)) {
              BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
              final Procedure1<BooleanValue> _function_3 = (BooleanValue it) -> {
                Value _value_4 = binding.getValue();
                it.setValue(((BooleanValue) _value_4).isValue());
              };
              final BooleanValue boolValue = ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function_3);
              return boolValue;
            } else {
              Value _value_4 = binding.getValue();
              if ((_value_4 instanceof ObjectRefValue)) {
                ObjectRefValue _createObjectRefValue = XminiJavaFactory.eINSTANCE.createObjectRefValue();
                final Procedure1<ObjectRefValue> _function_4 = (ObjectRefValue it) -> {
                  Value _value_5 = binding.getValue();
                  it.setInstance(((ObjectRefValue) _value_5).getInstance());
                };
                final ObjectRefValue objRefValue = ObjectExtensions.<ObjectRefValue>operator_doubleArrow(_createObjectRefValue, _function_4);
                return objRefValue;
              } else {
                Value _value_5 = binding.getValue();
                if ((_value_5 instanceof ArrayRefValue)) {
                  ArrayRefValue _createArrayRefValue = XminiJavaFactory.eINSTANCE.createArrayRefValue();
                  final Procedure1<ArrayRefValue> _function_5 = (ArrayRefValue it) -> {
                    Value _value_6 = binding.getValue();
                    it.setInstance(((ArrayRefValue) _value_6).getInstance());
                  };
                  final ArrayRefValue arrayRefValue = ObjectExtensions.<ArrayRefValue>operator_doubleArrow(_createArrayRefValue, _function_5);
                  return arrayRefValue;
                }
              }
            }
          }
        }
      }
    }
    return null;
  }
}
