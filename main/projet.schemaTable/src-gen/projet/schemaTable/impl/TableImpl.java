/**
 */
package projet.schemaTable.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projet.schemaTable.Colonne;
import projet.schemaTable.ColonneIdentifiants;
import projet.schemaTable.SchemaTablePackage;
import projet.schemaTable.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projet.schemaTable.impl.TableImpl#getColonneData <em>Colonne Data</em>}</li>
 *   <li>{@link projet.schemaTable.impl.TableImpl#getColonneidentifiants <em>Colonneidentifiants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The cached value of the '{@link #getColonneData() <em>Colonne Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonneData()
	 * @generated
	 * @ordered
	 */
	protected EList<Colonne> colonneData;

	/**
	 * The cached value of the '{@link #getColonneidentifiants() <em>Colonneidentifiants</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColonneidentifiants()
	 * @generated
	 * @ordered
	 */
	protected ColonneIdentifiants colonneidentifiants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Colonne> getColonneData() {
		if (colonneData == null) {
			colonneData = new EObjectContainmentEList<Colonne>(Colonne.class, this,
					SchemaTablePackage.TABLE__COLONNE_DATA);
		}
		return colonneData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneIdentifiants getColonneidentifiants() {
		if (colonneidentifiants != null && colonneidentifiants.eIsProxy()) {
			InternalEObject oldColonneidentifiants = (InternalEObject) colonneidentifiants;
			colonneidentifiants = (ColonneIdentifiants) eResolveProxy(oldColonneidentifiants);
			if (colonneidentifiants != oldColonneidentifiants) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SchemaTablePackage.TABLE__COLONNEIDENTIFIANTS, oldColonneidentifiants,
							colonneidentifiants));
			}
		}
		return colonneidentifiants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneIdentifiants basicGetColonneidentifiants() {
		return colonneidentifiants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColonneidentifiants(ColonneIdentifiants newColonneidentifiants) {
		ColonneIdentifiants oldColonneidentifiants = colonneidentifiants;
		colonneidentifiants = newColonneidentifiants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.TABLE__COLONNEIDENTIFIANTS,
					oldColonneidentifiants, colonneidentifiants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SchemaTablePackage.TABLE__COLONNE_DATA:
			return ((InternalEList<?>) getColonneData()).basicRemove(otherEnd, msgs);
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
		case SchemaTablePackage.TABLE__COLONNE_DATA:
			return getColonneData();
		case SchemaTablePackage.TABLE__COLONNEIDENTIFIANTS:
			if (resolve)
				return getColonneidentifiants();
			return basicGetColonneidentifiants();
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
		case SchemaTablePackage.TABLE__COLONNE_DATA:
			getColonneData().clear();
			getColonneData().addAll((Collection<? extends Colonne>) newValue);
			return;
		case SchemaTablePackage.TABLE__COLONNEIDENTIFIANTS:
			setColonneidentifiants((ColonneIdentifiants) newValue);
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
		case SchemaTablePackage.TABLE__COLONNE_DATA:
			getColonneData().clear();
			return;
		case SchemaTablePackage.TABLE__COLONNEIDENTIFIANTS:
			setColonneidentifiants((ColonneIdentifiants) null);
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
		case SchemaTablePackage.TABLE__COLONNE_DATA:
			return colonneData != null && !colonneData.isEmpty();
		case SchemaTablePackage.TABLE__COLONNEIDENTIFIANTS:
			return colonneidentifiants != null;
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
