package org.imt.xminijava.interpreter;

import java.util.Map;
import org.imt.minijava.xminiJava.Block;

@SuppressWarnings("all")
public class BlockAspectBlockAspectContext {
  public static final BlockAspectBlockAspectContext INSTANCE = new BlockAspectBlockAspectContext();
  
  public static BlockAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.xminijava.interpreter.BlockAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Block, BlockAspectBlockAspectProperties> map = new java.util.WeakHashMap<org.imt.minijava.xminiJava.Block, org.imt.xminijava.interpreter.BlockAspectBlockAspectProperties>();
  
  public Map<Block, BlockAspectBlockAspectProperties> getMap() {
    return map;
  }
}
