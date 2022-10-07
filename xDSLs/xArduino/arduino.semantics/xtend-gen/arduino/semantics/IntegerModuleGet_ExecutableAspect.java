package arduino.semantics;

import arduino.BluetoothTransceiver;
import arduino.IntegerModuleGet;
import arduino.Pin;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = IntegerModuleGet.class)
@SuppressWarnings("all")
public class IntegerModuleGet_ExecutableAspect extends Expression_EvaluableAspect {
  @Step
  @OverrideAspectMethod
  public static Object evaluate(final IntegerModuleGet _self) {
    final arduino.semantics.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_ = arduino.semantics.IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object evaluate()
    if (_self instanceof arduino.IntegerModuleGet){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(arduino.semantics.IntegerModuleGet_ExecutableAspect._privk3_evaluate(_self_, (arduino.IntegerModuleGet)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "IntegerModuleGet", "evaluate");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (java.lang.Object)result;
  }

  private static Object super_evaluate(final IntegerModuleGet _self) {
    final arduino.semantics.Expression_EvaluableAspectExpressionAspectProperties _self_ = arduino.semantics.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  arduino.semantics.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }

  protected static Object _privk3_evaluate(final IntegerModuleGet_ExecutableAspectIntegerModuleGetAspectProperties _self_, final IntegerModuleGet _self) {
    arduino.Module _module = _self.getModule();
    if ((_module instanceof BluetoothTransceiver)) {
      arduino.Module _module_1 = _self.getModule();
      final EList<Integer> l = BluetoothTransceiver_PushAspect.dataReceived(((BluetoothTransceiver) _module_1));
      final Integer res = IterableExtensions.<Integer>head(l);
      if ((res != null)) {
        l.remove(0);
        return res;
      } else {
        return Integer.valueOf(0);
      }
    }
    final Pin pin = Instruction_UtilitesAspect.getPin(Expression_EvaluableAspect.getInstruction(_self), _self.getModule());
    return Integer.valueOf(pin.getLevel());
  }
}
