package arduino.semantics;

import arduino.Project;
import java.util.Map;

@SuppressWarnings("all")
public class Project_ExecutableAspectProjectAspectContext {
  public static final Project_ExecutableAspectProjectAspectContext INSTANCE = new Project_ExecutableAspectProjectAspectContext();

  public static Project_ExecutableAspectProjectAspectProperties getSelf(final Project _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new arduino.semantics.Project_ExecutableAspectProjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Project, Project_ExecutableAspectProjectAspectProperties> map = new java.util.WeakHashMap<arduino.Project, arduino.semantics.Project_ExecutableAspectProjectAspectProperties>();

  public Map<Project, Project_ExecutableAspectProjectAspectProperties> getMap() {
    return map;
  }
}
