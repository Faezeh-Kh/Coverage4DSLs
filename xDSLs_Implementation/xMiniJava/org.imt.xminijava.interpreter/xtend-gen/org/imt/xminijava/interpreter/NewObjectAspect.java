package org.imt.xminijava.interpreter;

import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.Context;
import org.imt.minijava.xminiJava.Expression;
import org.imt.minijava.xminiJava.Field;
import org.imt.minijava.xminiJava.FieldBinding;
import org.imt.minijava.xminiJava.Method;
import org.imt.minijava.xminiJava.NewCall;
import org.imt.minijava.xminiJava.NewObject;
import org.imt.minijava.xminiJava.ObjectInstance;
import org.imt.minijava.xminiJava.ObjectRefValue;
import org.imt.minijava.xminiJava.Parameter;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.SymbolBinding;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = NewObject.class)
@SuppressWarnings("all")
public class NewObjectAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static Value evaluateExpression(final NewObject _self, final State state) {
    final org.imt.xminijava.interpreter.NewObjectAspectNewObjectAspectProperties _self_ = org.imt.xminijava.interpreter.NewObjectAspectNewObjectAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluateExpression(State)
    if (_self instanceof org.imt.minijava.xminiJava.NewObject){
    	result = org.imt.xminijava.interpreter.NewObjectAspect._privk3_evaluateExpression(_self_, (org.imt.minijava.xminiJava.NewObject)_self,state);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_evaluateExpression(final NewObject _self, final State state) {
    final org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectProperties _self_ = org.imt.xminijava.interpreter.ExpressionAspectExpressionAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ExpressionAspect._privk3_evaluateExpression(_self_, _self,state);
  }
  
  protected static Value _privk3_evaluateExpression(final NewObjectAspectNewObjectAspectProperties _self_, final NewObject _self, final State state) {
    ObjectInstance _createObjectInstance = XminiJavaFactory.eINSTANCE.createObjectInstance();
    final Procedure1<ObjectInstance> _function = (ObjectInstance it) -> {
      it.setType(_self.getType());
    };
    final ObjectInstance result = ObjectExtensions.<ObjectInstance>operator_doubleArrow(_createObjectInstance, _function);
    state.getObjectsHeap().add(result);
    Iterable<Field> _filter = Iterables.<Field>filter(result.getType().getMembers(), Field.class);
    for (final Field f : _filter) {
      Expression _defaultValue = f.getDefaultValue();
      boolean _tripleNotEquals = (_defaultValue != null);
      if (_tripleNotEquals) {
        final Value v = ExpressionAspect.evaluateExpression(f.getDefaultValue(), state);
        EList<FieldBinding> _fieldbindings = result.getFieldbindings();
        FieldBinding _createFieldBinding = XminiJavaFactory.eINSTANCE.createFieldBinding();
        final Procedure1<FieldBinding> _function_1 = (FieldBinding it) -> {
          it.setField(f);
          it.setValue(v);
        };
        FieldBinding _doubleArrow = ObjectExtensions.<FieldBinding>operator_doubleArrow(_createFieldBinding, _function_1);
        _fieldbindings.add(_doubleArrow);
      }
    }
    final Function1<Method, Boolean> _function_2 = (Method it) -> {
      return Boolean.valueOf(((it.getName() == null) && (it.getParams().size() == _self.getArgs().size())));
    };
    final Method constructor = IterableExtensions.<Method>findFirst(Iterables.<Method>filter(_self.getType().getMembers(), Method.class), _function_2);
    if ((constructor != null)) {
      final Context newContext = XminiJavaFactory.eINSTANCE.createContext();
      EList<Expression> _args = _self.getArgs();
      for (final Expression arg : _args) {
        {
          final Parameter param = constructor.getParams().get(_self.getArgs().indexOf(arg));
          SymbolBinding _createSymbolBinding = XminiJavaFactory.eINSTANCE.createSymbolBinding();
          final Procedure1<SymbolBinding> _function_3 = (SymbolBinding it) -> {
            it.setSymbol(param);
            it.setValue(ExpressionAspect.evaluateExpression(((Expression) arg), state));
          };
          final SymbolBinding binding = ObjectExtensions.<SymbolBinding>operator_doubleArrow(_createSymbolBinding, _function_3);
          newContext.getBindings().add(binding);
        }
      }
      NewCall _createNewCall = XminiJavaFactory.eINSTANCE.createNewCall();
      final Procedure1<NewCall> _function_3 = (NewCall it) -> {
        it.setNew(_self);
      };
      final NewCall call = ObjectExtensions.<NewCall>operator_doubleArrow(_createNewCall, _function_3);
      StateAspect.pushNewFrame(state, result, call, newContext);
      BlockAspect.evaluateStatement(constructor.getBody(), state);
      StateAspect.popCurrentFrame(state);
    }
    ObjectRefValue _createObjectRefValue = XminiJavaFactory.eINSTANCE.createObjectRefValue();
    final Procedure1<ObjectRefValue> _function_4 = (ObjectRefValue it) -> {
      it.setInstance(result);
    };
    return ObjectExtensions.<ObjectRefValue>operator_doubleArrow(_createObjectRefValue, _function_4);
  }
}
