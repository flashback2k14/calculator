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
		
		JFrame frame = new JFrame();
		JButton button1 = new JButton("Light/Dark");
		JButton button2 = new JButton("About");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel tastenfeld = new JPanel();
		JTextField anzeigeFeld = new JTextField(30);
		
		JButton but1 = new JButton("1");
		JButton but2 = new JButton("2");
		JButton but3 = new JButton("3");
		JButton but4 = new JButton("4");
		JButton but5 = new JButton("5");
		JButton but6 = new JButton("6");
		JButton but7 = new JButton("7");
		JButton but8 = new JButton("8");
		JButton but9 = new JButton("9");
		JButton but0 = new JButton("0");
		JButton butresult = new JButton("=");
		JButton butadd = new JButton("+");
		JButton butsub = new JButton("-");
		JButton butmul = new JButton("*");
		JButton butdiv = new JButton("/");
		JButton butreset = new JButton("Reset");
		
		GridLayout grid = new GridLayout(4,4);
		tastenfeld.setLayout(grid);
		
		frame.add(panel2, BorderLayout.NORTH);
		frame.add(panel1, BorderLayout.SOUTH);
		frame.add(tastenfeld, BorderLayout.CENTER);
		
		panel1.setBackground(Color.RED);
		panel1.add(button1);
		panel1.add(button2);
		
		button2.addActionListener(c);
		button2.setActionCommand("about");
		
		panel2.setBackground(Color.YELLOW);
		panel2.add(anzeigeFeld);
		
		tastenfeld.add(but1);
		tastenfeld.add(but2);
		tastenfeld.add(but3);
		tastenfeld.add(butadd);
		tastenfeld.add(but4);
		tastenfeld.add(but5);
		tastenfeld.add(but6);
		tastenfeld.add(butsub);
		tastenfeld.add(but7);
		tastenfeld.add(but8);
		tastenfeld.add(but9);
		tastenfeld.add(butmul);
		tastenfeld.add(but0);
		tastenfeld.add(butresult);
		tastenfeld.add(butdiv);
		tastenfeld.add(butreset);
		
		frame.setTitle("Calculator");
		frame.setSize(800, 600);
		frame.setVisible(true);

	}

}
