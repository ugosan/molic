package br.puc.molic.rcp;

import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.internal.ide.model.WorkbenchAdapterBuilder;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "br.puc.molic.rcp.perspective";

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		return new ApplicationWorkbenchWindowAdvisor(configurer);
	}

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}

    public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);		
		configurer.setSaveAndRestore(true);
	}

	public void preStartup() {
		// navigator view needs this
		WorkbenchAdapterBuilder.registerAdapters();
	}
	
}
