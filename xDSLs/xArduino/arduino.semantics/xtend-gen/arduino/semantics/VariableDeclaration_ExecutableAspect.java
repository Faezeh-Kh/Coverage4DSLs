package arduino.semantics;

import arduino.BooleanVariable;
import arduino.IntegerVariable;
import arduino.Variable;
import arduino.VariableDeclaration;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;

@Aspect(className = VariableDeclaration.class)
@SuppressWarnings("all")
public class VariableDeclaration_ExecutableAspect extends Instruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final VariableDeclaration _self) {
    final arduino.semantics.VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_ = arduino.semantics.VariableDeclaration_ExecutableAspectVariableDeclarationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.VariableDeclaration){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.VariableDeclaration_ExecutableAspect._privk3_execute(_self_, (arduino.VariableDeclaration)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "VariableDeclaration", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static void super_execute(final VariableDeclaration _self) {
    final arduino.semantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = arduino.semantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     arduino.semantics.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final VariableDeclaration_ExecutableAspectVariableDeclarationAspectProperties _self_, final VariableDeclaration _self) {
    Variable _variable = _self.getVariable();
    boolean _matched = false;
    if (_variable instanceof IntegerVariable) {
      _matched=true;
      Variable _variable_1 = _self.getVariable();
      Variable _variable_2 = _self.getVariable();
      IntegerVariable_EvaluableAspect.value(((IntegerVariable) _variable_1), Integer.valueOf(((IntegerVariable) _variable_2).getInitialValue()));
    }
    if (!_matched) {
      if (_variable instanceof BooleanVariable) {
        _matched=true;
        Variable _variable_1 = _self.getVariable();
        Variable _variable_2 = _self.getVariable();
        BooleanVariable_EvaluableAspect.value(((BooleanVariable) _variable_1), Boolean.valueOf(((BooleanVariable) _variable_2).isInitialValue()));
      }
    }
  }
}
