/**
 */
package DSLSpecificCoverage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Limitation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see DSLSpecificCoverage.DSLSpecificCoveragePackage#getLimitationType()
 * @model
 * @generated
 */
public enum LimitationType implements Enumerator {
	/**
	 * The '<em><b>Contained By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINED_BY(0, "containedBy", "ContainedBy"),

	/**
	 * The '<em><b>Not Contained By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_CONTAINED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_CONTAINED_BY(1, "notContainedBy", "NotContainedBy");

	/**
	 * The '<em><b>Contained By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINED_BY
	 * @model name="containedBy" literal="ContainedBy"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINED_BY_VALUE = 0;

	/**
	 * The '<em><b>Not Contained By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_CONTAINED_BY
	 * @model name="notContainedBy" literal="NotContainedBy"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_CONTAINED_BY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Limitation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LimitationType[] VALUES_ARRAY =
		new LimitationType[] {
			CONTAINED_BY,
			NOT_CONTAINED_BY,
		};

	/**
	 * A public read-only list of all the '<em><b>Limitation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LimitationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Limitation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LimitationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LimitationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Limitation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LimitationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LimitationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Limitation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LimitationType get(int value) {
		switch (value) {
			case CONTAINED_BY_VALUE: return CONTAINED_BY;
			case NOT_CONTAINED_BY_VALUE: return NOT_CONTAINED_BY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LimitationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LimitationType
