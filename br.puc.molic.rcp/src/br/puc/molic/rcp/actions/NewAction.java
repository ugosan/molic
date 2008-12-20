package br.puc.molic.rcp.actions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.action.Action;

import br.puc.molic.MolicPackage;
import br.puc.molic.diagram.part.MolicDiagramEditorUtil;
import br.puc.molic.rcp.file.FileManager;



public class NewAction extends Action {


	public NewAction() {
		super("New Diagram");	
		//super("New Diagram", RoxUIPlugin.getImageDescriptor("/icons/planta.gif"));	
		
	}

	public void run() {

		try{


			IProject projeto = ResourcesPlugin.getWorkspace().getRoot().getProject("sys");
			if (!projeto.exists()) {
				projeto.create(new NullProgressMonitor());
			}
			projeto.open(new NullProgressMonitor());

			//URI uri = projeto.getLocationURI();

			IFolder pasta  = FileManager.getInstance().createFolderTimestamp();
						
			IFile f = pasta.getFile("default.molic_diagram");
			
			
			
			//MolicDiagramFileCreator.getInstance().createNewFile(pasta.getFullPath(), f.getName(), f.getContents(), PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), null);
			
			
			//MolicDiagramEditorUtil.createDiagram(f.MolicDiagramFileCreator.getInstance(), pasta.getFullPath(), f.getName(),f.getContents(), DiagramEditPart.MODEL_ID, PlatformUI.getWorkbench().getActiveWorkbenchWindow(), new NullProgressMonitor(),true, false);
			
			MolicDiagramEditorUtil.openDiagram(this.createModelFile(f));
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

	public Resource createModelFile(IFile modelFile) throws Exception{

	
		ResourceSet resourceSet = new ResourceSetImpl();

		// Get the URI of the model file.
		//
		org.eclipse.emf.common.util.URI fileURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(modelFile.getFullPath().toString());

		// Create a resource for this file.
		//
		Resource resource = resourceSet.createResource(fileURI);

		// Add the initial model object to the contents.
		//

		EClass eClass = (EClass) MolicPackage.eINSTANCE.getEClassifier("Diagram");
		EObject rootObject = MolicPackage.eINSTANCE.getMolicFactory().create(eClass);

		if (rootObject != null) {
			resource.getContents().add(rootObject);
		}

		// Save the contents of the resource to the file system.
		//
		Map options = new HashMap();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		resource.save(options);

		MolicDiagramEditorUtil.createDiagram(fileURI,new NullProgressMonitor());
		
		return resource;
	}

}