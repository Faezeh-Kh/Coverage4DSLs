package org.imt.arduino.reactive.interpreter;

import java.util.Map;
import org.imt.arduino.reactive.arduino.Block;

@SuppressWarnings("all")
public class Block_ExecutableAspectBlockAspectContext {
  public static final Block_ExecutableAspectBlockAspectContext INSTANCE = new Block_ExecutableAspectBlockAspectContext();
  
  public static Block_ExecutableAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.arduino.reactive.interpreter.Block_ExecutableAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Block, Block_ExecutableAspectBlockAspectProperties> map = new java.util.WeakHashMap<org.imt.arduino.reactive.arduino.Block, org.imt.arduino.reactive.interpreter.Block_ExecutableAspectBlockAspectProperties>();
  
  public Map<Block, Block_ExecutableAspectBlockAspectProperties> getMap() {
    return map;
  }
}
