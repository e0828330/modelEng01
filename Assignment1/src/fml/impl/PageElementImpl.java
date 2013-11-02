/**
 */
package fml.impl;

import fml.FmlPackage;
import fml.Page;
import fml.PageElement;
import fml.SelectionItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fml.impl.PageElementImpl#getContained <em>Contained</em>}</li>
 *   <li>{@link fml.impl.PageElementImpl#getVisibleIfSelected <em>Visible If Selected</em>}</li>
 *   <li>{@link fml.impl.PageElementImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PageElementImpl extends MinimalEObjectImpl.Container implements PageElement {
	/**
	 * The cached value of the '{@link #getVisibleIfSelected() <em>Visible If Selected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleIfSelected()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionItem> visibleIfSelected;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmlPackage.Literals.PAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getContained() {
		if (eContainerFeatureID() != FmlPackage.PAGE_ELEMENT__CONTAINED) return null;
		return (Page)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContained(Page newContained, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContained, FmlPackage.PAGE_ELEMENT__CONTAINED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContained(Page newContained) {
		if (newContained != eInternalContainer() || (eContainerFeatureID() != FmlPackage.PAGE_ELEMENT__CONTAINED && newContained != null)) {
			if (EcoreUtil.isAncestor(this, newContained))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContained != null)
				msgs = ((InternalEObject)newContained).eInverseAdd(this, FmlPackage.PAGE__CONSISTS, Page.class, msgs);
			msgs = basicSetContained(newContained, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.PAGE_ELEMENT__CONTAINED, newContained, newContained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionItem> getVisibleIfSelected() {
		if (visibleIfSelected == null) {
			visibleIfSelected = new EObjectWithInverseResolvingEList.ManyInverse<SelectionItem>(SelectionItem.class, this, FmlPackage.PAGE_ELEMENT__VISIBLE_IF_SELECTED, FmlPackage.SELECTION_ITEM__DISPLAY_ELEMENT_VISIBLE);
		}
		return visibleIfSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(Integer newID) {
		Integer oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.PAGE_ELEMENT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmlPackage.PAGE_ELEMENT__CONTAINED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContained((Page)otherEnd, msgs);
			case FmlPackage.PAGE_ELEMENT__VISIBLE_IF_SELECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVisibleIfSelected()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmlPackage.PAGE_ELEMENT__CONTAINED:
				return basicSetContained(null, msgs);
			case FmlPackage.PAGE_ELEMENT__VISIBLE_IF_SELECTED:
				return ((InternalEList<?>)getVisibleIfSelected()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FmlPackage.PAGE_ELEMENT__CONTAINED:
				return eInternalContainer().eInverseRemove(this, FmlPackage.PAGE__CONSISTS, Page.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmlPackage.PAGE_ELEMENT__CONTAINED:
				return getContained();
			case FmlPackage.PAGE_ELEMENT__VISIBLE_IF_SELECTED:
				return getVisibleIfSelected();
			case FmlPackage.PAGE_ELEMENT__ID:
				return getID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FmlPackage.PAGE_ELEMENT__CONTAINED:
				setContained((Page)newValue);
				return;
			case FmlPackage.PAGE_ELEMENT__VISIBLE_IF_SELECTED:
				getVisibleIfSelected().clear();
				getVisibleIfSelected().addAll((Collection<? extends SelectionItem>)newValue);
				return;
			case FmlPackage.PAGE_ELEMENT__ID:
				setID((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FmlPackage.PAGE_ELEMENT__CONTAINED:
				setContained((Page)null);
				return;
			case FmlPackage.PAGE_ELEMENT__VISIBLE_IF_SELECTED:
				getVisibleIfSelected().clear();
				return;
			case FmlPackage.PAGE_ELEMENT__ID:
				setID(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FmlPackage.PAGE_ELEMENT__CONTAINED:
				return getContained() != null;
			case FmlPackage.PAGE_ELEMENT__VISIBLE_IF_SELECTED:
				return visibleIfSelected != null && !visibleIfSelected.isEmpty();
			case FmlPackage.PAGE_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PageElementImpl
