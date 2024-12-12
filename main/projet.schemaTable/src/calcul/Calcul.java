/**
 */
package calcul;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calcul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Calcul#getExpression <em>Expression</em>}</li>
 *   <li>{@link calcul.Calcul#getEntree <em>Entree</em>}</li>
 *   <li>{@link calcul.Calcul#getSortie <em>Sortie</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getCalcul()
 * @model
 * @generated
 */
public interface Calcul extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see calcul.CalculPackage#getCalcul_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link calcul.Calcul#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Entree</b></em>' containment reference list.
	 * The list contents are of type {@link calcul.Entree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' containment reference list.
	 * @see calcul.CalculPackage#getCalcul_Entree()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entree> getEntree();

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' attribute list.
	 * @see calcul.CalculPackage#getCalcul_Sortie()
	 * @model
	 * @generated
	 */
	EList<String> getSortie();

} // Calcul
