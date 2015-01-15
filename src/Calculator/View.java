package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {

	JPanel panel1;
	JPanel panel2;
	
	int id = 0;
	
	public void init() {
		
		Controller c = new Controller();
		
		JFrame frame = new JFrame();
		JButton button1 = new JButton("Light/Dark");
		JButton button2 = new JButton("About");
		JPanel tastenfeld = new JPanel();
		JTextField anzeigeFeld = new JTextField(30);
		
		GridLayout grid = new GridLayout(4,4);
		tastenfeld.setLayout(grid);
		
		// Create Buttons
		String[] labelBezeichnung = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "=", "0", "Reset", "/"};
		JButton[] but = new JButton[labelBezeichnung.length];
		
		for (int i = 0; i < labelBezeichnung.length; i++) {
			
			but[i] = new JButton(labelBezeichnung[i]);
			but[i].addActionListener(c);
			but[i].setActionCommand(labelBezeichnung[i]);
			tastenfeld.add(but[i]);
		}
		
		// Button Action
		button1.addActionListener(c);
		button1.setActionCommand("theme");
		button2.addActionListener(c);
		button2.setActionCommand("about");
		
		// Create Panels
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.YELLOW);
		id = 0;
		
		// Add Buttons/TextField to Panels
		panel1.add(button1);
		panel1.add(button2);
		panel2.add(anzeigeFeld);
		
		// Add Items to Frame
		frame.add(panel2, BorderLayout.NORTH);
		frame.add(panel1, BorderLayout.SOUTH);
		frame.add(tastenfeld, BorderLayout.CENTER);
		
		// Create Frame
		frame.setTitle("Calculator");
		frame.setSize(800, 600);
		frame.setVisible(true);
		
	}
	
	public void changeTheme() {
		
		if (id == 0) {
			panel1.setBackground(Color.BLUE);
			panel2.setBackground(Color.GREEN);
			panel1.repaint();
			panel2.repaint();
			id = 1;
		} else {
			panel1.setBackground(Color.RED);
			panel2.setBackground(Color.YELLOW);
			panel1.repaint();
			panel2.repaint();
			id = 0;			
		}
	}
}
