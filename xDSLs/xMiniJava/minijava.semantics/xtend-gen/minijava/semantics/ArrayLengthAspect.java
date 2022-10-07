package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.ArrayLength;
import xminiJava.ArrayRefValue;
import xminiJava.IntegerValue;
import xminiJava.State;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = ArrayLength.class)
@SuppressWarnings("all")
public class ArrayLengthAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final ArrayLength _self, final State state) {
    final minijava.semantics.ArrayLengthAspectArrayLengthAspectProperties _self_ = minijava.semantics.ArrayLengthAspectArrayLengthAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.ArrayLength){
    	result = minijava.semantics.ArrayLengthAspect._privk3_evaluateExpression(_self_, (xminiJava.ArrayLength)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final ArrayLength _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final ArrayLengthAspectArrayLengthAspectProperties _self_, final ArrayLength _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getArray(), state);
    final ArrayRefValue arrayRef = ((ArrayRefValue) _evaluateExpression);
    final int size = arrayRef.getInstance().getSize();
    IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = new Procedure1<IntegerValue>() {
      public void apply(final IntegerValue it) {
        it.setValue(size);
      }
    };
    return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
  }
}
