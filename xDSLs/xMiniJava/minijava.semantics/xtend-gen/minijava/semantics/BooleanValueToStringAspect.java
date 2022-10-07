package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import xminiJava.BooleanValue;

@Aspect(className = BooleanValue.class)
@SuppressWarnings("all")
public class BooleanValueToStringAspect extends ValueToStringAspect {
  @OverrideAspectMethod
  public static String customToString(final BooleanValue _self) {
    final minijava.semantics.BooleanValueToStringAspectBooleanValueAspectProperties _self_ = minijava.semantics.BooleanValueToStringAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String customToString()
    if (_self instanceof xminiJava.BooleanValue){
    	result = minijava.semantics.BooleanValueToStringAspect._privk3_customToString(_self_, (xminiJava.BooleanValue)_self);
    };
    return (java.lang.String)result;
  }

  private static String super_customToString(final BooleanValue _self) {
    final minijava.semantics.ValueToStringAspectValueAspectProperties _self_ = minijava.semantics.ValueToStringAspectValueAspectContext.getSelf(_self);
    return  minijava.semantics.ValueToStringAspect._privk3_customToString(_self_, _self);
  }

  protected static String _privk3_customToString(final BooleanValueToStringAspectBooleanValueAspectProperties _self_, final BooleanValue _self) {
    return Boolean.valueOf(_self.isValue()).toString();
  }
}
