/**
 */
package fml.impl;

import fml.FmlPackage;
import fml.PageElement;
import fml.SelectField;
import fml.SelectionItem;

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
 * An implementation of the model object '<em><b>Selection Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fml.impl.SelectionItemImpl#getText <em>Text</em>}</li>
 *   <li>{@link fml.impl.SelectionItemImpl#isPreselected <em>Preselected</em>}</li>
 *   <li>{@link fml.impl.SelectionItemImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link fml.impl.SelectionItemImpl#getContained <em>Contained</em>}</li>
 *   <li>{@link fml.impl.SelectionItemImpl#getDisplayElementVisible <em>Display Element Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionItemImpl extends MinimalEObjectImpl.Container implements SelectionItem {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreselected() <em>Preselected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreselected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRESELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreselected() <em>Preselected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreselected()
	 * @generated
	 * @ordered
	 */
	protected boolean preselected = PRESELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDisplayElementVisible() <em>Display Element Visible</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayElementVisible()
	 * @generated
	 * @ordered
	 */
	protected EList<PageElement> displayElementVisible;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmlPackage.Literals.SELECTION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.SELECTION_ITEM__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreselected() {
		return preselected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreselected(boolean newPreselected) {
		boolean oldPreselected = preselected;
		preselected = newPreselected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.SELECTION_ITEM__PRESELECTED, oldPreselected, preselected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.SELECTION_ITEM__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectField getContained() {
		if (eContainerFeatureID() != FmlPackage.SELECTION_ITEM__CONTAINED) return null;
		return (SelectField)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContained(SelectField newContained, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContained, FmlPackage.SELECTION_ITEM__CONTAINED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContained(SelectField newContained) {
		if (newContained != eInternalContainer() || (eContainerFeatureID() != FmlPackage.SELECTION_ITEM__CONTAINED && newContained != null)) {
			if (EcoreUtil.isAncestor(this, newContained))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContained != null)
				msgs = ((InternalEObject)newContained).eInverseAdd(this, FmlPackage.SELECT_FIELD__CONSISTS, SelectField.class, msgs);
			msgs = basicSetContained(newContained, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.SELECTION_ITEM__CONTAINED, newContained, newContained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageElement> getDisplayElementVisible() {
		if (displayElementVisible == null) {
			displayElementVisible = new EObjectWithInverseResolvingEList.ManyInverse<PageElement>(PageElement.class, this, FmlPackage.SELECTION_ITEM__DISPLAY_ELEMENT_VISIBLE, FmlPackage.PAGE_ELEMENT__VISIBLE_IF_SELECTED);
		}
		return displayElementVisible;
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
			case FmlPackage.SELECTION_ITEM__CONTAINED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContained((SelectField)otherEnd, msgs);
			case FmlPackage.SELECTION_ITEM__DISPLAY_ELEMENT_VISIBLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDisplayElementVisible()).basicAdd(otherEnd, msgs);
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
			case FmlPackage.SELECTION_ITEM__CONTAINED:
				return basicSetContained(null, msgs);
			case FmlPackage.SELECTION_ITEM__DISPLAY_ELEMENT_VISIBLE:
				return ((InternalEList<?>)getDisplayElementVisible()).basicRemove(otherEnd, msgs);
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
			case FmlPackage.SELECTION_ITEM__CONTAINED:
				return eInternalContainer().eInverseRemove(this, FmlPackage.SELECT_FIELD__CONSISTS, SelectField.class, msgs);
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
			case FmlPackage.SELECTION_ITEM__TEXT:
				return getText();
			case FmlPackage.SELECTION_ITEM__PRESELECTED:
				return isPreselected();
			case FmlPackage.SELECTION_ITEM__SELECTED:
				return isSelected();
			case FmlPackage.SELECTION_ITEM__CONTAINED:
				return getContained();
			case FmlPackage.SELECTION_ITEM__DISPLAY_ELEMENT_VISIBLE:
				return getDisplayElementVisible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FmlPackage.SELECTION_ITEM__TEXT:
				setText((String)newValue);
				return;
			case FmlPackage.SELECTION_ITEM__PRESELECTED:
				setPreselected((Boolean)newValue);
				return;
			case FmlPackage.SELECTION_ITEM__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case FmlPackage.SELECTION_ITEM__CONTAINED:
				setContained((SelectField)newValue);
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
			case FmlPackage.SELECTION_ITEM__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case FmlPackage.SELECTION_ITEM__PRESELECTED:
				setPreselected(PRESELECTED_EDEFAULT);
				return;
			case FmlPackage.SELECTION_ITEM__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case FmlPackage.SELECTION_ITEM__CONTAINED:
				setContained((SelectField)null);
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
			case FmlPackage.SELECTION_ITEM__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case FmlPackage.SELECTION_ITEM__PRESELECTED:
				return preselected != PRESELECTED_EDEFAULT;
			case FmlPackage.SELECTION_ITEM__SELECTED:
				return selected != SELECTED_EDEFAULT;
			case FmlPackage.SELECTION_ITEM__CONTAINED:
				return getContained() != null;
			case FmlPackage.SELECTION_ITEM__DISPLAY_ELEMENT_VISIBLE:
				return displayElementVisible != null && !displayElementVisible.isEmpty();
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
		result.append(" (Text: ");
		result.append(text);
		result.append(", preselected: ");
		result.append(preselected);
		result.append(", selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //SelectionItemImpl
