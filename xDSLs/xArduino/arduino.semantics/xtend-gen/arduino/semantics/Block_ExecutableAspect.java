package arduino.semantics;

import arduino.Block;
import arduino.Instruction;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class Block_ExecutableAspect {
  public static void execute(final Block _self) {
    final arduino.semantics.Block_ExecutableAspectBlockAspectProperties _self_ = arduino.semantics.Block_ExecutableAspectBlockAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof arduino.Block){
    	arduino.semantics.Block_ExecutableAspect._privk3_execute(_self_, (arduino.Block)_self);
    };
  }

  protected static void _privk3_execute(final Block_ExecutableAspectBlockAspectProperties _self_, final Block _self) {
    EList<Instruction> _instructions = _self.getInstructions();
    for (final Instruction i : _instructions) {
      Instruction_ExecutableAspect.execute(i);
    }
  }
}
