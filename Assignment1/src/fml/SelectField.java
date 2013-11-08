/**
 */
package fml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fml.SelectField#getLabel <em>Label</em>}</li>
 *   <li>{@link fml.SelectField#getType <em>Type</em>}</li>
 *   <li>{@link fml.SelectField#getConsists <em>Consists</em>}</li>
 * </ul>
 * </p>
 *
 * @see fml.FmlPackage#getSelectField()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RadioOnlyOneSelected'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RadioOnlyOneSelected='self.Type <> SelectionType::RADIO or (self.consists->select(preselected)->size() <= 1 and self.consists->select(selected)->size() <= 1)'"
 * @generated
 */
public interface SelectField extends InputElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see fml.FmlPackage#getSelectField_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link fml.SelectField#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fml.SelectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fml.SelectionType
	 * @see #setType(SelectionType)
	 * @see fml.FmlPackage#getSelectField_Type()
	 * @model
	 * @generated
	 */
	SelectionType getType();

	/**
	 * Sets the value of the '{@link fml.SelectField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fml.SelectionType
	 * @see #getType()
	 * @generated
	 */
	void setType(SelectionType value);

	/**
	 * Returns the value of the '<em><b>Consists</b></em>' containment reference list.
	 * The list contents are of type {@link fml.SelectionItem}.
	 * It is bidirectional and its opposite is '{@link fml.SelectionItem#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists</em>' containment reference list.
	 * @see fml.FmlPackage#getSelectField_Consists()
	 * @see fml.SelectionItem#getContained
	 * @model opposite="contained" containment="true" required="true"
	 * @generated
	 */
	EList<SelectionItem> getConsists();

} // SelectField
