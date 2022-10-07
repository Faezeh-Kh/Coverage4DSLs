package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Block;

@SuppressWarnings("all")
public class BlockAspectBlockAspectContext {
  public static final BlockAspectBlockAspectContext INSTANCE = new BlockAspectBlockAspectContext();

  public static BlockAspectBlockAspectProperties getSelf(final Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.BlockAspectBlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Block, BlockAspectBlockAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Block, org.imt.k3tdl.k3dsa.BlockAspectBlockAspectProperties>();

  public Map<Block, BlockAspectBlockAspectProperties> getMap() {
    return map;
  }
}
