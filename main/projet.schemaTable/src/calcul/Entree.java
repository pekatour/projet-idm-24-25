/**
 */
package calcul;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Entree#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getEntree()
 * @model
 * @generated
 */
public interface Entree extends Expression {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(String)
	 * @see calcul.CalculPackage#getEntree_Valeur()
	 * @model
	 * @generated
	 */
	String getValeur();

	/**
	 * Sets the value of the '{@link calcul.Entree#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(String value);

} // Entree
