/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.puc.molic.util;

import br.puc.molic.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.puc.molic.MolicPackage
 * @generated
 */
public class MolicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MolicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MolicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolicSwitch modelSwitch =
		new MolicSwitch() {
			public Object caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			public Object caseElement(Element object) {
				return createElementAdapter();
			}
			public Object caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			public Object caseScene(Scene object) {
				return createSceneAdapter();
			}
			public Object caseMonologue(Monologue object) {
				return createMonologueAdapter();
			}
			public Object caseUtterance(Utterance object) {
				return createUtteranceAdapter();
			}
			public Object caseBRTUtterance(BRTUtterance object) {
				return createBRTUtteranceAdapter();
			}
			public Object caseSystemProcess(SystemProcess object) {
				return createSystemProcessAdapter();
			}
			public Object caseUbiquitousAccess(UbiquitousAccess object) {
				return createUbiquitousAccessAdapter();
			}
			public Object caseOpeningPoint(OpeningPoint object) {
				return createOpeningPointAdapter();
			}
			public Object caseClosingPoint(ClosingPoint object) {
				return createClosingPointAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.Scene
	 * @generated
	 */
	public Adapter createSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.Utterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.Utterance
	 * @generated
	 */
	public Adapter createUtteranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.SystemProcess <em>System Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.SystemProcess
	 * @generated
	 */
	public Adapter createSystemProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.Monologue <em>Monologue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.Monologue
	 * @generated
	 */
	public Adapter createMonologueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.BRTUtterance <em>BRT Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.BRTUtterance
	 * @generated
	 */
	public Adapter createBRTUtteranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.UbiquitousAccess <em>Ubiquitous Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.UbiquitousAccess
	 * @generated
	 */
	public Adapter createUbiquitousAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.OpeningPoint <em>Opening Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.OpeningPoint
	 * @generated
	 */
	public Adapter createOpeningPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.ClosingPoint <em>Closing Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.ClosingPoint
	 * @generated
	 */
	public Adapter createClosingPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.puc.molic.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.puc.molic.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MolicAdapterFactory
