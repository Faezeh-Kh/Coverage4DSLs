package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.ArrayRefValue;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = ArrayRefValue.class)
@SuppressWarnings("all")
public class ArrayRefValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final ArrayRefValue _self) {
    final minijava.semantics.ArrayRefValueAspectArrayRefValueAspectProperties _self_ = minijava.semantics.ArrayRefValueAspectArrayRefValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof xminiJava.ArrayRefValue){
    	result = minijava.semantics.ArrayRefValueAspect._privk3_copy(_self_, (xminiJava.ArrayRefValue)_self);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_copy(final ArrayRefValue _self) {
    final minijava.semantics.ValueAspectValueAspectProperties _self_ = minijava.semantics.ValueAspectValueAspectContext.getSelf(_self);
    return  minijava.semantics.ValueAspect._privk3_copy(_self_, _self);
  }

  protected static Value _privk3_copy(final ArrayRefValueAspectArrayRefValueAspectProperties _self_, final ArrayRefValue _self) {
    ArrayRefValue _createArrayRefValue = XminiJavaFactory.eINSTANCE.createArrayRefValue();
    final Procedure1<ArrayRefValue> _function = new Procedure1<ArrayRefValue>() {
      public void apply(final ArrayRefValue it) {
        it.setInstance(_self.getInstance());
      }
    };
    return ObjectExtensions.<ArrayRefValue>operator_doubleArrow(_createArrayRefValue, _function);
  }
}
