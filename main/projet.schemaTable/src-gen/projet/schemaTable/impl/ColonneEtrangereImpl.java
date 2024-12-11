/**
 */
package projet.schemaTable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projet.schemaTable.ColonneEtrangere;
import projet.schemaTable.SchemaTablePackage;
import projet.schemaTable.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne Etrangere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projet.schemaTable.impl.ColonneEtrangereImpl#getTableEtrangere <em>Table Etrangere</em>}</li>
 *   <li>{@link projet.schemaTable.impl.ColonneEtrangereImpl#getIdColonneTableEtrangere <em>Id Colonne Table Etrangere</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColonneEtrangereImpl extends ColonneImpl implements ColonneEtrangere {
	/**
	 * The cached value of the '{@link #getTableEtrangere() <em>Table Etrangere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableEtrangere()
	 * @generated
	 * @ordered
	 */
	protected Table tableEtrangere;

	/**
	 * The default value of the '{@link #getIdColonneTableEtrangere() <em>Id Colonne Table Etrangere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdColonneTableEtrangere()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_COLONNE_TABLE_ETRANGERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdColonneTableEtrangere() <em>Id Colonne Table Etrangere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdColonneTableEtrangere()
	 * @generated
	 * @ordered
	 */
	protected String idColonneTableEtrangere = ID_COLONNE_TABLE_ETRANGERE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColonneEtrangereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaTablePackage.Literals.COLONNE_ETRANGERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getTableEtrangere() {
		if (tableEtrangere != null && tableEtrangere.eIsProxy()) {
			InternalEObject oldTableEtrangere = (InternalEObject) tableEtrangere;
			tableEtrangere = (Table) eResolveProxy(oldTableEtrangere);
			if (tableEtrangere != oldTableEtrangere) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SchemaTablePackage.COLONNE_ETRANGERE__TABLE_ETRANGERE, oldTableEtrangere, tableEtrangere));
			}
		}
		return tableEtrangere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTableEtrangere() {
		return tableEtrangere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableEtrangere(Table newTableEtrangere) {
		Table oldTableEtrangere = tableEtrangere;
		tableEtrangere = newTableEtrangere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaTablePackage.COLONNE_ETRANGERE__TABLE_ETRANGERE,
					oldTableEtrangere, tableEtrangere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdColonneTableEtrangere() {
		return idColonneTableEtrangere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdColonneTableEtrangere(String newIdColonneTableEtrangere) {
		String oldIdColonneTableEtrangere = idColonneTableEtrangere;
		idColonneTableEtrangere = newIdColonneTableEtrangere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SchemaTablePackage.COLONNE_ETRANGERE__ID_COLONNE_TABLE_ETRANGERE, oldIdColonneTableEtrangere,
					idColonneTableEtrangere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SchemaTablePackage.COLONNE_ETRANGERE__TABLE_ETRANGERE:
			if (resolve)
				return getTableEtrangere();
			return basicGetTableEtrangere();
		case SchemaTablePackage.COLONNE_ETRANGERE__ID_COLONNE_TABLE_ETRANGERE:
			return getIdColonneTableEtrangere();
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
		case SchemaTablePackage.COLONNE_ETRANGERE__TABLE_ETRANGERE:
			setTableEtrangere((Table) newValue);
			return;
		case SchemaTablePackage.COLONNE_ETRANGERE__ID_COLONNE_TABLE_ETRANGERE:
			setIdColonneTableEtrangere((String) newValue);
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
		case SchemaTablePackage.COLONNE_ETRANGERE__TABLE_ETRANGERE:
			setTableEtrangere((Table) null);
			return;
		case SchemaTablePackage.COLONNE_ETRANGERE__ID_COLONNE_TABLE_ETRANGERE:
			setIdColonneTableEtrangere(ID_COLONNE_TABLE_ETRANGERE_EDEFAULT);
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
		case SchemaTablePackage.COLONNE_ETRANGERE__TABLE_ETRANGERE:
			return tableEtrangere != null;
		case SchemaTablePackage.COLONNE_ETRANGERE__ID_COLONNE_TABLE_ETRANGERE:
			return ID_COLONNE_TABLE_ETRANGERE_EDEFAULT == null ? idColonneTableEtrangere != null
					: !ID_COLONNE_TABLE_ETRANGERE_EDEFAULT.equals(idColonneTableEtrangere);
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
		result.append(" (idColonneTableEtrangere: ");
		result.append(idColonneTableEtrangere);
		result.append(')');
		return result.toString();
	}

} //ColonneEtrangereImpl
