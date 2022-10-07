package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.IntegerValue;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = IntegerValue.class)
@SuppressWarnings("all")
public class IntegerValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final IntegerValue _self) {
    final minijava.semantics.IntegerValueAspectIntegerValueAspectProperties _self_ = minijava.semantics.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof xminiJava.IntegerValue){
    	result = minijava.semantics.IntegerValueAspect._privk3_copy(_self_, (xminiJava.IntegerValue)_self);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_copy(final IntegerValue _self) {
    final minijava.semantics.ValueAspectValueAspectProperties _self_ = minijava.semantics.ValueAspectValueAspectContext.getSelf(_self);
    return  minijava.semantics.ValueAspect._privk3_copy(_self_, _self);
  }

  protected static Value _privk3_copy(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    IntegerValue _createIntegerValue = XminiJavaFactory.eINSTANCE.createIntegerValue();
    final Procedure1<IntegerValue> _function = new Procedure1<IntegerValue>() {
      public void apply(final IntegerValue it) {
        it.setValue(_self.getValue());
      }
    };
    return ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function);
  }
}
