package br.puc.molic.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import br.puc.molic.MolicPackage;
import br.puc.molic.diagram.part.MetaModelFacility;
import br.puc.molic.diagram.part.MolicDiagramEditorPlugin;

/**
 * @generated
 */
public class MolicElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private MolicElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return MolicDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(Diagram_1000, MolicPackage.eINSTANCE.getDiagram());

			elements.put(Scene_2007, MolicPackage.eINSTANCE.getScene());

			elements.put(SystemProcess_2008, MolicPackage.eINSTANCE
					.getSystemProcess());

			elements.put(Monologue_2009, MolicPackage.eINSTANCE.getMonologue());

			elements.put(UbiquitousAccess_2010, MolicPackage.eINSTANCE
					.getUbiquitousAccess());

			elements.put(OpeningPoint_2011, MolicPackage.eINSTANCE
					.getOpeningPoint());

			elements.put(ClosingPoint_2012, MolicPackage.eINSTANCE
					.getClosingPoint());

			elements.put(Utterance_4001, MolicPackage.eINSTANCE.getUtterance());

			elements.put(BRTUtterance_4002, MolicPackage.eINSTANCE
					.getBRTUtterance());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Diagram_1000 = getElementType("br.puc.molic.diagram.Diagram_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Scene_2007 = getElementType("br.puc.molic.diagram.Scene_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SystemProcess_2008 = getElementType("br.puc.molic.diagram.SystemProcess_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Monologue_2009 = getElementType("br.puc.molic.diagram.Monologue_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UbiquitousAccess_2010 = getElementType("br.puc.molic.diagram.UbiquitousAccess_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OpeningPoint_2011 = getElementType("br.puc.molic.diagram.OpeningPoint_2011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClosingPoint_2012 = getElementType("br.puc.molic.diagram.ClosingPoint_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Utterance_4001 = getElementType("br.puc.molic.diagram.Utterance_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BRTUtterance_4002 = getElementType("br.puc.molic.diagram.BRTUtterance_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(Scene_2007);
			KNOWN_ELEMENT_TYPES.add(SystemProcess_2008);
			KNOWN_ELEMENT_TYPES.add(Monologue_2009);
			KNOWN_ELEMENT_TYPES.add(UbiquitousAccess_2010);
			KNOWN_ELEMENT_TYPES.add(OpeningPoint_2011);
			KNOWN_ELEMENT_TYPES.add(ClosingPoint_2012);
			KNOWN_ELEMENT_TYPES.add(Utterance_4001);
			KNOWN_ELEMENT_TYPES.add(BRTUtterance_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}
}
