package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.minijava.xminiJava.Value;

@Aspect(className = Value.class)
@SuppressWarnings("all")
public class ValueToStringAspect {
  public static String customToString(final Value _self) {
    final org.imt.xminijava.interpreter.ValueToStringAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueToStringAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.xminijava.interpreter.ValueToStringAspect#String customToString() from org.imt.xminijava.interpreter.BooleanValueToStringAspect
    		if (_self instanceof org.imt.minijava.xminiJava.BooleanValue){
    			result = org.imt.xminijava.interpreter.BooleanValueToStringAspect.customToString((org.imt.minijava.xminiJava.BooleanValue)_self);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ValueToStringAspect#String customToString() from org.imt.xminijava.interpreter.BooleanValueToStringAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ValueToStringAspect#String customToString() from org.imt.xminijava.interpreter.ObjectRefValueToStringAspect
    		if (_self instanceof org.imt.minijava.xminiJava.ObjectRefValue){
    			result = org.imt.xminijava.interpreter.ObjectRefValueToStringAspect.customToString((org.imt.minijava.xminiJava.ObjectRefValue)_self);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ValueToStringAspect#String customToString() from org.imt.xminijava.interpreter.ObjectRefValueToStringAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ValueToStringAspect#String customToString() from org.imt.xminijava.interpreter.StringValueToStringAspect
    		if (_self instanceof org.imt.minijava.xminiJava.StringValue){
    			result = org.imt.xminijava.interpreter.StringValueToStringAspect.customToString((org.imt.minijava.xminiJava.StringValue)_self);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ValueToStringAspect#String customToString() from org.imt.xminijava.interpreter.StringValueToStringAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ValueToStringAspect#String customToString() from org.imt.xminijava.interpreter.IntegerValueToStringAspect
    		if (_self instanceof org.imt.minijava.xminiJava.IntegerValue){
    			result = org.imt.xminijava.interpreter.IntegerValueToStringAspect.customToString((org.imt.minijava.xminiJava.IntegerValue)_self);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ValueToStringAspect#String customToString() from org.imt.xminijava.interpreter.IntegerValueToStringAspect
    // #DispatchPointCut_before# String customToString()
    if (_self instanceof org.imt.minijava.xminiJava.Value){
    	result = org.imt.xminijava.interpreter.ValueToStringAspect._privk3_customToString(_self_, (org.imt.minijava.xminiJava.Value)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_customToString(final ValueToStringAspectValueAspectProperties _self_, final Value _self) {
    return null;
  }
}
