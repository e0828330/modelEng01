/**
 */
package fml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Selection Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fml.FmlPackage#getSelectionType()
 * @model
 * @generated
 */
public enum SelectionType implements Enumerator {
	/**
	 * The '<em><b>RADIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO(0, "RADIO", "RADIO"),

	/**
	 * The '<em><b>CHECKBOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKBOX(1, "CHECKBOX", "CHECKBOX"),

	/**
	 * The '<em><b>COMBOBOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBOBOX_VALUE
	 * @generated
	 * @ordered
	 */
	COMBOBOX(2, "COMBOBOX", "COMBOBOX");

	/**
	 * The '<em><b>RADIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RADIO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_VALUE = 0;

	/**
	 * The '<em><b>CHECKBOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHECKBOX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX_VALUE = 1;

	/**
	 * The '<em><b>COMBOBOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMBOBOX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMBOBOX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMBOBOX_VALUE = 2;

	/**
	 * An array of all the '<em><b>Selection Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SelectionType[] VALUES_ARRAY =
		new SelectionType[] {
			RADIO,
			CHECKBOX,
			COMBOBOX,
		};

	/**
	 * A public read-only list of all the '<em><b>Selection Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SelectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Selection Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Selection Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Selection Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelectionType get(int value) {
		switch (value) {
			case RADIO_VALUE: return RADIO;
			case CHECKBOX_VALUE: return CHECKBOX;
			case COMBOBOX_VALUE: return COMBOBOX;
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
	private SelectionType(int value, String name, String literal) {
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
	
} //SelectionType
