/*
 * generated by Xtext 2.28.0
 */
package coverage.dsl.xtext.serializer;

import DSLSpecificCoverage.BinaryCondition;
import DSLSpecificCoverage.Branch;
import DSLSpecificCoverage.BranchSpecification;
import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.CoverageByContent;
import DSLSpecificCoverage.CoverageOfReferenced;
import DSLSpecificCoverage.DSLSpecificCoveragePackage;
import DSLSpecificCoverage.DomainSpecificCoverage;
import DSLSpecificCoverage.Ignore;
import DSLSpecificCoverage.LimitedIgnore;
import DSLSpecificCoverage.UnaryCondition;
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
			case DSLSpecificCoveragePackage.BINARY_CONDITION:
				sequence_BinaryCondition(context, (BinaryCondition) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.BRANCH:
				sequence_Branch(context, (Branch) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.BRANCH_SPECIFICATION:
				sequence_BranchSpecification(context, (BranchSpecification) semanticObject); 
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
			case DSLSpecificCoveragePackage.LIMITED_IGNORE:
				sequence_LimitedIgnore(context, (LimitedIgnore) semanticObject); 
				return; 
			case DSLSpecificCoveragePackage.UNARY_CONDITION:
				sequence_UnaryCondition(context, (UnaryCondition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns BinaryCondition
	 *     BinaryCondition returns BinaryCondition
	 *
	 * Constraint:
	 *     (constraint=EString operator=BinaryOperator)
	 * </pre>
	 */
	protected void sequence_BinaryCondition(ISerializationContext context, BinaryCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSpecificCoveragePackage.Literals.CONDITION__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSpecificCoveragePackage.Literals.CONDITION__CONSTRAINT));
			if (transientValues.isValueTransient(semanticObject, DSLSpecificCoveragePackage.Literals.BINARY_CONDITION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSpecificCoveragePackage.Literals.BINARY_CONDITION__OPERATOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryConditionAccess().getConstraintEStringParserRuleCall_0_0(), semanticObject.getConstraint());
		feeder.accept(grammarAccess.getBinaryConditionAccess().getOperatorBinaryOperatorEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns BranchSpecification
	 *     BranchSpecification returns BranchSpecification
	 *
	 * Constraint:
	 *     (description=EString? (condition+=Condition condition+=Condition*)? branches+=Branch branches+=Branch*)
	 * </pre>
	 */
	protected void sequence_BranchSpecification(ISerializationContext context, BranchSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Branch returns Branch
	 *
	 * Constraint:
	 *     query=EString
	 * </pre>
	 */
	protected void sequence_Branch(ISerializationContext context, Branch semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DSLSpecificCoveragePackage.Literals.BRANCH__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DSLSpecificCoveragePackage.Literals.BRANCH__QUERY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBranchAccess().getQueryEStringParserRuleCall_1_0(), semanticObject.getQuery());
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
	 *     (multiplicity=CoveredContents containmentReference=[EReference|EString] description=EString? (condition+=Condition condition+=Condition*)?)
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
	 *     (reference+=[EReference|EString] reference+=[EReference|EString]* description=EString? (condition+=Condition condition+=Condition*)?)
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
	 *     (ignoreSubtypes=EBoolean? description=EString? (condition+=Condition condition+=Condition*)?)
	 * </pre>
	 */
	protected void sequence_Ignore(ISerializationContext context, Ignore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rule returns LimitedIgnore
	 *     LimitedIgnore returns LimitedIgnore
	 *
	 * Constraint:
	 *     (
	 *         type=LimitationType 
	 *         containerMetaclass+=[EClass|EString] 
	 *         containerMetaclass+=[EClass|EString]* 
	 *         description=EString? 
	 *         (condition+=Condition condition+=Condition*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_LimitedIgnore(ISerializationContext context, LimitedIgnore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns UnaryCondition
	 *     UnaryCondition returns UnaryCondition
	 *
	 * Constraint:
	 *     (operator=UnaryOperator? constraint=EString)
	 * </pre>
	 */
	protected void sequence_UnaryCondition(ISerializationContext context, UnaryCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}