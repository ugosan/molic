/*
 * Teste de nota de copyright do Molic
 */
package br.puc.molic.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import br.puc.molic.MolicPackage;
import br.puc.molic.diagram.dynamic.MetaModelFacility;
import br.puc.molic.diagram.edit.parts.BRTUtteranceEditPart;
import br.puc.molic.diagram.edit.parts.BRTUtteranceLabelEditPart;
import br.puc.molic.diagram.edit.parts.ClosingPointEditPart;
import br.puc.molic.diagram.edit.parts.DiagramEditPart;
import br.puc.molic.diagram.edit.parts.MonologueEditPart;
import br.puc.molic.diagram.edit.parts.MonologueLabelEditPart;
import br.puc.molic.diagram.edit.parts.OpeningPointEditPart;
import br.puc.molic.diagram.edit.parts.SceneDialogueEditPart;
import br.puc.molic.diagram.edit.parts.SceneEditPart;
import br.puc.molic.diagram.edit.parts.SceneNameEditPart;
import br.puc.molic.diagram.edit.parts.SystemProcessEditPart;
import br.puc.molic.diagram.edit.parts.UbiquitousAccessEditPart;
import br.puc.molic.diagram.edit.parts.UtteranceEditPart;
import br.puc.molic.diagram.edit.parts.UtteranceLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MolicVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "br.puc.molic.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return br.puc.molic.diagram.part.MolicVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MolicDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MolicPackage.eINSTANCE.getDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((br.puc.molic.Diagram) domainElement)) {
			return DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = br.puc.molic.diagram.part.MolicVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = br.puc.molic.diagram.part.MolicVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DiagramEditPart.VISUAL_ID:
			if (MolicPackage.eINSTANCE.getScene().isSuperTypeOf(
					domainElement.eClass())) {
				return SceneEditPart.VISUAL_ID;
			}
			if (MolicPackage.eINSTANCE.getSystemProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return SystemProcessEditPart.VISUAL_ID;
			}
			if (MolicPackage.eINSTANCE.getMonologue().isSuperTypeOf(
					domainElement.eClass())) {
				return MonologueEditPart.VISUAL_ID;
			}
			if (MolicPackage.eINSTANCE.getUbiquitousAccess().isSuperTypeOf(
					domainElement.eClass())) {
				return UbiquitousAccessEditPart.VISUAL_ID;
			}
			if (MolicPackage.eINSTANCE.getOpeningPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return OpeningPointEditPart.VISUAL_ID;
			}
			if (MolicPackage.eINSTANCE.getClosingPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return ClosingPointEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = br.puc.molic.diagram.part.MolicVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = br.puc.molic.diagram.part.MolicVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SceneEditPart.VISUAL_ID:
			if (SceneNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SceneDialogueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MonologueEditPart.VISUAL_ID:
			if (MonologueLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiagramEditPart.VISUAL_ID:
			if (SceneEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MonologueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UbiquitousAccessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpeningPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClosingPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UtteranceEditPart.VISUAL_ID:
			if (UtteranceLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BRTUtteranceEditPart.VISUAL_ID:
			if (BRTUtteranceLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MolicPackage.eINSTANCE.getUtterance().isSuperTypeOf(
				domainElement.eClass())) {
			return UtteranceEditPart.VISUAL_ID;
		}
		if (MolicPackage.eINSTANCE.getBRTUtterance().isSuperTypeOf(
				domainElement.eClass())) {
			return BRTUtteranceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(br.puc.molic.Diagram element) {
		return true;
	}

}
