package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.etsi.mts.tdl.SimpleDataInstance;
import org.imt.tdl.testResult.TDLTestResultUtil;

@Aspect(className = SimpleDataInstance.class)
@SuppressWarnings("all")
public class SimpleDataInstanceAspect extends DataInstanceAspect {
  @OverrideAspectMethod
  public static ArrayList<EObject> getMatchedMUTElement(final SimpleDataInstance _self, final ArrayList<EObject> rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.SimpleDataInstanceAspectSimpleDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.SimpleDataInstanceAspectSimpleDataInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ArrayList<EObject> getMatchedMUTElement(ArrayList<EObject>,Resource,boolean,String)
    if (_self instanceof org.etsi.mts.tdl.SimpleDataInstance){
    	result = org.imt.k3tdl.k3dsa.SimpleDataInstanceAspect._privk3_getMatchedMUTElement(_self_, (org.etsi.mts.tdl.SimpleDataInstance)_self,rootElement,MUTResource,isAssertion,DSLPath);
    };
    return (java.util.ArrayList<org.eclipse.emf.ecore.EObject>)result;
  }

  private static ArrayList<EObject> super_getMatchedMUTElement(final SimpleDataInstance _self, final ArrayList<EObject> rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.DataInstanceAspect._privk3_getMatchedMUTElement(_self_, _self,rootElement,MUTResource,isAssertion,DSLPath);
  }

  protected static ArrayList<EObject> _privk3_getMatchedMUTElement(final SimpleDataInstanceAspectSimpleDataInstanceAspectProperties _self_, final SimpleDataInstance _self, final ArrayList<EObject> rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    String _name = _self.getName();
    String _plus = ("The " + _name);
    String _plus_1 = (_plus + " element cannot be found since it has no identifier");
    InputOutput.<String>println(_plus_1);
    String _name_1 = _self.getName();
    String _plus_2 = ((TDLTestResultUtil.FAIL + ": The ") + _name_1);
    String _plus_3 = (_plus_2 + " element cannot be found since it has no identifier");
    DataInstanceAspect.info(_self, _plus_3);
    return null;
  }
}
