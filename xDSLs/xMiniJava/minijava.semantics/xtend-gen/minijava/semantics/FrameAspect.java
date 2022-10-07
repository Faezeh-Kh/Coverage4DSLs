package minijava.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import xminiJava.Context;
import xminiJava.Frame;

@Aspect(className = Frame.class)
@SuppressWarnings("all")
public class FrameAspect {
  public static Frame findCurrentFrame(final Frame _self) {
    final minijava.semantics.FrameAspectFrameAspectProperties _self_ = minijava.semantics.FrameAspectFrameAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Frame findCurrentFrame()
    if (_self instanceof xminiJava.Frame){
    	result = minijava.semantics.FrameAspect._privk3_findCurrentFrame(_self_, (xminiJava.Frame)_self);
    };
    return (xminiJava.Frame)result;
  }

  public static Context findCurrentContext(final Frame _self) {
    final minijava.semantics.FrameAspectFrameAspectProperties _self_ = minijava.semantics.FrameAspectFrameAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Context findCurrentContext()
    if (_self instanceof xminiJava.Frame){
    	result = minijava.semantics.FrameAspect._privk3_findCurrentContext(_self_, (xminiJava.Frame)_self);
    };
    return (xminiJava.Context)result;
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
