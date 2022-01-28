package mutator.MiniJavaMutation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.AbstractMap.SimpleEntry;
import org.eclipse.core.resources.IProject;
import exceptions.*;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import mutator.MiniJavaAO.MiniJavaAO;
import mutator.MiniJavaAP.MiniJavaAP;
import mutator.MiniJavaGeneral.MiniJavaGeneral;
import mutator.MiniJavaUCOD.MiniJavaUCOD;
import manager.IMutatorExecutor;
import manager.IWodelTest;
import manager.ModelManager;
import manager.MutatorUtils;
import manager.MutatorUtils.MutationResults;

public class MiniJavaMutationLauncher implements IMutatorExecutor {
	public MutationResults execute(int maxAttempts, int numMutants, boolean registry, boolean metrics,
			boolean debugMetrics, String[] blockNames, IProject project, IProgressMonitor monitor, boolean serialize,
			Object testObject, TreeMap<String, List<String>> classes, HashMap<String, EPackage> registeredPackages)
			throws ReferenceNonExistingException, WrongAttributeTypeException, MaxSmallerThanMinException,
			AbstractCreationException, ObjectNoTargetableException, ObjectNotContainedException,
			MetaModelNotFoundException, ModelNotFoundException, IOException {
		IWodelTest test = testObject != null ? (IWodelTest) testObject : null;
		String ecoreURI = "/MiniJavaMutation/data/model/XMiniJava.ecore";
		List<EPackage> packages = ModelManager.loadMetaModel(ecoreURI, this.getClass());
		boolean isRegistered = ModelManager.isRegistered(packages);
		Map<String, EPackage> localRegisteredPackages = null;
		if (isRegistered == true) {
			if (registeredPackages != null) {
				List<EPackage> packageList = new ArrayList<EPackage>();
				packageList.addAll(registeredPackages.values());
				ModelManager.unregisterMetaModel(packageList);
			}
			localRegisteredPackages = ModelManager.unregisterMetaModel(packages);
		}
		MutationResults mutationResults = new MutationResults();
		MutatorUtils mutMiniJavaAO = new MiniJavaAO();
		MutationResults resultsMiniJavaAO = mutMiniJavaAO.execute(maxAttempts, numMutants, registry, metrics,
				debugMetrics, packages, registeredPackages, localRegisteredPackages, blockNames, project, monitor,
				serialize, test, classes);
		mutationResults.numMutatorsApplied += resultsMiniJavaAO.numMutatorsApplied;
		mutationResults.numMutantsGenerated += resultsMiniJavaAO.numMutantsGenerated;
		if (resultsMiniJavaAO.mutatorsApplied != null) {
			if (mutationResults.mutatorsApplied == null) {
				mutationResults.mutatorsApplied = new ArrayList<String>();
			}
			mutationResults.mutatorsApplied.addAll(resultsMiniJavaAO.mutatorsApplied);
		}
		MutatorUtils mutMiniJavaAP = new MiniJavaAP();
		MutationResults resultsMiniJavaAP = mutMiniJavaAP.execute(maxAttempts, numMutants, registry, metrics,
				debugMetrics, packages, registeredPackages, localRegisteredPackages, blockNames, project, monitor,
				serialize, test, classes);
		mutationResults.numMutatorsApplied += resultsMiniJavaAP.numMutatorsApplied;
		mutationResults.numMutantsGenerated += resultsMiniJavaAP.numMutantsGenerated;
		if (resultsMiniJavaAP.mutatorsApplied != null) {
			if (mutationResults.mutatorsApplied == null) {
				mutationResults.mutatorsApplied = new ArrayList<String>();
			}
			mutationResults.mutatorsApplied.addAll(resultsMiniJavaAP.mutatorsApplied);
		}
		MutatorUtils mutMiniJavaGeneral = new MiniJavaGeneral();
		MutationResults resultsMiniJavaGeneral = mutMiniJavaGeneral.execute(maxAttempts, numMutants, registry, metrics,
				debugMetrics, packages, registeredPackages, localRegisteredPackages, blockNames, project, monitor,
				serialize, test, classes);
		mutationResults.numMutatorsApplied += resultsMiniJavaGeneral.numMutatorsApplied;
		mutationResults.numMutantsGenerated += resultsMiniJavaGeneral.numMutantsGenerated;
		if (resultsMiniJavaGeneral.mutatorsApplied != null) {
			if (mutationResults.mutatorsApplied == null) {
				mutationResults.mutatorsApplied = new ArrayList<String>();
			}
			mutationResults.mutatorsApplied.addAll(resultsMiniJavaGeneral.mutatorsApplied);
		}
		MutatorUtils mutMiniJavaUCOD = new MiniJavaUCOD();
		MutationResults resultsMiniJavaUCOD = mutMiniJavaUCOD.execute(maxAttempts, numMutants, registry, metrics,
				debugMetrics, packages, registeredPackages, localRegisteredPackages, blockNames, project, monitor,
				serialize, test, classes);
		mutationResults.numMutatorsApplied += resultsMiniJavaUCOD.numMutatorsApplied;
		mutationResults.numMutantsGenerated += resultsMiniJavaUCOD.numMutantsGenerated;
		if (resultsMiniJavaUCOD.mutatorsApplied != null) {
			if (mutationResults.mutatorsApplied == null) {
				mutationResults.mutatorsApplied = new ArrayList<String>();
			}
			mutationResults.mutatorsApplied.addAll(resultsMiniJavaUCOD.mutatorsApplied);
		}
		if (isRegistered == true) {
			ModelManager.registerMetaModel(localRegisteredPackages);
			if (registeredPackages != null) {
				ModelManager.registerMetaModel(registeredPackages);
			}
		}
		return mutationResults;
	}
}
