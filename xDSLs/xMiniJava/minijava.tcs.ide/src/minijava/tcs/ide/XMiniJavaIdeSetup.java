/*
 * generated by Xtext 2.27.0
 */
package minijava.tcs.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import minijava.tcs.XMiniJavaRuntimeModule;
import minijava.tcs.XMiniJavaStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class XMiniJavaIdeSetup extends XMiniJavaStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new XMiniJavaRuntimeModule(), new XMiniJavaIdeModule()));
	}
	
}
