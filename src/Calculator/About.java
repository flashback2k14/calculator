package Calculator;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class About {

	public void initialise() {
		
		JFrame aboutWindow = new JFrame();
		JLabel aboutText = new JLabel("CS13DR1");
		
		aboutWindow.add(aboutText);
		aboutWindow.setModalExclusionType(null);
		aboutWindow.setSize(100, 100);
		aboutWindow.setTitle("About Calculator");
		
	}
	
	
}
