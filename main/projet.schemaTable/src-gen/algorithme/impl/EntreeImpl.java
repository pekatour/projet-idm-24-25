/**
 */
package algorithme.impl;

import algorithme.Algorithme;
import algorithme.AlgorithmePackage;
import algorithme.Entree;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithme.impl.EntreeImpl#getAlgorithme <em>Algorithme</em>}</li>
 *   <li>{@link algorithme.impl.EntreeImpl#getEntree <em>Entree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntreeImpl extends MinimalEObjectImpl.Container implements Entree {
	/**
	 * The default value of the '{@link #getEntree() <em>Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected String entree = ENTREE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmePackage.Literals.ENTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntree() {
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntree(String newEntree) {
		String oldEntree = entree;
		entree = newEntree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ENTREE__ENTREE, oldEntree, entree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithme getAlgorithme() {
		if (eContainerFeatureID() != AlgorithmePackage.ENTREE__ALGORITHME)
			return null;
		return (Algorithme) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithme(Algorithme newAlgorithme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAlgorithme, AlgorithmePackage.ENTREE__ALGORITHME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithme(Algorithme newAlgorithme) {
		if (newAlgorithme != eInternalContainer()
				|| (eContainerFeatureID() != AlgorithmePackage.ENTREE__ALGORITHME && newAlgorithme != null)) {
			if (EcoreUtil.isAncestor(this, newAlgorithme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAlgorithme != null)
				msgs = ((InternalEObject) newAlgorithme).eInverseAdd(this, AlgorithmePackage.ALGORITHME__ENTREE,
						Algorithme.class, msgs);
			msgs = basicSetAlgorithme(newAlgorithme, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmePackage.ENTREE__ALGORITHME, newAlgorithme,
					newAlgorithme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AlgorithmePackage.ENTREE__ALGORITHME:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAlgorithme((Algorithme) otherEnd, msgs);
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
		case AlgorithmePackage.ENTREE__ALGORITHME:
			return basicSetAlgorithme(null, msgs);
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
		case AlgorithmePackage.ENTREE__ALGORITHME:
			return eInternalContainer().eInverseRemove(this, AlgorithmePackage.ALGORITHME__ENTREE, Algorithme.class,
					msgs);
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
		case AlgorithmePackage.ENTREE__ALGORITHME:
			return getAlgorithme();
		case AlgorithmePackage.ENTREE__ENTREE:
			return getEntree();
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
		case AlgorithmePackage.ENTREE__ALGORITHME:
			setAlgorithme((Algorithme) newValue);
			return;
		case AlgorithmePackage.ENTREE__ENTREE:
			setEntree((String) newValue);
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
		case AlgorithmePackage.ENTREE__ALGORITHME:
			setAlgorithme((Algorithme) null);
			return;
		case AlgorithmePackage.ENTREE__ENTREE:
			setEntree(ENTREE_EDEFAULT);
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
		case AlgorithmePackage.ENTREE__ALGORITHME:
			return getAlgorithme() != null;
		case AlgorithmePackage.ENTREE__ENTREE:
			return ENTREE_EDEFAULT == null ? entree != null : !ENTREE_EDEFAULT.equals(entree);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (entree: ");
		result.append(entree);
		result.append(')');
		return result.toString();
	}

} //EntreeImpl
