package br.puc.molic.rcp.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;

import br.puc.molic.rcp.Activator;
import br.puc.molic.rcp.file.FileManager;


public class OpenAction extends Action{

	final IWorkbench workbench = Activator.getDefault().getWorkbench();

	
	public OpenAction(){
		//super("Open", RoxUIPlugin.getImageDescriptor("/icons/abrir_planta.png"));
		super("Open");
	}
	

	public void run(){
		
		final Shell shell = workbench.getActiveWorkbenchWindow().getShell();
		FileDialog dialog = new FileDialog(shell, SWT.OPEN);
		dialog.setFilterNames(new String[] { "Molic"});
		dialog.setFilterExtensions(new String[] { "*"+FileManager.getInstance().EXTENSION});
		String caminho = dialog.open();

		if(!FileManager.getInstance().isOpen(caminho) && caminho != null){

			try{

				FileManager.getInstance().openFile(caminho);


				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		
		
	}
	
	
	
	
}