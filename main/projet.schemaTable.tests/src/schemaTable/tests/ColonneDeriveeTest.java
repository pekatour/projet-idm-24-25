/**
 */
package schemaTable.tests;

import junit.textui.TestRunner;

import schemaTable.ColonneDerivee;
import schemaTable.SchemaTableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colonne Derivee</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColonneDeriveeTest extends ColonneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColonneDeriveeTest.class);
	}

	/**
	 * Constructs a new Colonne Derivee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneDeriveeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Colonne Derivee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ColonneDerivee getFixture() {
		return (ColonneDerivee)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SchemaTableFactory.eINSTANCE.createColonneDerivee());
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

} //ColonneDeriveeTest
