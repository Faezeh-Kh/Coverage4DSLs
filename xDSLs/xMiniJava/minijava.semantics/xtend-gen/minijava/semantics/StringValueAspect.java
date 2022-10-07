package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.StringValue;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = StringValue.class)
@SuppressWarnings("all")
public class StringValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final StringValue _self) {
    final minijava.semantics.StringValueAspectStringValueAspectProperties _self_ = minijava.semantics.StringValueAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof xminiJava.StringValue){
    	result = minijava.semantics.StringValueAspect._privk3_copy(_self_, (xminiJava.StringValue)_self);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_copy(final StringValue _self) {
    final minijava.semantics.ValueAspectValueAspectProperties _self_ = minijava.semantics.ValueAspectValueAspectContext.getSelf(_self);
    return  minijava.semantics.ValueAspect._privk3_copy(_self_, _self);
  }

  protected static Value _privk3_copy(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self) {
    StringValue _createStringValue = XminiJavaFactory.eINSTANCE.createStringValue();
    final Procedure1<StringValue> _function = new Procedure1<StringValue>() {
      public void apply(final StringValue it) {
        it.setValue(_self.getValue());
      }
    };
    return ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function);
  }
}
