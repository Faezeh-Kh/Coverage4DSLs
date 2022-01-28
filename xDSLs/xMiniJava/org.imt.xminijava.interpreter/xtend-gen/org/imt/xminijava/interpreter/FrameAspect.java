package org.imt.xminijava.interpreter;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.imt.minijava.xminiJava.Context;
import org.imt.minijava.xminiJava.Frame;

@Aspect(className = Frame.class)
@SuppressWarnings("all")
public class FrameAspect {
  public static Frame findCurrentFrame(final Frame _self) {
    final org.imt.xminijava.interpreter.FrameAspectFrameAspectProperties _self_ = org.imt.xminijava.interpreter.FrameAspectFrameAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Frame findCurrentFrame()
    if (_self instanceof org.imt.minijava.xminiJava.Frame){
    	result = org.imt.xminijava.interpreter.FrameAspect._privk3_findCurrentFrame(_self_, (org.imt.minijava.xminiJava.Frame)_self);
    };
    return (org.imt.minijava.xminiJava.Frame)result;
  }
  
  public static Context findCurrentContext(final Frame _self) {
    final org.imt.xminijava.interpreter.FrameAspectFrameAspectProperties _self_ = org.imt.xminijava.interpreter.FrameAspectFrameAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Context findCurrentContext()
    if (_self instanceof org.imt.minijava.xminiJava.Frame){
    	result = org.imt.xminijava.interpreter.FrameAspect._privk3_findCurrentContext(_self_, (org.imt.minijava.xminiJava.Frame)_self);
    };
    return (org.imt.minijava.xminiJava.Context)result;
  }
  
  protected static Frame _privk3_findCurrentFrame(final FrameAspectFrameAspectProperties _self_, final Frame _self) {
    Frame _childFrame = _self.getChildFrame();
    boolean _tripleNotEquals = (_childFrame != null);
    if (_tripleNotEquals) {
      return FrameAspect.findCurrentFrame(_self.getChildFrame());
    } else {
      return _self;
    }
  }
  
  protected static Context _privk3_findCurrentContext(final FrameAspectFrameAspectProperties _self_, final Frame _self) {
    Frame _childFrame = _self.getChildFrame();
    boolean _tripleNotEquals = (_childFrame != null);
    if (_tripleNotEquals) {
      return FrameAspect.findCurrentContext(_self.getChildFrame());
    } else {
      Context _rootContext = _self.getRootContext();
      boolean _tripleNotEquals_1 = (_rootContext != null);
      if (_tripleNotEquals_1) {
        return ContextAspect.findCurrentContext(_self.getRootContext());
      } else {
        return null;
      }
    }
  }
}
