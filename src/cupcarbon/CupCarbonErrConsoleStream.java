package cupcarbon;
import java.io.IOException;
import java.io.OutputStream;

import javafx.application.Platform;
import javafx.scene.control.TextArea;

public class CupCarbonErrConsoleStream extends OutputStream {
    
	private TextArea textArea ;
<<<<<<< HEAD
	private int x = 0;
	
	public CupCarbonErrConsoleStream(TextArea textArea) {
		this.textArea = textArea;
	}
	
    @Override
    public void write(int v) throws IOException {
    	Platform.runLater( () -> {
			if(v=='\n') {
				if(x++ > 100) {
    				x=0;
    				textArea.clear();
    			}
			}
			CupCarbon.cupCarbonController.stopSimulation();
			textArea.appendText(String.valueOf((char) v));
		}
	);
    	
=======
	
	public CupCarbonErrConsoleStream(TextArea textArea) {
		this.textArea = textArea;
	}
	
    @Override
    public void write(int v) throws IOException {
    	Platform.runLater( () -> { 
    			CupCarbon.cupCarbonController.stopSimulation();
    			textArea.appendText(String.valueOf((char) v));
    		}
    	);
>>>>>>> branch 'master' of https://github.com/bounceur/CupCarbon.git
    	//Platform.runLater(new Runnable() {
			//@Override
			//public void run() {				
//				CupCarbon.cupCarbonController.stopSimulation();
			//	CupCarbon.cupCarbonController.displayShortErrMessage("ERROR!");
//				textArea.appendText(String.valueOf((char) v));
			//}
    	//});
    }

}