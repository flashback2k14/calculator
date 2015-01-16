package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	
	public View view;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		//About Window
		if (e.getActionCommand().equals("about")) {
			About about = new About();
			about.initialise();
		
		//Theme Dark/Light	
		} else if (e.getActionCommand().equals("theme")) {
			this.view.changeTheme();
			
			// Click Counter
		} else if (e.getActionCommand().equals("count")) {
			
		}
				
	}

}
