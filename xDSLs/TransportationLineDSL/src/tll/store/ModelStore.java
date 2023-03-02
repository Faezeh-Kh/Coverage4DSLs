package tll.store;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tll.System;


public class ModelStore {
        public void store(System system, String uri) {

                Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
                Map<String, Object> m = reg.getExtensionToFactoryMap();
                m.put("xmi", new XMIResourceFactoryImpl());

                // Obtain a new resource set
                ResourceSet resSet = new ResourceSetImpl();

                // create a resource
                Resource resource = resSet.createResource(URI
                                .createURI(uri));
                // Get the first model element and cast it to the right type, in my
                // example everything is hierarchical included in this first node
                resource.getContents().add(system);

                // now save the content.
                try {
                        resource.save(Collections.EMPTY_MAP);
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
        }

}