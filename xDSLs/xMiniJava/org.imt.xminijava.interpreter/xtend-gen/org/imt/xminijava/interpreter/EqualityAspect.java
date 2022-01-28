package org.imt.xminijava.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.BooleanValue;
import org.imt.minijava.xminiJava.Equality;
import org.imt.minijava.xminiJava.IntegerValue;
import org.imt.minijava.xminiJava.NullValue;
import org.imt.minijava.xminiJava.ObjectRefValue;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.StringValue;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = Equality.class)
@SuppressWarnings("all")
public class EqualityAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final Equality _self, final State state) {
    final org.imt.xminijava.interpreter.EqualityAspectEqualityAspectProperties _self_ = org.imt.xminijava.interpreter.EqualityAspectEqualityAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.Equality){
    	result = org.imt.xminijava.interpreter.EqualityAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.Equality)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final Equality _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final EqualityAspectEqualityAspectProperties _self_, final Equality _self, final State state) {
    final Value left = ExpressionAspect.evaluateExpression(_self.getLeft(), state);
    final Value right = ExpressionAspect.evaluateExpression(_self.getRight(), state);
    boolean _xifexpression = false;
    if ((left instanceof IntegerValue)) {
      int _value = ((IntegerValue)left).getValue();
      int _value_1 = ((IntegerValue) right).getValue();
      _xifexpression = (_value == _value_1);
    } else {
      boolean _xifexpression_1 = false;
      if ((left instanceof StringValue)) {
        String _value_2 = ((StringValue)left).getValue();
        String _value_3 = ((StringValue) right).getValue();
        _xifexpression_1 = Objects.equal(_value_2, _value_3);
      } else {
        boolean _xifexpression_2 = false;
        if ((left instanceof BooleanValue)) {
          boolean _isValue = ((BooleanValue)left).isValue();
          boolean _isValue_1 = ((BooleanValue) right).isValue();
          _xifexpression_2 = (Boolean.valueOf(_isValue) == Boolean.valueOf(_isValue_1));
        } else {
          boolean _xifexpression_3 = false;
          if ((left instanceof NullValue)) {
            _xifexpression_3 = (right instanceof NullValue);
          } else {
            boolean _xifexpression_4 = false;
            if ((left instanceof ObjectRefValue)) {
              _xifexpression_4 = ((right instanceof ObjectRefValue) && (((ObjectRefValue)left).getInstance() == ((ObjectRefValue) right).getInstance()));
            } else {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("Type unsupported for equality operator: ");
              Class<? extends Value> _class = left.getClass();
              _builder.append(_class);
              throw new RuntimeException(_builder.toString());
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    final boolean result = _xifexpression;
    BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
    final Procedure1<BooleanValue> _function = (BooleanValue it) -> {
      it.setValue(result);
    };
    return ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
  }
}
