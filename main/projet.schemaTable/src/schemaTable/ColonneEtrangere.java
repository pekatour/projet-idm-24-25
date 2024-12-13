/**
 */
package schemaTable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne Etrangere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link schemaTable.ColonneEtrangere#getTableEtrangere <em>Table Etrangere</em>}</li>
 *   <li>{@link schemaTable.ColonneEtrangere#getIdColonneTableEtrangere <em>Id Colonne Table Etrangere</em>}</li>
 * </ul>
 *
 * @see schemaTable.SchemaTablePackage#getColonneEtrangere()
 * @model
 * @generated
 */
public interface ColonneEtrangere extends Colonne {
	/**
	 * Returns the value of the '<em><b>Table Etrangere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Etrangere</em>' reference.
	 * @see #setTableEtrangere(Table)
	 * @see schemaTable.SchemaTablePackage#getColonneEtrangere_TableEtrangere()
	 * @model required="true"
	 * @generated
	 */
	Table getTableEtrangere();

	/**
	 * Sets the value of the '{@link schemaTable.ColonneEtrangere#getTableEtrangere <em>Table Etrangere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Etrangere</em>' reference.
	 * @see #getTableEtrangere()
	 * @generated
	 */
	void setTableEtrangere(Table value);

	/**
	 * Returns the value of the '<em><b>Id Colonne Table Etrangere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Colonne Table Etrangere</em>' attribute.
	 * @see #setIdColonneTableEtrangere(String)
	 * @see schemaTable.SchemaTablePackage#getColonneEtrangere_IdColonneTableEtrangere()
	 * @model required="true"
	 * @generated
	 */
	String getIdColonneTableEtrangere();

	/**
	 * Sets the value of the '{@link schemaTable.ColonneEtrangere#getIdColonneTableEtrangere <em>Id Colonne Table Etrangere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Colonne Table Etrangere</em>' attribute.
	 * @see #getIdColonneTableEtrangere()
	 * @generated
	 */
	void setIdColonneTableEtrangere(String value);

} // ColonneEtrangere
