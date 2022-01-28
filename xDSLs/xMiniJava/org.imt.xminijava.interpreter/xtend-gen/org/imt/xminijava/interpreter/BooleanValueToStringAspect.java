package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.minijava.xminiJava.BooleanValue;

@Aspect(className = BooleanValue.class)
@SuppressWarnings("all")
public class BooleanValueToStringAspect extends ValueToStringAspect {
  @OverrideAspectMethod
  public static String customToString(final BooleanValue _self) {
    final org.imt.xminijava.interpreter.BooleanValueToStringAspectBooleanValueAspectProperties _self_ = org.imt.xminijava.interpreter.BooleanValueToStringAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String customToString()
    if (_self instanceof org.imt.minijava.xminiJava.BooleanValue){
    	result = org.imt.xminijava.interpreter.BooleanValueToStringAspect._privk3_customToString(_self_, (org.imt.minijava.xminiJava.BooleanValue)_self);
    };
    return (java.lang.String)result;
  }
  
  private static String super_customToString(final BooleanValue _self) {
    final org.imt.xminijava.interpreter.ValueToStringAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueToStringAspectValueAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ValueToStringAspect._privk3_customToString(_self_, _self);
  }
  
  protected static String _privk3_customToString(final BooleanValueToStringAspectBooleanValueAspectProperties _self_, final BooleanValue _self) {
    return Boolean.valueOf(_self.isValue()).toString();
  }
}
