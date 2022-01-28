package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.StringValue;
import org.imt.minijava.xminiJava.Value;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = StringValue.class)
@SuppressWarnings("all")
public class StringValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final StringValue _self) {
    final org.imt.xminijava.interpreter.StringValueAspectStringValueAspectProperties _self_ = org.imt.xminijava.interpreter.StringValueAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.imt.minijava.xminiJava.StringValue){
    	result = org.imt.xminijava.interpreter.StringValueAspect._privk3_copy(_self_, (org.imt.minijava.xminiJava.StringValue)_self);
    };
    return (org.imt.minijava.xminiJava.Value)result;
  }
  
  private static Value super_copy(final StringValue _self) {
    final org.imt.xminijava.interpreter.ValueAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueAspectValueAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ValueAspect._privk3_copy(_self_, _self);
  }
  
  protected static Value _privk3_copy(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self) {
    StringValue _createStringValue = XminiJavaFactory.eINSTANCE.createStringValue();
    final Procedure1<StringValue> _function = (StringValue it) -> {
      it.setValue(_self.getValue());
    };
    return ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function);
  }
}
