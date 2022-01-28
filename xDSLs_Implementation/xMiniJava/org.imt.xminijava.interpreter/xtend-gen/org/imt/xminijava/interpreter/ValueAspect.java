package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.imt.minijava.xminiJava.Value;

@Aspect(className = Value.class)
@SuppressWarnings("all")
public class ValueAspect {
  public static Value copy(final Value _self) {
    final org.imt.xminijava.interpreter.ValueAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.ObjectRefValueAspect
    		if (_self instanceof org.imt.minijava.xminiJava.ObjectRefValue){
    			result = org.imt.xminijava.interpreter.ObjectRefValueAspect.copy((org.imt.minijava.xminiJava.ObjectRefValue)_self);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.ObjectRefValueAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.IntegerValueAspect
    		if (_self instanceof org.imt.minijava.xminiJava.IntegerValue){
    			result = org.imt.xminijava.interpreter.IntegerValueAspect.copy((org.imt.minijava.xminiJava.IntegerValue)_self);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.IntegerValueAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.BooleanValueAspect
    		if (_self instanceof org.imt.minijava.xminiJava.BooleanValue){
    			result = org.imt.xminijava.interpreter.BooleanValueAspect.copy((org.imt.minijava.xminiJava.BooleanValue)_self);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.BooleanValueAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.StringValueAspect
    		if (_self instanceof org.imt.minijava.xminiJava.StringValue){
    			result = org.imt.xminijava.interpreter.StringValueAspect.copy((org.imt.minijava.xminiJava.StringValue)_self);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.StringValueAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.ArrayRefValueAspect
    		if (_self instanceof org.imt.minijava.xminiJava.ArrayRefValue){
    			result = org.imt.xminijava.interpreter.ArrayRefValueAspect.copy((org.imt.minijava.xminiJava.ArrayRefValue)_self);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.ArrayRefValueAspect
    	// BeginInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.NullValueAspect
    		if (_self instanceof org.imt.minijava.xminiJava.NullValue){
    			result = org.imt.xminijava.interpreter.NullValueAspect.copy((org.imt.minijava.xminiJava.NullValue)_self);
    		} else
    		// EndInjectInto org.imt.xminijava.interpreter.ValueAspect#Value copy() from org.imt.xminijava.interpreter.NullValueAspect
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.imt.minijava.xminiJava.Value){
    	result = org.imt.xminijava.interpreter.ValueAspect._privk3_copy(_self_, (org.imt.minijava.xminiJava.Value)_self);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  protected static Value _privk3_copy(final ValueAspectValueAspectProperties _self_, final Value _self) {
    try {
      throw new Exception(("Must provide a copy method for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
