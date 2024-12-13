/**
 */
package algorithme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithme.Algorithme#getNom <em>Nom</em>}</li>
 *   <li>{@link algorithme.Algorithme#getRessource <em>Ressource</em>}</li>
 *   <li>{@link algorithme.Algorithme#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link algorithme.Algorithme#getLangage <em>Langage</em>}</li>
 *   <li>{@link algorithme.Algorithme#getEntree <em>Entree</em>}</li>
 *   <li>{@link algorithme.Algorithme#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @see algorithme.AlgorithmePackage#getAlgorithme()
 * @model
 * @generated
 */
public interface Algorithme extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see algorithme.AlgorithmePackage#getAlgorithme_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link algorithme.Algorithme#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' attribute.
	 * @see #setRessource(String)
	 * @see algorithme.AlgorithmePackage#getAlgorithme_Ressource()
	 * @model required="true"
	 * @generated
	 */
	String getRessource();

	/**
	 * Sets the value of the '{@link algorithme.Algorithme#getRessource <em>Ressource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' attribute.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see algorithme.AlgorithmePackage#getAlgorithme_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link algorithme.Algorithme#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Langage</b></em>' attribute.
	 * The literals are from the enumeration {@link algorithme.Langage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langage</em>' attribute.
	 * @see algorithme.Langage
	 * @see #setLangage(Langage)
	 * @see algorithme.AlgorithmePackage#getAlgorithme_Langage()
	 * @model
	 * @generated
	 */
	Langage getLangage();

	/**
	 * Sets the value of the '{@link algorithme.Algorithme#getLangage <em>Langage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langage</em>' attribute.
	 * @see algorithme.Langage
	 * @see #getLangage()
	 * @generated
	 */
	void setLangage(Langage value);

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' attribute.
	 * @see #setSortie(String)
	 * @see algorithme.AlgorithmePackage#getAlgorithme_Sortie()
	 * @model required="true"
	 * @generated
	 */
	String getSortie();

	/**
	 * Sets the value of the '{@link algorithme.Algorithme#getSortie <em>Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' attribute.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(String value);

	/**
	 * Returns the value of the '<em><b>Entree</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' attribute list.
	 * @see algorithme.AlgorithmePackage#getAlgorithme_Entree()
	 * @model
	 * @generated
	 */
	EList<String> getEntree();

} // Algorithme
