package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.imt.minijava.xminiJava.NullValue;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = NullValue.class)
@SuppressWarnings("all")
public class NullValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final NullValue _self) {
    final org.imt.xminijava.interpreter.NullValueAspectNullValueAspectProperties _self_ = org.imt.xminijava.interpreter.NullValueAspectNullValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.imt.minijava.xminiJava.NullValue){
    	result = org.imt.xminijava.interpreter.NullValueAspect._privk3_copy(_self_, (org.imt.minijava.xminiJava.NullValue)_self);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_copy(final NullValue _self) {
    final org.imt.xminijava.interpreter.ValueAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueAspectValueAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ValueAspect._privk3_copy(_self_, _self);
  }
  
  protected static Value _privk3_copy(final NullValueAspectNullValueAspectProperties _self_, final NullValue _self) {
    return XminiJavaFactory.eINSTANCE.createNullValue();
  }
}
