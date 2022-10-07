package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.ArrayInstance;
import xminiJava.ArrayRefValue;
import xminiJava.BooleanTypeRef;
import xminiJava.BooleanValue;
import xminiJava.ClassRef;
import xminiJava.IntegerTypeRef;
import xminiJava.IntegerValue;
import xminiJava.NewArray;
import xminiJava.State;
import xminiJava.StringTypeRef;
import xminiJava.TypeRef;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = NewArray.class)
@SuppressWarnings("all")
public class NewArrayAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final NewArray _self, final State state) {
    final minijava.semantics.NewArrayAspectNewArrayAspectProperties _self_ = minijava.semantics.NewArrayAspectNewArrayAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.NewArray){
    	result = minijava.semantics.NewArrayAspect._privk3_evaluateExpression(_self_, (xminiJava.NewArray)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final NewArray _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final NewArrayAspectNewArrayAspectProperties _self_, final NewArray _self, final State state) {
    final ArrayInstance result = XminiJavaFactory.eINSTANCE.createArrayInstance();
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getSize(), state);
    result.setSize(((IntegerValue) _evaluateExpression).getValue());
    state.getArraysHeap().add(result);
    Value _switchResult = null;
    TypeRef _type = _self.getType();
    boolean _matched = false;
    if (_type instanceof IntegerTypeRef) {
      _matched=true;
      IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
      final Procedure1<IntegerValue> _function = new Procedure1<IntegerValue>() {
        public void apply(final IntegerValue it) {
          it.setValue(0);
        }
      };
      _switchResult = ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
    }
    if (!_matched) {
      if (_type instanceof BooleanTypeRef) {
        _matched=true;
        BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
        final Procedure1<BooleanValue> _function = new Procedure1<BooleanValue>() {
          public void apply(final BooleanValue it) {
            it.setValue(false);
          }
        };
        _switchResult = ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
      }
    }
    if (!_matched) {
      if (_type instanceof StringTypeRef) {
        _matched=true;
        _switchResult = XminiJavaFactory.eINSTANCE.createNullValue();
      }
    }
    if (!_matched) {
      if (_type instanceof ClassRef) {
        _matched=true;
        _switchResult = XminiJavaFactory.eINSTANCE.createNullValue();
      }
    }
    final Value defaultValue = _switchResult;
    int _size = result.getSize();
    IntegerRange _upTo = new IntegerRange(1, _size);
    for (final Integer i : _upTo) {
      result.getValue().add(ValueAspect.copy(defaultValue));
    }
    ArrayRefValue _createArrayRefValue = XminiJavaFactory.eINSTANCE.createArrayRefValue();
    final Procedure1<ArrayRefValue> _function = new Procedure1<ArrayRefValue>() {
      public void apply(final ArrayRefValue it) {
        it.setInstance(result);
      }
    };
    return ObjectExtensions.<ArrayRefValue>operator_doubleArrow(_createArrayRefValue, _function);
  }
}
