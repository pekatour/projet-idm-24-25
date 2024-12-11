/**
 */
package algorithme;

import org.eclipse.emf.ecore.EObject;

import projet.schemaTable.Colonne;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Sortie#getSortie <em>Sortie</em>}</li>
 *   <li>{@link algorithme.Sortie#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getSortie()
 * @model
 * @generated
 */
public interface Sortie extends EObject {
	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' reference.
	 * @see #setSortie(Colonne)
	 * @see algorithme.AlgorithmePackage#getSortie_Sortie()
	 * @model required="true"
	 * @generated
	 */
	Colonne getSortie();

	/**
	 * Sets the value of the '{@link algorithme.Sortie#getSortie <em>Sortie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' reference.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(Colonne value);

	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link algorithme.Algorithme#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see algorithme.AlgorithmePackage#getSortie_Algorithme()
	 * @see algorithme.Algorithme#getSortie
	 * @model opposite="sortie" required="true"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link algorithme.Sortie#getAlgorithme <em>Algorithme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithme</em>' reference.
	 * @see #getAlgorithme()
	 * @generated
	 */
	void setAlgorithme(Algorithme value);

} // Sortie
