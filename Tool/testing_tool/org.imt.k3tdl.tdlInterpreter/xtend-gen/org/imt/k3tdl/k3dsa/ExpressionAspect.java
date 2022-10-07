package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.etsi.mts.tdl.DataInstance;
import org.etsi.mts.tdl.DataInstanceUse;
import org.etsi.mts.tdl.DataUse;
import org.etsi.mts.tdl.LiteralValueUse;
import org.etsi.mts.tdl.LocalExpression;

@Aspect(className = LocalExpression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static boolean validateExpression(final LocalExpression _self) {
    final org.imt.k3tdl.k3dsa.ExpressionAspectLocalExpressionAspectProperties _self_ = org.imt.k3tdl.k3dsa.ExpressionAspectLocalExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean validateExpression()
    if (_self instanceof org.etsi.mts.tdl.LocalExpression){
    	result = org.imt.k3tdl.k3dsa.ExpressionAspect._privk3_validateExpression(_self_, (org.etsi.mts.tdl.LocalExpression)_self);
    };
    return (boolean)result;
  }

  public static int getNumIteration(final LocalExpression _self) {
    final org.imt.k3tdl.k3dsa.ExpressionAspectLocalExpressionAspectProperties _self_ = org.imt.k3tdl.k3dsa.ExpressionAspectLocalExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int getNumIteration()
    if (_self instanceof org.etsi.mts.tdl.LocalExpression){
    	result = org.imt.k3tdl.k3dsa.ExpressionAspect._privk3_getNumIteration(_self_, (org.etsi.mts.tdl.LocalExpression)_self);
    };
    return (int)result;
  }

  protected static boolean _privk3_validateExpression(final ExpressionAspectLocalExpressionAspectProperties _self_, final LocalExpression _self) {
    DataUse _expression = _self.getExpression();
    if ((_expression instanceof DataInstanceUse)) {
      DataUse _expression_1 = _self.getExpression();
      if ((_expression_1 instanceof DataInstanceUse)) {
        DataUse _expression_2 = _self.getExpression();
        final DataInstance expression = ((DataInstanceUse) _expression_2).getDataInstance();
        boolean _equals = expression.getDataType().getName().equals("EBoolean");
        if (_equals) {
          return Boolean.parseBoolean(expression.getName());
        } else {
          return false;
        }
      } else {
        DataUse _expression_3 = _self.getExpression();
        if ((_expression_3 instanceof LiteralValueUse)) {
          DataUse _expression_4 = _self.getExpression();
          final String value = ((LiteralValueUse) _expression_4).getValue();
          int _length = value.length();
          int _minus = (_length - 1);
          return Boolean.parseBoolean(value.substring(1, _minus));
        } else {
          return false;
        }
      }
    } else {
      return false;
    }
  }

  protected static int _privk3_getNumIteration(final ExpressionAspectLocalExpressionAspectProperties _self_, final LocalExpression _self) {
    DataUse _expression = _self.getExpression();
    if ((_expression instanceof DataInstanceUse)) {
      DataUse _expression_1 = _self.getExpression();
      final DataInstance expression = ((DataInstanceUse) _expression_1).getDataInstance();
      boolean _equals = expression.getDataType().getName().equals("EInt");
      if (_equals) {
        return Integer.parseInt(expression.getName());
      } else {
        DataUse _expression_2 = _self.getExpression();
        if ((_expression_2 instanceof LiteralValueUse)) {
          DataUse _expression_3 = _self.getExpression();
          final String value = ((LiteralValueUse) _expression_3).getValue();
          int _length = value.length();
          int _minus = (_length - 1);
          return Integer.parseInt(value.substring(1, _minus));
        } else {
          return 0;
        }
      }
    } else {
      DataUse _expression_4 = _self.getExpression();
      if ((_expression_4 instanceof LiteralValueUse)) {
        DataUse _expression_5 = _self.getExpression();
        final String value_1 = ((LiteralValueUse) _expression_5).getValue();
        int _length_1 = value_1.length();
        int _minus_1 = (_length_1 - 1);
        return Integer.parseInt(value_1.substring(1, _minus_1));
      } else {
        return 0;
      }
    }
  }
}
