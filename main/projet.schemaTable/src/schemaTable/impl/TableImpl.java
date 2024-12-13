/**
 */
package schemaTable.impl;

import algorithme.Algorithme;

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

import schemaTable.Colonne;
import schemaTable.SchemaTablePackage;
import schemaTable.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.impl.TableImpl#getColonneData <em>Colonne Data</em>}</li>
 *   <li>{@link schemaTable.impl.TableImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link schemaTable.impl.TableImpl#getAlgoContrainte <em>Algo Contrainte</em>}</li>
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
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlgoContrainte() <em>Algo Contrainte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoContrainte()
	 * @generated
	 * @ordered
	 */
	protected EList<Algorithme> algoContrainte;

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
			colonneData = new EObjectContainmentEList<Colonne>(Colonne.class, this, SchemaTablePackage.TABLE__COLONNE_DATA);
		}
		return colonneData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.TABLE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Algorithme> getAlgoContrainte() {
		if (algoContrainte == null) {
			algoContrainte = new EObjectContainmentEList<Algorithme>(Algorithme.class, this, SchemaTablePackage.TABLE__ALGO_CONTRAINTE);
		}
		return algoContrainte;
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
				return ((InternalEList<?>)getColonneData()).basicRemove(otherEnd, msgs);
			case SchemaTablePackage.TABLE__ALGO_CONTRAINTE:
				return ((InternalEList<?>)getAlgoContrainte()).basicRemove(otherEnd, msgs);
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
			case SchemaTablePackage.TABLE__NOM:
				return getNom();
			case SchemaTablePackage.TABLE__ALGO_CONTRAINTE:
				return getAlgoContrainte();
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
				getColonneData().addAll((Collection<? extends Colonne>)newValue);
				return;
			case SchemaTablePackage.TABLE__NOM:
				setNom((String)newValue);
				return;
			case SchemaTablePackage.TABLE__ALGO_CONTRAINTE:
				getAlgoContrainte().clear();
				getAlgoContrainte().addAll((Collection<? extends Algorithme>)newValue);
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
			case SchemaTablePackage.TABLE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaTablePackage.TABLE__ALGO_CONTRAINTE:
				getAlgoContrainte().clear();
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
			case SchemaTablePackage.TABLE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaTablePackage.TABLE__ALGO_CONTRAINTE:
				return algoContrainte != null && !algoContrainte.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //TableImpl
