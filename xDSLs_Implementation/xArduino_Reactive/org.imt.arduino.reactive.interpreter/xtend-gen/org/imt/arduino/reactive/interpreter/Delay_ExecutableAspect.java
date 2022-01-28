package org.imt.arduino.reactive.interpreter;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.imt.arduino.reactive.arduino.Delay;
import org.imt.arduino.reactive.arduino.Time;

@Aspect(className = Delay.class)
@SuppressWarnings("all")
public class Delay_ExecutableAspect extends Utilities_ExecutableAspect {
  @Step
  @OverrideAspectMethod
  public static void execute(final Delay _self) {
    final org.imt.arduino.reactive.interpreter.Delay_ExecutableAspectDelayAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Delay_ExecutableAspectDelayAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof org.imt.arduino.reactive.arduino.Delay){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.arduino.reactive.interpreter.Delay_ExecutableAspect._privk3_execute(_self_, (org.imt.arduino.reactive.arduino.Delay)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Delay", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static void super_execute(final Delay _self) {
    final org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspectUtilitiesAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspectUtilitiesAspectContext.getSelf(_self);
     org.imt.arduino.reactive.interpreter.Utilities_ExecutableAspect._privk3_execute(_self_, _self);
  }
  
  protected static void _privk3_execute(final Delay_ExecutableAspectDelayAspectProperties _self_, final Delay _self) {
    try {
      Time _unit = _self.getUnit();
      boolean _equals = Objects.equal(_unit, Time.MICRO_SECOND);
      if (_equals) {
        int _value = _self.getValue();
        final int value = (_value / 1000);
        Thread.sleep(value);
      } else {
        Thread.sleep(_self.getValue());
      }
    } catch (final Throwable _t) {
      if (_t instanceof InterruptedException) {
        final InterruptedException e = (InterruptedException)_t;
        System.out.println("InterruptedException thrown because of Delay");
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
