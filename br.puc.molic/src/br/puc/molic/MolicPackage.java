/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.puc.molic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.puc.molic.MolicFactory
 * @model kind="package"
 * @generated
 */
public interface MolicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "molic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "molic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "molic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MolicPackage eINSTANCE = br.puc.molic.impl.MolicPackageImpl.init();

	/**
	 * The meta object id for the '{@link br.puc.molic.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.impl.DiagramImpl
	 * @see br.puc.molic.impl.MolicPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Utterances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__UTTERANCES = 1;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.puc.molic.Element <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.Element
	 * @see br.puc.molic.impl.MolicPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.puc.molic.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.impl.SceneImpl
	 * @see br.puc.molic.impl.MolicPackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 3;

	/**
	 * The meta object id for the '{@link br.puc.molic.Connection <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.Connection
	 * @see br.puc.molic.impl.MolicPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dialogue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__DIALOGUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link br.puc.molic.impl.UtteranceImpl <em>Utterance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.impl.UtteranceImpl
	 * @see br.puc.molic.impl.MolicPackageImpl#getUtterance()
	 * @generated
	 */
	int UTTERANCE = 5;

	/**
	 * The meta object id for the '{@link br.puc.molic.impl.SystemProcessImpl <em>System Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.impl.SystemProcessImpl
	 * @see br.puc.molic.impl.MolicPackageImpl#getSystemProcess()
	 * @generated
	 */
	int SYSTEM_PROCESS = 7;

	/**
	 * The meta object id for the '{@link br.puc.molic.impl.MonologueImpl <em>Monologue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.impl.MonologueImpl
	 * @see br.puc.molic.impl.MolicPackageImpl#getMonologue()
	 * @generated
	 */
	int MONOLOGUE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOLOGUE__LABEL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Monologue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOLOGUE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__LABEL = CONNECTION__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__SOURCE = CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE__TARGET = CONNECTION__TARGET;

	/**
	 * The number of structural features of the '<em>Utterance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTTERANCE_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.puc.molic.impl.BRTUtteranceImpl <em>BRT Utterance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.impl.BRTUtteranceImpl
	 * @see br.puc.molic.impl.MolicPackageImpl#getBRTUtterance()
	 * @generated
	 */
	int BRT_UTTERANCE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRT_UTTERANCE__LABEL = CONNECTION__LABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRT_UTTERANCE__SOURCE = CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRT_UTTERANCE__TARGET = CONNECTION__TARGET;

	/**
	 * The number of structural features of the '<em>BRT Utterance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRT_UTTERANCE_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROCESS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link br.puc.molic.impl.UbiquitousAccessImpl <em>Ubiquitous Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.impl.UbiquitousAccessImpl
	 * @see br.puc.molic.impl.MolicPackageImpl#getUbiquitousAccess()
	 * @generated
	 */
	int UBIQUITOUS_ACCESS = 8;

	/**
	 * The number of structural features of the '<em>Ubiquitous Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUITOUS_ACCESS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link br.puc.molic.impl.OpeningPointImpl <em>Opening Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.impl.OpeningPointImpl
	 * @see br.puc.molic.impl.MolicPackageImpl#getOpeningPoint()
	 * @generated
	 */
	int OPENING_POINT = 9;

	/**
	 * The number of structural features of the '<em>Opening Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_POINT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link br.puc.molic.impl.ClosingPointImpl <em>Closing Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.puc.molic.impl.ClosingPointImpl
	 * @see br.puc.molic.impl.MolicPackageImpl#getClosingPoint()
	 * @generated
	 */
	int CLOSING_POINT = 10;

	/**
	 * The number of structural features of the '<em>Closing Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSING_POINT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link br.puc.molic.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see br.puc.molic.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link br.puc.molic.Diagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see br.puc.molic.Diagram#getElements()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link br.puc.molic.Diagram#getUtterances <em>Utterances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Utterances</em>'.
	 * @see br.puc.molic.Diagram#getUtterances()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Utterances();

	/**
	 * Returns the meta object for class '{@link br.puc.molic.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see br.puc.molic.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the attribute '{@link br.puc.molic.Scene#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.puc.molic.Scene#getName()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.puc.molic.Scene#getDialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialogue</em>'.
	 * @see br.puc.molic.Scene#getDialogue()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Dialogue();

	/**
	 * Returns the meta object for class '{@link br.puc.molic.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see br.puc.molic.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link br.puc.molic.Utterance <em>Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utterance</em>'.
	 * @see br.puc.molic.Utterance
	 * @generated
	 */
	EClass getUtterance();

	/**
	 * Returns the meta object for class '{@link br.puc.molic.SystemProcess <em>System Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Process</em>'.
	 * @see br.puc.molic.SystemProcess
	 * @generated
	 */
	EClass getSystemProcess();

	/**
	 * Returns the meta object for class '{@link br.puc.molic.Monologue <em>Monologue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monologue</em>'.
	 * @see br.puc.molic.Monologue
	 * @generated
	 */
	EClass getMonologue();

	/**
	 * Returns the meta object for the attribute '{@link br.puc.molic.Monologue#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see br.puc.molic.Monologue#getLabel()
	 * @see #getMonologue()
	 * @generated
	 */
	EAttribute getMonologue_Label();

	/**
	 * Returns the meta object for class '{@link br.puc.molic.BRTUtterance <em>BRT Utterance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BRT Utterance</em>'.
	 * @see br.puc.molic.BRTUtterance
	 * @generated
	 */
	EClass getBRTUtterance();

	/**
	 * Returns the meta object for class '{@link br.puc.molic.UbiquitousAccess <em>Ubiquitous Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubiquitous Access</em>'.
	 * @see br.puc.molic.UbiquitousAccess
	 * @generated
	 */
	EClass getUbiquitousAccess();

	/**
	 * Returns the meta object for class '{@link br.puc.molic.OpeningPoint <em>Opening Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opening Point</em>'.
	 * @see br.puc.molic.OpeningPoint
	 * @generated
	 */
	EClass getOpeningPoint();

	/**
	 * Returns the meta object for class '{@link br.puc.molic.ClosingPoint <em>Closing Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closing Point</em>'.
	 * @see br.puc.molic.ClosingPoint
	 * @generated
	 */
	EClass getClosingPoint();

	/**
	 * Returns the meta object for class '{@link br.puc.molic.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see br.puc.molic.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link br.puc.molic.Connection#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see br.puc.molic.Connection#getLabel()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Label();

	/**
	 * Returns the meta object for the reference '{@link br.puc.molic.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see br.puc.molic.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link br.puc.molic.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see br.puc.molic.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MolicFactory getMolicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link br.puc.molic.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.impl.DiagramImpl
		 * @see br.puc.molic.impl.MolicPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__ELEMENTS = eINSTANCE.getDiagram_Elements();

		/**
		 * The meta object literal for the '<em><b>Utterances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__UTTERANCES = eINSTANCE.getDiagram_Utterances();

		/**
		 * The meta object literal for the '{@link br.puc.molic.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.impl.SceneImpl
		 * @see br.puc.molic.impl.MolicPackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__NAME = eINSTANCE.getScene_Name();

		/**
		 * The meta object literal for the '<em><b>Dialogue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__DIALOGUE = eINSTANCE.getScene_Dialogue();

		/**
		 * The meta object literal for the '{@link br.puc.molic.Element <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.Element
		 * @see br.puc.molic.impl.MolicPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link br.puc.molic.impl.UtteranceImpl <em>Utterance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.impl.UtteranceImpl
		 * @see br.puc.molic.impl.MolicPackageImpl#getUtterance()
		 * @generated
		 */
		EClass UTTERANCE = eINSTANCE.getUtterance();

		/**
		 * The meta object literal for the '{@link br.puc.molic.impl.SystemProcessImpl <em>System Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.impl.SystemProcessImpl
		 * @see br.puc.molic.impl.MolicPackageImpl#getSystemProcess()
		 * @generated
		 */
		EClass SYSTEM_PROCESS = eINSTANCE.getSystemProcess();

		/**
		 * The meta object literal for the '{@link br.puc.molic.impl.MonologueImpl <em>Monologue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.impl.MonologueImpl
		 * @see br.puc.molic.impl.MolicPackageImpl#getMonologue()
		 * @generated
		 */
		EClass MONOLOGUE = eINSTANCE.getMonologue();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONOLOGUE__LABEL = eINSTANCE.getMonologue_Label();

		/**
		 * The meta object literal for the '{@link br.puc.molic.impl.BRTUtteranceImpl <em>BRT Utterance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.impl.BRTUtteranceImpl
		 * @see br.puc.molic.impl.MolicPackageImpl#getBRTUtterance()
		 * @generated
		 */
		EClass BRT_UTTERANCE = eINSTANCE.getBRTUtterance();

			/**
		 * The meta object literal for the '{@link br.puc.molic.impl.UbiquitousAccessImpl <em>Ubiquitous Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.impl.UbiquitousAccessImpl
		 * @see br.puc.molic.impl.MolicPackageImpl#getUbiquitousAccess()
		 * @generated
		 */
		EClass UBIQUITOUS_ACCESS = eINSTANCE.getUbiquitousAccess();

			/**
		 * The meta object literal for the '{@link br.puc.molic.impl.OpeningPointImpl <em>Opening Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.impl.OpeningPointImpl
		 * @see br.puc.molic.impl.MolicPackageImpl#getOpeningPoint()
		 * @generated
		 */
		EClass OPENING_POINT = eINSTANCE.getOpeningPoint();

			/**
		 * The meta object literal for the '{@link br.puc.molic.impl.ClosingPointImpl <em>Closing Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.impl.ClosingPointImpl
		 * @see br.puc.molic.impl.MolicPackageImpl#getClosingPoint()
		 * @generated
		 */
		EClass CLOSING_POINT = eINSTANCE.getClosingPoint();

			/**
		 * The meta object literal for the '{@link br.puc.molic.Connection <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.puc.molic.Connection
		 * @see br.puc.molic.impl.MolicPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

			/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__LABEL = eINSTANCE.getConnection_Label();

			/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

			/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

	}

} //MolicPackage
