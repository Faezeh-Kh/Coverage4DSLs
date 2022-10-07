package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.ArrayRefValue;
import xminiJava.BooleanValue;
import xminiJava.Field;
import xminiJava.FieldAccess;
import xminiJava.FieldBinding;
import xminiJava.IntegerValue;
import xminiJava.NullValue;
import xminiJava.ObjectInstance;
import xminiJava.ObjectRefValue;
import xminiJava.State;
import xminiJava.StringValue;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = FieldAccess.class)
@SuppressWarnings("all")
public class FieldAccessAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final FieldAccess _self, final State state) {
    final minijava.semantics.FieldAccessAspectFieldAccessAspectProperties _self_ = minijava.semantics.FieldAccessAspectFieldAccessAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.FieldAccess){
    	result = minijava.semantics.FieldAccessAspect._privk3_evaluateExpression(_self_, (xminiJava.FieldAccess)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final FieldAccess _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final FieldAccessAspectFieldAccessAspectProperties _self_, final FieldAccess _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getReceiver(), state);
    ObjectInstance _instance = ((ObjectRefValue) _evaluateExpression).getInstance();
    final ObjectInstance realReceiver = ((ObjectInstance) _instance);
    final Function1<FieldBinding, Boolean> _function = new Function1<FieldBinding, Boolean>() {
      public Boolean apply(final FieldBinding it) {
        Field _field = it.getField();
        Field _field_1 = _self.getField();
        return Boolean.valueOf((_field == _field_1));
      }
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
          final Procedure1<StringValue> _function_1 = new Procedure1<StringValue>() {
            public void apply(final StringValue it) {
              Value _value = binding.getValue();
              it.setValue(((StringValue) _value).getValue());
            }
          };
          final StringValue stringValue = ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function_1);
          return stringValue;
        } else {
          Value _value_2 = binding.getValue();
          if ((_value_2 instanceof IntegerValue)) {
            IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
            final Procedure1<IntegerValue> _function_2 = new Procedure1<IntegerValue>() {
              public void apply(final IntegerValue it) {
                Value _value = binding.getValue();
                it.setValue(((IntegerValue) _value).getValue());
              }
            };
            final IntegerValue intValue = ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function_2);
            return intValue;
          } else {
            Value _value_3 = binding.getValue();
            if ((_value_3 instanceof BooleanValue)) {
              BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
              final Procedure1<BooleanValue> _function_3 = new Procedure1<BooleanValue>() {
                public void apply(final BooleanValue it) {
                  Value _value = binding.getValue();
                  it.setValue(((BooleanValue) _value).isValue());
                }
              };
              final BooleanValue boolValue = ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function_3);
              return boolValue;
            } else {
              Value _value_4 = binding.getValue();
              if ((_value_4 instanceof ObjectRefValue)) {
                ObjectRefValue _createObjectRefValue = XminiJavaFactory.eINSTANCE.createObjectRefValue();
                final Procedure1<ObjectRefValue> _function_4 = new Procedure1<ObjectRefValue>() {
                  public void apply(final ObjectRefValue it) {
                    Value _value = binding.getValue();
                    it.setInstance(((ObjectRefValue) _value).getInstance());
                  }
                };
                final ObjectRefValue objRefValue = ObjectExtensions.<ObjectRefValue>operator_doubleArrow(_createObjectRefValue, _function_4);
                return objRefValue;
              } else {
                Value _value_5 = binding.getValue();
                if ((_value_5 instanceof ArrayRefValue)) {
                  ArrayRefValue _createArrayRefValue = XminiJavaFactory.eINSTANCE.createArrayRefValue();
                  final Procedure1<ArrayRefValue> _function_5 = new Procedure1<ArrayRefValue>() {
                    public void apply(final ArrayRefValue it) {
                      Value _value = binding.getValue();
                      it.setInstance(((ArrayRefValue) _value).getInstance());
                    }
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
