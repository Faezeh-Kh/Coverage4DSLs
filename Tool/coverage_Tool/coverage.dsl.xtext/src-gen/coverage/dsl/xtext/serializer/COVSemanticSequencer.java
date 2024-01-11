/*
 * generated by Xtext 2.31.0
 */
package coverage.dsl.xtext.serializer;

import DSLSpecificCoverage.BranchSpecification;
import DSLSpecificCoverage.Condition;
import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.CoverageByContent;
import DSLSpecificCoverage.CoverageOfReferenced;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;
import DSLSpecificCoverage.DomainSpecificCoverage;
import DSLSpecificCoverage.ExplicitBranch;
import DSLSpecificCoverage.Ignore;
import DSLSpecificCoverage.ImplicitBranch;
import DSLSpecificCoverage.Import;
import DSLSpecificCoverage.LimitedIgnore;
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
			case DSLSpecificCoveragePackage.BRANCH_SPECIFICATION:
				sequence_BranchSpecification(context, (BranchSpecification) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
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
			case DSLSpecificCoveragePackage.EXPLICIT_BRANCH:
				sequence_ExplicitBranch(context, (ExplicitBranch) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.IGNORE:
				sequence_Ignore(context, (Ignore) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.IMPLICIT_BRANCH:
				sequence_ImplicitBranch(context, (ImplicitBranch) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.LIMITED_IGNORE:
				sequence_LimitedIgnore(context, (LimitedIgnore) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns BranchSpecification
	 *     BranchSpecification returns BranchSpecification
	 *
	 * Constraint:
	 *     (condition=Condition? branches+=Branch branches+=Branch* description=STRING?)
	 * </pre>
	 */
	protected void sequence_BranchSpecification(ISerializationContext context, BranchSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     OCLConstraint=STRING
	 * </pre>
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSpecificCoveragePackage.Literals.CONDITION__OCL_CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSpecificCoveragePackage.Literals.CONDITION__OCL_CONSTRAINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getOCLConstraintSTRINGTerminalRuleCall_0(), semanticObject.getOCLConstraint());
		feeder.finish();
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
	 *     (condition=Condition? multiplicity=CoveredContents containmentReference=[EReference|EString]? description=EString?)
	 * </pre>
	 */
	protected void sequence_CoverageByContent(ISerializationContext context, CoverageByContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns CoverageOfReferenced
	 *     CoverageOfReferenced returns CoverageOfReferenced
	 *
	 * Constraint:
	 *     (condition=Condition? reference+=[EReference|EString] reference+=[EReference|EString]* description=EString?)
	 * </pre>
	 */
	protected void sequence_CoverageOfReferenced(ISerializationContext context, CoverageOfReferenced semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DomainSpecificCoverage returns DomainSpecificCoverage
	 *
	 * Constraint:
	 *     (name=EString metamodel=[EPackage|EString] (imports+=Import imports+=Import*)? contexts+=Context contexts+=Context*)
	 * </pre>
	 */
	protected void sequence_DomainSpecificCoverage(ISerializationContext context, DomainSpecificCoverage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Branch returns ExplicitBranch
	 *     ExplicitBranch returns ExplicitBranch
	 *
	 * Constraint:
	 *     OCLQuery=STRING
	 * </pre>
	 */
	protected void sequence_ExplicitBranch(ISerializationContext context, ExplicitBranch semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSpecificCoveragePackage.Literals.EXPLICIT_BRANCH__OCL_QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSpecificCoveragePackage.Literals.EXPLICIT_BRANCH__OCL_QUERY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExplicitBranchAccess().getOCLQuerySTRINGTerminalRuleCall_1_0(), semanticObject.getOCLQuery());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns Ignore
	 *     Ignore returns Ignore
	 *
	 * Constraint:
	 *     (condition=Condition? ignoreSubtypes=EBoolean? description=EString?)
	 * </pre>
	 */
	protected void sequence_Ignore(ISerializationContext context, Ignore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Branch returns ImplicitBranch
	 *     ImplicitBranch returns ImplicitBranch
	 *
	 * Constraint:
	 *     {ImplicitBranch}
	 * </pre>
	 */
	protected void sequence_ImplicitBranch(ISerializationContext context, ImplicitBranch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     ((importedNamespace=ImportedFQN importURI=STRING?) | importURI=STRING | importedRuleset=[DomainSpecificCoverage|EString])
	 * </pre>
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns LimitedIgnore
	 *     LimitedIgnore returns LimitedIgnore
	 *
	 * Constraint:
	 *     (condition=Condition? type=LimitationType containerMetaclass+=[EClass|EString] containerMetaclass+=[EClass|EString]* description=EString?)
	 * </pre>
	 */
	protected void sequence_LimitedIgnore(ISerializationContext context, LimitedIgnore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
