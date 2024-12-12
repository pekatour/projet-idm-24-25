/**
 */
package calcul;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see calcul.CalculFactory
 * @model kind="package"
 * @generated
 */
public interface CalculPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calcul";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://calcul";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "calcul";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CalculPackage eINSTANCE = calcul.impl.CalculPackageImpl.init();

	/**
	 * The meta object id for the '{@link calcul.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.ExpressionImpl
	 * @see calcul.impl.CalculPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calcul.impl.BinaireImpl <em>Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.BinaireImpl
	 * @see calcul.impl.CalculPackageImpl#getBinaire()
	 * @generated
	 */
	int BINAIRE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINAIRE__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressiong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINAIRE__EXPRESSIONG = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expressiond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINAIRE__EXPRESSIOND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINAIRE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINAIRE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.impl.UnaireImpl <em>Unaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.UnaireImpl
	 * @see calcul.impl.CalculPackageImpl#getUnaire()
	 * @generated
	 */
	int UNAIRE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAIRE__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAIRE__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAIRE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAIRE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.impl.ConstanteImpl <em>Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.ConstanteImpl
	 * @see calcul.impl.CalculPackageImpl#getConstante()
	 * @generated
	 */
	int CONSTANTE = 2;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__VALEUR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.impl.CalculImpl <em>Calcul</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.CalculImpl
	 * @see calcul.impl.CalculPackageImpl#getCalcul()
	 * @generated
	 */
	int CALCUL = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL__ENTREE = 1;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL__SORTIE = 2;

	/**
	 * The number of structural features of the '<em>Calcul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Calcul</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCUL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calcul.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.impl.EntreeImpl
	 * @see calcul.impl.CalculPackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 4;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__VALEUR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calcul.TypeUnaire <em>Type Unaire</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.TypeUnaire
	 * @see calcul.impl.CalculPackageImpl#getTypeUnaire()
	 * @generated
	 */
	int TYPE_UNAIRE = 6;

	/**
	 * The meta object id for the '{@link calcul.TypeBinaire <em>Type Binaire</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calcul.TypeBinaire
	 * @see calcul.impl.CalculPackageImpl#getTypeBinaire()
	 * @generated
	 */
	int TYPE_BINAIRE = 7;


	/**
	 * Returns the meta object for class '{@link calcul.Binaire <em>Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binaire</em>'.
	 * @see calcul.Binaire
	 * @generated
	 */
	EClass getBinaire();

	/**
	 * Returns the meta object for the attribute '{@link calcul.Binaire#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see calcul.Binaire#getType()
	 * @see #getBinaire()
	 * @generated
	 */
	EAttribute getBinaire_Type();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Binaire#getExpressiong <em>Expressiong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressiong</em>'.
	 * @see calcul.Binaire#getExpressiong()
	 * @see #getBinaire()
	 * @generated
	 */
	EReference getBinaire_Expressiong();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Binaire#getExpressiond <em>Expressiond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expressiond</em>'.
	 * @see calcul.Binaire#getExpressiond()
	 * @see #getBinaire()
	 * @generated
	 */
	EReference getBinaire_Expressiond();

	/**
	 * Returns the meta object for class '{@link calcul.Unaire <em>Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unaire</em>'.
	 * @see calcul.Unaire
	 * @generated
	 */
	EClass getUnaire();

	/**
	 * Returns the meta object for the attribute '{@link calcul.Unaire#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see calcul.Unaire#getType()
	 * @see #getUnaire()
	 * @generated
	 */
	EAttribute getUnaire_Type();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Unaire#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see calcul.Unaire#getExpression()
	 * @see #getUnaire()
	 * @generated
	 */
	EReference getUnaire_Expression();

	/**
	 * Returns the meta object for class '{@link calcul.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constante</em>'.
	 * @see calcul.Constante
	 * @generated
	 */
	EClass getConstante();

	/**
	 * Returns the meta object for the attribute '{@link calcul.Constante#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see calcul.Constante#getValeur()
	 * @see #getConstante()
	 * @generated
	 */
	EAttribute getConstante_Valeur();

	/**
	 * Returns the meta object for class '{@link calcul.Calcul <em>Calcul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calcul</em>'.
	 * @see calcul.Calcul
	 * @generated
	 */
	EClass getCalcul();

	/**
	 * Returns the meta object for the containment reference '{@link calcul.Calcul#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see calcul.Calcul#getExpression()
	 * @see #getCalcul()
	 * @generated
	 */
	EReference getCalcul_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link calcul.Calcul#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entree</em>'.
	 * @see calcul.Calcul#getEntree()
	 * @see #getCalcul()
	 * @generated
	 */
	EReference getCalcul_Entree();

	/**
	 * Returns the meta object for the attribute list '{@link calcul.Calcul#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sortie</em>'.
	 * @see calcul.Calcul#getSortie()
	 * @see #getCalcul()
	 * @generated
	 */
	EAttribute getCalcul_Sortie();

	/**
	 * Returns the meta object for class '{@link calcul.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see calcul.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for the attribute '{@link calcul.Entree#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see calcul.Entree#getValeur()
	 * @see #getEntree()
	 * @generated
	 */
	EAttribute getEntree_Valeur();

	/**
	 * Returns the meta object for class '{@link calcul.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see calcul.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for enum '{@link calcul.TypeUnaire <em>Type Unaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Unaire</em>'.
	 * @see calcul.TypeUnaire
	 * @generated
	 */
	EEnum getTypeUnaire();

	/**
	 * Returns the meta object for enum '{@link calcul.TypeBinaire <em>Type Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Binaire</em>'.
	 * @see calcul.TypeBinaire
	 * @generated
	 */
	EEnum getTypeBinaire();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CalculFactory getCalculFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link calcul.impl.BinaireImpl <em>Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.BinaireImpl
		 * @see calcul.impl.CalculPackageImpl#getBinaire()
		 * @generated
		 */
		EClass BINAIRE = eINSTANCE.getBinaire();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINAIRE__TYPE = eINSTANCE.getBinaire_Type();

		/**
		 * The meta object literal for the '<em><b>Expressiong</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINAIRE__EXPRESSIONG = eINSTANCE.getBinaire_Expressiong();

		/**
		 * The meta object literal for the '<em><b>Expressiond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINAIRE__EXPRESSIOND = eINSTANCE.getBinaire_Expressiond();

		/**
		 * The meta object literal for the '{@link calcul.impl.UnaireImpl <em>Unaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.UnaireImpl
		 * @see calcul.impl.CalculPackageImpl#getUnaire()
		 * @generated
		 */
		EClass UNAIRE = eINSTANCE.getUnaire();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNAIRE__TYPE = eINSTANCE.getUnaire_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNAIRE__EXPRESSION = eINSTANCE.getUnaire_Expression();

		/**
		 * The meta object literal for the '{@link calcul.impl.ConstanteImpl <em>Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.ConstanteImpl
		 * @see calcul.impl.CalculPackageImpl#getConstante()
		 * @generated
		 */
		EClass CONSTANTE = eINSTANCE.getConstante();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTE__VALEUR = eINSTANCE.getConstante_Valeur();

		/**
		 * The meta object literal for the '{@link calcul.impl.CalculImpl <em>Calcul</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.CalculImpl
		 * @see calcul.impl.CalculPackageImpl#getCalcul()
		 * @generated
		 */
		EClass CALCUL = eINSTANCE.getCalcul();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCUL__EXPRESSION = eINSTANCE.getCalcul_Expression();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCUL__ENTREE = eINSTANCE.getCalcul_Entree();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCUL__SORTIE = eINSTANCE.getCalcul_Sortie();

		/**
		 * The meta object literal for the '{@link calcul.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.EntreeImpl
		 * @see calcul.impl.CalculPackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE__VALEUR = eINSTANCE.getEntree_Valeur();

		/**
		 * The meta object literal for the '{@link calcul.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.impl.ExpressionImpl
		 * @see calcul.impl.CalculPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link calcul.TypeUnaire <em>Type Unaire</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.TypeUnaire
		 * @see calcul.impl.CalculPackageImpl#getTypeUnaire()
		 * @generated
		 */
		EEnum TYPE_UNAIRE = eINSTANCE.getTypeUnaire();

		/**
		 * The meta object literal for the '{@link calcul.TypeBinaire <em>Type Binaire</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calcul.TypeBinaire
		 * @see calcul.impl.CalculPackageImpl#getTypeBinaire()
		 * @generated
		 */
		EEnum TYPE_BINAIRE = eINSTANCE.getTypeBinaire();

	}

} //CalculPackage
