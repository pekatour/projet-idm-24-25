/**
 */
package projet.schemaTable.impl;

import algorithme.Algorithme;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projet.schemaTable.ColonneDerivee;
import projet.schemaTable.SchemaTablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne Derivee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projet.schemaTable.impl.ColonneDeriveeImpl#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneDeriveeImpl extends ColonneImpl implements ColonneDerivee {
	/**
	 * The cached value of the '{@link #getAlgorithme() <em>Algorithme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithme()
	 * @generated
	 * @ordered
	 */
	protected Algorithme algorithme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneDeriveeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.COLONNE_DERIVEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithme getAlgorithme() {
		return algorithme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithme(Algorithme newAlgorithme, NotificationChain msgs) {
		Algorithme oldAlgorithme = algorithme;
		algorithme = newAlgorithme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SchemaTablePackage.COLONNE_DERIVEE__ALGORITHME, oldAlgorithme, newAlgorithme);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithme(Algorithme newAlgorithme) {
		if (newAlgorithme != algorithme) {
			NotificationChain msgs = null;
			if (algorithme != null)
				msgs = ((InternalEObject) algorithme).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SchemaTablePackage.COLONNE_DERIVEE__ALGORITHME, null, msgs);
			if (newAlgorithme != null)
				msgs = ((InternalEObject) newAlgorithme).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SchemaTablePackage.COLONNE_DERIVEE__ALGORITHME, null, msgs);
			msgs = basicSetAlgorithme(newAlgorithme, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE_DERIVEE__ALGORITHME,
					newAlgorithme, newAlgorithme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchemaTablePackage.COLONNE_DERIVEE__ALGORITHME:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SchemaTablePackage.COLONNE_DERIVEE__ALGORITHME:
			return getAlgorithme();
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
		case SchemaTablePackage.COLONNE_DERIVEE__ALGORITHME:
			setAlgorithme((Algorithme) newValue);
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
		case SchemaTablePackage.COLONNE_DERIVEE__ALGORITHME:
			setAlgorithme((Algorithme) null);
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
		case SchemaTablePackage.COLONNE_DERIVEE__ALGORITHME:
			return algorithme != null;
		}
		return super.eIsSet(featureID);
	}

} //ColonneDeriveeImpl
