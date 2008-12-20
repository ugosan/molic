package br.puc.molic.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import br.puc.molic.MolicPackage;
import br.puc.molic.diagram.part.MetaModelFacility;

/**
 * @generated
 */
public class MonologueCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public MonologueCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return MolicPackage.eINSTANCE.getDiagram();
	}
}
