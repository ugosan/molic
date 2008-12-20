/*
 * Teste de nota de copyright do Molic
 */
package br.puc.molic.diagram.application;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import br.puc.molic.diagram.part.Messages;

/**
 * @generated
 */
public class DiagramEditorWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	/**
	 * @generated
	 */
	public DiagramEditorWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	/**
	 * @generated
	 */
	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new DiagramEditorActionBarAdvisor(configurer);
	}

	/**
	 * @generated
	 */
	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(1000, 700));
		configurer.setTitle(Messages.DiagramEditorWorkbenchWindowAdvisor_Title);
	}

	/**
	 * @generated NOT
	 */
	public void postWindowCreate() {
		IContributionItem[] mItems, mSubItems;
		IMenuManager mm = getWindowConfigurer().getActionBarConfigurer()
				.getMenuManager();
		mItems = mm.getItems();
		for (int i = 0; i < mItems.length; i++) {
			if (mItems[i] instanceof MenuManager) {
				mSubItems = ((MenuManager) mItems[i]).getItems();
				for (int j = 0; j < mSubItems.length; j++) {
					if (mItems[i].getId().equals("file"))
						((MenuManager) mItems[i])
								.remove("org.eclipse.ui.openLocalFile");
					/*else if (mItems[i].getId().equals("help")) {
						((MenuManager) mItems[i]).remove("group.updates");
						((MenuManager) mItems[i])
								.remove("org.eclipse.update.ui.updateMenu");
						((MenuManager) mItems[i])
								.remove("org.eclipse.ui.actions.showKeyAssistHandler");
					}*/
				}
			}
		}
	}

}
