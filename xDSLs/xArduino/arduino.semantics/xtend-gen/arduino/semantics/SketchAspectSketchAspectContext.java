package arduino.semantics;

import arduino.Sketch;
import java.util.Map;

@SuppressWarnings("all")
public class SketchAspectSketchAspectContext {
  public static final SketchAspectSketchAspectContext INSTANCE = new SketchAspectSketchAspectContext();

  public static SketchAspectSketchAspectProperties getSelf(final Sketch _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.SketchAspectSketchAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Sketch, SketchAspectSketchAspectProperties> map = new java.util.WeakHashMap<arduino.Sketch, arduino.semantics.SketchAspectSketchAspectProperties>();

  public Map<Sketch, SketchAspectSketchAspectProperties> getMap() {
    return map;
  }
}
