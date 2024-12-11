/**
 */
package projet.schemaTable;

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

} // Table
