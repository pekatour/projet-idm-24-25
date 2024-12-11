/**
 */
package projet.schemaTable;

import algorithme.Algorithme;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projet.schemaTable.Table#getColonneData <em>Colonne Data</em>}</li>
 *   <li>{@link projet.schemaTable.Table#getColonneidentifiants <em>Colonneidentifiants</em>}</li>
 *   <li>{@link projet.schemaTable.Table#getNom <em>Nom</em>}</li>
 *   <li>{@link projet.schemaTable.Table#getAlgoContrainte <em>Algo Contrainte</em>}</li>
 * </ul>
 *
 * @see projet.schemaTable.SchemaTablePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Colonne Data</b></em>' containment reference list.
	 * The list contents are of type {@link projet.schemaTable.Colonne}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne Data</em>' containment reference list.
	 * @see projet.schemaTable.SchemaTablePackage#getTable_ColonneData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Colonne> getColonneData();

	/**
	 * Returns the value of the '<em><b>Colonneidentifiants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonneidentifiants</em>' reference.
	 * @see #setColonneidentifiants(ColonneIdentifiants)
	 * @see projet.schemaTable.SchemaTablePackage#getTable_Colonneidentifiants()
	 * @model required="true"
	 * @generated
	 */
	ColonneIdentifiants getColonneidentifiants();

	/**
	 * Sets the value of the '{@link projet.schemaTable.Table#getColonneidentifiants <em>Colonneidentifiants</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonneidentifiants</em>' reference.
	 * @see #getColonneidentifiants()
	 * @generated
	 */
	void setColonneidentifiants(ColonneIdentifiants value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see projet.schemaTable.SchemaTablePackage#getTable_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link projet.schemaTable.Table#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Algo Contrainte</b></em>' containment reference list.
	 * The list contents are of type {@link algorithme.Algorithme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Contrainte</em>' containment reference list.
	 * @see projet.schemaTable.SchemaTablePackage#getTable_AlgoContrainte()
	 * @model containment="true"
	 * @generated
	 */
	EList<Algorithme> getAlgoContrainte();

} // Table
