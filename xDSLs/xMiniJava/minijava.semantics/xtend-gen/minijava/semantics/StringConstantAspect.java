package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.State;
import xminiJava.StringConstant;
import xminiJava.StringValue;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = StringConstant.class)
@SuppressWarnings("all")
public class StringConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final StringConstant _self, final State state) {
    final minijava.semantics.StringConstantAspectStringConstantAspectProperties _self_ = minijava.semantics.StringConstantAspectStringConstantAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.StringConstant){
    	result = minijava.semantics.StringConstantAspect._privk3_evaluateExpression(_self_, (xminiJava.StringConstant)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final StringConstant _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final StringConstantAspectStringConstantAspectProperties _self_, final StringConstant _self, final State state) {
    StringValue _createStringValue = XminiJavaFactory.eINSTANCE.createStringValue();
    final Procedure1<StringValue> _function = new Procedure1<StringValue>() {
      public void apply(final StringValue it) {
        it.setValue(_self.getValue());
      }
    };
    return ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function);
  }
}
