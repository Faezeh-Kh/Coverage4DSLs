package org.imt.k3tdl.k3dsa;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.etsi.mts.tdl.GateInstance;
import org.etsi.mts.tdl.Message;
import org.etsi.mts.tdl.Target;
import org.imt.tdl.testResult.TDLMessageResult;
import org.imt.tdl.testResult.TDLTestCaseResult;
import org.imt.tdl.testResult.TDLTestResultUtil;

@Aspect(className = Message.class)
@SuppressWarnings("all")
public class MessageAspect extends InteractoinAspect {
  @Step
  @OverrideAspectMethod
  public static boolean performBehavior(final Message _self) {
    final org.imt.k3tdl.k3dsa.MessageAspectMessageAspectProperties _self_ = org.imt.k3tdl.k3dsa.MessageAspectMessageAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean performBehavior()
    if (_self instanceof org.etsi.mts.tdl.Message){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.imt.k3tdl.k3dsa.MessageAspect._privk3_performBehavior(_self_, (org.etsi.mts.tdl.Message)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Message", "performBehavior");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }

  public static void addMessageResult(final Message _self, final String info) {
    final org.imt.k3tdl.k3dsa.MessageAspectMessageAspectProperties _self_ = org.imt.k3tdl.k3dsa.MessageAspectMessageAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void addMessageResult(String)
    if (_self instanceof org.etsi.mts.tdl.Message){
    	org.imt.k3tdl.k3dsa.MessageAspect._privk3_addMessageResult(_self_, (org.etsi.mts.tdl.Message)_self,info);
    };
  }

  private static TDLMessageResult messageVerdict(final Message _self) {
    final org.imt.k3tdl.k3dsa.MessageAspectMessageAspectProperties _self_ = org.imt.k3tdl.k3dsa.MessageAspectMessageAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TDLMessageResult messageVerdict()
    if (_self instanceof org.etsi.mts.tdl.Message){
    	result = org.imt.k3tdl.k3dsa.MessageAspect._privk3_messageVerdict(_self_, (org.etsi.mts.tdl.Message)_self);
    };
    return (org.imt.tdl.testResult.TDLMessageResult)result;
  }

  private static void messageVerdict(final Message _self, final TDLMessageResult messageVerdict) {
    final org.imt.k3tdl.k3dsa.MessageAspectMessageAspectProperties _self_ = org.imt.k3tdl.k3dsa.MessageAspectMessageAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void messageVerdict(TDLMessageResult)
    if (_self instanceof org.etsi.mts.tdl.Message){
    	org.imt.k3tdl.k3dsa.MessageAspect._privk3_messageVerdict(_self_, (org.etsi.mts.tdl.Message)_self,messageVerdict);
    };
  }

  private static boolean super_performBehavior(final Message _self) {
    final org.imt.k3tdl.k3dsa.InteractoinAspectInteractionAspectProperties _self_ = org.imt.k3tdl.k3dsa.InteractoinAspectInteractionAspectContext.getSelf(_self);
    return  org.imt.k3tdl.k3dsa.InteractoinAspect._privk3_performBehavior(_self_, _self);
  }

  protected static boolean _privk3_performBehavior(final MessageAspectMessageAspectProperties _self_, final Message _self) {
    EList<Target> _target = _self.getTarget();
    for (final Target t : _target) {
      {
        GateInstance _gate = t.getTargetGate().getGate();
        GateInstanceAspect.DSLPath(_gate, TestConfigurationAspect.DSLPath(_self.getParentTestDescription().getTestConfiguration()));
        GateInstance _gate_1 = t.getTargetGate().getGate();
        GateInstanceAspect.MUTPath(_gate_1, TestConfigurationAspect.MUTPath(_self.getParentTestDescription().getTestConfiguration()));
        String _string = _self.getSourceGate().getComponent().getRole().toString();
        boolean _equals = Objects.equal(_string, "SUT");
        if (_equals) {
          GateInstanceAspect.setLauncher(_self.getSourceGate().getGate(), TestDescriptionAspect.launcher(_self.getParentTestDescription()));
          String verdict = GateInstanceAspect.assertArgument(_self.getSourceGate().getGate(), _self.getArgument());
          MessageAspect.addMessageResult(_self, verdict);
          return true;
        } else {
          GateInstanceAspect.setLauncher(t.getTargetGate().getGate(), TestDescriptionAspect.launcher(_self.getParentTestDescription()));
          String verdict_1 = null;
          verdict_1 = GateInstanceAspect.sendArgument2sut(t.getTargetGate().getGate(), _self.getArgument());
          MessageAspect.addMessageResult(_self, verdict_1);
          boolean result = true;
          boolean _contains = verdict_1.contains(TDLTestResultUtil.FAIL);
          if (_contains) {
            result = false;
            TDLTestCaseResult _testCaseResult = TestDescriptionAspect.testCaseResult(_self.getParentTestDescription());
            _testCaseResult.setValue(TDLTestResultUtil.INCONCLUSIVE);
          }
          return result;
        }
      }
    }
    return false;
  }

  protected static void _privk3_addMessageResult(final MessageAspectMessageAspectProperties _self_, final Message _self, final String info) {
    String result = "";
    boolean _contains = info.contains(TDLTestResultUtil.FAIL);
    if (_contains) {
      result = TDLTestResultUtil.FAIL;
      TDLTestCaseResult _testCaseResult = TestDescriptionAspect.testCaseResult(_self.getParentTestDescription());
      _testCaseResult.setValue(TDLTestResultUtil.FAIL);
    } else {
      boolean _contains_1 = info.contains(TDLTestResultUtil.INCONCLUSIVE);
      if (_contains_1) {
        result = TDLTestResultUtil.INCONCLUSIVE;
        TDLTestCaseResult _testCaseResult_1 = TestDescriptionAspect.testCaseResult(_self.getParentTestDescription());
        _testCaseResult_1.setValue(TDLTestResultUtil.INCONCLUSIVE);
      } else {
        boolean _contains_2 = info.contains(TDLTestResultUtil.PASS);
        if (_contains_2) {
          result = TDLTestResultUtil.PASS;
        }
      }
    }
    String description = info;
    boolean _contains_3 = info.contains(":");
    if (_contains_3) {
      int _indexOf = info.indexOf(":");
      int _plus = (_indexOf + 2);
      description = info.substring(_plus, info.length());
    }
    TDLMessageResult _tDLMessageResult = new TDLMessageResult(_self, result, description, null);
    MessageAspect.messageVerdict(_self, _tDLMessageResult);
    TestDescriptionAspect.testCaseResult(_self.getParentTestDescription()).addTdlMessage(MessageAspect.messageVerdict(_self));
  }

  protected static TDLMessageResult _privk3_messageVerdict(final MessageAspectMessageAspectProperties _self_, final Message _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMessageVerdict") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.imt.tdl.testResult.TDLMessageResult) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.messageVerdict;
  }

  protected static void _privk3_messageVerdict(final MessageAspectMessageAspectProperties _self_, final Message _self, final TDLMessageResult messageVerdict) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMessageVerdict")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, messageVerdict);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.messageVerdict = messageVerdict;
    }
  }
}
