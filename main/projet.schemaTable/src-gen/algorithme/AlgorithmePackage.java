/**
 */
package algorithme;

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
 * @see algorithme.AlgorithmeFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algorithme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://algorithme";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "algorithme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmePackage eINSTANCE = algorithme.impl.AlgorithmePackageImpl.init();

	/**
	 * The meta object id for the '{@link algorithme.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.AlgorithmeImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getAlgorithme()
	 * @generated
	 */
	int ALGORITHME = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__NOM = 0;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__RESSOURCE = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Langage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__LANGAGE = 3;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__SORTIE = 4;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME__ENTREE = 5;

	/**
	 * The number of structural features of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Algorithme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.EntreeImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 1;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__ALGORITHME = 0;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__ENTREE = 1;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithme.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.impl.SortieImpl
	 * @see algorithme.impl.AlgorithmePackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 2;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__ALGORITHME = 0;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__SORTIE = 1;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link algorithme.Langage <em>Langage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithme.Langage
	 * @see algorithme.impl.AlgorithmePackageImpl#getLangage()
	 * @generated
	 */
	int LANGAGE = 3;

	/**
	 * Returns the meta object for class '{@link algorithme.Algorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithme</em>'.
	 * @see algorithme.Algorithme
	 * @generated
	 */
	EClass getAlgorithme();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Algorithme#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see algorithme.Algorithme#getNom()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EAttribute getAlgorithme_Nom();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Algorithme#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ressource</em>'.
	 * @see algorithme.Algorithme#getRessource()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EAttribute getAlgorithme_Ressource();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Algorithme#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see algorithme.Algorithme#getDocumentation()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EAttribute getAlgorithme_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Algorithme#getLangage <em>Langage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Langage</em>'.
	 * @see algorithme.Algorithme#getLangage()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EAttribute getAlgorithme_Langage();

	/**
	 * Returns the meta object for the containment reference '{@link algorithme.Algorithme#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sortie</em>'.
	 * @see algorithme.Algorithme#getSortie()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Sortie();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithme.Algorithme#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entree</em>'.
	 * @see algorithme.Algorithme#getEntree()
	 * @see #getAlgorithme()
	 * @generated
	 */
	EReference getAlgorithme_Entree();

	/**
	 * Returns the meta object for class '{@link algorithme.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see algorithme.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Entree#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entree</em>'.
	 * @see algorithme.Entree#getEntree()
	 * @see #getEntree()
	 * @generated
	 */
	EAttribute getEntree_Entree();

	/**
	 * Returns the meta object for the container reference '{@link algorithme.Entree#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithme</em>'.
	 * @see algorithme.Entree#getAlgorithme()
	 * @see #getEntree()
	 * @generated
	 */
	EReference getEntree_Algorithme();

	/**
	 * Returns the meta object for class '{@link algorithme.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortie</em>'.
	 * @see algorithme.Sortie
	 * @generated
	 */
	EClass getSortie();

	/**
	 * Returns the meta object for the attribute '{@link algorithme.Sortie#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sortie</em>'.
	 * @see algorithme.Sortie#getSortie()
	 * @see #getSortie()
	 * @generated
	 */
	EAttribute getSortie_Sortie();

	/**
	 * Returns the meta object for the container reference '{@link algorithme.Sortie#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithme</em>'.
	 * @see algorithme.Sortie#getAlgorithme()
	 * @see #getSortie()
	 * @generated
	 */
	EReference getSortie_Algorithme();

	/**
	 * Returns the meta object for enum '{@link algorithme.Langage <em>Langage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Langage</em>'.
	 * @see algorithme.Langage
	 * @generated
	 */
	EEnum getLangage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgorithmeFactory getAlgorithmeFactory();

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
		 * The meta object literal for the '{@link algorithme.impl.AlgorithmeImpl <em>Algorithme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.AlgorithmeImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getAlgorithme()
		 * @generated
		 */
		EClass ALGORITHME = eINSTANCE.getAlgorithme();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHME__NOM = eINSTANCE.getAlgorithme_Nom();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHME__RESSOURCE = eINSTANCE.getAlgorithme_Ressource();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHME__DOCUMENTATION = eINSTANCE.getAlgorithme_Documentation();

		/**
		 * The meta object literal for the '<em><b>Langage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHME__LANGAGE = eINSTANCE.getAlgorithme_Langage();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__SORTIE = eINSTANCE.getAlgorithme_Sortie();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHME__ENTREE = eINSTANCE.getAlgorithme_Entree();

		/**
		 * The meta object literal for the '{@link algorithme.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.EntreeImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE__ENTREE = eINSTANCE.getEntree_Entree();

		/**
		 * The meta object literal for the '<em><b>Algorithme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE__ALGORITHME = eINSTANCE.getEntree_Algorithme();

		/**
		 * The meta object literal for the '{@link algorithme.impl.SortieImpl <em>Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.impl.SortieImpl
		 * @see algorithme.impl.AlgorithmePackageImpl#getSortie()
		 * @generated
		 */
		EClass SORTIE = eINSTANCE.getSortie();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTIE__SORTIE = eINSTANCE.getSortie_Sortie();

		/**
		 * The meta object literal for the '<em><b>Algorithme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE__ALGORITHME = eINSTANCE.getSortie_Algorithme();

		/**
		 * The meta object literal for the '{@link algorithme.Langage <em>Langage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithme.Langage
		 * @see algorithme.impl.AlgorithmePackageImpl#getLangage()
		 * @generated
		 */
		EEnum LANGAGE = eINSTANCE.getLangage();

	}

} //AlgorithmePackage
