package br.puc.molic.tests;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tracker;

public class Snippet23 {

	static boolean down = false;

	
  public static void main(String[] args) {
    Display display = new Display();
    final Shell shell = new Shell(display);
    shell.setSize(200, 200);
    shell.open();
    final GC gc = new GC(shell);

    shell.addListener(SWT.MouseDown, new Listener() {
      public void handleEvent(Event e) {     
	      Snippet23.down = true;
      }
    });
    
    shell.addListener(SWT.MouseMove, new Listener() {
        public void handleEvent(Event e) {	     
  	      if(Snippet23.down){
  	    	//System.out.println(e.x+"."+e.y);
  	    	gc.drawPoint(e.x, e.y);
  	      }  	      	
        }
      });
    
    shell.addListener(SWT.MouseUp, new Listener() {
        public void handleEvent(Event e) {
  	      Snippet23.down = false;
        }
      });
    
    
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch())
        display.sleep();
      	
    }
    display.dispose();
  }
}