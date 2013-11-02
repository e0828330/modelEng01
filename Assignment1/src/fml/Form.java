/**
 */
package fml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fml.Form#getOrganized <em>Organized</em>}</li>
 * </ul>
 * </p>
 *
 * @see fml.FmlPackage#getForm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneWelcomePage oneFirstPage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot oneWelcomePage='self.organized->select(p | p.isWelcome)->size() = 1 and self.organized->select(p | p.isWelcome)->forAll(p | p.predecessor->isEmpty())' oneFirstPage='self.organized->select(p | p.predecessor->isEmpty())->size() = 1'"
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Organized</b></em>' containment reference list.
	 * The list contents are of type {@link fml.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organized</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organized</em>' containment reference list.
	 * @see fml.FmlPackage#getForm_Organized()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getOrganized();

} // Form
