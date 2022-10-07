package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import xminiJava.NullValue;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = NullValue.class)
@SuppressWarnings("all")
public class NullValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final NullValue _self) {
    final minijava.semantics.NullValueAspectNullValueAspectProperties _self_ = minijava.semantics.NullValueAspectNullValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof xminiJava.NullValue){
    	result = minijava.semantics.NullValueAspect._privk3_copy(_self_, (xminiJava.NullValue)_self);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_copy(final NullValue _self) {
    final minijava.semantics.ValueAspectValueAspectProperties _self_ = minijava.semantics.ValueAspectValueAspectContext.getSelf(_self);
    return  minijava.semantics.ValueAspect._privk3_copy(_self_, _self);
  }

  protected static Value _privk3_copy(final NullValueAspectNullValueAspectProperties _self_, final NullValue _self) {
    return XminiJavaFactory.eINSTANCE.createNullValue();
  }
}
