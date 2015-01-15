package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		About about = new About();
		
		if (e.getActionCommand().equals("about")) {
			about.initialise();
		}
		
	}

}
