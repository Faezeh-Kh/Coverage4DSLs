package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import xminiJava.StringValue;

@Aspect(className = StringValue.class)
@SuppressWarnings("all")
public class StringValueToStringAspect extends ValueToStringAspect {
  @OverrideAspectMethod
  public static String customToString(final StringValue _self) {
    final minijava.semantics.StringValueToStringAspectStringValueAspectProperties _self_ = minijava.semantics.StringValueToStringAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String customToString()
    if (_self instanceof xminiJava.StringValue){
    	result = minijava.semantics.StringValueToStringAspect._privk3_customToString(_self_, (xminiJava.StringValue)_self);
    };
    return (java.lang.String)result;
  }

  private static String super_customToString(final StringValue _self) {
    final minijava.semantics.ValueToStringAspectValueAspectProperties _self_ = minijava.semantics.ValueToStringAspectValueAspectContext.getSelf(_self);
    return  minijava.semantics.ValueToStringAspect._privk3_customToString(_self_, _self);
  }

  protected static String _privk3_customToString(final StringValueToStringAspectStringValueAspectProperties _self_, final StringValue _self) {
    return _self.getValue().toString();
  }
}
