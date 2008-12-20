/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.puc.molic.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import br.puc.molic.MolicFactory;
import br.puc.molic.Monologue;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Monologue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonologueTest extends TestCase {
	/**
	 * The fixture for this Monologue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Monologue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MonologueTest.class);
	}

	/**
	 * Constructs a new Monologue test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonologueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Monologue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Monologue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Monologue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Monologue getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(MolicFactory.eINSTANCE.createMonologue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MonologueTest
