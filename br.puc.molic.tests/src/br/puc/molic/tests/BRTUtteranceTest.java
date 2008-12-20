/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.puc.molic.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import br.puc.molic.BRTUtterance;
import br.puc.molic.MolicFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BRT Utterance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BRTUtteranceTest extends TestCase {
	/**
	 * The fixture for this BRT Utterance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BRTUtterance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BRTUtteranceTest.class);
	}

	/**
	 * Constructs a new BRT Utterance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BRTUtteranceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this BRT Utterance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BRTUtterance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this BRT Utterance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BRTUtterance getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(MolicFactory.eINSTANCE.createBRTUtterance());
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

} //BRTUtteranceTest
