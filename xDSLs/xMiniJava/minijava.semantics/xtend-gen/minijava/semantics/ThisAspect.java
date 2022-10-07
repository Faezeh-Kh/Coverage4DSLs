package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.ObjectInstance;
import xminiJava.ObjectRefValue;
import xminiJava.State;
import xminiJava.This;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = This.class)
@SuppressWarnings("all")
public class ThisAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final This _self, final State state) {
    final minijava.semantics.ThisAspectThisAspectProperties _self_ = minijava.semantics.ThisAspectThisAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof xminiJava.This){
    	result = minijava.semantics.ThisAspect._privk3_evaluateExpression(_self_, (xminiJava.This)_self,state);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_evaluateExpression(final This _self, final State state) {
    final minijava.semantics.ExpressionAspectExpressionAspectProperties _self_ = minijava.semantics.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  minijava.semantics.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }

  protected static Value _privk3_evaluateExpression(final ThisAspectThisAspectProperties _self_, final This _self, final State state) {
    final ObjectInstance currentInstance = StateAspect.findCurrentFrame(state).getInstance();
    if ((currentInstance == null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"this\" is not valid in the current context");
      throw new RuntimeException(_builder.toString());
    } else {
      ObjectRefValue _createObjectRefValue = XminiJavaFactory.eINSTANCE.createObjectRefValue();
      final Procedure1<ObjectRefValue> _function = new Procedure1<ObjectRefValue>() {
        public void apply(final ObjectRefValue it) {
          it.setInstance(currentInstance);
        }
      };
      return ObjectExtensions.<ObjectRefValue>operator_doubleArrow(_createObjectRefValue, _function);
    }
  }
}
