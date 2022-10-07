package pssm.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import statemachines.Attribute;
import statemachines.BooleanAttributeValue;

@Aspect(className = BooleanAttributeValue.class)
@SuppressWarnings("all")
public class BooleanAttributeValueAspect extends AttributeValueAspect {
  @OverrideAspectMethod
  protected static int get_value(final BooleanAttributeValue _self) {
    final pssm.semantics.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties _self_ = pssm.semantics.BooleanAttributeValueAspectBooleanAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int get_value()
    if (_self instanceof statemachines.BooleanAttributeValue){
    	result = pssm.semantics.BooleanAttributeValueAspect._privk3_get_value(_self_, (statemachines.BooleanAttributeValue)_self);
    };
    return (int)result;
  }
  
  @OverrideAspectMethod
  protected static void set_value(final BooleanAttributeValue _self, final int value) {
    final pssm.semantics.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties _self_ = pssm.semantics.BooleanAttributeValueAspectBooleanAttributeValueAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void set_value(int)
    if (_self instanceof statemachines.BooleanAttributeValue){
    	pssm.semantics.BooleanAttributeValueAspect._privk3_set_value(_self_, (statemachines.BooleanAttributeValue)_self,value);
    };
  }
  
  @OverrideAspectMethod
  protected static Attribute get_attribute(final BooleanAttributeValue _self) {
    final pssm.semantics.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties _self_ = pssm.semantics.BooleanAttributeValueAspectBooleanAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Attribute get_attribute()
    if (_self instanceof statemachines.BooleanAttributeValue){
    	result = pssm.semantics.BooleanAttributeValueAspect._privk3_get_attribute(_self_, (statemachines.BooleanAttributeValue)_self);
    };
    return (statemachines.Attribute)result;
  }
  
  @OverrideAspectMethod
  protected static String getString(final BooleanAttributeValue _self) {
    final pssm.semantics.BooleanAttributeValueAspectBooleanAttributeValueAspectProperties _self_ = pssm.semantics.BooleanAttributeValueAspectBooleanAttributeValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getString()
    if (_self instanceof statemachines.BooleanAttributeValue){
    	result = pssm.semantics.BooleanAttributeValueAspect._privk3_getString(_self_, (statemachines.BooleanAttributeValue)_self);
    };
    return (java.lang.String)result;
  }
  
  protected static int _privk3_get_value(final BooleanAttributeValueAspectBooleanAttributeValueAspectProperties _self_, final BooleanAttributeValue _self) {
    int _xifexpression = (int) 0;
    Boolean _value = _self.getValue();
    if ((_value).booleanValue()) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected static void _privk3_set_value(final BooleanAttributeValueAspectBooleanAttributeValueAspectProperties _self_, final BooleanAttributeValue _self, final int value) {
    _self.setValue(Boolean.valueOf((value == 1)));
  }
  
  protected static Attribute _privk3_get_attribute(final BooleanAttributeValueAspectBooleanAttributeValueAspectProperties _self_, final BooleanAttributeValue _self) {
    return _self.getAttribute();
  }
  
  protected static String _privk3_getString(final BooleanAttributeValueAspectBooleanAttributeValueAspectProperties _self_, final BooleanAttributeValue _self) {
    Boolean _value = _self.getValue();
    return ("" + _value);
  }
}
