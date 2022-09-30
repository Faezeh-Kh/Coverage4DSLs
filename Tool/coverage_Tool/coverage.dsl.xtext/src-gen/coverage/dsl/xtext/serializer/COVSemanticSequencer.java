/*
 * generated by Xtext 2.28.0
 */
package coverage.dsl.xtext.serializer;

import DSLSpecificCoverage.ConditionalIgnore;
import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.CoverageByContent;
import DSLSpecificCoverage.CoverageOfReferenced;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;
import DSLSpecificCoverage.DomainSpecificCoverage;
import DSLSpecificCoverage.Ignore;
import com.google.inject.Inject;
import coverage.dsl.xtext.services.COVGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class COVSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private COVGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DSLSpecificCoveragePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DSLSpecificCoveragePackage.CONDITIONAL_IGNORE:
				sequence_ConditionalIgnore(context, (ConditionalIgnore) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.CONTEXT:
				sequence_Context(context, (Context) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.COVERAGE_BY_CONTENT:
				sequence_CoverageByContent(context, (CoverageByContent) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.COVERAGE_OF_REFERENCED:
				sequence_CoverageOfReferenced(context, (CoverageOfReferenced) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.DOMAIN_SPECIFIC_COVERAGE:
				sequence_DomainSpecificCoverage(context, (DomainSpecificCoverage) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.IGNORE:
				sequence_Ignore(context, (Ignore) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns ConditionalIgnore
	 *     ConditionalIgnore returns ConditionalIgnore
	 *
	 * Constraint:
	 *     (condition=ConditionType containerType+=[EClass|EString] containerType+=[EClass|EString]*)
	 * </pre>
	 */
	protected void sequence_ConditionalIgnore(ISerializationContext context, ConditionalIgnore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Context returns Context
	 *
	 * Constraint:
	 *     (metaclass=[EClass|EString] (rules+=Rule rules+=Rule*)?)
	 * </pre>
	 */
	protected void sequence_Context(ISerializationContext context, Context semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns CoverageByContent
	 *     CoverageByContent returns CoverageByContent
	 *
	 * Constraint:
	 *     (containmentReference=[EReference|EString] multiplicity=CoveredContents)
	 * </pre>
	 */
	protected void sequence_CoverageByContent(ISerializationContext context, CoverageByContent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSpecificCoveragePackage.Literals.COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSpecificCoveragePackage.Literals.COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE));
			if (transientValues.isValueTransient(semanticObject, DSLSpecificCoveragePackage.Literals.COVERAGE_BY_CONTENT__MULTIPLICITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSpecificCoveragePackage.Literals.COVERAGE_BY_CONTENT__MULTIPLICITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoverageByContentAccess().getContainmentReferenceEReferenceEStringParserRuleCall_3_0_1(), semanticObject.eGet(DSLSpecificCoveragePackage.Literals.COVERAGE_BY_CONTENT__CONTAINMENT_REFERENCE, false));
		feeder.accept(grammarAccess.getCoverageByContentAccess().getMultiplicityCoveredContentsEnumRuleCall_5_0(), semanticObject.getMultiplicity());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns CoverageOfReferenced
	 *     CoverageOfReferenced returns CoverageOfReferenced
	 *
	 * Constraint:
	 *     reference=[EReference|EString]
	 * </pre>
	 */
	protected void sequence_CoverageOfReferenced(ISerializationContext context, CoverageOfReferenced semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSpecificCoveragePackage.Literals.COVERAGE_OF_REFERENCED__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSpecificCoveragePackage.Literals.COVERAGE_OF_REFERENCED__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoverageOfReferencedAccess().getReferenceEReferenceEStringParserRuleCall_3_0_1(), semanticObject.eGet(DSLSpecificCoveragePackage.Literals.COVERAGE_OF_REFERENCED__REFERENCE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DomainSpecificCoverage returns DomainSpecificCoverage
	 *
	 * Constraint:
	 *     (name=EString metamodel=[EPackage|EString] contexts+=Context contexts+=Context*)
	 * </pre>
	 */
	protected void sequence_DomainSpecificCoverage(ISerializationContext context, DomainSpecificCoverage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns Ignore
	 *     Ignore returns Ignore
	 *
	 * Constraint:
	 *     ignoreSubtypes=EBoolean?
	 * </pre>
	 */
	protected void sequence_Ignore(ISerializationContext context, Ignore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}