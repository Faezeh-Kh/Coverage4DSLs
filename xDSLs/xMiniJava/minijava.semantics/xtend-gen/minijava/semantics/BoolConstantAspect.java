package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.BoolConstant;
import xminiJava.BooleanValue;
import xminiJava.State;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = BoolConstant.class)
@SuppressWarnings("all")
public class BoolConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final BoolConstant _self, final State state) {
    final minijava.semantics.BoolConstantAspectBoolConstantAspectProperties _self_ = minijava.semantics.BoolConstantAspectBoolConstantAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.BoolConstant){
    	result = minijava.semantics.BoolConstantAspect._privk3_evaluateExpression(_self_, (xminiJava.BoolConstant)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final BoolConstant _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final BoolConstantAspectBoolConstantAspectProperties _self_, final BoolConstant _self, final State state) {
    BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
    final Procedure1<BooleanValue> _function = new Procedure1<BooleanValue>() {
      public void apply(final BooleanValue it) {
        it.setValue(_self.getValue().equalsIgnoreCase("true"));
      }
    };
    return ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
  }
}
