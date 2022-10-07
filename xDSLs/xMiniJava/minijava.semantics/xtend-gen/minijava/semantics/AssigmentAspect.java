package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.ArrayAccess;
import xminiJava.ArrayInstance;
import xminiJava.ArrayRefValue;
import xminiJava.Assignee;
import xminiJava.Assignment;
import xminiJava.Context;
import xminiJava.Field;
import xminiJava.FieldAccess;
import xminiJava.FieldBinding;
import xminiJava.IntegerValue;
import xminiJava.ObjectInstance;
import xminiJava.ObjectRefValue;
import xminiJava.State;
import xminiJava.Symbol;
import xminiJava.SymbolBinding;
import xminiJava.SymbolRef;
import xminiJava.Value;
import xminiJava.VariableDeclaration;
import xminiJava.XminiJavaFactory;

@Aspect(className = Assignment.class)
@SuppressWarnings("all")
public class AssigmentAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final Assignment _self, final State state) {
    final minijava.semantics.AssigmentAspectAssignmentAspectProperties _self_ = minijava.semantics.AssigmentAspectAssignmentAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof xminiJava.Assignment){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			minijava.semantics.AssigmentAspect._privk3_evaluateStatement(_self_, (xminiJava.Assignment)_self,state);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {state}, command, "Assignment", "evaluateStatement");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static void super_evaluateStatement(final Assignment _self, final State state) {
    final minijava.semantics.StatementAspectStatementAspectProperties _self_ = minijava.semantics.StatementAspectStatementAspectContext.getSelf(_self);
     minijava.semantics.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
  }

  protected static void _privk3_evaluateStatement(final AssigmentAspectAssignmentAspectProperties _self_, final Assignment _self, final State state) {
    try {
      final Context context = StateAspect.findCurrentContext(state);
      final Value right = ExpressionAspect.evaluateExpression(_self.getValue(), state);
      final Assignee assignee = _self.getAssignee();
      boolean _matched = false;
      if (assignee instanceof SymbolRef) {
        _matched=true;
        final SymbolBinding existingBinding = ContextAspect.findBinding(context, ((SymbolRef)assignee).getSymbol());
        existingBinding.setValue(right);
      }
      if (!_matched) {
        if (assignee instanceof VariableDeclaration) {
          _matched=true;
          SymbolBinding _createSymbolBinding = XminiJavaFactory.eINSTANCE.createSymbolBinding();
          final Procedure1<SymbolBinding> _function = new Procedure1<SymbolBinding>() {
            public void apply(final SymbolBinding it) {
              it.setSymbol(((Symbol)assignee));
              it.setValue(right);
            }
          };
          final SymbolBinding binding = ObjectExtensions.<SymbolBinding>operator_doubleArrow(_createSymbolBinding, _function);
          context.getBindings().add(binding);
        }
      }
      if (!_matched) {
        if (assignee instanceof FieldAccess) {
          _matched=true;
          Field _field = ((FieldAccess)assignee).getField();
          final Field f = ((Field) _field);
          Value _evaluateExpression = ExpressionAspect.evaluateExpression(((FieldAccess)assignee).getReceiver(), state);
          final ObjectInstance realReceiver = ((ObjectRefValue) _evaluateExpression).getInstance();
          final Function1<FieldBinding, Boolean> _function = new Function1<FieldBinding, Boolean>() {
            public Boolean apply(final FieldBinding it) {
              Field _field = it.getField();
              return Boolean.valueOf((_field == f));
            }
          };
          final FieldBinding existingBinding = IterableExtensions.<FieldBinding>findFirst(realReceiver.getFieldbindings(), _function);
          if ((existingBinding != null)) {
            existingBinding.setValue(right);
          } else {
            FieldBinding _createFieldBinding = XminiJavaFactory.eINSTANCE.createFieldBinding();
            final Procedure1<FieldBinding> _function_1 = new Procedure1<FieldBinding>() {
              public void apply(final FieldBinding it) {
                it.setField(f);
                it.setValue(right);
              }
            };
            final FieldBinding binding = ObjectExtensions.<FieldBinding>operator_doubleArrow(_createFieldBinding, _function_1);
            realReceiver.getFieldbindings().add(binding);
          }
        }
      }
      if (!_matched) {
        if (assignee instanceof ArrayAccess) {
          _matched=true;
          Value _evaluateExpression = ExpressionAspect.evaluateExpression(((ArrayAccess)assignee).getObject(), state);
          final ArrayInstance array = ((ArrayRefValue) _evaluateExpression).getInstance();
          Value _evaluateExpression_1 = ExpressionAspect.evaluateExpression(((ArrayAccess)assignee).getIndex(), state);
          final int index = ((IntegerValue) _evaluateExpression_1).getValue();
          array.getValue().set(index, right);
        }
      }
      if (!_matched) {
        throw new Exception(("Cannot assign a value to " + assignee));
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
