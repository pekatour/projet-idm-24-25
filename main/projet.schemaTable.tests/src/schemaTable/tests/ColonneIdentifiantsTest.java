/**
 */
package schemaTable.tests;

import junit.textui.TestRunner;

import schemaTable.ColonneIdentifiants;
import schemaTable.SchemaTableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colonne Identifiants</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColonneIdentifiantsTest extends ColonneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColonneIdentifiantsTest.class);
	}

	/**
	 * Constructs a new Colonne Identifiants test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneIdentifiantsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Colonne Identifiants test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ColonneIdentifiants getFixture() {
		return (ColonneIdentifiants)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SchemaTableFactory.eINSTANCE.createColonneIdentifiants());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ColonneIdentifiantsTest
