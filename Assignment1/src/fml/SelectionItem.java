/**
 */
package fml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fml.SelectionItem#getText <em>Text</em>}</li>
 *   <li>{@link fml.SelectionItem#isPreselected <em>Preselected</em>}</li>
 *   <li>{@link fml.SelectionItem#isSelected <em>Selected</em>}</li>
 *   <li>{@link fml.SelectionItem#getContained <em>Contained</em>}</li>
 *   <li>{@link fml.SelectionItem#getDisplayElementVisible <em>Display Element Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see fml.FmlPackage#getSelectionItem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selectionIsOfSubsequentPage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot selectionIsOfSubsequentPage='self.displayElementVisible -> forAll(e |e.contained.predecessor->asSet()->union(e.contained.predecessor->closure(p | p.predecessor))->includes(self.contained.contained))'"
 * @generated
 */
public interface SelectionItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see fml.FmlPackage#getSelectionItem_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link fml.SelectionItem#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Preselected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preselected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preselected</em>' attribute.
	 * @see #setPreselected(boolean)
	 * @see fml.FmlPackage#getSelectionItem_Preselected()
	 * @model
	 * @generated
	 */
	boolean isPreselected();

	/**
	 * Sets the value of the '{@link fml.SelectionItem#isPreselected <em>Preselected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preselected</em>' attribute.
	 * @see #isPreselected()
	 * @generated
	 */
	void setPreselected(boolean value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see fml.FmlPackage#getSelectionItem_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link fml.SelectionItem#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Contained</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fml.SelectField#getConsists <em>Consists</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' container reference.
	 * @see #setContained(SelectField)
	 * @see fml.FmlPackage#getSelectionItem_Contained()
	 * @see fml.SelectField#getConsists
	 * @model opposite="consists" transient="false"
	 * @generated
	 */
	SelectField getContained();

	/**
	 * Sets the value of the '{@link fml.SelectionItem#getContained <em>Contained</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained</em>' container reference.
	 * @see #getContained()
	 * @generated
	 */
	void setContained(SelectField value);

	/**
	 * Returns the value of the '<em><b>Display Element Visible</b></em>' reference list.
	 * The list contents are of type {@link fml.PageElement}.
	 * It is bidirectional and its opposite is '{@link fml.PageElement#getVisibleIfSelected <em>Visible If Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Element Visible</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Element Visible</em>' reference list.
	 * @see fml.FmlPackage#getSelectionItem_DisplayElementVisible()
	 * @see fml.PageElement#getVisibleIfSelected
	 * @model opposite="visibleIfSelected" changeable="false" derived="true"
	 * @generated
	 */
	EList<PageElement> getDisplayElementVisible();

} // SelectionItem
