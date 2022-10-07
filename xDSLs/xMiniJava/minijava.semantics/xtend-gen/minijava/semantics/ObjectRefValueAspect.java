package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import xminiJava.ObjectRefValue;
import xminiJava.Value;
import xminiJava.XminiJavaFactory;

@Aspect(className = ObjectRefValue.class)
@SuppressWarnings("all")
public class ObjectRefValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Value copy(final ObjectRefValue _self) {
    final minijava.semantics.ObjectRefValueAspectObjectRefValueAspectProperties _self_ = minijava.semantics.ObjectRefValueAspectObjectRefValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof xminiJava.ObjectRefValue){
    	result = minijava.semantics.ObjectRefValueAspect._privk3_copy(_self_, (xminiJava.ObjectRefValue)_self);
    };
    return (xminiJava.Value)result;
  }

  private static Value super_copy(final ObjectRefValue _self) {
    final minijava.semantics.ValueAspectValueAspectProperties _self_ = minijava.semantics.ValueAspectValueAspectContext.getSelf(_self);
    return  minijava.semantics.ValueAspect._privk3_copy(_self_, _self);
  }

  protected static Value _privk3_copy(final ObjectRefValueAspectObjectRefValueAspectProperties _self_, final ObjectRefValue _self) {
    ObjectRefValue _createObjectRefValue = XminiJavaFactory.eINSTANCE.createObjectRefValue();
    final Procedure1<ObjectRefValue> _function = new Procedure1<ObjectRefValue>() {
      public void apply(final ObjectRefValue it) {
        it.setInstance(_self.getInstance());
      }
    };
    return ObjectExtensions.<ObjectRefValue>operator_doubleArrow(_createObjectRefValue, _function);
  }
}
