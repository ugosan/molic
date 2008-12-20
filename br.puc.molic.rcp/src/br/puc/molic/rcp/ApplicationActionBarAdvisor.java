package br.puc.molic.rcp;

import org.eclipse.core.runtime.IExtension;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.registry.ActionSetRegistry;
import org.eclipse.ui.internal.registry.IActionSetDescriptor;

import br.puc.molic.rcp.actions.NewAction;
import br.puc.molic.rcp.actions.OpenAction;










/**
 * An action bar advisor is responsible for creating, adding, and disposing of
 * the actions added to a workbench window. Each window will be populated with
 * new actions.
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	// Actions - important to allocate these only in makeActions, and then use
	// them
	// in the fill methods. This ensures that the actions aren't recreated
	// when fillActionBars is called with FILL_PROXY.
	private IWorkbenchAction exitAction;
	
	private IAction saveAction;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
		this.adjustOutsideActions();
	}

	private void adjustOutsideActions() {
		String[] actionSetIds = {
				"org.eclipse.ui.edit.text.actionSet.navigation",
				"org.eclipse.ui.edit.text.actionSet.convertLineDelimitersTo",
				"org.eclipse.ui.edit.text.actionSet.openExternalFile",
				"org.eclipse.ui.WorkingSetActionSet",
				"org.eclipse.ui.edit.text.actionSet.annotationNavigation",
				"org.eclipse.update.ui.softwareUpdates"
		};
		ActionSetRegistry reg = WorkbenchPlugin.getDefault().getActionSetRegistry();
		IActionSetDescriptor[] actionSets = reg.getActionSets();
		for (int i = actionSets.length - 1; i >= 0; i--) {
			for (int j = 0; j < actionSetIds.length; j++) {
				if (actionSets[i].getId().equals(actionSetIds[j])) {
					IExtension ext = actionSets[i].getConfigurationElement().getDeclaringExtension();
					reg.removeExtension(ext, new Object[] { actionSets[i] });
				}
			}
		}
	} 

	protected void makeActions(final IWorkbenchWindow window) {
		// Creates the actions and registers them.
		// Registering is needed to ensure that key bindings work.
		// The corresponding commands keybindings are defined in the plugin.xml
		// file.
		// Registering also provides automatic disposal of the actions when
		// the window is closed.

		exitAction = ActionFactory.QUIT.create(window);
		register(exitAction);
		
		saveAction = ActionFactory.SAVE.create(window);
	}

	protected void fillMenuBar(IMenuManager menuBar) {
		//MenuManager fileMenu2 = new MenuManager("File", IWorkbenchActionConstants.M_FILE);
		//menuBar.add(fileMenu2);
		
		
		MenuManager fileMenu = new MenuManager("&File");
		
		OpenAction open = new OpenAction();
		NewAction newAction = new NewAction();
		
		
		menuBar.add(fileMenu);
		//fileMenu.add();
		fileMenu.add(newAction);
		fileMenu.add(open);
		fileMenu.add(saveAction);
		fileMenu.add(exitAction);
	}
	
	@Override
	protected void fillCoolBar(ICoolBarManager coolBar) {
		IToolBarManager editToolBar = new ToolBarManager(coolBar.getStyle());
		//super.fillCoolBar(coolBar);
		
		editToolBar.add(saveAction);
		coolBar.add(editToolBar);
	}
}
