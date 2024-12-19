/**
 */
package calcul.impl;

import calcul.Binaire;
import calcul.Calcul;
import calcul.CalculFactory;
import calcul.CalculPackage;
import calcul.Constante;
import calcul.Entree;
import calcul.Expression;
import calcul.TypeBinaire;
import calcul.TypeUnaire;
import calcul.Unaire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CalculPackageImpl extends EPackageImpl implements CalculPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculEClass = null;

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
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeUnaireEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeBinaireEEnum = null;

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
	 * @see calcul.CalculPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CalculPackageImpl() {
		super(eNS_URI, CalculFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CalculPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CalculPackage init() {
		if (isInited) return (CalculPackage)EPackage.Registry.INSTANCE.getEPackage(CalculPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCalculPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CalculPackageImpl theCalculPackage = registeredCalculPackage instanceof CalculPackageImpl ? (CalculPackageImpl)registeredCalculPackage : new CalculPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCalculPackage.createPackageContents();

		// Initialize created meta-data
		theCalculPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCalculPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CalculPackage.eNS_URI, theCalculPackage);
		return theCalculPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaire() {
		return binaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaire_Type() {
		return (EAttribute)binaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaire_Expressiong() {
		return (EReference)binaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaire_Expressiond() {
		return (EReference)binaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaire() {
		return unaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnaire_Type() {
		return (EAttribute)unaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaire_Expression() {
		return (EReference)unaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstante() {
		return constanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstante_Valeur() {
		return (EAttribute)constanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalcul() {
		return calculEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalcul_Expression() {
		return (EReference)calculEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalcul_Entree() {
		return (EReference)calculEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalcul_Sortie() {
		return (EAttribute)calculEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getEntree_Valeur() {
		return (EAttribute)entreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeUnaire() {
		return typeUnaireEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeBinaire() {
		return typeBinaireEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculFactory getCalculFactory() {
		return (CalculFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		binaireEClass = createEClass(BINAIRE);
		createEAttribute(binaireEClass, BINAIRE__TYPE);
		createEReference(binaireEClass, BINAIRE__EXPRESSIONG);
		createEReference(binaireEClass, BINAIRE__EXPRESSIOND);

		unaireEClass = createEClass(UNAIRE);
		createEAttribute(unaireEClass, UNAIRE__TYPE);
		createEReference(unaireEClass, UNAIRE__EXPRESSION);

		constanteEClass = createEClass(CONSTANTE);
		createEAttribute(constanteEClass, CONSTANTE__VALEUR);

		calculEClass = createEClass(CALCUL);
		createEReference(calculEClass, CALCUL__EXPRESSION);
		createEReference(calculEClass, CALCUL__ENTREE);
		createEAttribute(calculEClass, CALCUL__SORTIE);

		entreeEClass = createEClass(ENTREE);
		createEAttribute(entreeEClass, ENTREE__VALEUR);

		expressionEClass = createEClass(EXPRESSION);

		// Create enums
		typeUnaireEEnum = createEEnum(TYPE_UNAIRE);
		typeBinaireEEnum = createEEnum(TYPE_BINAIRE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		binaireEClass.getESuperTypes().add(this.getExpression());
		unaireEClass.getESuperTypes().add(this.getExpression());
		constanteEClass.getESuperTypes().add(this.getExpression());
		entreeEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(binaireEClass, Binaire.class, "Binaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaire_Type(), this.getTypeBinaire(), "type", null, 1, 1, Binaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaire_Expressiong(), this.getExpression(), null, "expressiong", null, 1, 1, Binaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaire_Expressiond(), this.getExpression(), null, "expressiond", null, 1, 1, Binaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaireEClass, Unaire.class, "Unaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaire_Type(), this.getTypeUnaire(), "type", null, 1, 1, Unaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaire_Expression(), this.getExpression(), null, "expression", null, 1, 1, Unaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constanteEClass, Constante.class, "Constante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstante_Valeur(), ecorePackage.getEFloat(), "valeur", null, 1, 1, Constante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calculEClass, Calcul.class, "Calcul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalcul_Expression(), this.getExpression(), null, "expression", null, 1, 1, Calcul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalcul_Entree(), this.getEntree(), null, "entree", null, 0, -1, Calcul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalcul_Sortie(), ecorePackage.getEString(), "sortie", null, 0, -1, Calcul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entreeEClass, Entree.class, "Entree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntree_Valeur(), ecorePackage.getEString(), "valeur", null, 0, 1, Entree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(typeUnaireEEnum, TypeUnaire.class, "TypeUnaire");
		addEEnumLiteral(typeUnaireEEnum, TypeUnaire.INVERSE);
		addEEnumLiteral(typeUnaireEEnum, TypeUnaire.OPPOSE);
		addEEnumLiteral(typeUnaireEEnum, TypeUnaire.EXP);
		addEEnumLiteral(typeUnaireEEnum, TypeUnaire.COS);
		addEEnumLiteral(typeUnaireEEnum, TypeUnaire.SIN);
		addEEnumLiteral(typeUnaireEEnum, TypeUnaire.RACINE);

		initEEnum(typeBinaireEEnum, TypeBinaire.class, "TypeBinaire");
		addEEnumLiteral(typeBinaireEEnum, TypeBinaire.ADDITION);
		addEEnumLiteral(typeBinaireEEnum, TypeBinaire.SOUSTRACTION);
		addEEnumLiteral(typeBinaireEEnum, TypeBinaire.MULTIPLICATION);
		addEEnumLiteral(typeBinaireEEnum, TypeBinaire.DIVISION);
		addEEnumLiteral(typeBinaireEEnum, TypeBinaire.MAXIMUM);
		addEEnumLiteral(typeBinaireEEnum, TypeBinaire.MINIMUM);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation
		  (entreeEClass,
		   source,
		   new String[] {
			   "archetype", "Role"
		   });
	}

} //CalculPackageImpl
