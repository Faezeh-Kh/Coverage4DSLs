package org.imt.k3tdl.k3dsa;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.etsi.mts.tdl.DataInstanceUse;
import org.etsi.mts.tdl.DataUse;
import org.etsi.mts.tdl.MemberAssignment;
import org.etsi.mts.tdl.StructuredDataInstance;
import org.imt.tdl.testResult.TDLTestResultUtil;

@Aspect(className = StructuredDataInstance.class)
@SuppressWarnings("all")
public class StructuredDataInstanceAspect extends DataInstanceAspect {
  @OverrideAspectMethod
  public static ArrayList<EObject> getMatchedMUTElement(final StructuredDataInstance _self, final ArrayList<EObject> rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.StructuredDataInstanceAspectStructuredDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.StructuredDataInstanceAspectStructuredDataInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ArrayList<EObject> getMatchedMUTElement(ArrayList<EObject>,Resource,boolean,String)
    if (_self instanceof org.etsi.mts.tdl.StructuredDataInstance){
    	result = org.imt.k3tdl.k3dsa.StructuredDataInstanceAspect._privk3_getMatchedMUTElement(_self_, (org.etsi.mts.tdl.StructuredDataInstance)_self,rootElement,MUTResource,isAssertion,DSLPath);
    };
    return (java.util.ArrayList<org.eclipse.emf.ecore.EObject>)result;
  }

  public static String setMatchedMUTElement(final StructuredDataInstance _self, final EObject matchedObject, final Resource MUTResource, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.StructuredDataInstanceAspectStructuredDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.StructuredDataInstanceAspectStructuredDataInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String setMatchedMUTElement(EObject,Resource,String)
    if (_self instanceof org.etsi.mts.tdl.StructuredDataInstance){
    	result = org.imt.k3tdl.k3dsa.StructuredDataInstanceAspect._privk3_setMatchedMUTElement(_self_, (org.etsi.mts.tdl.StructuredDataInstance)_self,matchedObject,MUTResource,DSLPath);
    };
    return (java.lang.String)result;
  }

  public static ArrayList<EObject> matchedElements(final StructuredDataInstance _self) {
    final org.imt.k3tdl.k3dsa.StructuredDataInstanceAspectStructuredDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.StructuredDataInstanceAspectStructuredDataInstanceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ArrayList<EObject> matchedElements()
    if (_self instanceof org.etsi.mts.tdl.StructuredDataInstance){
    	result = org.imt.k3tdl.k3dsa.StructuredDataInstanceAspect._privk3_matchedElements(_self_, (org.etsi.mts.tdl.StructuredDataInstance)_self);
    };
    return (java.util.ArrayList<org.eclipse.emf.ecore.EObject>)result;
  }

  public static void matchedElements(final StructuredDataInstance _self, final ArrayList<EObject> matchedElements) {
    final org.imt.k3tdl.k3dsa.StructuredDataInstanceAspectStructuredDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.StructuredDataInstanceAspectStructuredDataInstanceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void matchedElements(ArrayList<EObject>)
    if (_self instanceof org.etsi.mts.tdl.StructuredDataInstance){
    	org.imt.k3tdl.k3dsa.StructuredDataInstanceAspect._privk3_matchedElements(_self_, (org.etsi.mts.tdl.StructuredDataInstance)_self,matchedElements);
    };
  }

  private static ArrayList<EObject> super_getMatchedMUTElement(final StructuredDataInstance _self, final ArrayList<EObject> rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    final org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectProperties _self_ = org.imt.k3tdl.k3dsa.DataInstanceAspectDataInstanceAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.DataInstanceAspect._privk3_getMatchedMUTElement(_self_, _self,rootElement,MUTResource,isAssertion,DSLPath);
  }

  protected static ArrayList<EObject> _privk3_getMatchedMUTElement(final StructuredDataInstanceAspectStructuredDataInstanceAspectProperties _self_, final StructuredDataInstance _self, final ArrayList<EObject> rootElement, final Resource MUTResource, final boolean isAssertion, final String DSLPath) {
    StructuredDataInstanceAspect.matchedElements(_self).clear();
    int _size = rootElement.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        boolean memberFound = true;
        try {
          final Consumer<MemberAssignment> _function = new Consumer<MemberAssignment>() {
            public void accept(final MemberAssignment memberAssign) {
              try {
                DataInstanceAspect.info(_self, MemberAssignmentAspect.isMatchedMember(memberAssign, rootElement.get((i).intValue()), MUTResource, Boolean.valueOf(isAssertion), DSLPath));
                boolean _contains = DataInstanceAspect.info(_self).contains(TDLTestResultUtil.FAIL);
                if (_contains) {
                  throw new InterruptedException();
                }
              } catch (Throwable _e) {
                throw Exceptions.sneakyThrow(_e);
              }
            }
          };
          _self.getMemberAssignment().forEach(_function);
        } catch (final Throwable _t) {
          if (_t instanceof InterruptedException) {
            memberFound = false;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        if (memberFound) {
          StructuredDataInstanceAspect.matchedElements(_self).add(rootElement.get((i).intValue()));
        }
      }
    }
    return StructuredDataInstanceAspect.matchedElements(_self);
  }

  protected static String _privk3_setMatchedMUTElement(final StructuredDataInstanceAspectStructuredDataInstanceAspectProperties _self_, final StructuredDataInstance _self, final EObject matchedObject, final Resource MUTResource, final String DSLPath) {
    String status = "";
    int _size = _self.getMemberAssignment().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        MemberAssignment memberAssig = _self.getMemberAssignment().get((i).intValue());
        if ((DataTypeAspect.isDynamicType(memberAssig.getMember().getDataType()) || MemberAspect.isDynamicMember(memberAssig.getMember()))) {
          status = MemberAssignmentAspect.setMatchedMember(memberAssig, matchedObject, MUTResource, DSLPath);
        } else {
          if ((memberAssig instanceof DataInstanceUse)) {
            DataUse _memberSpec = memberAssig.getMemberSpec();
            final DataInstanceUse data = ((DataInstanceUse) _memberSpec);
            Boolean _hasItems = MemberAssignmentAspect.hasItems(memberAssig);
            if ((_hasItems).booleanValue()) {
              int _size_1 = data.getItem().size();
              ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
              for (final Integer j : _doubleDotLessThan_1) {
                {
                  DataUse _get = data.getItem().get((j).intValue());
                  final DataInstanceUse item = ((DataInstanceUse) _get);
                  final EObject rootObject = DataInstanceUseAspect.getMatchedMUTElement(item, MUTResource, false, DSLPath);
                  DataUse _get_1 = data.getItem().get((j).intValue());
                  status = DataInstanceUseAspect.setMatchedMUTElement(((DataInstanceUse) _get_1), rootObject, MUTResource, DSLPath);
                  boolean _contains = status.contains(TDLTestResultUtil.FAIL);
                  if (_contains) {
                    return status;
                  }
                }
              }
            } else {
              final EObject rootObject = DataInstanceUseAspect.getMatchedMUTElement(data, MUTResource, false, DSLPath);
              status = DataInstanceUseAspect.setMatchedMUTElement(data, rootObject, MUTResource, DSLPath);
              boolean _contains = status.contains(TDLTestResultUtil.FAIL);
              if (_contains) {
                return status;
              }
            }
          }
        }
        boolean _contains_1 = status.contains(TDLTestResultUtil.FAIL);
        if (_contains_1) {
          return status;
        }
      }
    }
    return status;
  }

  protected static ArrayList<EObject> _privk3_matchedElements(final StructuredDataInstanceAspectStructuredDataInstanceAspectProperties _self_, final StructuredDataInstance _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMatchedElements") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.ArrayList) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.matchedElements;
  }

  protected static void _privk3_matchedElements(final StructuredDataInstanceAspectStructuredDataInstanceAspectProperties _self_, final StructuredDataInstance _self, final ArrayList<EObject> matchedElements) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMatchedElements")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, matchedElements);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.matchedElements = matchedElements;
    }
  }
}
