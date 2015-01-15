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
		
		Controller controller = new Controller();
		View view = new View();
		view.controller = controller;
		view.init();

		
		

	}

}
