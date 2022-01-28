package org.imt.xminijava.xtext.typing;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.imt.minijava.xminiJava.TypeDeclaration;
import org.imt.xminijava.xtext.XMiniJavaModelUtil;

@SuppressWarnings("all")
public class XMiniJavaTypeConformance {
  @Inject
  @Extension
  private XMiniJavaModelUtil _xMiniJavaModelUtil;
  
  public boolean isConformant(final TypeDeclaration c1, final TypeDeclaration c2) {
    return (((c1 == XMiniJavaTypeComputer.NULL_TYPE) || 
      (c1 == c2)) || this.isSubclassOf(c1, c2));
  }
  
  public boolean isSubclassOf(final TypeDeclaration c1, final TypeDeclaration c2) {
    return this._xMiniJavaModelUtil.classHierarchy(c1).contains(c2);
  }
}
