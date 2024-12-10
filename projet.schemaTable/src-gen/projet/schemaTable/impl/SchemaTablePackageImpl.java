/**
 */
package projet.schemaTable.impl;

import algorithme.AlgorithmePackage;

import algorithme.impl.AlgorithmePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projet.schemaTable.Colonne;
import projet.schemaTable.ColonneDerivee;
import projet.schemaTable.ColonneEtrangere;
import projet.schemaTable.ColonneIdentifiants;
import projet.schemaTable.SchemaTableFactory;
import projet.schemaTable.SchemaTablePackage;
import projet.schemaTable.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaTablePackageImpl extends EPackageImpl implements SchemaTablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneDeriveeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneEtrangereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colonneIdentifiantsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see projet.schemaTable.SchemaTablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchemaTablePackageImpl() {
		super(eNS_URI, SchemaTableFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SchemaTablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchemaTablePackage init() {
		if (isInited)
			return (SchemaTablePackage) EPackage.Registry.INSTANCE.getEPackage(SchemaTablePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchemaTablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchemaTablePackageImpl theSchemaTablePackage = registeredSchemaTablePackage instanceof SchemaTablePackageImpl
				? (SchemaTablePackageImpl) registeredSchemaTablePackage
				: new SchemaTablePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AlgorithmePackage.eNS_URI);
		AlgorithmePackageImpl theAlgorithmePackage = (AlgorithmePackageImpl) (registeredPackage instanceof AlgorithmePackageImpl
				? registeredPackage
				: AlgorithmePackage.eINSTANCE);

		// Create package meta-data objects
		theSchemaTablePackage.createPackageContents();
		theAlgorithmePackage.createPackageContents();

		// Initialize created meta-data
		theSchemaTablePackage.initializePackageContents();
		theAlgorithmePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchemaTablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchemaTablePackage.eNS_URI, theSchemaTablePackage);
		return theSchemaTablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_ColonneData() {
		return (EReference) tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Colonneidentifiants() {
		return (EReference) tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonne() {
		return colonneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonne_Nom() {
		return (EAttribute) colonneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneDerivee() {
		return colonneDeriveeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonneDerivee_Algorithme() {
		return (EReference) colonneDeriveeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneEtrangere() {
		return colonneEtrangereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColonneEtrangere_TableEtrangere() {
		return (EReference) colonneEtrangereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColonneEtrangere_IdColonneTableEtrangere() {
		return (EAttribute) colonneEtrangereEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColonneIdentifiants() {
		return colonneIdentifiantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaTableFactory getSchemaTableFactory() {
		return (SchemaTableFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLONNE_DATA);
		createEReference(tableEClass, TABLE__COLONNEIDENTIFIANTS);

		colonneEClass = createEClass(COLONNE);
		createEAttribute(colonneEClass, COLONNE__NOM);

		colonneDeriveeEClass = createEClass(COLONNE_DERIVEE);
		createEReference(colonneDeriveeEClass, COLONNE_DERIVEE__ALGORITHME);

		colonneEtrangereEClass = createEClass(COLONNE_ETRANGERE);
		createEReference(colonneEtrangereEClass, COLONNE_ETRANGERE__TABLE_ETRANGERE);
		createEAttribute(colonneEtrangereEClass, COLONNE_ETRANGERE__ID_COLONNE_TABLE_ETRANGERE);

		colonneIdentifiantsEClass = createEClass(COLONNE_IDENTIFIANTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AlgorithmePackage theAlgorithmePackage = (AlgorithmePackage) EPackage.Registry.INSTANCE
				.getEPackage(AlgorithmePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		colonneDeriveeEClass.getESuperTypes().add(this.getColonne());
		colonneEtrangereEClass.getESuperTypes().add(this.getColonne());
		colonneIdentifiantsEClass.getESuperTypes().add(this.getColonne());

		// Initialize classes, features, and operations; add parameters
		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_ColonneData(), this.getColonne(), null, "colonneData", null, 0, -1, Table.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Colonneidentifiants(), this.getColonneIdentifiants(), null, "colonneidentifiants", null,
				1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneEClass, Colonne.class, "Colonne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColonne_Nom(), ecorePackage.getEString(), "nom", "", 1, 1, Colonne.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneDeriveeEClass, ColonneDerivee.class, "ColonneDerivee", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColonneDerivee_Algorithme(), theAlgorithmePackage.getAlgorithme(), null, "algorithme", null,
				1, 1, ColonneDerivee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneEtrangereEClass, ColonneEtrangere.class, "ColonneEtrangere", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColonneEtrangere_TableEtrangere(), this.getTable(), null, "tableEtrangere", null, 1, 1,
				ColonneEtrangere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColonneEtrangere_IdColonneTableEtrangere(), ecorePackage.getEString(),
				"idColonneTableEtrangere", null, 1, 1, ColonneEtrangere.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colonneIdentifiantsEClass, ColonneIdentifiants.class, "ColonneIdentifiants", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SchemaTablePackageImpl
