package org.imt.xminijava.interpreter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.imt.minijava.xminiJava.ArrayInstance;
import org.imt.minijava.xminiJava.ArrayRefValue;
import org.imt.minijava.xminiJava.ArrayTypeRef;
import org.imt.minijava.xminiJava.Context;
import org.imt.minijava.xminiJava.Frame;
import org.imt.minijava.xminiJava.Member;
import org.imt.minijava.xminiJava.Method;
import org.imt.minijava.xminiJava.Parameter;
import org.imt.minijava.xminiJava.Program;
import org.imt.minijava.xminiJava.State;
import org.imt.minijava.xminiJava.StringTypeRef;
import org.imt.minijava.xminiJava.StringValue;
import org.imt.minijava.xminiJava.SymbolBinding;
import org.imt.minijava.xminiJava.TypeDeclaration;
import org.imt.minijava.xminiJava.XminiJavaFactory;

@Aspect(className = Program.class)
@SuppressWarnings("all")
public class ProgramAspect {
  @Main
  @Step
  public static void main(final Program _self) {
    final org.imt.xminijava.interpreter.ProgramAspectProgramAspectProperties _self_ = org.imt.xminijava.interpreter.ProgramAspectProgramAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof org.imt.minijava.xminiJava.Program){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.imt.xminijava.interpreter.ProgramAspect._privk3_main(_self_, (org.imt.minijava.xminiJava.Program)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Program", "main");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @InitializeModel
  public static void initialize(final Program _self, final List<String> args) {
    final org.imt.xminijava.interpreter.ProgramAspectProgramAspectProperties _self_ = org.imt.xminijava.interpreter.ProgramAspectProgramAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initialize(List<String>)
    if (_self instanceof org.imt.minijava.xminiJava.Program){
    	org.imt.xminijava.interpreter.ProgramAspect._privk3_initialize(_self_, (org.imt.minijava.xminiJava.Program)_self,args);
    };
  }
  
  public static State execute(final Program _self) {
    final org.imt.xminijava.interpreter.ProgramAspectProgramAspectProperties _self_ = org.imt.xminijava.interpreter.ProgramAspectProgramAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State execute()
    if (_self instanceof org.imt.minijava.xminiJava.Program){
    	result = org.imt.xminijava.interpreter.ProgramAspect._privk3_execute(_self_, (org.imt.minijava.xminiJava.Program)_self);
    };
    return (org.imt.minijava.xminiJava.State)result;
  }
  
  protected static void _privk3_main(final ProgramAspectProgramAspectProperties _self_, final Program _self) {
    ProgramAspect.execute(_self);
  }
  
  protected static void _privk3_initialize(final ProgramAspectProgramAspectProperties _self_, final Program _self, final List<String> args) {
    final Function1<TypeDeclaration, EList<Member>> _function = (TypeDeclaration it) -> {
      return it.getMembers();
    };
    final Function1<Method, Boolean> _function_1 = (Method it) -> {
      return Boolean.valueOf(((((Objects.equal(it.getName(), "main") && it.isStatic()) && (it.getParams().size() == 1)) && (IterableExtensions.<Parameter>head(it.getParams()).getTypeRef() instanceof ArrayTypeRef)) && 
        (((ArrayTypeRef) IterableExtensions.<Parameter>head(it.getParams()).getTypeRef()).getTypeRef() instanceof StringTypeRef)));
    };
    final Method main = IterableExtensions.<Method>findFirst(Iterables.<Method>filter((Iterables.<Member>concat(ListExtensions.<TypeDeclaration, EList<Member>>map(_self.getClasses(), _function))), Method.class), _function_1);
    if ((main != null)) {
      final ArrayInstance argsArray = XminiJavaFactory.eINSTANCE.createArrayInstance();
      argsArray.setSize(args.size());
      for (final String arg : args) {
        {
          StringValue _createStringValue = XminiJavaFactory.eINSTANCE.createStringValue();
          final Procedure1<StringValue> _function_2 = (StringValue it) -> {
            it.setValue(arg);
          };
          final StringValue stringVal = ObjectExtensions.<StringValue>operator_doubleArrow(_createStringValue, _function_2);
          argsArray.getValue().add(stringVal);
        }
      }
      SymbolBinding _createSymbolBinding = XminiJavaFactory.eINSTANCE.createSymbolBinding();
      final Procedure1<SymbolBinding> _function_2 = (SymbolBinding it) -> {
        it.setSymbol(IterableExtensions.<Parameter>head(main.getParams()));
        ArrayRefValue _createArrayRefValue = XminiJavaFactory.eINSTANCE.createArrayRefValue();
        final Procedure1<ArrayRefValue> _function_3 = (ArrayRefValue it_1) -> {
          it_1.setInstance(argsArray);
        };
        ArrayRefValue _doubleArrow = ObjectExtensions.<ArrayRefValue>operator_doubleArrow(_createArrayRefValue, _function_3);
        it.setValue(_doubleArrow);
      };
      final SymbolBinding argsBinding = ObjectExtensions.<SymbolBinding>operator_doubleArrow(_createSymbolBinding, _function_2);
      final Context rootCont = XminiJavaFactory.eINSTANCE.createContext();
      rootCont.getBindings().add(argsBinding);
      State _createState = XminiJavaFactory.eINSTANCE.createState();
      final Procedure1<State> _function_3 = (State it) -> {
        it.setOutputStream(XminiJavaFactory.eINSTANCE.createOutputStream());
        Frame _createFrame = XminiJavaFactory.eINSTANCE.createFrame();
        final Procedure1<Frame> _function_4 = (Frame it_1) -> {
          it_1.setRootContext(rootCont);
        };
        Frame _doubleArrow = ObjectExtensions.<Frame>operator_doubleArrow(_createFrame, _function_4);
        it.setRootFrame(_doubleArrow);
      };
      final State state = ObjectExtensions.<State>operator_doubleArrow(_createState, _function_3);
      state.getArraysHeap().add(argsArray);
      _self.setState(state);
    } else {
      throw new RuntimeException("No main method found.");
    }
  }
  
  protected static State _privk3_execute(final ProgramAspectProgramAspectProperties _self_, final Program _self) {
    final Function1<TypeDeclaration, EList<Member>> _function = (TypeDeclaration it) -> {
      return it.getMembers();
    };
    final Function1<Method, Boolean> _function_1 = (Method it) -> {
      return Boolean.valueOf(((((Objects.equal(it.getName(), "main") && it.isStatic()) && (it.getParams().size() == 1)) && (IterableExtensions.<Parameter>head(it.getParams()).getTypeRef() instanceof ArrayTypeRef)) && 
        (((ArrayTypeRef) IterableExtensions.<Parameter>head(it.getParams()).getTypeRef()).getTypeRef() instanceof StringTypeRef)));
    };
    final Method main = IterableExtensions.<Method>findFirst(Iterables.<Method>filter((Iterables.<Member>concat(ListExtensions.<TypeDeclaration, EList<Member>>map(_self.getClasses(), _function))), Method.class), _function_1);
    BlockAspect.evaluateStatementKeepContext(main.getBody(), _self.getState());
    return _self.getState();
  }
}
