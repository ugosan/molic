/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.puc.molic.util;

import br.puc.molic.*;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import br.puc.molic.BRTUtterance;
import br.puc.molic.Connection;
import br.puc.molic.Diagram;
import br.puc.molic.Element;
import br.puc.molic.MolicPackage;
import br.puc.molic.Monologue;
import br.puc.molic.Scene;
import br.puc.molic.SystemProcess;
import br.puc.molic.UbiquitousAccess;
import br.puc.molic.Utterance;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.puc.molic.MolicPackage
 * @generated
 */
public class MolicSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MolicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolicSwitch() {
		if (modelPackage == null) {
			modelPackage = MolicPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MolicPackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				Object result = caseDiagram(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.ELEMENT: {
				Element element = (Element)theEObject;
				Object result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				Object result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.SCENE: {
				Scene scene = (Scene)theEObject;
				Object result = caseScene(scene);
				if (result == null) result = caseElement(scene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.MONOLOGUE: {
				Monologue monologue = (Monologue)theEObject;
				Object result = caseMonologue(monologue);
				if (result == null) result = caseElement(monologue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.UTTERANCE: {
				Utterance utterance = (Utterance)theEObject;
				Object result = caseUtterance(utterance);
				if (result == null) result = caseConnection(utterance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.BRT_UTTERANCE: {
				BRTUtterance brtUtterance = (BRTUtterance)theEObject;
				Object result = caseBRTUtterance(brtUtterance);
				if (result == null) result = caseConnection(brtUtterance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.SYSTEM_PROCESS: {
				SystemProcess systemProcess = (SystemProcess)theEObject;
				Object result = caseSystemProcess(systemProcess);
				if (result == null) result = caseElement(systemProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.UBIQUITOUS_ACCESS: {
				UbiquitousAccess ubiquitousAccess = (UbiquitousAccess)theEObject;
				Object result = caseUbiquitousAccess(ubiquitousAccess);
				if (result == null) result = caseElement(ubiquitousAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.OPENING_POINT: {
				OpeningPoint openingPoint = (OpeningPoint)theEObject;
				Object result = caseOpeningPoint(openingPoint);
				if (result == null) result = caseElement(openingPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.CLOSING_POINT: {
				ClosingPoint closingPoint = (ClosingPoint)theEObject;
				Object result = caseClosingPoint(closingPoint);
				if (result == null) result = caseElement(closingPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseScene(Scene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utterance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utterance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUtterance(Utterance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSystemProcess(SystemProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monologue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monologue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMonologue(Monologue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BRT Utterance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BRT Utterance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBRTUtterance(BRTUtterance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ubiquitous Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ubiquitous Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUbiquitousAccess(UbiquitousAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opening Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opening Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOpeningPoint(OpeningPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closing Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closing Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClosingPoint(ClosingPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //MolicSwitch
