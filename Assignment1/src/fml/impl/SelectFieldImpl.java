/**
 */
package fml.impl;

import fml.FmlPackage;
import fml.SelectField;
import fml.SelectionItem;
import fml.SelectionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fml.impl.SelectFieldImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fml.impl.SelectFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link fml.impl.SelectFieldImpl#getConsists <em>Consists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectFieldImpl extends InputElementImpl implements SelectField {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SelectionType TYPE_EDEFAULT = SelectionType.RADIO;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SelectionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsists() <em>Consists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsists()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionItem> consists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmlPackage.Literals.SELECT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.SELECT_FIELD__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SelectionType newType) {
		SelectionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.SELECT_FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionItem> getConsists() {
		if (consists == null) {
			consists = new EObjectContainmentWithInverseEList<SelectionItem>(SelectionItem.class, this, FmlPackage.SELECT_FIELD__CONSISTS, FmlPackage.SELECTION_ITEM__CONTAINED);
		}
		return consists;
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
			case FmlPackage.SELECT_FIELD__CONSISTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsists()).basicAdd(otherEnd, msgs);
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
			case FmlPackage.SELECT_FIELD__CONSISTS:
				return ((InternalEList<?>)getConsists()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmlPackage.SELECT_FIELD__LABEL:
				return getLabel();
			case FmlPackage.SELECT_FIELD__TYPE:
				return getType();
			case FmlPackage.SELECT_FIELD__CONSISTS:
				return getConsists();
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
			case FmlPackage.SELECT_FIELD__LABEL:
				setLabel((String)newValue);
				return;
			case FmlPackage.SELECT_FIELD__TYPE:
				setType((SelectionType)newValue);
				return;
			case FmlPackage.SELECT_FIELD__CONSISTS:
				getConsists().clear();
				getConsists().addAll((Collection<? extends SelectionItem>)newValue);
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
			case FmlPackage.SELECT_FIELD__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FmlPackage.SELECT_FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FmlPackage.SELECT_FIELD__CONSISTS:
				getConsists().clear();
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
			case FmlPackage.SELECT_FIELD__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FmlPackage.SELECT_FIELD__TYPE:
				return type != TYPE_EDEFAULT;
			case FmlPackage.SELECT_FIELD__CONSISTS:
				return consists != null && !consists.isEmpty();
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
		result.append(" (Label: ");
		result.append(label);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SelectFieldImpl
