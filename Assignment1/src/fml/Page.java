/**
 */
package fml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fml.Page#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fml.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link fml.Page#isIsWelcome <em>Is Welcome</em>}</li>
 *   <li>{@link fml.Page#getConsists <em>Consists</em>}</li>
 * </ul>
 * </p>
 *
 * @see fml.FmlPackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='titleStartsUpperCase noCycles'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot titleStartsUpperCase='not (Title.size()=0) and Title.at(1) = Title.at(1).toUpper()' noCycles='self.predecessor->asSet()->union(self.predecessor->closure(p | p.predecessor))->excludes(self)'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Page)
	 * @see fml.FmlPackage#getPage_Predecessor()
	 * @model
	 * @generated
	 */
	Page getPredecessor();

	/**
	 * Sets the value of the '{@link fml.Page#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Page value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see fml.FmlPackage#getPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fml.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Is Welcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Welcome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Welcome</em>' attribute.
	 * @see #setIsWelcome(boolean)
	 * @see fml.FmlPackage#getPage_IsWelcome()
	 * @model
	 * @generated
	 */
	boolean isIsWelcome();

	/**
	 * Sets the value of the '{@link fml.Page#isIsWelcome <em>Is Welcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Welcome</em>' attribute.
	 * @see #isIsWelcome()
	 * @generated
	 */
	void setIsWelcome(boolean value);

	/**
	 * Returns the value of the '<em><b>Consists</b></em>' containment reference list.
	 * The list contents are of type {@link fml.PageElement}.
	 * It is bidirectional and its opposite is '{@link fml.PageElement#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists</em>' containment reference list.
	 * @see fml.FmlPackage#getPage_Consists()
	 * @see fml.PageElement#getContained
	 * @model opposite="contained" containment="true"
	 * @generated
	 */
	EList<PageElement> getConsists();

} // Page
