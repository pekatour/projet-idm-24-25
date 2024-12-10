/**
 */
package algorithme;

import org.eclipse.emf.ecore.EObject;

import projet.schemaTable.Colonne;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Entree#getEntree <em>Entree</em>}</li>
 *   <li>{@link algorithme.Entree#getAlgorithme <em>Algorithme</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getEntree()
 * @model
 * @generated
 */
public interface Entree extends EObject {
	/**
	 * Returns the value of the '<em><b>Entree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' reference.
	 * @see #setEntree(Colonne)
	 * @see algorithme.AlgorithmePackage#getEntree_Entree()
	 * @model required="true"
	 * @generated
	 */
	Colonne getEntree();

	/**
	 * Sets the value of the '{@link algorithme.Entree#getEntree <em>Entree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree</em>' reference.
	 * @see #getEntree()
	 * @generated
	 */
	void setEntree(Colonne value);

	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link algorithme.Algorithme#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see algorithme.AlgorithmePackage#getEntree_Algorithme()
	 * @see algorithme.Algorithme#getEntree
	 * @model opposite="entree" required="true"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link algorithme.Entree#getAlgorithme <em>Algorithme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithme</em>' reference.
	 * @see #getAlgorithme()
	 * @generated
	 */
	void setAlgorithme(Algorithme value);

} // Entree
