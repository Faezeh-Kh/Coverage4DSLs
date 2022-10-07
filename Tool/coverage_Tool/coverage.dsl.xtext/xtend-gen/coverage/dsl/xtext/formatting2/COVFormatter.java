/**
 * generated by Xtext 2.26.0
 */
package coverage.dsl.xtext.formatting2;

import DSLSpecificCoverage.Context;
import DSLSpecificCoverage.DomainSpecificCoverage;
import DSLSpecificCoverage.Rule;
import com.google.inject.Inject;
import coverage.dsl.xtext.services.COVGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class COVFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private COVGrammarAccess _cOVGrammarAccess;

  protected void _format(final DomainSpecificCoverage domainSpecificCoverage, @Extension final IFormattableDocument document) {
    EList<Context> _contexts = domainSpecificCoverage.getContexts();
    for (final Context context : _contexts) {
      document.<Context>format(context);
    }
  }

  protected void _format(final Context context, @Extension final IFormattableDocument document) {
    EList<Rule> _rules = context.getRules();
    for (final Rule rule : _rules) {
      document.<Rule>format(rule);
    }
  }

  public void format(final Object context, final IFormattableDocument document) {
    if (context instanceof XtextResource) {
      _format((XtextResource)context, document);
      return;
    } else if (context instanceof Context) {
      _format((Context)context, document);
      return;
    } else if (context instanceof DomainSpecificCoverage) {
      _format((DomainSpecificCoverage)context, document);
      return;
    } else if (context instanceof EObject) {
      _format((EObject)context, document);
      return;
    } else if (context == null) {
      _format((Void)null, document);
      return;
    } else if (context != null) {
      _format(context, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(context, document).toString());
    }
  }
}
