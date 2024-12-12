/**
 */
package algorithme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Sortie#getAlgorithme <em>Algorithme</em>}</li>
 *   <li>{@link algorithme.Sortie#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getSortie()
 * @model
 * @generated
 */
public interface Sortie extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithme.Algorithme#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithme</em>' container reference.
	 * @see #setAlgorithme(Algorithme)
	 * @see algorithme.AlgorithmePackage#getSortie_Algorithme()
	 * @see algorithme.Algorithme#getSortie
	 * @model opposite="sortie" required="true" transient="false"
	 * @generated
	 */
	Algorithme getAlgorithme();

	/**
	 * Sets the value of the '{@link algorithme.Sortie#getAlgorithme <em>Algorithme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithme</em>' container reference.
	 * @see #getAlgorithme()
	 * @generated
	 */
	void setAlgorithme(Algorithme value);

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' attribute.
	 * @see #setSortie(String)
	 * @see algorithme.AlgorithmePackage#getSortie_Sortie()
	 * @model required="true"
	 * @generated
	 */
	String getSortie();

	/**
	 * Sets the value of the '{@link algorithme.Sortie#getSortie <em>Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' attribute.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(String value);

} // Sortie
