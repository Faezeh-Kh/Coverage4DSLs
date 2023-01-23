package coverage.utilities;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

public class OCLInterpreter {

	@SuppressWarnings("rawtypes")
	protected OCL ocl = null;
	@SuppressWarnings("rawtypes")
	protected OCLHelper oclHelper = null;

	protected OCLExpression<EClassifier> expression = null;
	protected Query<EClassifier, EClass, EObject> queryEval = null;
	
	private ArrayList<EObject> resultAsObject;

	public OCLInterpreter() {
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		oclHelper = ocl.createOCLHelper();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<EObject> runQuery(EObject context, String query) {
		// The root element of the dsl is the context for ocl
		oclHelper.setContext(context.eClass());
		try {
			expression = oclHelper.createQuery(query);
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		queryEval = ocl.createQuery(expression);
		// the ocl query will be evaluated on the context element
		Object res = queryEval.evaluate(context);
		resultAsObject = new ArrayList<>();
		if (res instanceof Collection<?>) {
			if (res instanceof LinkedHashSet<?>) {
				LinkedHashSet<?> queryResult =  (LinkedHashSet<?>) res;
				Iterator<?> it = queryResult.iterator();
				while (it.hasNext()) {
					EObject object = (EObject) it.next();
					resultAsObject.add(object);
				}
			}else if (res instanceof ArrayList<?>) {
				ArrayList<?> queryResult =  (ArrayList<?>) res;
				if (queryResult.isEmpty()) {
					resultAsObject.add(null);
				}
				else {
					queryResult.stream().forEach(object -> resultAsObject.add((EObject) object));
				}
			}
		}else {
			if (res instanceof EObject) {
				resultAsObject.add((EObject) res);
			}else {//result is a primitive value or null
				resultAsObject.add(null);
			}
		}
		return resultAsObject;
	}

	public void tearDown() throws Exception {
		oclHelper = null;
		ocl = null;
		expression = null;
		queryEval = null;
		Runtime.getRuntime().gc();
	}
}
