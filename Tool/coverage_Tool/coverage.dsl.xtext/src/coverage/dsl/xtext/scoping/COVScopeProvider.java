/*
 * generated by Xtext 2.26.0
 */
package coverage.dsl.xtext.scoping;

import java.util.Collection;

import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.CoverageByContainment;
import DSLSpecificCoverage.CoverageByReference;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;
import DSLSpecificCoverage.DomainSpecificCoverage;
import DSLSpecificCoverage.IgnoreIfContained;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class COVScopeProvider extends AbstractCOVScopeProvider {
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference.equals(DSLSpecificCoveragePackage.eINSTANCE.getDomainSpecificCoverage_Metamodel())) {
			Collection<EPackage> allPackages = EPackage.Registry.INSTANCE.values()
												.stream()
												.filter(EPackage.class::isInstance)
												.map(EPackage.class::cast)
												.collect(Collectors.toCollection(BasicEList::new));
			
			return Scopes.scopeFor(allPackages);			
		}
		else if (reference.equals(DSLSpecificCoveragePackage.eINSTANCE.getContext_Metaclass())) {
			Collection<EClass> allClasses = ((DomainSpecificCoverage)((Context) context).eContainer())
												.getMetamodel().getEClassifiers().stream()
												.filter(EClass.class::isInstance)
												.map(EClass.class::cast)
												.collect(Collectors.toCollection(BasicEList::new));
			return Scopes.scopeFor(allClasses);
		}
		else if (reference.equals(DSLSpecificCoveragePackage.eINSTANCE.getIgnoreIfContained_ContainerType())) {
		Collection<EClass> allClasses = ((DomainSpecificCoverage)((Context)((IgnoreIfContained) context).eContainer()).eContainer())
											.getMetamodel().getEClassifiers().stream()
											.filter(EClass.class::isInstance)
											.map(EClass.class::cast)
											.collect(Collectors.toCollection(BasicEList::new));
		return Scopes.scopeFor(allClasses);
	}
		else if (reference.equals(DSLSpecificCoveragePackage.eINSTANCE.getCoverageByReference_Reference())) {
			EList<EReference> references = ((Context)((CoverageByReference) context).eContainer())
												.getMetaclass().getEAllReferences();
			return Scopes.scopeFor(references);
		}
		else if (reference.equals(DSLSpecificCoveragePackage.eINSTANCE.getCoverageByContainment_ContainmentReference())){
			EList<EReference> containments = ((Context)((CoverageByContainment) context).eContainer())
												.getMetaclass().getEAllContainments();
			return Scopes.scopeFor(containments);
		}
		return super.getScope(context, reference);
	}
}