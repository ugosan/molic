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
import br.puc.molic.SystemProcess;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Process</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemProcessTest extends TestCase {
	/**
	 * The fixture for this System Process test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemProcess fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemProcessTest.class);
	}

	/**
	 * Constructs a new System Process test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemProcessTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this System Process test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SystemProcess fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this System Process test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SystemProcess getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(MolicFactory.eINSTANCE.createSystemProcess());
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

} //SystemProcessTest
