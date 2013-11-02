/**
 */
package fml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fml.PageElement#getContained <em>Contained</em>}</li>
 *   <li>{@link fml.PageElement#getVisibleIfSelected <em>Visible If Selected</em>}</li>
 *   <li>{@link fml.PageElement#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see fml.FmlPackage#getPageElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueID'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueID='PageElement.allInstances()->forAll(e1, e2 | e1 <> e2 implies e1.oclAsType(PageElement).ID <> e2.oclAsType(PageElement).ID)'"
 * @generated
 */
public interface PageElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fml.Page#getConsists <em>Consists</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' container reference.
	 * @see #setContained(Page)
	 * @see fml.FmlPackage#getPageElement_Contained()
	 * @see fml.Page#getConsists
	 * @model opposite="consists" transient="false"
	 * @generated
	 */
	Page getContained();

	/**
	 * Sets the value of the '{@link fml.PageElement#getContained <em>Contained</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained</em>' container reference.
	 * @see #getContained()
	 * @generated
	 */
	void setContained(Page value);

	/**
	 * Returns the value of the '<em><b>Visible If Selected</b></em>' reference list.
	 * The list contents are of type {@link fml.SelectionItem}.
	 * It is bidirectional and its opposite is '{@link fml.SelectionItem#getDisplayElementVisible <em>Display Element Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible If Selected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible If Selected</em>' reference list.
	 * @see fml.FmlPackage#getPageElement_VisibleIfSelected()
	 * @see fml.SelectionItem#getDisplayElementVisible
	 * @model opposite="displayElementVisible"
	 * @generated
	 */
	EList<SelectionItem> getVisibleIfSelected();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(Integer)
	 * @see fml.FmlPackage#getPageElement_ID()
	 * @model
	 * @generated
	 */
	Integer getID();

	/**
	 * Sets the value of the '{@link fml.PageElement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(Integer value);

} // PageElement
