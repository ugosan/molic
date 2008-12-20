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
import br.puc.molic.Utterance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Utterance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtteranceTest extends TestCase {
	/**
	 * The fixture for this Utterance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Utterance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UtteranceTest.class);
	}

	/**
	 * Constructs a new Utterance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtteranceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Utterance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Utterance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Utterance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Utterance getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(MolicFactory.eINSTANCE.createUtterance());
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

} //UtteranceTest
