package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.minijava.xminiJava.StringValue;

@Aspect(className = StringValue.class)
@SuppressWarnings("all")
public class StringValueToStringAspect extends ValueToStringAspect {
  @OverrideAspectMethod
  public static String customToString(final StringValue _self) {
    final org.imt.xminijava.interpreter.StringValueToStringAspectStringValueAspectProperties _self_ = org.imt.xminijava.interpreter.StringValueToStringAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String customToString()
    if (_self instanceof org.imt.minijava.xminiJava.StringValue){
    	result = org.imt.xminijava.interpreter.StringValueToStringAspect._privk3_customToString(_self_, (org.imt.minijava.xminiJava.StringValue)_self);
    };
    return (java.lang.String)result;
  }
  
  private static String super_customToString(final StringValue _self) {
    final org.imt.xminijava.interpreter.ValueToStringAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueToStringAspectValueAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ValueToStringAspect._privk3_customToString(_self_, _self);
  }
  
  protected static String _privk3_customToString(final StringValueToStringAspectStringValueAspectProperties _self_, final StringValue _self) {
    return _self.getValue().toString();
  }
}
