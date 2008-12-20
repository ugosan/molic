/*
 * Teste de nota de copyright do Molic
 */
package br.puc.molic.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import br.puc.molic.BRTUtterance;
import br.puc.molic.ClosingPoint;
import br.puc.molic.Diagram;
import br.puc.molic.Element;
import br.puc.molic.MolicPackage;
import br.puc.molic.Monologue;
import br.puc.molic.OpeningPoint;
import br.puc.molic.Scene;
import br.puc.molic.SystemProcess;
import br.puc.molic.UbiquitousAccess;
import br.puc.molic.Utterance;
import br.puc.molic.diagram.dynamic.MetaModelFacility;
import br.puc.molic.diagram.edit.parts.BRTUtteranceEditPart;
import br.puc.molic.diagram.edit.parts.ClosingPointEditPart;
import br.puc.molic.diagram.edit.parts.DiagramEditPart;
import br.puc.molic.diagram.edit.parts.MonologueEditPart;
import br.puc.molic.diagram.edit.parts.OpeningPointEditPart;
import br.puc.molic.diagram.edit.parts.SceneEditPart;
import br.puc.molic.diagram.edit.parts.SystemProcessEditPart;
import br.puc.molic.diagram.edit.parts.UbiquitousAccessEditPart;
import br.puc.molic.diagram.edit.parts.UtteranceEditPart;
import br.puc.molic.diagram.providers.MolicElementTypes;

/**
 * @generated
 */
public class MolicDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (MolicVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Diagram modelElement = (Diagram) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getElements().iterator(); it.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = MolicVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SceneEditPart.VISUAL_ID) {
				result.add(new MolicNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SystemProcessEditPart.VISUAL_ID) {
				result.add(new MolicNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MonologueEditPart.VISUAL_ID) {
				result.add(new MolicNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UbiquitousAccessEditPart.VISUAL_ID) {
				result.add(new MolicNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpeningPointEditPart.VISUAL_ID) {
				result.add(new MolicNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ClosingPointEditPart.VISUAL_ID) {
				result.add(new MolicNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (MolicVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000ContainedLinks(view);
		case SceneEditPart.VISUAL_ID:
			return getScene_2001ContainedLinks(view);
		case SystemProcessEditPart.VISUAL_ID:
			return getSystemProcess_2002ContainedLinks(view);
		case MonologueEditPart.VISUAL_ID:
			return getMonologue_2003ContainedLinks(view);
		case UbiquitousAccessEditPart.VISUAL_ID:
			return getUbiquitousAccess_2004ContainedLinks(view);
		case OpeningPointEditPart.VISUAL_ID:
			return getOpeningPoint_2005ContainedLinks(view);
		case ClosingPointEditPart.VISUAL_ID:
			return getClosingPoint_2006ContainedLinks(view);
		case UtteranceEditPart.VISUAL_ID:
			return getUtterance_4001ContainedLinks(view);
		case BRTUtteranceEditPart.VISUAL_ID:
			return getBRTUtterance_4002ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (MolicVisualIDRegistry.getVisualID(view)) {
		case SceneEditPart.VISUAL_ID:
			return getScene_2001IncomingLinks(view);
		case SystemProcessEditPart.VISUAL_ID:
			return getSystemProcess_2002IncomingLinks(view);
		case MonologueEditPart.VISUAL_ID:
			return getMonologue_2003IncomingLinks(view);
		case UbiquitousAccessEditPart.VISUAL_ID:
			return getUbiquitousAccess_2004IncomingLinks(view);
		case OpeningPointEditPart.VISUAL_ID:
			return getOpeningPoint_2005IncomingLinks(view);
		case ClosingPointEditPart.VISUAL_ID:
			return getClosingPoint_2006IncomingLinks(view);
		case UtteranceEditPart.VISUAL_ID:
			return getUtterance_4001IncomingLinks(view);
		case BRTUtteranceEditPart.VISUAL_ID:
			return getBRTUtterance_4002IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (MolicVisualIDRegistry.getVisualID(view)) {
		case SceneEditPart.VISUAL_ID:
			return getScene_2001OutgoingLinks(view);
		case SystemProcessEditPart.VISUAL_ID:
			return getSystemProcess_2002OutgoingLinks(view);
		case MonologueEditPart.VISUAL_ID:
			return getMonologue_2003OutgoingLinks(view);
		case UbiquitousAccessEditPart.VISUAL_ID:
			return getUbiquitousAccess_2004OutgoingLinks(view);
		case OpeningPointEditPart.VISUAL_ID:
			return getOpeningPoint_2005OutgoingLinks(view);
		case ClosingPointEditPart.VISUAL_ID:
			return getClosingPoint_2006OutgoingLinks(view);
		case UtteranceEditPart.VISUAL_ID:
			return getUtterance_4001OutgoingLinks(view);
		case BRTUtteranceEditPart.VISUAL_ID:
			return getBRTUtterance_4002OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_1000ContainedLinks(View view) {
		Diagram modelElement = (Diagram) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Utterance_4001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_BRTUtterance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getScene_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSystemProcess_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMonologue_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUbiquitousAccess_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOpeningPoint_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClosingPoint_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUtterance_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBRTUtterance_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScene_2001IncomingLinks(View view) {
		Scene modelElement = (Scene) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Utterance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BRTUtterance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSystemProcess_2002IncomingLinks(View view) {
		SystemProcess modelElement = (SystemProcess) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Utterance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BRTUtterance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMonologue_2003IncomingLinks(View view) {
		Monologue modelElement = (Monologue) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Utterance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BRTUtterance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUbiquitousAccess_2004IncomingLinks(View view) {
		UbiquitousAccess modelElement = (UbiquitousAccess) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Utterance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BRTUtterance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpeningPoint_2005IncomingLinks(View view) {
		OpeningPoint modelElement = (OpeningPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Utterance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BRTUtterance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClosingPoint_2006IncomingLinks(View view) {
		ClosingPoint modelElement = (ClosingPoint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Utterance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BRTUtterance_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUtterance_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBRTUtterance_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getScene_2001OutgoingLinks(View view) {
		Scene modelElement = (Scene) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Utterance_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BRTUtterance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSystemProcess_2002OutgoingLinks(View view) {
		SystemProcess modelElement = (SystemProcess) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Utterance_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BRTUtterance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMonologue_2003OutgoingLinks(View view) {
		Monologue modelElement = (Monologue) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Utterance_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BRTUtterance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUbiquitousAccess_2004OutgoingLinks(View view) {
		UbiquitousAccess modelElement = (UbiquitousAccess) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Utterance_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BRTUtterance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpeningPoint_2005OutgoingLinks(View view) {
		OpeningPoint modelElement = (OpeningPoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Utterance_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BRTUtterance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClosingPoint_2006OutgoingLinks(View view) {
		ClosingPoint modelElement = (ClosingPoint) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Utterance_4001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BRTUtterance_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getUtterance_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBRTUtterance_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Utterance_4001(
			Diagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getUtterances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Utterance) {
				continue;
			}
			Utterance link = (Utterance) linkObject;
			if (UtteranceEditPart.VISUAL_ID != MolicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			result.add(new MolicLinkDescriptor(src, dst, link,
					MolicElementTypes.Utterance_4001,
					UtteranceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_BRTUtterance_4002(
			Diagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getUtterances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof BRTUtterance) {
				continue;
			}
			BRTUtterance link = (BRTUtterance) linkObject;
			if (BRTUtteranceEditPart.VISUAL_ID != MolicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			result.add(new MolicLinkDescriptor(src, dst, link,
					MolicElementTypes.BRTUtterance_4002,
					BRTUtteranceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Utterance_4001(
			Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MolicPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof Utterance) {
				continue;
			}
			Utterance link = (Utterance) setting.getEObject();
			if (UtteranceEditPart.VISUAL_ID != MolicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getSource();
			result.add(new MolicLinkDescriptor(src, target, link,
					MolicElementTypes.Utterance_4001,
					UtteranceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_BRTUtterance_4002(
			Element target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != MolicPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof BRTUtterance) {
				continue;
			}
			BRTUtterance link = (BRTUtterance) setting.getEObject();
			if (BRTUtteranceEditPart.VISUAL_ID != MolicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getSource();
			result.add(new MolicLinkDescriptor(src, target, link,
					MolicElementTypes.BRTUtterance_4002,
					BRTUtteranceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Utterance_4001(
			Element source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getUtterances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Utterance) {
				continue;
			}
			Utterance link = (Utterance) linkObject;
			if (UtteranceEditPart.VISUAL_ID != MolicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MolicLinkDescriptor(src, dst, link,
					MolicElementTypes.Utterance_4001,
					UtteranceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_BRTUtterance_4002(
			Element source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getUtterances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof BRTUtterance) {
				continue;
			}
			BRTUtterance link = (BRTUtterance) linkObject;
			if (BRTUtteranceEditPart.VISUAL_ID != MolicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getTarget();
			Element src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MolicLinkDescriptor(src, dst, link,
					MolicElementTypes.BRTUtterance_4002,
					BRTUtteranceEditPart.VISUAL_ID));
		}
		return result;
	}

}
