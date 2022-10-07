package arduino.semantics;

import arduino.BooleanModuleGet;
import arduino.Pin;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;

@Aspect(className = BooleanModuleGet.class)
@SuppressWarnings("all")
public class BooleanModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @Step
  @OverrideAspectMethod
  public static Object evaluate(final BooleanModuleGet _self) {
    final arduino.semantics.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_ = arduino.semantics.BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof arduino.BooleanModuleGet){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(arduino.semantics.BooleanModuleGet_ExecutableAspect._privk3_evaluate(_self_, (arduino.BooleanModuleGet)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "BooleanModuleGet", "evaluate");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (java.lang.Object)result;
  }

  private static Object super_evaluate(final BooleanModuleGet _self) {
    final arduino.semantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = arduino.semantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  arduino.semantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Object _privk3_evaluate(final BooleanModuleGet_ExecutableAspectBooleanModuleGetAspectProperties _self_, final BooleanModuleGet _self) {
    final Pin pin = Instruction_UtilitesAspect.getPin(Expression_EvaluableAspect.getInstruction(_self), _self.getModule());
    int _level = pin.getLevel();
    boolean _equals = (_level == 0);
    if (_equals) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
}
