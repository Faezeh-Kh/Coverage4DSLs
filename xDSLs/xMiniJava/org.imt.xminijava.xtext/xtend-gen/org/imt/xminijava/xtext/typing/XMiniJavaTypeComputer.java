package org.imt.xminijava.xtext.typing;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.Assignee;
import org.imt.minijava.xminiJava.Assignment;
import org.imt.minijava.xminiJava.BoolConstant;
import org.imt.minijava.xminiJava.BooleanTypeRef;
import org.imt.minijava.xminiJava.ClassRef;
import org.imt.minijava.xminiJava.Expression;
import org.imt.minijava.xminiJava.FieldAccess;
import org.imt.minijava.xminiJava.IntConstant;
import org.imt.minijava.xminiJava.IntegerTypeRef;
import org.imt.minijava.xminiJava.Method;
import org.imt.minijava.xminiJava.MethodCall;
import org.imt.minijava.xminiJava.NewObject;
import org.imt.minijava.xminiJava.Null;
import org.imt.minijava.xminiJava.Return;
import org.imt.minijava.xminiJava.StringConstant;
import org.imt.minijava.xminiJava.StringTypeRef;
import org.imt.minijava.xminiJava.Super;
import org.imt.minijava.xminiJava.SymbolRef;
import org.imt.minijava.xminiJava.This;
import org.imt.minijava.xminiJava.TypeDeclaration;
import org.imt.minijava.xminiJava.TypeRef;
import org.imt.minijava.xminiJava.VariableDeclaration;
import org.imt.minijava.xminiJava.VoidTypeRef;
import org.imt.minijava.xminiJava.XminiJavaFactory;
import org.imt.minijava.xminiJava.XminiJavaPackage;

@SuppressWarnings("all")
public class XMiniJavaTypeComputer {
  private static final XminiJavaFactory factory = XminiJavaFactory.eINSTANCE;
  
  public static final org.imt.minijava.xminiJava.Class STRING_TYPE = ObjectExtensions.<org.imt.minijava.xminiJava.Class>operator_doubleArrow(XMiniJavaTypeComputer.factory.createClass(), ((Procedure1<org.imt.minijava.xminiJava.Class>) (org.imt.minijava.xminiJava.Class it) -> {
    it.setName("stringType");
  }));
  
  public static final org.imt.minijava.xminiJava.Class INT_TYPE = ObjectExtensions.<org.imt.minijava.xminiJava.Class>operator_doubleArrow(XMiniJavaTypeComputer.factory.createClass(), ((Procedure1<org.imt.minijava.xminiJava.Class>) (org.imt.minijava.xminiJava.Class it) -> {
    it.setName("intType");
  }));
  
  public static final org.imt.minijava.xminiJava.Class BOOLEAN_TYPE = ObjectExtensions.<org.imt.minijava.xminiJava.Class>operator_doubleArrow(XMiniJavaTypeComputer.factory.createClass(), ((Procedure1<org.imt.minijava.xminiJava.Class>) (org.imt.minijava.xminiJava.Class it) -> {
    it.setName("booleanType");
  }));
  
  public static final org.imt.minijava.xminiJava.Class NULL_TYPE = ObjectExtensions.<org.imt.minijava.xminiJava.Class>operator_doubleArrow(XMiniJavaTypeComputer.factory.createClass(), ((Procedure1<org.imt.minijava.xminiJava.Class>) (org.imt.minijava.xminiJava.Class it) -> {
    it.setName("nullType");
  }));
  
  private static final XminiJavaPackage ep = XminiJavaPackage.eINSTANCE;
  
  public TypeDeclaration getType(final TypeRef r) {
    TypeDeclaration _switchResult = null;
    boolean _matched = false;
    if (r instanceof ClassRef) {
      _matched=true;
      _switchResult = ((ClassRef)r).getReferencedClass();
    }
    if (!_matched) {
      if (r instanceof IntegerTypeRef) {
        _matched=true;
        _switchResult = XMiniJavaTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (r instanceof BooleanTypeRef) {
        _matched=true;
        _switchResult = XMiniJavaTypeComputer.BOOLEAN_TYPE;
      }
    }
    if (!_matched) {
      if (r instanceof StringTypeRef) {
        _matched=true;
        _switchResult = XMiniJavaTypeComputer.STRING_TYPE;
      }
    }
    if (!_matched) {
      if (r instanceof VoidTypeRef) {
        _matched=true;
        _switchResult = XMiniJavaTypeComputer.NULL_TYPE;
      }
    }
    return _switchResult;
  }
  
  public TypeDeclaration typeFor(final Expression e) {
    TypeDeclaration _switchResult = null;
    boolean _matched = false;
    if (e instanceof SymbolRef) {
      _matched=true;
      _switchResult = this.getType(((SymbolRef)e).getSymbol().getTypeRef());
    }
    if (!_matched) {
      if (e instanceof FieldAccess) {
        _matched=true;
        _switchResult = this.getType(((FieldAccess)e).getField().getTypeRef());
      }
    }
    if (!_matched) {
      if (e instanceof MethodCall) {
        _matched=true;
        _switchResult = this.getType(((MethodCall)e).getMethod().getTypeRef());
      }
    }
    if (!_matched) {
      if (e instanceof NewObject) {
        _matched=true;
        _switchResult = ((NewObject)e).getType();
      }
    }
    if (!_matched) {
      if (e instanceof This) {
        _matched=true;
        _switchResult = EcoreUtil2.<org.imt.minijava.xminiJava.Class>getContainerOfType(e, org.imt.minijava.xminiJava.Class.class);
      }
    }
    if (!_matched) {
      if (e instanceof Super) {
        _matched=true;
        _switchResult = EcoreUtil2.<org.imt.minijava.xminiJava.Class>getContainerOfType(e, org.imt.minijava.xminiJava.Class.class).getSuperClass();
      }
    }
    if (!_matched) {
      if (e instanceof Null) {
        _matched=true;
        _switchResult = XMiniJavaTypeComputer.NULL_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof StringConstant) {
        _matched=true;
        _switchResult = XMiniJavaTypeComputer.STRING_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        _switchResult = XMiniJavaTypeComputer.INT_TYPE;
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        _switchResult = XMiniJavaTypeComputer.BOOLEAN_TYPE;
      }
    }
    return _switchResult;
  }
  
  public boolean isPrimitive(final TypeDeclaration c) {
    Resource _eResource = c.eResource();
    return (_eResource == null);
  }
  
  public TypeDeclaration expectedType(final Expression e) {
    TypeDeclaration _xblockexpression = null;
    {
      final EObject c = e.eContainer();
      final EStructuralFeature f = e.eContainingFeature();
      TypeDeclaration _switchResult = null;
      boolean _matched = false;
      if (c instanceof VariableDeclaration) {
        _matched=true;
        _switchResult = this.getType(((VariableDeclaration)c).getTypeRef());
      }
      if (!_matched) {
        if (c instanceof Assignment) {
          EReference _assignment_Value = XMiniJavaTypeComputer.ep.getAssignment_Value();
          boolean _equals = Objects.equal(f, _assignment_Value);
          if (_equals) {
            _matched=true;
            TypeDeclaration _xblockexpression_1 = null;
            {
              final Assignee assignee = ((Assignment)c).getAssignee();
              TypeDeclaration _switchResult_1 = null;
              boolean _matched_1 = false;
              if (assignee instanceof VariableDeclaration) {
                _matched_1=true;
                _switchResult_1 = this.getType(((VariableDeclaration)assignee).getTypeRef());
              }
              if (!_matched_1) {
                if (assignee instanceof FieldAccess) {
                  _matched_1=true;
                  _switchResult_1 = this.typeFor(((Expression)assignee));
                }
              }
              _xblockexpression_1 = _switchResult_1;
            }
            _switchResult = _xblockexpression_1;
          }
        }
      }
      if (!_matched) {
        if (c instanceof Return) {
          _matched=true;
          _switchResult = this.getType(EcoreUtil2.<Method>getContainerOfType(c, Method.class).getTypeRef());
        }
      }
      if (!_matched) {
        EReference _ifStatement_Expression = XMiniJavaTypeComputer.ep.getIfStatement_Expression();
        boolean _equals = Objects.equal(f, _ifStatement_Expression);
        if (_equals) {
          _matched=true;
          _switchResult = XMiniJavaTypeComputer.BOOLEAN_TYPE;
        }
      }
      if (!_matched) {
        if (c instanceof MethodCall) {
          EReference _methodCall_Args = XMiniJavaTypeComputer.ep.getMethodCall_Args();
          boolean _equals_1 = Objects.equal(f, _methodCall_Args);
          if (_equals_1) {
            _matched=true;
            TypeDeclaration _xifexpression = null;
            Method _method = ((MethodCall)c).getMethod();
            boolean _tripleNotEquals = (_method != null);
            if (_tripleNotEquals) {
              TypeDeclaration _xifexpression_1 = null;
              int _size = ((MethodCall)c).getMethod().getParams().size();
              int _indexOf = ((MethodCall)c).getArgs().indexOf(e);
              boolean _greaterThan = (_size > _indexOf);
              if (_greaterThan) {
                _xifexpression_1 = this.getType(((MethodCall)c).getMethod().getParams().get(((MethodCall)c).getArgs().indexOf(e)).getTypeRef());
              }
              _xifexpression = _xifexpression_1;
            }
            _switchResult = _xifexpression;
          }
        }
      }
      if (!_matched) {
        if (c instanceof NewObject) {
          EReference _newObject_Args = XMiniJavaTypeComputer.ep.getNewObject_Args();
          boolean _equals_1 = Objects.equal(f, _newObject_Args);
          if (_equals_1) {
            _matched=true;
            final Function1<Method, Boolean> _function = (Method it) -> {
              return Boolean.valueOf(((it.getName() == null) && (it.getParams().size() == ((NewObject)c).getArgs().size())));
            };
            _switchResult = this.getType(IterableExtensions.<Method>findFirst(Iterables.<Method>filter(((NewObject)c).getType().getMembers(), Method.class), _function).getParams().get(((NewObject)c).getArgs().indexOf(e)).getTypeRef());
          }
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
