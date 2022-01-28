package org.imt.xminijava.xtext.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.imt.minijava.xminiJava.AccessLevel;
import org.imt.minijava.xminiJava.Member;
import org.imt.xminijava.xtext.typing.XMiniJavaTypeConformance;

@SuppressWarnings("all")
public class XMiniJavaAccessibility {
  @Inject
  @Extension
  private XMiniJavaTypeConformance _xMiniJavaTypeConformance;
  
  public boolean isAccessibleFrom(final Member member, final EObject context) {
    boolean _xblockexpression = false;
    {
      final org.imt.minijava.xminiJava.Class contextClass = EcoreUtil2.<org.imt.minijava.xminiJava.Class>getContainerOfType(context, org.imt.minijava.xminiJava.Class.class);
      final org.imt.minijava.xminiJava.Class memberClass = EcoreUtil2.<org.imt.minijava.xminiJava.Class>getContainerOfType(member, org.imt.minijava.xminiJava.Class.class);
      boolean _switchResult = false;
      boolean _matched = false;
      if ((contextClass == memberClass)) {
        _matched=true;
        _switchResult = true;
      }
      if (!_matched) {
        boolean _isSubclassOf = this._xMiniJavaTypeConformance.isSubclassOf(contextClass, memberClass);
        if (_isSubclassOf) {
          _matched=true;
          AccessLevel _access = member.getAccess();
          _switchResult = (!Objects.equal(_access, AccessLevel.PRIVATE));
        }
      }
      if (!_matched) {
        AccessLevel _access_1 = member.getAccess();
        _switchResult = Objects.equal(_access_1, AccessLevel.PUBLIC);
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
