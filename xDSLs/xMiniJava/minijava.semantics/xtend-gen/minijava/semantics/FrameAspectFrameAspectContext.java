package minijava.semantics;

import java.util.Map;
import xminiJava.Frame;

@SuppressWarnings("all")
public class FrameAspectFrameAspectContext {
  public static final FrameAspectFrameAspectContext INSTANCE = new FrameAspectFrameAspectContext();

  public static FrameAspectFrameAspectProperties getSelf(final Frame _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.FrameAspectFrameAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Frame, FrameAspectFrameAspectProperties> map = new java.util.WeakHashMap<xminiJava.Frame, minijava.semantics.FrameAspectFrameAspectProperties>();

  public Map<Frame, FrameAspectFrameAspectProperties> getMap() {
    return map;
  }
}
