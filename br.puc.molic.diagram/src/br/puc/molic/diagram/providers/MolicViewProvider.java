package br.puc.molic.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

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
import br.puc.molic.diagram.part.MolicVisualIDRegistry;
import br.puc.molic.diagram.view.factories.BRTUtteranceLabelViewFactory;
import br.puc.molic.diagram.view.factories.BRTUtteranceViewFactory;
import br.puc.molic.diagram.view.factories.ClosingPointViewFactory;
import br.puc.molic.diagram.view.factories.DiagramViewFactory;
import br.puc.molic.diagram.view.factories.MonologueLabelViewFactory;
import br.puc.molic.diagram.view.factories.MonologueViewFactory;
import br.puc.molic.diagram.view.factories.OpeningPointViewFactory;
import br.puc.molic.diagram.view.factories.SceneDialogueViewFactory;
import br.puc.molic.diagram.view.factories.SceneNameViewFactory;
import br.puc.molic.diagram.view.factories.SceneViewFactory;
import br.puc.molic.diagram.view.factories.SystemProcessViewFactory;
import br.puc.molic.diagram.view.factories.UbiquitousAccessViewFactory;
import br.puc.molic.diagram.view.factories.UtteranceLabelViewFactory;
import br.puc.molic.diagram.view.factories.UtteranceViewFactory;

/**
 * @generated
 */
public class MolicViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (DiagramEditPart.MODEL_ID.equals(diagramKind)
				&& MolicVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return DiagramViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = MolicVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = MolicVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!MolicElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != MolicVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!DiagramEditPart.MODEL_ID.equals(MolicVisualIDRegistry
						.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case SceneEditPart.VISUAL_ID:
				case SystemProcessEditPart.VISUAL_ID:
				case MonologueEditPart.VISUAL_ID:
				case UbiquitousAccessEditPart.VISUAL_ID:
				case OpeningPointEditPart.VISUAL_ID:
				case ClosingPointEditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != MolicVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case SceneNameEditPart.VISUAL_ID:
				case SceneDialogueEditPart.VISUAL_ID:
					if (SceneEditPart.VISUAL_ID != MolicVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case MonologueLabelEditPart.VISUAL_ID:
					if (MonologueEditPart.VISUAL_ID != MolicVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case UtteranceLabelEditPart.VISUAL_ID:
					if (UtteranceEditPart.VISUAL_ID != MolicVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case BRTUtteranceLabelEditPart.VISUAL_ID:
					if (BRTUtteranceEditPart.VISUAL_ID != MolicVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !MolicVisualIDRegistry
						.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case SceneEditPart.VISUAL_ID:
			return SceneViewFactory.class;
		case SceneNameEditPart.VISUAL_ID:
			return SceneNameViewFactory.class;
		case SceneDialogueEditPart.VISUAL_ID:
			return SceneDialogueViewFactory.class;
		case SystemProcessEditPart.VISUAL_ID:
			return SystemProcessViewFactory.class;
		case MonologueEditPart.VISUAL_ID:
			return MonologueViewFactory.class;
		case MonologueLabelEditPart.VISUAL_ID:
			return MonologueLabelViewFactory.class;
		case UbiquitousAccessEditPart.VISUAL_ID:
			return UbiquitousAccessViewFactory.class;
		case OpeningPointEditPart.VISUAL_ID:
			return OpeningPointViewFactory.class;
		case ClosingPointEditPart.VISUAL_ID:
			return ClosingPointViewFactory.class;
		case UtteranceLabelEditPart.VISUAL_ID:
			return UtteranceLabelViewFactory.class;
		case BRTUtteranceLabelEditPart.VISUAL_ID:
			return BRTUtteranceLabelViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!MolicElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = MolicVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != MolicVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case UtteranceEditPart.VISUAL_ID:
			return UtteranceViewFactory.class;
		case BRTUtteranceEditPart.VISUAL_ID:
			return BRTUtteranceViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

}
