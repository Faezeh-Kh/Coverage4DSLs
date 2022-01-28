package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.IntegerValue;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = IntegerValue.class)
@SuppressWarnings("all")
public class IntegerValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final IntegerValue _self) {
    final org.imt.xminijava.interpreter.IntegerValueAspectIntegerValueAspectProperties _self_ = org.imt.xminijava.interpreter.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.imt.minijava.xminiJava.IntegerValue){
    	result = org.imt.xminijava.interpreter.IntegerValueAspect._privk3_copy(_self_, (org.imt.minijava.xminiJava.IntegerValue)_self);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_copy(final IntegerValue _self) {
    final org.imt.xminijava.interpreter.ValueAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueAspectValueAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ValueAspect._privk3_copy(_self_, _self);
  }
  
  protected static Value _privk3_copy(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = (IntegerValue it) -> {
      it.setValue(_self.getValue());
    };
    return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
  }
}
