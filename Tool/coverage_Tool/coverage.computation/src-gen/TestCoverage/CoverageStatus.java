/**
 */
package TestCoverage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coverage Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TestCoverage.TestCoveragePackage#getCoverageStatus()
 * @model
 * @generated
 */
public enum CoverageStatus implements Enumerator {
	/**
	 * The '<em><b>COVERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERED_VALUE
	 * @generated
	 * @ordered
	 */
	COVERED(0, "COVERED", "COVERED"),

	/**
	 * The '<em><b>NOTCOVERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTCOVERED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTCOVERED(1, "NOTCOVERED", "NOTCOVERED"),

	/**
	 * The '<em><b>PARTLYCOVERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTLYCOVERED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTLYCOVERED(2, "PARTLYCOVERED", "PARTLYCOVERED"), /**
	 * The '<em><b>NOSTATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOSTATUS_VALUE
	 * @generated
	 * @ordered
	 */
	NOSTATUS(3, "NOSTATUS", "NOSTATUS");

	/**
	 * The '<em><b>COVERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COVERED_VALUE = 0;

	/**
	 * The '<em><b>NOTCOVERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTCOVERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTCOVERED_VALUE = 1;

	/**
	 * The '<em><b>PARTLYCOVERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTLYCOVERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTLYCOVERED_VALUE = 2;

	/**
	 * The '<em><b>NOSTATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOSTATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOSTATUS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Coverage Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CoverageStatus[] VALUES_ARRAY =
		new CoverageStatus[] {
			COVERED,
			NOTCOVERED,
			PARTLYCOVERED,
			NOSTATUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Coverage Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CoverageStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coverage Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoverageStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoverageStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coverage Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoverageStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoverageStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coverage Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoverageStatus get(int value) {
		switch (value) {
			case COVERED_VALUE: return COVERED;
			case NOTCOVERED_VALUE: return NOTCOVERED;
			case PARTLYCOVERED_VALUE: return PARTLYCOVERED;
			case NOSTATUS_VALUE: return NOSTATUS;
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
	private CoverageStatus(int value, String name, String literal) {
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
	
} //CoverageStatus
