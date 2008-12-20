/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.puc.molic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.puc.molic.MolicPackage
 * @generated
 */
public interface MolicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MolicFactory eINSTANCE = br.puc.molic.impl.MolicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	Diagram createDiagram();

	/**
	 * Returns a new object of class '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene</em>'.
	 * @generated
	 */
	Scene createScene();

	/**
	 * Returns a new object of class '<em>Utterance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utterance</em>'.
	 * @generated
	 */
	Utterance createUtterance();

	/**
	 * Returns a new object of class '<em>System Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Process</em>'.
	 * @generated
	 */
	SystemProcess createSystemProcess();

	/**
	 * Returns a new object of class '<em>Monologue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monologue</em>'.
	 * @generated
	 */
	Monologue createMonologue();

	/**
	 * Returns a new object of class '<em>BRT Utterance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BRT Utterance</em>'.
	 * @generated
	 */
	BRTUtterance createBRTUtterance();

	/**
	 * Returns a new object of class '<em>Ubiquitous Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ubiquitous Access</em>'.
	 * @generated
	 */
	UbiquitousAccess createUbiquitousAccess();

	/**
	 * Returns a new object of class '<em>Opening Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opening Point</em>'.
	 * @generated
	 */
	OpeningPoint createOpeningPoint();

	/**
	 * Returns a new object of class '<em>Closing Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closing Point</em>'.
	 * @generated
	 */
	ClosingPoint createClosingPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MolicPackage getMolicPackage();

} //MolicFactory
