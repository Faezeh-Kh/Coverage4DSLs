package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.pssm.reactive.model.statemachines.Attribute;
import org.imt.pssm.reactive.model.statemachines.AttributeValue;

@Aspect(className = AttributeValue.class)
@SuppressWarnings("all")
public abstract class AttributeValueAspect {
  @Abstract
  protected static int get_value(final AttributeValue _self) {
    final org.imt.pssm.reactive.interpreter.AttributeValueAspectAttributeValueAspectProperties _self_ = org.imt.pssm.reactive.interpreter.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#int get_value() from org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue){
    			result = org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect.get_value((org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#int get_value() from org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#int get_value() from org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue){
    			result = org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect.get_value((org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#int get_value() from org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect
    // #DispatchPointCut_before# int get_value()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.AttributeValue){
    	result = org.imt.pssm.reactive.interpreter.AttributeValueAspect._privk3_get_value(_self_, (org.imt.pssm.reactive.model.statemachines.AttributeValue)_self);
    };
    return (int)result;
  }
  
  @Abstract
  protected static void set_value(final AttributeValue _self, final int value) {
    final org.imt.pssm.reactive.interpreter.AttributeValueAspectAttributeValueAspectProperties _self_ = org.imt.pssm.reactive.interpreter.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#void set_value(int) from org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue){
    			org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect.set_value((org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue)_self,value);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#void set_value(int) from org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#void set_value(int) from org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue){
    			org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect.set_value((org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue)_self,value);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#void set_value(int) from org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect
    // #DispatchPointCut_before# void set_value(int)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.AttributeValue){
    	org.imt.pssm.reactive.interpreter.AttributeValueAspect._privk3_set_value(_self_, (org.imt.pssm.reactive.model.statemachines.AttributeValue)_self,value);
    };
  }
  
  @Abstract
  protected static Attribute get_attribute(final AttributeValue _self) {
    final org.imt.pssm.reactive.interpreter.AttributeValueAspectAttributeValueAspectProperties _self_ = org.imt.pssm.reactive.interpreter.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#Attribute get_attribute() from org.imt.pssm.reactive.interpreter.StringAttributeValueAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.StringAttributeValue){
    			result = org.imt.pssm.reactive.interpreter.StringAttributeValueAspect.get_attribute((org.imt.pssm.reactive.model.statemachines.StringAttributeValue)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#Attribute get_attribute() from org.imt.pssm.reactive.interpreter.StringAttributeValueAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#Attribute get_attribute() from org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue){
    			result = org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect.get_attribute((org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#Attribute get_attribute() from org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#Attribute get_attribute() from org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue){
    			result = org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect.get_attribute((org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#Attribute get_attribute() from org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect
    // #DispatchPointCut_before# Attribute get_attribute()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.AttributeValue){
    	result = org.imt.pssm.reactive.interpreter.AttributeValueAspect._privk3_get_attribute(_self_, (org.imt.pssm.reactive.model.statemachines.AttributeValue)_self);
    };
    return (org.imt.pssm.reactive.model.statemachines.Attribute)result;
  }
  
  @Abstract
  protected static String getString(final AttributeValue _self) {
    final org.imt.pssm.reactive.interpreter.AttributeValueAspectAttributeValueAspectProperties _self_ = org.imt.pssm.reactive.interpreter.AttributeValueAspectAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#String getString() from org.imt.pssm.reactive.interpreter.StringAttributeValueAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.StringAttributeValue){
    			result = org.imt.pssm.reactive.interpreter.StringAttributeValueAspect.getString((org.imt.pssm.reactive.model.statemachines.StringAttributeValue)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#String getString() from org.imt.pssm.reactive.interpreter.StringAttributeValueAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#String getString() from org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue){
    			result = org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect.getString((org.imt.pssm.reactive.model.statemachines.BooleanAttributeValue)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#String getString() from org.imt.pssm.reactive.interpreter.BooleanAttributeValueAspect
    	// BeginInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#String getString() from org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect
    		if (_self instanceof org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue){
    			result = org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect.getString((org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue)_self);
    		} else
    		// EndInjectInto org.imt.pssm.reactive.interpreter.AttributeValueAspect#String getString() from org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect
    // #DispatchPointCut_before# String getString()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.AttributeValue){
    	result = org.imt.pssm.reactive.interpreter.AttributeValueAspect._privk3_getString(_self_, (org.imt.pssm.reactive.model.statemachines.AttributeValue)_self);
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
