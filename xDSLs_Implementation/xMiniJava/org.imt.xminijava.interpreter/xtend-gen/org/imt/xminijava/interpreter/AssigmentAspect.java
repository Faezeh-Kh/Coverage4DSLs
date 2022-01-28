package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.ArrayAccess;
import org.imt.minijava.xminiJava.ArrayInstance;
import org.imt.minijava.xminiJava.ArrayRefValue;
import org.imt.minijava.xminiJava.Assignee;
import org.imt.minijava.xminiJava.Assignment;
import org.imt.minijava.xminiJava.Context;
import org.imt.minijava.xminiJava.Field;
import org.imt.minijava.xminiJava.FieldAccess;
import org.imt.minijava.xminiJava.FieldBinding;
import org.imt.minijava.xminiJava.IntegerValue;
import org.imt.minijava.xminiJava.ObjectInstance;
import org.imt.minijava.xminiJava.ObjectRefValue;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.Symbol;
import org.imt.minijava.xminiJava.SymbolBinding;
import org.imt.minijava.xminiJava.SymbolRef;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.VariableDeclaration;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = Assignment.class)
@SuppressWarnings("all")
public class AssigmentAspect extends StatementAspect {
  @OverrideAspectMethod
  @Step
  public static void evaluateStatement(final Assignment _self, final State state) {
    final org.imt.xminijava.interpreter.AssigmentAspectAssignmentAspectProperties _self_ = org.imt.xminijava.interpreter.AssigmentAspectAssignmentAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void evaluateStatement(State)
    if (_self instanceof org.imt.minijava.xminiJava.Assignment){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.xminijava.interpreter.AssigmentAspect._privk3_evaluateStatement(_self_, (org.imt.minijava.xminiJava.Assignment)_self,state);
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
    final org.imt.xminijava.interpreter.StatementAspectStatementAspectProperties _self_ = org.imt.xminijava.interpreter.StatementAspectStatementAspectContext.getSelf(_self);
     org.imt.xminijava.interpreter.StatementAspect._privk3_evaluateStatement(_self_, _self,state);
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
          final Procedure1<SymbolBinding> _function = (SymbolBinding it) -> {
            it.setSymbol(((Symbol)assignee));
            it.setValue(right);
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
          final Function1<FieldBinding, Boolean> _function = (FieldBinding it) -> {
            Field _field_1 = it.getField();
            return Boolean.valueOf((_field_1 == f));
          };
          final FieldBinding existingBinding = IterableExtensions.<FieldBinding>findFirst(realReceiver.getFieldbindings(), _function);
          if ((existingBinding != null)) {
            existingBinding.setValue(right);
          } else {
            FieldBinding _createFieldBinding = XminiJavaFactory.eINSTANCE.createFieldBinding();
            final Procedure1<FieldBinding> _function_1 = (FieldBinding it) -> {
              it.setField(f);
              it.setValue(right);
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
