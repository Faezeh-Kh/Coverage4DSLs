package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.minijava.xminiJava.IntegerValue;

@Aspect(className = IntegerValue.class)
@SuppressWarnings("all")
public class IntegerValueToStringAspect extends ValueToStringAspect {
  @OverrideAspectMethod
  public static String customToString(final IntegerValue _self) {
    final org.imt.xminijava.interpreter.IntegerValueToStringAspectIntegerValueAspectProperties _self_ = org.imt.xminijava.interpreter.IntegerValueToStringAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String customToString()
    if (_self instanceof org.imt.minijava.xminiJava.IntegerValue){
    	result = org.imt.xminijava.interpreter.IntegerValueToStringAspect._privk3_customToString(_self_, (org.imt.minijava.xminiJava.IntegerValue)_self);
    };
    return (java.lang.String)result;
  }
  
  private static String super_customToString(final IntegerValue _self) {
    final org.imt.xminijava.interpreter.ValueToStringAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueToStringAspectValueAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ValueToStringAspect._privk3_customToString(_self_, _self);
  }
  
  protected static String _privk3_customToString(final IntegerValueToStringAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    return Integer.valueOf(_self.getValue()).toString();
  }
}
