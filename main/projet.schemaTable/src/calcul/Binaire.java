/**
 */
package calcul;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calcul.Binaire#getType <em>Type</em>}</li>
 *   <li>{@link calcul.Binaire#getExpressiong <em>Expressiong</em>}</li>
 *   <li>{@link calcul.Binaire#getExpressiond <em>Expressiond</em>}</li>
 * </ul>
 *
 * @see calcul.CalculPackage#getBinaire()
 * @model
 * @generated
 */
public interface Binaire extends Expression {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link calcul.TypeBinaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see calcul.TypeBinaire
	 * @see #setType(TypeBinaire)
	 * @see calcul.CalculPackage#getBinaire_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeBinaire getType();

	/**
	 * Sets the value of the '{@link calcul.Binaire#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see calcul.TypeBinaire
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeBinaire value);

	/**
	 * Returns the value of the '<em><b>Expressiong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressiong</em>' containment reference.
	 * @see #setExpressiong(Expression)
	 * @see calcul.CalculPackage#getBinaire_Expressiong()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpressiong();

	/**
	 * Sets the value of the '{@link calcul.Binaire#getExpressiong <em>Expressiong</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressiong</em>' containment reference.
	 * @see #getExpressiong()
	 * @generated
	 */
	void setExpressiong(Expression value);

	/**
	 * Returns the value of the '<em><b>Expressiond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressiond</em>' containment reference.
	 * @see #setExpressiond(Expression)
	 * @see calcul.CalculPackage#getBinaire_Expressiond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpressiond();

	/**
	 * Sets the value of the '{@link calcul.Binaire#getExpressiond <em>Expressiond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expressiond</em>' containment reference.
	 * @see #getExpressiond()
	 * @generated
	 */
	void setExpressiond(Expression value);

} // Binaire
