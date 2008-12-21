/*
 * Teste de nota de copyright do Molic
 */
package br.puc.molic.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import br.puc.molic.diagram.edit.policies.SceneItemSemanticEditPolicy;
import br.puc.molic.diagram.part.MolicVisualIDRegistry;

/**
 * @generated
 */
public class SceneEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public SceneEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SceneItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		SceneFigure figure = new SceneFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public SceneFigure getPrimaryShape() {
		return (SceneFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SceneNameEditPart) {
			((SceneNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureSceneNameFigure());
			return true;
		}
		if (childEditPart instanceof SceneDialogueEditPart) {
			((SceneDialogueEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureDialogueFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(150), getMapMode().DPtoLP(100));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model so
	 * you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane. Respects
	 * layout one may have set for generated figure.
	 * 
	 * @param nodeShape
	 *            instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(MolicVisualIDRegistry
				.getType(SceneNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class SceneFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSceneNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDialogueFigure;

		/**
		 * @generated
		 */
		public SceneFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(150),
					getMapMode().DPtoLP(100)));
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureSceneNameFigure = new WrapLabel();
			fFigureSceneNameFigure.setText("<...>");

			GridData constraintFFigureSceneNameFigure = new GridData();
			constraintFFigureSceneNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureSceneNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureSceneNameFigure.horizontalIndent = 0;
			constraintFFigureSceneNameFigure.horizontalSpan = 1;
			constraintFFigureSceneNameFigure.verticalSpan = 1;
			constraintFFigureSceneNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureSceneNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureSceneNameFigure, constraintFFigureSceneNameFigure);

			fFigureDialogueFigure = new WrapLabel();
			fFigureDialogueFigure.setText("Click to edit...");
			fFigureDialogueFigure.setTextWrap(true);

			GridData constraintFFigureDialogueFigure = new GridData();
			constraintFFigureDialogueFigure.verticalAlignment = GridData.FILL;
			constraintFFigureDialogueFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureDialogueFigure.horizontalIndent = 0;
			constraintFFigureDialogueFigure.horizontalSpan = 1;
			constraintFFigureDialogueFigure.verticalSpan = 1;
			constraintFFigureDialogueFigure.grabExcessHorizontalSpace = true;
			constraintFFigureDialogueFigure.grabExcessVerticalSpace = true;
			this.add(fFigureDialogueFigure, constraintFFigureDialogueFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSceneNameFigure() {
			return fFigureSceneNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDialogueFigure() {
			return fFigureDialogueFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURESCENENAMEFIGURE_FONT = new Font(Display
			.getCurrent(), "sans", 10, SWT.NORMAL);

}
