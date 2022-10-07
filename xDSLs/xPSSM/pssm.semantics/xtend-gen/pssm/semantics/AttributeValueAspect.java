package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import statemachines.Attribute;
import statemachines.AttributeValue;

@Aspect(className = AttributeValue.class)
@SuppressWarnings("all")
public abstract class AttributeValueAspect {
  @Abstract
  protected static int get_value(final AttributeValue _self) {
    final pssm.semantics.AttributeValueAspectAttributeValueAspectProperties _self_ = pssm.semantics.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.AttributeValueAspect#int get_value() from pssm.semantics.IntegerAttributeValueAspect
    		if (_self instanceof statemachines.IntegerAttributeValue){
    			result = pssm.semantics.IntegerAttributeValueAspect.get_value((statemachines.IntegerAttributeValue)_self);
    		} else
    		// EndInjectInto pssm.semantics.AttributeValueAspect#int get_value() from pssm.semantics.IntegerAttributeValueAspect
    	// BeginInjectInto pssm.semantics.AttributeValueAspect#int get_value() from pssm.semantics.BooleanAttributeValueAspect
    		if (_self instanceof statemachines.BooleanAttributeValue){
    			result = pssm.semantics.BooleanAttributeValueAspect.get_value((statemachines.BooleanAttributeValue)_self);
    		} else
    		// EndInjectInto pssm.semantics.AttributeValueAspect#int get_value() from pssm.semantics.BooleanAttributeValueAspect
    // #DispatchPointCut_before# int get_value()
    if (_self instanceof statemachines.AttributeValue){
    	result = pssm.semantics.AttributeValueAspect._privk3_get_value(_self_, (statemachines.AttributeValue)_self);
    };
    return (int)result;
  }
  
  @Abstract
  protected static void set_value(final AttributeValue _self, final int value) {
    final pssm.semantics.AttributeValueAspectAttributeValueAspectProperties _self_ = pssm.semantics.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    	// BeginInjectInto pssm.semantics.AttributeValueAspect#void set_value(int) from pssm.semantics.IntegerAttributeValueAspect
    		if (_self instanceof statemachines.IntegerAttributeValue){
    			pssm.semantics.IntegerAttributeValueAspect.set_value((statemachines.IntegerAttributeValue)_self,value);
    		} else
    		// EndInjectInto pssm.semantics.AttributeValueAspect#void set_value(int) from pssm.semantics.IntegerAttributeValueAspect
    	// BeginInjectInto pssm.semantics.AttributeValueAspect#void set_value(int) from pssm.semantics.BooleanAttributeValueAspect
    		if (_self instanceof statemachines.BooleanAttributeValue){
    			pssm.semantics.BooleanAttributeValueAspect.set_value((statemachines.BooleanAttributeValue)_self,value);
    		} else
    		// EndInjectInto pssm.semantics.AttributeValueAspect#void set_value(int) from pssm.semantics.BooleanAttributeValueAspect
    // #DispatchPointCut_before# void set_value(int)
    if (_self instanceof statemachines.AttributeValue){
    	pssm.semantics.AttributeValueAspect._privk3_set_value(_self_, (statemachines.AttributeValue)_self,value);
    };
  }
  
  @Abstract
  protected static Attribute get_attribute(final AttributeValue _self) {
    final pssm.semantics.AttributeValueAspectAttributeValueAspectProperties _self_ = pssm.semantics.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.AttributeValueAspect#Attribute get_attribute() from pssm.semantics.IntegerAttributeValueAspect
    		if (_self instanceof statemachines.IntegerAttributeValue){
    			result = pssm.semantics.IntegerAttributeValueAspect.get_attribute((statemachines.IntegerAttributeValue)_self);
    		} else
    		// EndInjectInto pssm.semantics.AttributeValueAspect#Attribute get_attribute() from pssm.semantics.IntegerAttributeValueAspect
    	// BeginInjectInto pssm.semantics.AttributeValueAspect#Attribute get_attribute() from pssm.semantics.BooleanAttributeValueAspect
    		if (_self instanceof statemachines.BooleanAttributeValue){
    			result = pssm.semantics.BooleanAttributeValueAspect.get_attribute((statemachines.BooleanAttributeValue)_self);
    		} else
    		// EndInjectInto pssm.semantics.AttributeValueAspect#Attribute get_attribute() from pssm.semantics.BooleanAttributeValueAspect
    	// BeginInjectInto pssm.semantics.AttributeValueAspect#Attribute get_attribute() from pssm.semantics.StringAttributeValueAspect
    		if (_self instanceof statemachines.StringAttributeValue){
    			result = pssm.semantics.StringAttributeValueAspect.get_attribute((statemachines.StringAttributeValue)_self);
    		} else
    		// EndInjectInto pssm.semantics.AttributeValueAspect#Attribute get_attribute() from pssm.semantics.StringAttributeValueAspect
    // #DispatchPointCut_before# Attribute get_attribute()
    if (_self instanceof statemachines.AttributeValue){
    	result = pssm.semantics.AttributeValueAspect._privk3_get_attribute(_self_, (statemachines.AttributeValue)_self);
    };
    return (statemachines.Attribute)result;
  }
  
  @Abstract
  protected static String getString(final AttributeValue _self) {
    final pssm.semantics.AttributeValueAspectAttributeValueAspectProperties _self_ = pssm.semantics.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto pssm.semantics.AttributeValueAspect#String getString() from pssm.semantics.IntegerAttributeValueAspect
    		if (_self instanceof statemachines.IntegerAttributeValue){
    			result = pssm.semantics.IntegerAttributeValueAspect.getString((statemachines.IntegerAttributeValue)_self);
    		} else
    		// EndInjectInto pssm.semantics.AttributeValueAspect#String getString() from pssm.semantics.IntegerAttributeValueAspect
    	// BeginInjectInto pssm.semantics.AttributeValueAspect#String getString() from pssm.semantics.StringAttributeValueAspect
    		if (_self instanceof statemachines.StringAttributeValue){
    			result = pssm.semantics.StringAttributeValueAspect.getString((statemachines.StringAttributeValue)_self);
    		} else
    		// EndInjectInto pssm.semantics.AttributeValueAspect#String getString() from pssm.semantics.StringAttributeValueAspect
    	// BeginInjectInto pssm.semantics.AttributeValueAspect#String getString() from pssm.semantics.BooleanAttributeValueAspect
    		if (_self instanceof statemachines.BooleanAttributeValue){
    			result = pssm.semantics.BooleanAttributeValueAspect.getString((statemachines.BooleanAttributeValue)_self);
    		} else
    		// EndInjectInto pssm.semantics.AttributeValueAspect#String getString() from pssm.semantics.BooleanAttributeValueAspect
    // #DispatchPointCut_before# String getString()
    if (_self instanceof statemachines.AttributeValue){
    	result = pssm.semantics.AttributeValueAspect._privk3_getString(_self_, (statemachines.AttributeValue)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static int _privk3_get_value(final AttributeValueAspectAttributeValueAspectProperties _self_, final AttributeValue _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_set_value(final AttributeValueAspectAttributeValueAspectProperties _self_, final AttributeValue _self, final int value) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static Attribute _privk3_get_attribute(final AttributeValueAspectAttributeValueAspectProperties _self_, final AttributeValue _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static String _privk3_getString(final AttributeValueAspectAttributeValueAspectProperties _self_, final AttributeValue _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
