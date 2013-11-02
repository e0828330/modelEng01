/**
 */
package fml.impl;

import fml.FmlPackage;
import fml.Page;
import fml.PageElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fml.impl.PageImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fml.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fml.impl.PageImpl#isIsWelcome <em>Is Welcome</em>}</li>
 *   <li>{@link fml.impl.PageImpl#getConsists <em>Consists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected Page predecessor;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsWelcome() <em>Is Welcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWelcome()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WELCOME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWelcome() <em>Is Welcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWelcome()
	 * @generated
	 * @ordered
	 */
	protected boolean isWelcome = IS_WELCOME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsists() <em>Consists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsists()
	 * @generated
	 * @ordered
	 */
	protected EList<PageElement> consists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmlPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (Page)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmlPackage.PAGE__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(Page newPredecessor) {
		Page oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.PAGE__PREDECESSOR, oldPredecessor, predecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWelcome() {
		return isWelcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWelcome(boolean newIsWelcome) {
		boolean oldIsWelcome = isWelcome;
		isWelcome = newIsWelcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmlPackage.PAGE__IS_WELCOME, oldIsWelcome, isWelcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageElement> getConsists() {
		if (consists == null) {
			consists = new EObjectContainmentWithInverseEList<PageElement>(PageElement.class, this, FmlPackage.PAGE__CONSISTS, FmlPackage.PAGE_ELEMENT__CONTAINED);
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
			case FmlPackage.PAGE__CONSISTS:
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
			case FmlPackage.PAGE__CONSISTS:
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
			case FmlPackage.PAGE__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
			case FmlPackage.PAGE__TITLE:
				return getTitle();
			case FmlPackage.PAGE__IS_WELCOME:
				return isIsWelcome();
			case FmlPackage.PAGE__CONSISTS:
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
			case FmlPackage.PAGE__PREDECESSOR:
				setPredecessor((Page)newValue);
				return;
			case FmlPackage.PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case FmlPackage.PAGE__IS_WELCOME:
				setIsWelcome((Boolean)newValue);
				return;
			case FmlPackage.PAGE__CONSISTS:
				getConsists().clear();
				getConsists().addAll((Collection<? extends PageElement>)newValue);
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
			case FmlPackage.PAGE__PREDECESSOR:
				setPredecessor((Page)null);
				return;
			case FmlPackage.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FmlPackage.PAGE__IS_WELCOME:
				setIsWelcome(IS_WELCOME_EDEFAULT);
				return;
			case FmlPackage.PAGE__CONSISTS:
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
			case FmlPackage.PAGE__PREDECESSOR:
				return predecessor != null;
			case FmlPackage.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FmlPackage.PAGE__IS_WELCOME:
				return isWelcome != IS_WELCOME_EDEFAULT;
			case FmlPackage.PAGE__CONSISTS:
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
		result.append(" (Title: ");
		result.append(title);
		result.append(", isWelcome: ");
		result.append(isWelcome);
		result.append(')');
		return result.toString();
	}

} //PageImpl
