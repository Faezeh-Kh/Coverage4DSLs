/**
 * generated by Xtext 2.12.0
 */
package org.imt.xminijava.xtext.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.ArrayAccess;
import org.imt.minijava.xminiJava.ArrayLength;
import org.imt.minijava.xminiJava.ArrayTypeRef;
import org.imt.minijava.xminiJava.Assignee;
import org.imt.minijava.xminiJava.Assignment;
import org.imt.minijava.xminiJava.Block;
import org.imt.minijava.xminiJava.Expression;
import org.imt.minijava.xminiJava.Field;
import org.imt.minijava.xminiJava.FieldAccess;
import org.imt.minijava.xminiJava.ForStatement;
import org.imt.minijava.xminiJava.IfStatement;
import org.imt.minijava.xminiJava.Member;
import org.imt.minijava.xminiJava.Method;
import org.imt.minijava.xminiJava.MethodCall;
import org.imt.minijava.xminiJava.NewObject;
import org.imt.minijava.xminiJava.Parameter;
import org.imt.minijava.xminiJava.Program;
import org.imt.minijava.xminiJava.SingleTypeRef;
import org.imt.minijava.xminiJava.Statement;
import org.imt.minijava.xminiJava.TypeDeclaration;
import org.imt.minijava.xminiJava.TypeRef;
import org.imt.minijava.xminiJava.XminiJavaPackage;
import org.imt.xminijava.xtext.services.XMiniJavaGrammarAccess;

@SuppressWarnings("all")
public class XMiniJavaFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private XMiniJavaGrammarAccess _xMiniJavaGrammarAccess;
  
  protected void _format(final Program program, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(this.textRegionExtensions.regionFor(program).keyword(";"), _function);
    EList<TypeDeclaration> _classes = program.getClasses();
    for (final TypeDeclaration type : _classes) {
      document.<TypeDeclaration>format(type);
    }
  }
  
  protected void _format(final TypeDeclaration type, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<TypeDeclaration>append(type, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(type).feature(XminiJavaPackage.eINSTANCE.getNamedElement_Name()), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(this.textRegionExtensions.regionFor(type).keyword("{"), _function_2), 
      document.prepend(this.textRegionExtensions.regionFor(type).keyword("}"), _function_3), _function_4);
    EList<Member> _members = type.getMembers();
    for (final Member member : _members) {
      document.<Member>format(member);
    }
  }
  
  private void formatMember(final Member member, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(member).feature(XminiJavaPackage.eINSTANCE.getMember_Access()), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.<TypeRef>append(member.getTypeRef(), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(this.textRegionExtensions.regionFor(member).feature(XminiJavaPackage.eINSTANCE.getNamedElement_Name()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(this.textRegionExtensions.regionFor(member).keyword("("), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(member).keyword(")"), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(member).keyword(","), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(member).keyword(","), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.<Member>append(member, _function_7);
  }
  
  protected void _format(final Method method, @Extension final IFormattableDocument document) {
    this.formatMember(method, document);
    document.<Block>format(method.getBody());
  }
  
  protected void _format(final Field field, @Extension final IFormattableDocument document) {
    this.formatMember(field, document);
    document.<Expression>format(field.getDefaultValue());
  }
  
  protected void _format(final ArrayLength arrayLength, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(arrayLength).keyword("."), _function);
    document.<Expression>format(arrayLength.getArray());
  }
  
  protected void _format(final ArrayAccess arrayAccess, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(arrayAccess).keyword("["), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(arrayAccess).keyword("]"), _function_1);
    document.<Expression>format(arrayAccess.getIndex());
    document.<Expression>format(arrayAccess.getObject());
  }
  
  protected void _format(final Parameter parameter, @Extension final IFormattableDocument document) {
    document.<TypeRef>format(parameter.getTypeRef());
  }
  
  protected void _format(final ArrayTypeRef arrayTypeRef, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(arrayTypeRef).keyword("["), _function);
    document.<SingleTypeRef>format(arrayTypeRef.getTypeRef());
  }
  
  protected void _format(final IfStatement ifStatement, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(ifStatement).keyword("("), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(this.textRegionExtensions.regionFor(ifStatement).keyword("("), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(ifStatement).keyword(")"), _function_2);
    document.<Block>format(ifStatement.getThenBlock());
    document.<Block>format(ifStatement.getElseBlock());
    document.<Expression>format(ifStatement.getExpression());
  }
  
  protected void _format(final ForStatement forStatement, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(forStatement).keyword("for"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(this.textRegionExtensions.regionFor(forStatement).keyword("("), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.<Assignment>surround(forStatement.getDeclaration(), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.<Expression>prepend(forStatement.getCondition(), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.<Expression>append(forStatement.getCondition(), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.<Assignment>prepend(forStatement.getProgression(), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.<Assignment>append(forStatement.getProgression(), _function_6);
    document.<Assignment>format(forStatement.getDeclaration());
    document.<Expression>format(forStatement.getCondition());
    document.<Assignment>format(forStatement.getProgression());
    document.<Block>format(forStatement.getBlock());
  }
  
  protected void _format(final Assignment assignment, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(assignment).keyword("="), _function);
    document.<Assignee>format(assignment.getAssignee());
    document.<Expression>format(assignment.getValue());
  }
  
  protected void _format(final Block block, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(block).keyword("{"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(1);
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(this.textRegionExtensions.regionFor(block).keyword("{"), _function_1), 
      document.prepend(this.textRegionExtensions.regionFor(block).keyword("}"), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(block).keyword("return"), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.allRegionsFor(block).keyword(";"), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.allRegionsFor(block).keyword(";"), _function_6);
    EList<Statement> _statements = block.getStatements();
    for (final Statement s : _statements) {
      document.<Statement>format(s);
    }
  }
  
  protected void _format(final NewObject _new, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(_new).keyword("new"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(_new).keyword("("), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(_new).keyword(")"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(_new).keyword(","), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(_new).keyword(","), _function_4);
    EList<Expression> _args = _new.getArgs();
    for (final Expression arg : _args) {
      document.<Expression>format(arg);
    }
  }
  
  protected void _format(final MethodCall methodCall, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(methodCall).keyword("("), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(methodCall).keyword(")"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(methodCall).keyword("."), _function_2);
    document.<Expression>format(methodCall.getReceiver());
  }
  
  protected void _format(final FieldAccess selection, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(selection).keyword("."), _function);
    document.<Expression>format(selection.getReceiver());
  }
  
  public void format(final Object field, final IFormattableDocument document) {
    if (field instanceof Field) {
      _format((Field)field, document);
      return;
    } else if (field instanceof Method) {
      _format((Method)field, document);
      return;
    } else if (field instanceof Parameter) {
      _format((Parameter)field, document);
      return;
    } else if (field instanceof XtextResource) {
      _format((XtextResource)field, document);
      return;
    } else if (field instanceof ArrayAccess) {
      _format((ArrayAccess)field, document);
      return;
    } else if (field instanceof ArrayLength) {
      _format((ArrayLength)field, document);
      return;
    } else if (field instanceof FieldAccess) {
      _format((FieldAccess)field, document);
      return;
    } else if (field instanceof MethodCall) {
      _format((MethodCall)field, document);
      return;
    } else if (field instanceof NewObject) {
      _format((NewObject)field, document);
      return;
    } else if (field instanceof ArrayTypeRef) {
      _format((ArrayTypeRef)field, document);
      return;
    } else if (field instanceof Assignment) {
      _format((Assignment)field, document);
      return;
    } else if (field instanceof Block) {
      _format((Block)field, document);
      return;
    } else if (field instanceof ForStatement) {
      _format((ForStatement)field, document);
      return;
    } else if (field instanceof IfStatement) {
      _format((IfStatement)field, document);
      return;
    } else if (field instanceof TypeDeclaration) {
      _format((TypeDeclaration)field, document);
      return;
    } else if (field instanceof Program) {
      _format((Program)field, document);
      return;
    } else if (field instanceof EObject) {
      _format((EObject)field, document);
      return;
    } else if (field == null) {
      _format((Void)null, document);
      return;
    } else if (field != null) {
      _format(field, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(field, document).toString());
    }
  }
}
