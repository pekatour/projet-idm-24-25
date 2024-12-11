/**
 */
package algorithme.impl;

import algorithme.Algorithme;
import algorithme.AlgorithmeFactory;
import algorithme.AlgorithmePackage;
import algorithme.Entree;
import algorithme.Langage;
import algorithme.Sortie;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projet.schemaTable.SchemaTablePackage;

import projet.schemaTable.impl.SchemaTablePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgorithmePackageImpl extends EPackageImpl implements AlgorithmePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum langageEEnum = null;

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
	 * @see algorithme.AlgorithmePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlgorithmePackageImpl() {
		super(eNS_URI, AlgorithmeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AlgorithmePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlgorithmePackage init() {
		if (isInited)
			return (AlgorithmePackage) EPackage.Registry.INSTANCE.getEPackage(AlgorithmePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlgorithmePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlgorithmePackageImpl theAlgorithmePackage = registeredAlgorithmePackage instanceof AlgorithmePackageImpl
				? (AlgorithmePackageImpl) registeredAlgorithmePackage
				: new AlgorithmePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaTablePackage.eNS_URI);
		SchemaTablePackageImpl theSchemaTablePackage = (SchemaTablePackageImpl) (registeredPackage instanceof SchemaTablePackageImpl
				? registeredPackage
				: SchemaTablePackage.eINSTANCE);

		// Create package meta-data objects
		theAlgorithmePackage.createPackageContents();
		theSchemaTablePackage.createPackageContents();

		// Initialize created meta-data
		theAlgorithmePackage.initializePackageContents();
		theSchemaTablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlgorithmePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlgorithmePackage.eNS_URI, theAlgorithmePackage);
		return theAlgorithmePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgorithme() {
		return algorithmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithme_Nom() {
		return (EAttribute) algorithmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithme_Ressource() {
		return (EAttribute) algorithmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithme_Documentation() {
		return (EAttribute) algorithmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithme_Langage() {
		return (EAttribute) algorithmeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgorithme_Sortie() {
		return (EReference) algorithmeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgorithme_Entree() {
		return (EReference) algorithmeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntree() {
		return entreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntree_Entree() {
		return (EAttribute) entreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntree_Algorithme() {
		return (EReference) entreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSortie() {
		return sortieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSortie_Sortie() {
		return (EAttribute) sortieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSortie_Algorithme() {
		return (EReference) sortieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLangage() {
		return langageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgorithmeFactory getAlgorithmeFactory() {
		return (AlgorithmeFactory) getEFactoryInstance();
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
		algorithmeEClass = createEClass(ALGORITHME);
		createEAttribute(algorithmeEClass, ALGORITHME__NOM);
		createEAttribute(algorithmeEClass, ALGORITHME__RESSOURCE);
		createEAttribute(algorithmeEClass, ALGORITHME__DOCUMENTATION);
		createEAttribute(algorithmeEClass, ALGORITHME__LANGAGE);
		createEReference(algorithmeEClass, ALGORITHME__SORTIE);
		createEReference(algorithmeEClass, ALGORITHME__ENTREE);

		entreeEClass = createEClass(ENTREE);
		createEReference(entreeEClass, ENTREE__ALGORITHME);
		createEAttribute(entreeEClass, ENTREE__ENTREE);

		sortieEClass = createEClass(SORTIE);
		createEReference(sortieEClass, SORTIE__ALGORITHME);
		createEAttribute(sortieEClass, SORTIE__SORTIE);

		// Create enums
		langageEEnum = createEEnum(LANGAGE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(algorithmeEClass, Algorithme.class, "Algorithme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgorithme_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithme_Ressource(), ecorePackage.getEString(), "ressource", null, 1, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithme_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1,
				Algorithme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithme_Langage(), this.getLangage(), "langage", null, 0, 1, Algorithme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithme_Sortie(), this.getSortie(), this.getSortie_Algorithme(), "sortie", null, 1, 1,
				Algorithme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithme_Entree(), this.getEntree(), this.getEntree_Algorithme(), "entree", null, 0, -1,
				Algorithme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entreeEClass, Entree.class, "Entree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntree_Algorithme(), this.getAlgorithme(), this.getAlgorithme_Entree(), "algorithme", null, 1,
				1, Entree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntree_Entree(), ecorePackage.getEString(), "entree", null, 1, 1, Entree.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortieEClass, Sortie.class, "Sortie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortie_Algorithme(), this.getAlgorithme(), this.getAlgorithme_Sortie(), "algorithme", null, 1,
				1, Sortie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortie_Sortie(), ecorePackage.getEString(), "sortie", null, 1, 1, Sortie.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(langageEEnum, Langage.class, "Langage");
		addEEnumLiteral(langageEEnum, Langage.PYTHON);
		addEEnumLiteral(langageEEnum, Langage.INTERNE);

		// Create resource
		createResource(eNS_URI);
	}

} //AlgorithmePackageImpl
