/*
 * Teste de nota de copyright do Molic
 */
package br.puc.molic.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.SharedCursors;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.CreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.swt.graphics.Cursor;

import br.puc.molic.diagram.providers.MolicElementTypes;

/**
 * @generated
 */
public class MolicPaletteFactory {

	/**
	 * @generated 
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated 
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Default1Group_title);
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(createScene1CreationTool());
		paletteContainer.add(createOpeningPoint2CreationTool());
		paletteContainer.add(createClosingPoint3CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createSystemProcess5CreationTool());
		paletteContainer.add(createMonologue6CreationTool());
		paletteContainer.add(createUbiquitousAccess7CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createUtterance9CreationTool());
		paletteContainer.add(createBreakdown10CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScene1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MolicElementTypes.Scene_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Scene1CreationTool_title,
				Messages.Scene1CreationTool_desc, types);
		entry.setSmallIcon(MolicDiagramEditorPlugin
				.findImageDescriptor("/br.puc.molic/icons/scene_small.png")); //$NON-NLS-1$
		entry.setLargeIcon(MolicDiagramEditorPlugin
				.findImageDescriptor("/br.puc.molic/icons/scene_big.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated 
	 */
	private ToolEntry createOpeningPoint2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MolicElementTypes.OpeningPoint_2011);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OpeningPoint2CreationTool_title,
				Messages.OpeningPoint2CreationTool_desc, types);
		entry
				.setSmallIcon(MolicDiagramEditorPlugin
						.findImageDescriptor("/br.puc.molic/icons/openingpoint_small.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(MolicDiagramEditorPlugin
						.findImageDescriptor("/br.puc.molic/icons/openingpoint_big.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClosingPoint3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MolicElementTypes.ClosingPoint_2012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ClosingPoint3CreationTool_title,
				Messages.ClosingPoint3CreationTool_desc, types);
		entry
				.setSmallIcon(MolicDiagramEditorPlugin
						.findImageDescriptor("/br.puc.molic/icons/closingpoint_small.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(MolicDiagramEditorPlugin
						.findImageDescriptor("/br.puc.molic/icons/closingpoint_big.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSystemProcess5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MolicElementTypes.SystemProcess_2008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SystemProcess5CreationTool_title,
				Messages.SystemProcess5CreationTool_desc, types);
		entry
				.setSmallIcon(MolicDiagramEditorPlugin
						.findImageDescriptor("/br.puc.molic/icons/systemprocess_small.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(MolicDiagramEditorPlugin
						.findImageDescriptor("/br.puc.molic/icons/systemprocess_big.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMonologue6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MolicElementTypes.Monologue_2009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Monologue6CreationTool_title,
				Messages.Monologue6CreationTool_desc, types);
		entry
				.setSmallIcon(MolicDiagramEditorPlugin
						.findImageDescriptor("/br.puc.molic/icons/monologue_small.png")); //$NON-NLS-1$
		entry.setLargeIcon(MolicDiagramEditorPlugin
				.findImageDescriptor("/br.puc.molic/icons/monologue_big.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUbiquitousAccess7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MolicElementTypes.UbiquitousAccess_2010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.UbiquitousAccess7CreationTool_title,
				Messages.UbiquitousAccess7CreationTool_desc, types);
		entry
				.setSmallIcon(MolicDiagramEditorPlugin
						.findImageDescriptor("/br.puc.molic/icons/ubiquitous_small.png")); //$NON-NLS-1$
		entry.setLargeIcon(MolicDiagramEditorPlugin
				.findImageDescriptor("/br.puc.molic/icons/ubiquitous_big.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUtterance9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MolicElementTypes.Utterance_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Utterance9CreationTool_title,
				Messages.Utterance9CreationTool_desc, types);
		entry
				.setSmallIcon(MolicDiagramEditorPlugin
						.findImageDescriptor("/br.puc.molic/icons/utterance_small.png")); //$NON-NLS-1$
		entry.setLargeIcon(MolicDiagramEditorPlugin
				.findImageDescriptor("/br.puc.molic/icons/utterance_big.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBreakdown10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MolicElementTypes.BRTUtterance_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Breakdown10CreationTool_title,
				Messages.Breakdown10CreationTool_desc, types);
		entry
				.setSmallIcon(MolicDiagramEditorPlugin
						.findImageDescriptor("/br.puc.molic/icons/utterance_small.png")); //$NON-NLS-1$
		entry.setLargeIcon(MolicDiagramEditorPlugin
				.findImageDescriptor("/br.puc.molic/icons/utterance_big.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
