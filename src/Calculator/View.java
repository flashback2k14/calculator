package Calculator;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
	/**
	 * Attribute
	 */
	private JPanel panel1;
	private JPanel panel2;
	private JTextField anzeigeFeld;
	private JLabel lblBtnCounter;
	//
	private int id = 0;
	//
	private Controller controller;
	private CounterModel counterModel;

	/**
	 * Getter / Setter
	 */
	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public CounterModel getCounterModel() {
		return this.counterModel;
	}

	public void setCounterModel(CounterModel counterModel) {
		this.counterModel = counterModel;
	}

	/**
	 * Erstelle das Fenster
	 */
	public void init() {
		JButton button1 = new JButton("Light/Dark");
		JButton button2 = new JButton("About");
		JButton button3 = new JButton("Verlauf");
		JPanel tastenfeld = new JPanel();
		//
		anzeigeFeld = new JTextField(30);
		anzeigeFeld.setFocusable(false);
		anzeigeFeld.setForeground(Color.BLACK);
		//
		lblBtnCounter = new JLabel("Button Counter: 0");
		lblBtnCounter.setForeground(Color.WHITE);
		//
		GridLayout grid = new GridLayout(4,4,5,5);
		tastenfeld.setLayout(grid);
		
		// Create Buttons
		JButton[] but = new JButton[Constants.KEYS.length];
		
		for (int i = 0; i < Constants.KEYS.length; i++) {
			
			but[i] = new JButton(Constants.KEYS[i]);
			but[i].addActionListener(getController());
			but[i].setActionCommand(Constants.KEYS[i]);
			tastenfeld.add(but[i]);
		}
		
		// Button Action
		button1.addActionListener(getController());
		button1.setActionCommand(Constants.THEME);

		button2.addActionListener(getController());
		button2.setActionCommand(Constants.ABOUT);

		button3.addActionListener(getController());
		button3.setActionCommand(Constants.VERLAUF);

		// Create Panels
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.YELLOW);

		// Add Buttons/TextField to Panels
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(lblBtnCounter);
		panel2.add(anzeigeFeld);
		
		// Add Items to Frame
		add(panel2, BorderLayout.NORTH);
		add(panel1, BorderLayout.SOUTH);
		add(tastenfeld, BorderLayout.CENTER);
		
		// Create Frame
		setTitle("Calculator");
		setSize(450, 400);
		setLocationByPlatform(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Update UI
	 */
	public void addPressedButtonToTextfeld(String input) {
		String tmp = anzeigeFeld.getText();
		String tmp2 = tmp + input;
		anzeigeFeld.setText(tmp2);
	}

	public void clearTextfield() {
		anzeigeFeld.setText("");
	}

	public String getTextfield() {
		return anzeigeFeld.getText();
	}

	public void setTextfield(String ergebnis) {
		anzeigeFeld.setText(ergebnis);
	}

	/**
	 * Wechsel die Farben von Panel 1 & 2
	 */
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

	/**
	 * Zeige Counter im Textfeld
	 */
	public void setCounterToAnzeigeFeld() {
		lblBtnCounter.setText("Button Counter: " + getCounterModel().getCounter());
		repaint();
	}
}