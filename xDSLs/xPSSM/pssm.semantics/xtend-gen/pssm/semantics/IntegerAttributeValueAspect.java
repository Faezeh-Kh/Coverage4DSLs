package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import statemachines.Attribute;
import statemachines.IntegerAttributeValue;

@Aspect(className = IntegerAttributeValue.class)
@SuppressWarnings("all")
public class IntegerAttributeValueAspect extends AttributeValueAspect {
  @OverrideAspectMethod
  protected static int get_value(final IntegerAttributeValue _self) {
    final pssm.semantics.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_ = pssm.semantics.IntegerAttributeValueAspectIntegerAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int get_value()
    if (_self instanceof statemachines.IntegerAttributeValue){
    	result = pssm.semantics.IntegerAttributeValueAspect._privk3_get_value(_self_, (statemachines.IntegerAttributeValue)_self);
    };
    return (int)result;
  }
  
  @OverrideAspectMethod
  protected static void set_value(final IntegerAttributeValue _self, final int value) {
    final pssm.semantics.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_ = pssm.semantics.IntegerAttributeValueAspectIntegerAttributeValueAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void set_value(int)
    if (_self instanceof statemachines.IntegerAttributeValue){
    	pssm.semantics.IntegerAttributeValueAspect._privk3_set_value(_self_, (statemachines.IntegerAttributeValue)_self,value);
    };
  }
  
  @OverrideAspectMethod
  protected static Attribute get_attribute(final IntegerAttributeValue _self) {
    final pssm.semantics.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_ = pssm.semantics.IntegerAttributeValueAspectIntegerAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Attribute get_attribute()
    if (_self instanceof statemachines.IntegerAttributeValue){
    	result = pssm.semantics.IntegerAttributeValueAspect._privk3_get_attribute(_self_, (statemachines.IntegerAttributeValue)_self);
    };
    return (statemachines.Attribute)result;
  }
  
  @OverrideAspectMethod
  protected static String getString(final IntegerAttributeValue _self) {
    final pssm.semantics.IntegerAttributeValueAspectIntegerAttributeValueAspectProperties _self_ = pssm.semantics.IntegerAttributeValueAspectIntegerAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getString()
    if (_self instanceof statemachines.IntegerAttributeValue){
    	result = pssm.semantics.IntegerAttributeValueAspect._privk3_getString(_self_, (statemachines.IntegerAttributeValue)_self);
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
