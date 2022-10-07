package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import xminiJava.Value;

@Aspect(className = Value.class)
@SuppressWarnings("all")
public class ValueToStringAspect {
  public static String customToString(final Value _self) {
    final minijava.semantics.ValueToStringAspectValueAspectProperties _self_ = minijava.semantics.ValueToStringAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto minijava.semantics.ValueToStringAspect#String customToString() from minijava.semantics.IntegerValueToStringAspect
    		if (_self instanceof xminiJava.IntegerValue){
    			result = minijava.semantics.IntegerValueToStringAspect.customToString((xminiJava.IntegerValue)_self);
    		} else
    		// EndInjectInto minijava.semantics.ValueToStringAspect#String customToString() from minijava.semantics.IntegerValueToStringAspect
    	// BeginInjectInto minijava.semantics.ValueToStringAspect#String customToString() from minijava.semantics.BooleanValueToStringAspect
    		if (_self instanceof xminiJava.BooleanValue){
    			result = minijava.semantics.BooleanValueToStringAspect.customToString((xminiJava.BooleanValue)_self);
    		} else
    		// EndInjectInto minijava.semantics.ValueToStringAspect#String customToString() from minijava.semantics.BooleanValueToStringAspect
    	// BeginInjectInto minijava.semantics.ValueToStringAspect#String customToString() from minijava.semantics.StringValueToStringAspect
    		if (_self instanceof xminiJava.StringValue){
    			result = minijava.semantics.StringValueToStringAspect.customToString((xminiJava.StringValue)_self);
    		} else
    		// EndInjectInto minijava.semantics.ValueToStringAspect#String customToString() from minijava.semantics.StringValueToStringAspect
    	// BeginInjectInto minijava.semantics.ValueToStringAspect#String customToString() from minijava.semantics.ObjectRefValueToStringAspect
    		if (_self instanceof xminiJava.ObjectRefValue){
    			result = minijava.semantics.ObjectRefValueToStringAspect.customToString((xminiJava.ObjectRefValue)_self);
    		} else
    		// EndInjectInto minijava.semantics.ValueToStringAspect#String customToString() from minijava.semantics.ObjectRefValueToStringAspect
    // #DispatchPointCut_before# String customToString()
    if (_self instanceof xminiJava.Value){
    	result = minijava.semantics.ValueToStringAspect._privk3_customToString(_self_, (xminiJava.Value)_self);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_customToString(final ValueToStringAspectValueAspectProperties _self_, final Value _self) {
    return null;
  }
}
