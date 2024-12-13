/**
 */
package schemaTable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see schemaTable.SchemaTableFactory
 * @model kind="package"
 * @generated
 */
public interface SchemaTablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schemaTable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemaTable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schemaTable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaTablePackage eINSTANCE = schemaTable.impl.SchemaTablePackageImpl.init();

	/**
	 * The meta object id for the '{@link schemaTable.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schemaTable.impl.TableImpl
	 * @see schemaTable.impl.SchemaTablePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Colonne Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLONNE_DATA = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Algo Contrainte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ALGO_CONTRAINTE = 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schemaTable.impl.ColonneImpl <em>Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schemaTable.impl.ColonneImpl
	 * @see schemaTable.impl.SchemaTablePackageImpl#getColonne()
	 * @generated
	 */
	int COLONNE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__NOM = 0;

	/**
	 * The number of structural features of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link schemaTable.impl.ColonneDeriveeImpl <em>Colonne Derivee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schemaTable.impl.ColonneDeriveeImpl
	 * @see schemaTable.impl.SchemaTablePackageImpl#getColonneDerivee()
	 * @generated
	 */
	int COLONNE_DERIVEE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__NOM = COLONNE__NOM;

	/**
	 * The feature id for the '<em><b>Algorithme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__ALGORITHME = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colonne Derivee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Colonne Derivee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schemaTable.impl.ColonneEtrangereImpl <em>Colonne Etrangere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schemaTable.impl.ColonneEtrangereImpl
	 * @see schemaTable.impl.SchemaTablePackageImpl#getColonneEtrangere()
	 * @generated
	 */
	int COLONNE_ETRANGERE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE__NOM = COLONNE__NOM;

	/**
	 * The feature id for the '<em><b>Table Etrangere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE__TABLE_ETRANGERE = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Colonne Table Etrangere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE__ID_COLONNE_TABLE_ETRANGERE = COLONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Colonne Etrangere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Colonne Etrangere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_ETRANGERE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link schemaTable.impl.ColonneIdentifiantsImpl <em>Colonne Identifiants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see schemaTable.impl.ColonneIdentifiantsImpl
	 * @see schemaTable.impl.SchemaTablePackageImpl#getColonneIdentifiants()
	 * @generated
	 */
	int COLONNE_IDENTIFIANTS = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_IDENTIFIANTS__NOM = COLONNE__NOM;

	/**
	 * The number of structural features of the '<em>Colonne Identifiants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_IDENTIFIANTS_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Colonne Identifiants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_IDENTIFIANTS_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link schemaTable.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see schemaTable.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link schemaTable.Table#getColonneData <em>Colonne Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colonne Data</em>'.
	 * @see schemaTable.Table#getColonneData()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ColonneData();

	/**
	 * Returns the meta object for the attribute '{@link schemaTable.Table#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see schemaTable.Table#getNom()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link schemaTable.Table#getAlgoContrainte <em>Algo Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algo Contrainte</em>'.
	 * @see schemaTable.Table#getAlgoContrainte()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_AlgoContrainte();

	/**
	 * Returns the meta object for class '{@link schemaTable.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne</em>'.
	 * @see schemaTable.Colonne
	 * @generated
	 */
	EClass getColonne();

	/**
	 * Returns the meta object for the attribute '{@link schemaTable.Colonne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see schemaTable.Colonne#getNom()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Nom();

	/**
	 * Returns the meta object for class '{@link schemaTable.ColonneDerivee <em>Colonne Derivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Derivee</em>'.
	 * @see schemaTable.ColonneDerivee
	 * @generated
	 */
	EClass getColonneDerivee();

	/**
	 * Returns the meta object for the containment reference '{@link schemaTable.ColonneDerivee#getAlgorithme <em>Algorithme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithme</em>'.
	 * @see schemaTable.ColonneDerivee#getAlgorithme()
	 * @see #getColonneDerivee()
	 * @generated
	 */
	EReference getColonneDerivee_Algorithme();

	/**
	 * Returns the meta object for class '{@link schemaTable.ColonneEtrangere <em>Colonne Etrangere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Etrangere</em>'.
	 * @see schemaTable.ColonneEtrangere
	 * @generated
	 */
	EClass getColonneEtrangere();

	/**
	 * Returns the meta object for the reference '{@link schemaTable.ColonneEtrangere#getTableEtrangere <em>Table Etrangere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Etrangere</em>'.
	 * @see schemaTable.ColonneEtrangere#getTableEtrangere()
	 * @see #getColonneEtrangere()
	 * @generated
	 */
	EReference getColonneEtrangere_TableEtrangere();

	/**
	 * Returns the meta object for the attribute '{@link schemaTable.ColonneEtrangere#getIdColonneTableEtrangere <em>Id Colonne Table Etrangere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Colonne Table Etrangere</em>'.
	 * @see schemaTable.ColonneEtrangere#getIdColonneTableEtrangere()
	 * @see #getColonneEtrangere()
	 * @generated
	 */
	EAttribute getColonneEtrangere_IdColonneTableEtrangere();

	/**
	 * Returns the meta object for class '{@link schemaTable.ColonneIdentifiants <em>Colonne Identifiants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne Identifiants</em>'.
	 * @see schemaTable.ColonneIdentifiants
	 * @generated
	 */
	EClass getColonneIdentifiants();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchemaTableFactory getSchemaTableFactory();

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
		 * The meta object literal for the '{@link schemaTable.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schemaTable.impl.TableImpl
		 * @see schemaTable.impl.SchemaTablePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Colonne Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLONNE_DATA = eINSTANCE.getTable_ColonneData();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NOM = eINSTANCE.getTable_Nom();

		/**
		 * The meta object literal for the '<em><b>Algo Contrainte</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ALGO_CONTRAINTE = eINSTANCE.getTable_AlgoContrainte();

		/**
		 * The meta object literal for the '{@link schemaTable.impl.ColonneImpl <em>Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schemaTable.impl.ColonneImpl
		 * @see schemaTable.impl.SchemaTablePackageImpl#getColonne()
		 * @generated
		 */
		EClass COLONNE = eINSTANCE.getColonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__NOM = eINSTANCE.getColonne_Nom();

		/**
		 * The meta object literal for the '{@link schemaTable.impl.ColonneDeriveeImpl <em>Colonne Derivee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schemaTable.impl.ColonneDeriveeImpl
		 * @see schemaTable.impl.SchemaTablePackageImpl#getColonneDerivee()
		 * @generated
		 */
		EClass COLONNE_DERIVEE = eINSTANCE.getColonneDerivee();

		/**
		 * The meta object literal for the '<em><b>Algorithme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_DERIVEE__ALGORITHME = eINSTANCE.getColonneDerivee_Algorithme();

		/**
		 * The meta object literal for the '{@link schemaTable.impl.ColonneEtrangereImpl <em>Colonne Etrangere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schemaTable.impl.ColonneEtrangereImpl
		 * @see schemaTable.impl.SchemaTablePackageImpl#getColonneEtrangere()
		 * @generated
		 */
		EClass COLONNE_ETRANGERE = eINSTANCE.getColonneEtrangere();

		/**
		 * The meta object literal for the '<em><b>Table Etrangere</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_ETRANGERE__TABLE_ETRANGERE = eINSTANCE.getColonneEtrangere_TableEtrangere();

		/**
		 * The meta object literal for the '<em><b>Id Colonne Table Etrangere</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE_ETRANGERE__ID_COLONNE_TABLE_ETRANGERE = eINSTANCE.getColonneEtrangere_IdColonneTableEtrangere();

		/**
		 * The meta object literal for the '{@link schemaTable.impl.ColonneIdentifiantsImpl <em>Colonne Identifiants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see schemaTable.impl.ColonneIdentifiantsImpl
		 * @see schemaTable.impl.SchemaTablePackageImpl#getColonneIdentifiants()
		 * @generated
		 */
		EClass COLONNE_IDENTIFIANTS = eINSTANCE.getColonneIdentifiants();

	}

} //SchemaTablePackage
