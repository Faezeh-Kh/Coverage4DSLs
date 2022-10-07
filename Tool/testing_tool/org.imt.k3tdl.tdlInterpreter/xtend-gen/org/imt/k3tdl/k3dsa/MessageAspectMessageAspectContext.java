package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.Message;

@SuppressWarnings("all")
public class MessageAspectMessageAspectContext {
  public static final MessageAspectMessageAspectContext INSTANCE = new MessageAspectMessageAspectContext();

  public static MessageAspectMessageAspectProperties getSelf(final Message _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.MessageAspectMessageAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Message, MessageAspectMessageAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.Message, org.imt.k3tdl.k3dsa.MessageAspectMessageAspectProperties>();

  public Map<Message, MessageAspectMessageAspectProperties> getMap() {
    return map;
  }
}
