package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import xminiJava.IntegerValue;

@Aspect(className = IntegerValue.class)
@SuppressWarnings("all")
public class IntegerValueToStringAspect extends ValueToStringAspect {
  @OverrideAspectMethod
  public static String customToString(final IntegerValue _self) {
    final minijava.semantics.IntegerValueToStringAspectIntegerValueAspectProperties _self_ = minijava.semantics.IntegerValueToStringAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String customToString()
    if (_self instanceof xminiJava.IntegerValue){
    	result = minijava.semantics.IntegerValueToStringAspect._privk3_customToString(_self_, (xminiJava.IntegerValue)_self);
    };
    return (java.lang.String)result;
  }

  private static String super_customToString(final IntegerValue _self) {
    final minijava.semantics.ValueToStringAspectValueAspectProperties _self_ = minijava.semantics.ValueToStringAspectValueAspectContext.getSelf(_self);
    return  minijava.semantics.ValueToStringAspect._privk3_customToString(_self_, _self);
  }

  protected static String _privk3_customToString(final IntegerValueToStringAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    return Integer.valueOf(_self.getValue()).toString();
  }
}
