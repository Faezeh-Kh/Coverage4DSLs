package arduino.semantics;

import arduino.Control;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_EvaluableAspect extends Instruction_ExecutableAspect {
  public static Boolean evaluate(final Control _self) {
    final arduino.semantics.Control_EvaluableAspectControlAspectProperties _self_ = arduino.semantics.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto arduino.semantics.Control_EvaluableAspect#Boolean evaluate() from arduino.semantics.Repeat_EvaluableAspect
    		if (_self instanceof arduino.Repeat){
    			result = arduino.semantics.Repeat_EvaluableAspect.evaluate((arduino.Repeat)_self);
    		} else
    		// EndInjectInto arduino.semantics.Control_EvaluableAspect#Boolean evaluate() from arduino.semantics.Repeat_EvaluableAspect
    	// BeginInjectInto arduino.semantics.Control_EvaluableAspect#Boolean evaluate() from arduino.semantics.While_EvaluableAspect
    		if (_self instanceof arduino.While){
    			result = arduino.semantics.While_EvaluableAspect.evaluate((arduino.While)_self);
    		} else
    		// EndInjectInto arduino.semantics.Control_EvaluableAspect#Boolean evaluate() from arduino.semantics.While_EvaluableAspect
    	// BeginInjectInto arduino.semantics.Control_EvaluableAspect#Boolean evaluate() from arduino.semantics.If_EvaluableAspect
    		if (_self instanceof arduino.If){
    			result = arduino.semantics.If_EvaluableAspect.evaluate((arduino.If)_self);
    		} else
    		// EndInjectInto arduino.semantics.Control_EvaluableAspect#Boolean evaluate() from arduino.semantics.If_EvaluableAspect
    // #DispatchPointCut_before# Boolean evaluate()
    if (_self instanceof arduino.Control){
    	result = arduino.semantics.Control_EvaluableAspect._privk3_evaluate(_self_, (arduino.Control)_self);
    };
    return (java.lang.Boolean)result;
  }

  protected static Boolean _privk3_evaluate(final Control_EvaluableAspectControlAspectProperties _self_, final Control _self) {
    return null;
  }
}
