package org.imt.pssm.reactive.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.pssm.reactive.model.statemachines.Attribute;
import org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue;

@Aspect(className = IntegerAttributeValue.class)
@SuppressWarnings("all")
public class IntegerAttributeValueAspect extends AttributeValueAspect {
  @OverrideAspectMethod
  protected static int get_value(final IntegerAttributeValue _self) {
    final org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_ = org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspectIntegerAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int get_value()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue){
    	result = org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect._privk3_get_value(_self_, (org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue)_self);
    };
    return (int)result;
  }
  
  @OverrideAspectMethod
  protected static void set_value(final IntegerAttributeValue _self, final int value) {
    final org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_ = org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspectIntegerAttributeValueAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void set_value(int)
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue){
    	org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect._privk3_set_value(_self_, (org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue)_self,value);
    };
  }
  
  @OverrideAspectMethod
  protected static Attribute get_attribute(final IntegerAttributeValue _self) {
    final org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_ = org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspectIntegerAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Attribute get_attribute()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue){
    	result = org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect._privk3_get_attribute(_self_, (org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue)_self);
    };
    return (org.imt.pssm.reactive.model.statemachines.Attribute)result;
  }
  
  @OverrideAspectMethod
  protected static String getString(final IntegerAttributeValue _self) {
    final org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_ = org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspectIntegerAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getString()
    if (_self instanceof org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue){
    	result = org.imt.pssm.reactive.interpreter.IntegerAttributeValueAspect._privk3_getString(_self_, (org.imt.pssm.reactive.model.statemachines.IntegerAttributeValue)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static int _privk3_get_value(final IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_, final IntegerAttributeValue _self) {
    return (_self.getValue()).intValue();
  }
  
  protected static void _privk3_set_value(final IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_, final IntegerAttributeValue _self, final int value) {
    _self.setValue(Integer.valueOf(value));
  }
  
  protected static Attribute _privk3_get_attribute(final IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_, final IntegerAttributeValue _self) {
    return _self.getAttribute();
  }
  
  protected static String _privk3_getString(final IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_, final IntegerAttributeValue _self) {
    Integer _value = _self.getValue();
    return ("" + _value);
  }
}
