package Calculator;

import java.awt.Color;

import javax.swing.JPanel;

public class View {

	JPanel panel1;
	JPanel panel2;
	int id = 0;
	
	public void init() {
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.YELLOW);
		
		id = 0;
	}
	
	public void changeTheme() {
		
		if (id == 0) {
			panel1.setBackground(Color.BLUE);
			panel2.setBackground(Color.GREEN);
			panel1.repaint();
			panel2.repaint();
		} else {
			panel1.setBackground(Color.RED);
			panel2.setBackground(Color.YELLOW);
			panel1.repaint();
			panel2.repaint();
			id = 1;
		}
	}
}
