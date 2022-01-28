package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Frame;

@SuppressWarnings("all")
public class FrameAspectFrameAspectContext {
  public static final FrameAspectFrameAspectContext INSTANCE = new FrameAspectFrameAspectContext();
  
  public static FrameAspectFrameAspectProperties getSelf(final Frame _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.FrameAspectFrameAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Frame, FrameAspectFrameAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Frame, org.imt.xminijava.interpreter.FrameAspectFrameAspectProperties>();
  
  public Map<Frame, FrameAspectFrameAspectProperties> getMap() {
    return map;
  }
}
