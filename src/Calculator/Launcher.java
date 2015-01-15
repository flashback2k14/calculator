package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Launcher {
	
	public static void main(String[] args) {
		
		Controller c = new Controller();
		View v = new View();
		
		JFrame frame = new JFrame();
		JButton button1 = new JButton("Light/Dark");
		JButton button2 = new JButton("About");
		JPanel tastenfeld = new JPanel();
		JTextField anzeigeFeld = new JTextField(30);
		
		GridLayout grid = new GridLayout(4,4);
		tastenfeld.setLayout(grid);
		
		String[] labelBezeichnung = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "=", "0", "Reset", "/"};
		JButton[] but = new JButton[labelBezeichnung.length];
		
		for (int i = 0; i < labelBezeichnung.length; i++) {
			
			but[i] = new JButton(labelBezeichnung[i]);
			but[i].addActionListener(c);
			but[i].setActionCommand(labelBezeichnung[i]);
			tastenfeld.add(but[i]);
			
		}
		
		//Create Panels
		v.init();
		
		frame.add(v.panel2, BorderLayout.NORTH);
		frame.add(v.panel1, BorderLayout.SOUTH);
		frame.add(tastenfeld, BorderLayout.CENTER);
		
		v.panel1.add(button1);
		v.panel1.add(button2);
		
		button2.addActionListener(c);
		button2.setActionCommand("about");
		button1.addActionListener(c);
		button1.setActionCommand("theme");
		
		v.panel2.add(anzeigeFeld);
		
		frame.setTitle("Calculator");
		frame.setSize(800, 600);
		frame.setVisible(true);

	}

}
