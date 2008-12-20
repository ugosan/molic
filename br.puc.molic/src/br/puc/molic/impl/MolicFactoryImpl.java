/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.puc.molic.impl;

import br.puc.molic.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import br.puc.molic.BRTUtterance;
import br.puc.molic.Diagram;
import br.puc.molic.MolicFactory;
import br.puc.molic.MolicPackage;
import br.puc.molic.Monologue;
import br.puc.molic.Scene;
import br.puc.molic.SystemProcess;
import br.puc.molic.UbiquitousAccess;
import br.puc.molic.Utterance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MolicFactoryImpl extends EFactoryImpl implements MolicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MolicFactory init() {
		try {
			MolicFactory theMolicFactory = (MolicFactory)EPackage.Registry.INSTANCE.getEFactory("molic"); 
			if (theMolicFactory != null) {
				return theMolicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MolicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolicFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MolicPackage.DIAGRAM: return createDiagram();
			case MolicPackage.SCENE: return createScene();
			case MolicPackage.MONOLOGUE: return createMonologue();
			case MolicPackage.UTTERANCE: return createUtterance();
			case MolicPackage.BRT_UTTERANCE: return createBRTUtterance();
			case MolicPackage.SYSTEM_PROCESS: return createSystemProcess();
			case MolicPackage.UBIQUITOUS_ACCESS: return createUbiquitousAccess();
			case MolicPackage.OPENING_POINT: return createOpeningPoint();
			case MolicPackage.CLOSING_POINT: return createClosingPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene createScene() {
		SceneImpl scene = new SceneImpl();
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utterance createUtterance() {
		UtteranceImpl utterance = new UtteranceImpl();
		return utterance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemProcess createSystemProcess() {
		SystemProcessImpl systemProcess = new SystemProcessImpl();
		return systemProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monologue createMonologue() {
		MonologueImpl monologue = new MonologueImpl();
		return monologue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BRTUtterance createBRTUtterance() {
		BRTUtteranceImpl brtUtterance = new BRTUtteranceImpl();
		return brtUtterance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiquitousAccess createUbiquitousAccess() {
		UbiquitousAccessImpl ubiquitousAccess = new UbiquitousAccessImpl();
		return ubiquitousAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpeningPoint createOpeningPoint() {
		OpeningPointImpl openingPoint = new OpeningPointImpl();
		return openingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosingPoint createClosingPoint() {
		ClosingPointImpl closingPoint = new ClosingPointImpl();
		return closingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolicPackage getMolicPackage() {
		return (MolicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static MolicPackage getPackage() {
		return MolicPackage.eINSTANCE;
	}

} //MolicFactoryImpl
