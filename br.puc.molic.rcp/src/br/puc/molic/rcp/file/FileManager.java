package br.puc.molic.rcp.file;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;


public class FileManager  {

	//HashMap para armazenar o link de um arquivo Interno X Externo	
	private HashMap<IFile,File> files = new HashMap<IFile,File>(); 
	
	
	private static FileManager instance;

	public static String EXTENSION = ".molic_diagram";
	
	public static FileManager getInstance() {
		if (instance == null) {
			instance = new FileManager();			
		}
		return instance;
	}

	private FileManager(){
		
		IProject projeto = ResourcesPlugin.getWorkspace().getRoot().getProject("sys");
		
		try{			
			if(!projeto.exists())
				projeto.create(new NullProgressMonitor());
			
			projeto.open(new NullProgressMonitor());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Código sensacional que escreve de "from" para "to"
	 * 
	 * @param from de onde vem
	 * @param to pra onde vai
	 * @throws Exception 
	 */
	private void write(FileInputStream from, FileOutputStream to) throws Exception{		
		byte[] buf = new byte[1024];
		int len;
		while ((len = from.read(buf)) > 0) {
			to.write(buf, 0, len);
		}
		from.close();
		to.close();		
	}

	public void saveFile(IFile internalFile) throws Exception{

		File externalFile = files.get(internalFile); 

		//save as..
		if (externalFile == null) {
			this.saveAs(internalFile);
						
		}else{
			
			FileInputStream in = (FileInputStream)internalFile.getContents();

			FileOutputStream out = new FileOutputStream(externalFile.getAbsolutePath());

			this.write(in, out);
			
		}

	}
	
	public void saveAs(IFile internalFile)throws Exception{
		SaveDialog s = new SaveDialog(new Shell());

		s.setFileName(internalFile.getName());

		String outFileName = s.open();

		if(outFileName!=null){

			FileInputStream in = (FileInputStream)internalFile.getContents();

			FileOutputStream out = new FileOutputStream(outFileName);

			this.write(in,out);

			File externalFile = new File(outFileName);

			files.put(internalFile, externalFile);

			//fecha o editor atual..
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().closeEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor(), true);

			//	..abre outro com o arquivo externo
			this.openFile(outFileName);
		}
	}
	
	/**
	 * Copia o arquivo externo pra dentro do cache, mas não chama o editor
	 * @param externalFile
	 * @return
	 * @throws Exception
	 */
	public void openFile(String externalFile) throws Exception{
		File f = new File(externalFile);
		
		FileInputStream in = new FileInputStream(f);

		IFolder pasta = this.createFolderTimestamp();
		
		URI uri = pasta.getLocationURI();

		File file = new File(uri.getPath()+File.separator+f.getName());

		file.createNewFile();					
				
		FileOutputStream out = new FileOutputStream(file);
		
		this.write(in, out);
		
		
		files.put(pasta.getFile(f.getName()), f);
		
		openDefaultEditor(pasta.getFile(f.getName()));
		
		this.addRecent(externalFile);
		
	}
	
	public IFolder createFolderTimestamp() throws Exception{
		IProject projeto = ResourcesPlugin.getWorkspace().getRoot().getProject("sys");

		IFolder pasta = projeto.getFolder(""+System.currentTimeMillis());
		
		pasta.create(true, true, new NullProgressMonitor());
		
		return pasta;
	}
	
	
	public Collection getRecent(){
		IProject projeto = ResourcesPlugin.getWorkspace().getRoot().getProject("sys");
		String path = projeto.getFullPath()+File.separator+"recent.xml";
		
		
		IFile f = (IFile) projeto.getFile(path);
		
		if(!f.exists()){
			try{
				f.create(new FileInputStream(path), true, new NullProgressMonitor());
				return new ArrayList();
			}catch(Exception e){}
		}
			
		Properties p = new Properties();
		
		try{			
			p.loadFromXML(new FileInputStream(path));
		}catch(Exception e){						
		}
		
		
		return p.values();		
	}
	
	private void addRecent(String path){
		ArrayList c = new ArrayList(getRecent());
		
		if(c.contains(path)){
			if(c.size()<4){
				c.add(path);
			}else{
				c.add(0, path);
				c.remove(c.size()-1);
			}
		}
		
		Properties p = new Properties();
		for(int i=0;i<c.size();i++){
			p.setProperty((String)c.get(i), (String)c.get(i));
		}
				
		try{		
			//ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path("sys")).getf;
			

			//File file = new File(uri.getPath()+File.separator+f.getName());

			//file.createNewFile();					
					
			//FileOutputStream out = new FileOutputStream(file);
			
			//System.out.println(ResourcesPlugin.getWorkspace().getRoot().getProject("sys").getRawLocation());
			
			FileOutputStream fos = new FileOutputStream(ResourcesPlugin.getWorkspace().getRoot().getProject("sys").getFullPath()+File.separator+"recent.xml");
			p.storeToXML(fos, "Arquivos recentes");
			
		} catch (FileNotFoundException ex) {
			String pathwork = ResourcesPlugin.getWorkspace().getRoot().getProject("sys").getLocation().toOSString();
			File fl = new File(pathwork+File.separator+"recent.xml");
			
			//System.out.println(ResourcesPlugin.getWorkspace().getRoot().getProject("sys").getFullPath());
			//System.out.println(ResourcesPlugin.getWorkspace().getRoot().getProject("sys").getLocation());
			//System.out.println(ResourcesPlugin.getWorkspace().getRoot().getProject("sys").getLocation().toOSString());
			
			try {
				//System.out.println(fl.getCanonicalPath());
				fl.createNewFile();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
	public void openDefaultEditor(IFile f) throws Exception{
		IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();


		FileEditorInput editorInput = new FileEditorInput(f);

		
		workbenchPage.openEditor(editorInput, PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(f.getName()).getId());
	}
	
	
	/**
	 * Limpa o cache
	 * @param internalFile
	 * @throws Exception
	 */
	public void closeFile(IFile internalFile) throws Exception{
		files.remove(internalFile);
		
		internalFile.delete(true, new NullProgressMonitor());
		
		IFolder folder = (IFolder) internalFile.getParent();
		
		folder.delete(true, new NullProgressMonitor());
	}
	
	
	/**
	 * Se o arquivo já estiver aberto, retorna true, evidentemente.
	 * @param path
	 * @return
	 */
	public boolean isOpen(String path){
		Iterator<File> it = files.values().iterator();
		
		while(it.hasNext()){
			File f = it.next();			
			if( f.getAbsolutePath().equals(path)) return true;			
		}
		return false;
	}
	
}