package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.imt.minijava.xminiJava.FieldBinding;
import org.imt.minijava.xminiJava.ObjectRefValue;

@Aspect(className = ObjectRefValue.class)
@SuppressWarnings("all")
public class ObjectRefValueToStringAspect extends ValueToStringAspect {
  @OverrideAspectMethod
  public static String customToString(final ObjectRefValue _self) {
    final org.imt.xminijava.interpreter.ObjectRefValueToStringAspectObjectRefValueAspectProperties _self_ = org.imt.xminijava.interpreter.ObjectRefValueToStringAspectObjectRefValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String customToString()
    if (_self instanceof org.imt.minijava.xminiJava.ObjectRefValue){
    	result = org.imt.xminijava.interpreter.ObjectRefValueToStringAspect._privk3_customToString(_self_, (org.imt.minijava.xminiJava.ObjectRefValue)_self);
    };
    return (java.lang.String)result;
  }
  
  private static String super_customToString(final ObjectRefValue _self) {
    final org.imt.xminijava.interpreter.ValueToStringAspectValueAspectProperties _self_ = org.imt.xminijava.interpreter.ValueToStringAspectValueAspectContext.getSelf(_self);
    return  org.imt.xminijava.interpreter.ValueToStringAspect._privk3_customToString(_self_, _self);
  }
  
  protected static String _privk3_customToString(final ObjectRefValueToStringAspectObjectRefValueAspectProperties _self_, final ObjectRefValue _self) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = _self.getInstance().getType().getName();
    _builder.append(_name);
    _builder.append(" {");
    {
      EList<FieldBinding> _fieldbindings = _self.getInstance().getFieldbindings();
      boolean _hasElements = false;
      for(final FieldBinding b : _fieldbindings) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n\t", "");
        }
        String _name_1 = b.getField().getName();
        _builder.append(_name_1);
        _builder.append(": ");
        String _customToString = ValueToStringAspect.customToString(b.getValue());
        _builder.append(_customToString);
      }
    }
    _builder.append("}");
    return _builder.toString();
  }
}
