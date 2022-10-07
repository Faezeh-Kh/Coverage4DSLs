package org.imt.k3tdl.k3dsa;

import java.util.Map;
import org.etsi.mts.tdl.TestDescriptionReference;

@SuppressWarnings("all")
public class TestDescriptionReferenceAspectTestDescriptionReferenceAspectContext {
  public static final TestDescriptionReferenceAspectTestDescriptionReferenceAspectContext INSTANCE = new TestDescriptionReferenceAspectTestDescriptionReferenceAspectContext();

  public static TestDescriptionReferenceAspectTestDescriptionReferenceAspectProperties getSelf(final TestDescriptionReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspectTestDescriptionReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TestDescriptionReference, TestDescriptionReferenceAspectTestDescriptionReferenceAspectProperties> map = new java.util.WeakHashMap<org.etsi.mts.tdl.TestDescriptionReference, org.imt.k3tdl.k3dsa.TestDescriptionReferenceAspectTestDescriptionReferenceAspectProperties>();

  public Map<TestDescriptionReference, TestDescriptionReferenceAspectTestDescriptionReferenceAspectProperties> getMap() {
    return map;
  }
}
