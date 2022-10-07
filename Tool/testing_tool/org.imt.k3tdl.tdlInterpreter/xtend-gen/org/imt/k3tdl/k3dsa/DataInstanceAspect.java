package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.etsi.mts.tdl.DataInstance;
import org.etsi.mts.tdl.DataUse;
import org.etsi.mts.tdl.LiteralValueUse;
import org.etsi.mts.tdl.MemberAssignment;
import org.etsi.mts.tdl.StructuredDataInstance;

@Aspect(className = DataInstance.class)
@SuppressWarnings("all")
public class DataInstanceAspect {
  public static EObject getMatchedMUTElement(final DataInstance _self, final ArrayList<EObject> rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataInstanceAspect#EObject getMatchedMUTElement(ArrayList<EObject>,Resource,boolean,String) from org.imt.k3tdl.k3dsa.StructuredDataInstanceAspect
    		if (_self instanceof org.etsi.mts.tdl.StructuredDataInstance){
    			result = org.imt.k3tdl.k3dsa.StructuredDataInstanceAspect.getMatchedMUTElement((org.etsi.mts.tdl.StructuredDataInstance)_self,rootElement,MUTResource,isAssertion,DSLPath);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataInstanceAspect#EObject getMatchedMUTElement(ArrayList<EObject>,Resource,boolean,String) from org.imt.k3tdl.k3dsa.StructuredDataInstanceAspect
    	// BeginInjectInto org.imt.k3tdl.k3dsa.DataInstanceAspect#EObject getMatchedMUTElement(ArrayList<EObject>,Resource,boolean,String) from org.imt.k3tdl.k3dsa.SimpleDataInstanceAspect
    		if (_self instanceof org.etsi.mts.tdl.SimpleDataInstance){
    			result = org.imt.k3tdl.k3dsa.SimpleDataInstanceAspect.getMatchedMUTElement((org.etsi.mts.tdl.SimpleDataInstance)_self,rootElement,MUTResource,isAssertion,DSLPath);
    		} else
    		// EndInjectInto org.imt.k3tdl.k3dsa.DataInstanceAspect#EObject getMatchedMUTElement(ArrayList<EObject>,Resource,boolean,String) from org.imt.k3tdl.k3dsa.SimpleDataInstanceAspect
    // #DispatchPointCut_before# EObject getMatchedMUTElement(ArrayList<EObject>,Resource,boolean,String)
    if (_self instanceof org.etsi.mts.tdl.DataInstance){
    	result = org.imt.k3tdl.k3dsa.DataInstanceAspect._privk3_getMatchedMUTElement(_self_, (org.etsi.mts.tdl.DataInstance)_self,rootElement,MUTResource,isAssertion,DSLPath);
    };
    return (org.eclipse.emf.ecore.EObject)result;
  }

  public static String getValidName(final DataInstance _self) {
    final org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getValidName()
    if (_self instanceof org.etsi.mts.tdl.DataInstance){
    	result = org.imt.k3tdl.k3dsa.DataInstanceAspect._privk3_getValidName(_self_, (org.etsi.mts.tdl.DataInstance)_self);
    };
    return (java.lang.String)result;
  }

  public static String info(final DataInstance _self) {
    final org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String info()
    if (_self instanceof org.etsi.mts.tdl.DataInstance){
    	result = org.imt.k3tdl.k3dsa.DataInstanceAspect._privk3_info(_self_, (org.etsi.mts.tdl.DataInstance)_self);
    };
    return (java.lang.String)result;
  }

  public static void info(final DataInstance _self, final String info) {
    final org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void info(String)
    if (_self instanceof org.etsi.mts.tdl.DataInstance){
    	org.imt.k3tdl.k3dsa.DataInstanceAspect._privk3_info(_self_, (org.etsi.mts.tdl.DataInstance)_self,info);
    };
  }

  protected static EObject _privk3_getMatchedMUTElement(final DataInstanceAspectDataInstanceAspectProperties _self_, final DataInstance _self, final ArrayList<EObject> rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    return null;
  }

  protected static String _privk3_getValidName(final DataInstanceAspectDataInstanceAspectProperties _self_, final DataInstance _self) {
    String tdlName = _self.getName();
    boolean _startsWith = _self.getName().startsWith("_");
    if (_startsWith) {
      tdlName = tdlName.substring(1);
    }
    if ((_self instanceof StructuredDataInstance)) {
      final StructuredDataInstance sDataInstance = ((StructuredDataInstance) _self);
      int _size = sDataInstance.getMemberAssignment().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        final Function1<MemberAssignment, Boolean> _function = new Function1<MemberAssignment, Boolean>() {
          public Boolean apply(final MemberAssignment ma) {
            return Boolean.valueOf(ma.getMember().getName().equals("_name"));
          }
        };
        final MemberAssignment ma = IterableExtensions.<MemberAssignment>findFirst(sDataInstance.getMemberAssignment(), _function);
        if (((ma != null) && (ma.getMemberSpec() instanceof LiteralValueUse))) {
          DataUse _memberSpec = ma.getMemberSpec();
          tdlName = ((LiteralValueUse) _memberSpec).getValue();
        }
      }
    }
    return tdlName;
  }

  protected static String _privk3_info(final DataInstanceAspectDataInstanceAspectProperties _self_, final DataInstance _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInfo") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.info;
  }

  protected static void _privk3_info(final DataInstanceAspectDataInstanceAspectProperties _self_, final DataInstance _self, final String info) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInfo")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, info);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.info = info;
    }
  }
}
