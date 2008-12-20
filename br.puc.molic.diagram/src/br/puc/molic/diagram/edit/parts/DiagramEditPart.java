package br.puc.molic.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import br.puc.molic.diagram.edit.policies.DiagramCanonicalEditPolicy;
import br.puc.molic.diagram.edit.policies.DiagramItemSemanticEditPolicy;

/**
 * @generated
 */
public class DiagramEditPart extends
		org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart {

	/**
	 * @generated
	 */
	public static final String MODEL_ID = "Molic"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public DiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DiagramCanonicalEditPolicy());
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}
}
