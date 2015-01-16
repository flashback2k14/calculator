package Calculator;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
	/**
	 * Attribute
	 */
	private Model model;

	/**
	 * Gtter / Setter
	 */
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	/**
	 * Init About Fenster
	 */
	public void initialise() {
		/**
		 * UI Elemente
		 */
		JLabel aboutText = new JLabel("CS13DR1");
		add(aboutText);
		JLabel btnCounter = new JLabel();
		btnCounter.setText("Button Counter: " + getModel().getCounter());
		add(btnCounter);
		/**
		 * Frame Settings
		 */
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setSize(300, 300);
		setTitle("About Calculator");
		setLocationByPlatform(true);
		//setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Schließt gesamte Anwendung
		setVisible(true);
	}
}