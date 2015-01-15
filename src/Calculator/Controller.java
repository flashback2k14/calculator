package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		//About Window
		if (e.getActionCommand().equals("about")) {
			About about = new About();
			about.initialise();
		
		//Theme Dark/Light	
		} else if (e.getActionCommand().equals("theme")) {
			View view = new View();
			view.changeTheme();
			
		}
		
	}

}
