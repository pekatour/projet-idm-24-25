/**
 */
package projet.schemaTable.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projet.schemaTable.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaTableFactoryImpl extends EFactoryImpl implements SchemaTableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchemaTableFactory init() {
		try {
			SchemaTableFactory theSchemaTableFactory = (SchemaTableFactory) EPackage.Registry.INSTANCE
					.getEFactory(SchemaTablePackage.eNS_URI);
			if (theSchemaTableFactory != null) {
				return theSchemaTableFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchemaTableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaTableFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SchemaTablePackage.TABLE:
			return createTable();
		case SchemaTablePackage.COLONNE:
			return createColonne();
		case SchemaTablePackage.COLONNE_DERIVEE:
			return createColonneDerivee();
		case SchemaTablePackage.COLONNE_ETRANGERE:
			return createColonneEtrangere();
		case SchemaTablePackage.COLONNE_IDENTIFIANTS:
			return createColonneIdentifiants();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne createColonne() {
		ColonneImpl colonne = new ColonneImpl();
		return colonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneDerivee createColonneDerivee() {
		ColonneDeriveeImpl colonneDerivee = new ColonneDeriveeImpl();
		return colonneDerivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneEtrangere createColonneEtrangere() {
		ColonneEtrangereImpl colonneEtrangere = new ColonneEtrangereImpl();
		return colonneEtrangere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColonneIdentifiants createColonneIdentifiants() {
		ColonneIdentifiantsImpl colonneIdentifiants = new ColonneIdentifiantsImpl();
		return colonneIdentifiants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaTablePackage getSchemaTablePackage() {
		return (SchemaTablePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchemaTablePackage getPackage() {
		return SchemaTablePackage.eINSTANCE;
	}

} //SchemaTableFactoryImpl
