package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.Sketch;

@SuppressWarnings("all")
public class SketchAspectSketchAspectContext {
  public static final SketchAspectSketchAspectContext INSTANCE = new SketchAspectSketchAspectContext();
  
  public static SketchAspectSketchAspectProperties getSelf(final Sketch _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.SketchAspectSketchAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sketch, SketchAspectSketchAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Sketch, org.imt.arduino.reactive.interpreter.SketchAspectSketchAspectProperties>();
  
  public Map<Sketch, SketchAspectSketchAspectProperties> getMap() {
    return map;
  }
}
