package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.BooleanValue;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = BooleanValue.class)
@SuppressWarnings("all")
public class BooleanValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final BooleanValue _self) {
    final minijava.semantics.BooleanValueAspectBooleanValueAspectProperties _self_ = minijava.semantics.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof xminiJava.BooleanValue){
    	result = minijava.semantics.BooleanValueAspect._privk3_copy(_self_, (xminiJava.BooleanValue)_self);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_copy(final BooleanValue _self) {
    final minijava.semantics.ValueAspectValueAspectProperties _self_ = minijava.semantics.ValueAspectValueAspectContext.getSelf(_self);
    return  minijava.semantics.ValueAspect._privk3_copy(_self_, _self);
  }

  protected static Value _privk3_copy(final BooleanValueAspectBooleanValueAspectProperties _self_, final BooleanValue _self) {
    BooleanValue _createBooleanValue = XminiJavaFactory.eINSTANCE.createBooleanValue();
    final Procedure1<BooleanValue> _function = new Procedure1<BooleanValue>() {
      public void apply(final BooleanValue it) {
        it.setValue(_self.isValue());
      }
    };
    return ObjectExtensions.<BooleanValue>operator_doubleArrow(_createBooleanValue, _function);
  }
}
