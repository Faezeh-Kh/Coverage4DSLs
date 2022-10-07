package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import xminiJava.Value;

@Aspect(className = Value.class)
@SuppressWarnings("all")
public class ValueAspect {
  public static Value copy(final Value _self) {
    final minijava.semantics.ValueAspectValueAspectProperties _self_ = minijava.semantics.ValueAspectValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.StringValueAspect
    		if (_self instanceof xminiJava.StringValue){
    			result = minijava.semantics.StringValueAspect.copy((xminiJava.StringValue)_self);
    		} else
    		// EndInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.StringValueAspect
    	// BeginInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.ObjectRefValueAspect
    		if (_self instanceof xminiJava.ObjectRefValue){
    			result = minijava.semantics.ObjectRefValueAspect.copy((xminiJava.ObjectRefValue)_self);
    		} else
    		// EndInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.ObjectRefValueAspect
    	// BeginInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.BooleanValueAspect
    		if (_self instanceof xminiJava.BooleanValue){
    			result = minijava.semantics.BooleanValueAspect.copy((xminiJava.BooleanValue)_self);
    		} else
    		// EndInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.BooleanValueAspect
    	// BeginInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.NullValueAspect
    		if (_self instanceof xminiJava.NullValue){
    			result = minijava.semantics.NullValueAspect.copy((xminiJava.NullValue)_self);
    		} else
    		// EndInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.NullValueAspect
    	// BeginInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.IntegerValueAspect
    		if (_self instanceof xminiJava.IntegerValue){
    			result = minijava.semantics.IntegerValueAspect.copy((xminiJava.IntegerValue)_self);
    		} else
    		// EndInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.IntegerValueAspect
    	// BeginInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.ArrayRefValueAspect
    		if (_self instanceof xminiJava.ArrayRefValue){
    			result = minijava.semantics.ArrayRefValueAspect.copy((xminiJava.ArrayRefValue)_self);
    		} else
    		// EndInjectInto minijava.semantics.ValueAspect#Value copy() from minijava.semantics.ArrayRefValueAspect
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof xminiJava.Value){
    	result = minijava.semantics.ValueAspect._privk3_copy(_self_, (xminiJava.Value)_self);
    };
    return (xminiJava.Value)result;
  }

  protected static Value _privk3_copy(final ValueAspectValueAspectProperties _self_, final Value _self) {
    try {
      throw new Exception(("Must provide a copy method for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
