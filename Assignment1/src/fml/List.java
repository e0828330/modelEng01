/**
 */
package fml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fml.List#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link fml.List#getConsists <em>Consists</em>}</li>
 * </ul>
 * </p>
 *
 * @see fml.FmlPackage#getList()
 * @model
 * @generated
 */
public interface List extends DisplayElement {
	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see fml.FmlPackage#getList_IsOrdered()
	 * @model
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link fml.List#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Consists</b></em>' containment reference list.
	 * The list contents are of type {@link fml.ListItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists</em>' containment reference list.
	 * @see fml.FmlPackage#getList_Consists()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ListItem> getConsists();

} // List
