/**
 */
package projet.schemaTable;

import algorithme.Algorithme;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne Derivee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projet.schemaTable.ColonneDerivee#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see projet.schemaTable.SchemaTablePackage#getColonneDerivee()
 * @model
 * @generated
 */
public interface ColonneDerivee extends Colonne {
	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' containment reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see projet.schemaTable.SchemaTablePackage#getColonneDerivee_Algorithme()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link projet.schemaTable.ColonneDerivee#getAlgorithme <em>Algorithme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithme</em>' containment reference.
	 * @see #getAlgorithme()
	 * @generated
	 */
	void setAlgorithme(Algorithme value);

} // ColonneDerivee
