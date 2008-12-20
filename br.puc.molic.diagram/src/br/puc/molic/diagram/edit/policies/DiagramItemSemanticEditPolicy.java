/*
 * Teste de nota de copyright do Molic
 */
package br.puc.molic.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import br.puc.molic.MolicPackage;
import br.puc.molic.diagram.edit.commands.ClosingPointCreateCommand;
import br.puc.molic.diagram.edit.commands.MonologueCreateCommand;
import br.puc.molic.diagram.edit.commands.OpeningPointCreateCommand;
import br.puc.molic.diagram.edit.commands.SceneCreateCommand;
import br.puc.molic.diagram.edit.commands.SystemProcessCreateCommand;
import br.puc.molic.diagram.edit.commands.UbiquitousAccessCreateCommand;
import br.puc.molic.diagram.part.MetaModelFacility;
import br.puc.molic.diagram.providers.MolicElementTypes;

/**
 * @generated
 */
public class DiagramItemSemanticEditPolicy extends
		MolicBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MolicElementTypes.Scene_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(MolicPackage.eINSTANCE
						.getDiagram_Elements());
			}
			return getGEFWrapper(new SceneCreateCommand(req));
		}
		if (MolicElementTypes.SystemProcess_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(MolicPackage.eINSTANCE
						.getDiagram_Elements());
			}
			return getGEFWrapper(new SystemProcessCreateCommand(req));
		}
		if (MolicElementTypes.Monologue_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(MolicPackage.eINSTANCE
						.getDiagram_Elements());
			}
			return getGEFWrapper(new MonologueCreateCommand(req));
		}
		if (MolicElementTypes.UbiquitousAccess_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(MolicPackage.eINSTANCE
						.getDiagram_Elements());
			}
			return getGEFWrapper(new UbiquitousAccessCreateCommand(req));
		}
		if (MolicElementTypes.OpeningPoint_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(MolicPackage.eINSTANCE
						.getDiagram_Elements());
			}
			return getGEFWrapper(new OpeningPointCreateCommand(req));
		}
		if (MolicElementTypes.ClosingPoint_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(MolicPackage.eINSTANCE
						.getDiagram_Elements());
			}
			return getGEFWrapper(new ClosingPointCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
