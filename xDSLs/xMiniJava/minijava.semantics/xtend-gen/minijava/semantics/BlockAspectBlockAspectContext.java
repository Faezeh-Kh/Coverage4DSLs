package minijava.semantics;

import java.util.Map;
import xminiJava.Block;

@SuppressWarnings("all")
public class BlockAspectBlockAspectContext {
  public static final BlockAspectBlockAspectContext INSTANCE = new BlockAspectBlockAspectContext();

  public static BlockAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new minijava.semantics.BlockAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Block, BlockAspectBlockAspectProperties> map = new java.util.WeakHashMap<xminiJava.Block, minijava.semantics.BlockAspectBlockAspectProperties>();

  public Map<Block, BlockAspectBlockAspectProperties> getMap() {
    return map;
  }
}
