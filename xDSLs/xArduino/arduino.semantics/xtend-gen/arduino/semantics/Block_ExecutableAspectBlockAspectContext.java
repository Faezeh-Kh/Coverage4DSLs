package arduino.semantics;

import arduino.Block;
import java.util.Map;

@SuppressWarnings("all")
public class Block_ExecutableAspectBlockAspectContext {
  public static final Block_ExecutableAspectBlockAspectContext INSTANCE = new Block_ExecutableAspectBlockAspectContext();

  public static Block_ExecutableAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Block_ExecutableAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Block, Block_ExecutableAspectBlockAspectProperties> map = new java.util.WeakHashMap<arduino.Block, arduino.semantics.Block_ExecutableAspectBlockAspectProperties>();

  public Map<Block, Block_ExecutableAspectBlockAspectProperties> getMap() {
    return map;
  }
}
