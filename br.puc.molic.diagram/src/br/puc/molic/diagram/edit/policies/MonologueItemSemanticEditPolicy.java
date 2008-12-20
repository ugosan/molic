/*
 * Teste de nota de copyright do Molic
 */
package br.puc.molic.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

import br.puc.molic.diagram.edit.commands.BRTUtteranceCreateCommand;
import br.puc.molic.diagram.edit.commands.BRTUtteranceReorientCommand;
import br.puc.molic.diagram.edit.commands.UtteranceCreateCommand;
import br.puc.molic.diagram.edit.commands.UtteranceReorientCommand;
import br.puc.molic.diagram.edit.parts.BRTUtteranceEditPart;
import br.puc.molic.diagram.edit.parts.UtteranceEditPart;
import br.puc.molic.diagram.providers.MolicElementTypes;

/**
 * @generated
 */
public class MonologueItemSemanticEditPolicy extends
		MolicBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MolicElementTypes.Utterance_4001 == req.getElementType()) {
			return getGEFWrapper(new UtteranceCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MolicElementTypes.BRTUtterance_4002 == req.getElementType()) {
			return getGEFWrapper(new BRTUtteranceCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (MolicElementTypes.Utterance_4001 == req.getElementType()) {
			return getGEFWrapper(new UtteranceCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (MolicElementTypes.BRTUtterance_4002 == req.getElementType()) {
			return getGEFWrapper(new BRTUtteranceCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case UtteranceEditPart.VISUAL_ID:
			return getGEFWrapper(new UtteranceReorientCommand(req));
		case BRTUtteranceEditPart.VISUAL_ID:
			return getGEFWrapper(new BRTUtteranceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
