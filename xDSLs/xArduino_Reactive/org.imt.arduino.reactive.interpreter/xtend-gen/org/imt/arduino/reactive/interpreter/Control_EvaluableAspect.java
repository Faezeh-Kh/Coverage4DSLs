package org.imt.arduino.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.arduino.reactive.arduino.Control;

@Aspect(className = Control.class)
@SuppressWarnings("all")
public class Control_EvaluableAspect extends Instruction_ExecutableAspect {
  public static Boolean evaluate(final Control _self) {
    final org.imt.arduino.reactive.interpreter.Control_EvaluableAspectControlAspectProperties _self_ = org.imt.arduino.reactive.interpreter.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Control_EvaluableAspect#Boolean evaluate() from org.imt.arduino.reactive.interpreter.Repeat_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.Repeat){
    			result = org.imt.arduino.reactive.interpreter.Repeat_EvaluableAspect.evaluate((org.imt.arduino.reactive.arduino.Repeat)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Control_EvaluableAspect#Boolean evaluate() from org.imt.arduino.reactive.interpreter.Repeat_EvaluableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Control_EvaluableAspect#Boolean evaluate() from org.imt.arduino.reactive.interpreter.If_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.If){
    			result = org.imt.arduino.reactive.interpreter.If_EvaluableAspect.evaluate((org.imt.arduino.reactive.arduino.If)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Control_EvaluableAspect#Boolean evaluate() from org.imt.arduino.reactive.interpreter.If_EvaluableAspect
    	// BeginInjectInto org.imt.arduino.reactive.interpreter.Control_EvaluableAspect#Boolean evaluate() from org.imt.arduino.reactive.interpreter.While_EvaluableAspect
    		if (_self instanceof org.imt.arduino.reactive.arduino.While){
    			result = org.imt.arduino.reactive.interpreter.While_EvaluableAspect.evaluate((org.imt.arduino.reactive.arduino.While)_self);
    		} else
    		// EndInjectInto org.imt.arduino.reactive.interpreter.Control_EvaluableAspect#Boolean evaluate() from org.imt.arduino.reactive.interpreter.While_EvaluableAspect
    // #DispatchPointCut_before# Boolean evaluate()
    if (_self instanceof org.imt.arduino.reactive.arduino.Control){
    	result = org.imt.arduino.reactive.interpreter.Control_EvaluableAspect._privk3_evaluate(_self_, (org.imt.arduino.reactive.arduino.Control)_self);
    };
    return (java.lang.Boolean)result;
  }
  
  protected static Boolean _privk3_evaluate(final Control_EvaluableAspectControlAspectProperties _self_, final Control _self) {
    return null;
  }
}
