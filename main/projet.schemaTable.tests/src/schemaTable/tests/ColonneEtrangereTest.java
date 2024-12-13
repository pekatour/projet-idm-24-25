/**
 */
package schemaTable.tests;

import junit.textui.TestRunner;

import schemaTable.ColonneEtrangere;
import schemaTable.SchemaTableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colonne Etrangere</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColonneEtrangereTest extends ColonneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColonneEtrangereTest.class);
	}

	/**
	 * Constructs a new Colonne Etrangere test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColonneEtrangereTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Colonne Etrangere test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ColonneEtrangere getFixture() {
		return (ColonneEtrangere)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SchemaTableFactory.eINSTANCE.createColonneEtrangere());
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

} //ColonneEtrangereTest
