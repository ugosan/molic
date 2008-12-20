package br.puc.molic.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import br.puc.molic.BRTUtterance;
import br.puc.molic.Diagram;
import br.puc.molic.Element;
import br.puc.molic.diagram.edit.policies.MolicBaseItemSemanticEditPolicy;
import br.puc.molic.diagram.part.MetaModelFacility;

/**
 * @generated
 */
public class BRTUtteranceReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public BRTUtteranceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof BRTUtterance) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Element && newEnd instanceof Element)) {
			return false;
		}
		Element target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Diagram)) {
			return false;
		}
		Diagram container = (Diagram) getLink().eContainer();
		return MolicBaseItemSemanticEditPolicy.LinkConstraints
				.canExistBRTUtterance_4002(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Element && newEnd instanceof Element)) {
			return false;
		}
		Element source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Diagram)) {
			return false;
		}
		Diagram container = (Diagram) getLink().eContainer();
		return MolicBaseItemSemanticEditPolicy.LinkConstraints
				.canExistBRTUtterance_4002(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected BRTUtterance getLink() {
		return (BRTUtterance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Element getOldSource() {
		return (Element) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Element getNewSource() {
		return (Element) newEnd;
	}

	/**
	 * @generated
	 */
	protected Element getOldTarget() {
		return (Element) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Element getNewTarget() {
		return (Element) newEnd;
	}
}
