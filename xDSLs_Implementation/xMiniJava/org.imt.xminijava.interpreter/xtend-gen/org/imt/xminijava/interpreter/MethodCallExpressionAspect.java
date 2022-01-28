package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.Context;
import org.imt.minijava.xminiJava.Expression;
import org.imt.minijava.xminiJava.Method;
import org.imt.minijava.xminiJava.MethodCall;
import org.imt.minijava.xminiJava.MethodCall2;
import org.imt.minijava.xminiJava.ObjectInstance;
import org.imt.minijava.xminiJava.ObjectRefValue;
import org.imt.minijava.xminiJava.Parameter;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.SymbolBinding;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = MethodCall.class)
@SuppressWarnings("all")
public class MethodCallExpressionAspect extends ExpressionAspect {
  @Step
  @OverrideAspectMethod
  public static Value evaluateExpression(final MethodCall _self, final State state) {
    final org.imt.xminijava.interpreter.MethodCallExpressionAspectMethodCallAspectProperties _self_ = org.imt.xminijava.interpreter.MethodCallExpressionAspectMethodCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.MethodCall){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.xminijava.interpreter.MethodCallExpressionAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.MethodCall)_self,state));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {state}, command, "MethodCall", "evaluateExpression");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final MethodCall _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final MethodCallExpressionAspectMethodCallAspectProperties _self_, final MethodCall _self, final State state) {
    Value _evaluateExpression = ExpressionAspect.evaluateExpression(_self.getReceiver(), state);
    final ObjectInstance realReceiver = ((ObjectRefValue) _evaluateExpression).getInstance();
    org.imt.minijava.xminiJava.Class _type = realReceiver.getType();
    final Method realMethod = MethodAspect.findOverride(_self.getMethod(), ((org.imt.minijava.xminiJava.Class) _type));
    final Context newContext = XminiJavaFactory.eINSTANCE.createContext();
    EList<Expression> _args = _self.getArgs();
    for (final Expression arg : _args) {
      {
        final Parameter param = realMethod.getParams().get(_self.getArgs().indexOf(arg));
        SymbolBinding _createSymbolBinding = XminiJavaFactory.eINSTANCE.createSymbolBinding();
        final Procedure1<SymbolBinding> _function = (SymbolBinding it) -> {
          it.setSymbol(param);
          it.setValue(ExpressionAspect.evaluateExpression(arg, state));
        };
        final SymbolBinding binding = ObjectExtensions.<SymbolBinding>operator_doubleArrow(_createSymbolBinding, _function);
        newContext.getBindings().add(binding);
      }
    }
    MethodCall2 _createMethodCall2 = XminiJavaFactory.eINSTANCE.createMethodCall2();
    final Procedure1<MethodCall2> _function = (MethodCall2 it) -> {
      it.setMethodcall(_self);
    };
    final MethodCall2 call = ObjectExtensions.<MethodCall2>operator_doubleArrow(_createMethodCall2, _function);
    StateAspect.pushNewFrame(state, realReceiver, call, newContext);
    MethodSortofStatementAspect.call(realMethod, state);
    final Value returnValue = StateAspect.findCurrentFrame(state).getReturnValue();
    StateAspect.popCurrentFrame(state);
    return returnValue;
  }
}
