package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.ProcedureCall;

@SuppressWarnings("all")
public class ProcedureCallAspectProcedureCallAspectContext {
  public static final ProcedureCallAspectProcedureCallAspectContext INSTANCE = new ProcedureCallAspectProcedureCallAspectContext();

  public static ProcedureCallAspectProcedureCallAspectProperties getSelf(final ProcedureCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.ProcedureCallAspectProcedureCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ProcedureCall, ProcedureCallAspectProcedureCallAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.ProcedureCall, org.imt.k3tdl.k3dsa.ProcedureCallAspectProcedureCallAspectProperties>();

  public Map<ProcedureCall, ProcedureCallAspectProcedureCallAspectProperties> getMap() {
    return map;
  }
}
