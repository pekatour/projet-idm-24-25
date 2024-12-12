/**
 */
package calcul;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Unaire#getType <em>Type</em>}</li>
 *   <li>{@link calcul.Unaire#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getUnaire()
 * @model
 * @generated
 */
public interface Unaire extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link calcul.TypeUnaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see calcul.TypeUnaire
	 * @see #setType(TypeUnaire)
	 * @see calcul.CalculPackage#getUnaire_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeUnaire getType();

	/**
	 * Sets the value of the '{@link calcul.Unaire#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see calcul.TypeUnaire
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeUnaire value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see calcul.CalculPackage#getUnaire_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link calcul.Unaire#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // Unaire
