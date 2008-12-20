package br.puc.molic.rcp.file;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * This class provides a facade for the "save" FileDialog class. If the selected
 * file already exists, the user is asked to confirm before overwriting.
 */
public class OpenDialog {
	// The wrapped FileDialog
	private FileDialog dlg;

	/**
	 * SafeSaveDialog constructor
	 * 
	 * @param shell
	 *            the parent shell
	 */
	public OpenDialog(Shell shell) {
		
		dlg = new FileDialog(shell, SWT.OPEN);
		
	}

	public String open() {
		
		return dlg.open();
	}

	public String getFileName() {
		return dlg.getFileName();
	}

	public String[] getFileNames() {
		return dlg.getFileNames();
	}

	public String[] getFilterExtensions() {
		return dlg.getFilterExtensions();
	}

	public String[] getFilterNames() {
		return dlg.getFilterNames();
	}

	public String getFilterPath() {
		return dlg.getFilterPath();
	}

	public void setFileName(String string) {
		dlg.setFileName(string);
	}

	public void setFilterExtensions(String[] extensions) {
		dlg.setFilterExtensions(extensions);
	}

	public void setFilterNames(String[] names) {
		dlg.setFilterNames(names);
	}

	public void setFilterPath(String string) {
		dlg.setFilterPath(string);
	}

	public Shell getParent() {
		return dlg.getParent();
	}

	public int getStyle() {
		return dlg.getStyle();
	}

	public String getText() {
		return dlg.getText();
	}

	public void setText(String string) {
		dlg.setText(string);
	}
}
