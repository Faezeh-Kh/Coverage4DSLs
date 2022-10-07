package arduino.semantics;

import arduino.BooleanVariable;
import arduino.IntegerVariable;
import arduino.Variable;
import arduino.VariableAssignment;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;

@Aspect(className = VariableAssignment.class)
@SuppressWarnings("all")
public class VariableAssignment_ExecutableAspect extends Instruction_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final VariableAssignment _self) {
    final arduino.semantics.VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_ = arduino.semantics.VariableAssignment_ExecutableAspectVariableAssignmentAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.VariableAssignment){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			arduino.semantics.VariableAssignment_ExecutableAspect._privk3_execute(_self_, (arduino.VariableAssignment)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "VariableAssignment", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }

  private static void super_execute(final VariableAssignment _self) {
    final arduino.semantics.Instruction_ExecutableAspectInstructionAspectProperties _self_ = arduino.semantics.Instruction_ExecutableAspectInstructionAspectContext.getSelf(_self);
     arduino.semantics.Instruction_ExecutableAspect._privk3_execute(_self_, _self);
  }

  protected static void _privk3_execute(final VariableAssignment_ExecutableAspectVariableAssignmentAspectProperties _self_, final VariableAssignment _self) {
    final Variable variable = _self.getVariable();
    final Object value = Expression_EvaluableAspect.evaluate(_self.getOperand());
    if ((variable instanceof IntegerVariable)) {
      ((IntegerVariable)variable).setInitialValue((((Integer) value)).intValue());
      IntegerVariable_EvaluableAspect.value(((IntegerVariable)variable), ((Integer) value));
    }
    if ((variable instanceof BooleanVariable)) {
      BooleanVariable_EvaluableAspect.value(((BooleanVariable)variable), ((Boolean) value));
    }
  }
}
