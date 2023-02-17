package tll.load;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tll.TllPackage;
import tll.System;


public class ModelLoader {
        public System load(String uri) {
                // Initialize the model
                TllPackage.eINSTANCE.eClass();

                // Register the XMI resource factory for the .xmi extension
                Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
                Map<String, Object> m = reg.getExtensionToFactoryMap();
                m.put("xmi", new XMIResourceFactoryImpl());

                // Obtain a new resource set
                ResourceSet resSet = new ResourceSetImpl();

                // Get the resource
                Resource resource = resSet.getResource(URI
                                .createURI(uri), true);
                // Get the first model element and cast it to the right type, in my
                // example everything is hierarchical included in this first node
                System system = (System) resource.getContents().get(0);
                return system;
        }

}