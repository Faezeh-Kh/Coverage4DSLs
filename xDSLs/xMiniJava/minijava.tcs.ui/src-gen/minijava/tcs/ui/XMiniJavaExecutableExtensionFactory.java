/*
 * generated by Xtext 2.27.0
 */
package minijava.tcs.ui;

import com.google.inject.Injector;
import minijava.tcs.ui.internal.TcsActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XMiniJavaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(TcsActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		TcsActivator activator = TcsActivator.getInstance();
		return activator != null ? activator.getInjector(TcsActivator.MINIJAVA_TCS_XMINIJAVA) : null;
	}

}
