package Calculator;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
	/**
	 * Attribute
	 */
	private CounterModel counterModel;

	/**
	 * Getter / Setter
	 */
	public CounterModel getCounterModel() {
		return this.counterModel;
	}

	public void setCounterModel(CounterModel counterModel) {
		this.counterModel = counterModel;
	}

	/**
	 * Init About Fenster
	 */
	public void initialise() {
		/**
		 * UI Elemente
		 */
		JLabel aboutText = new JLabel("Created / Idea by CS13DR1");
		add(aboutText);

		JLabel aboutText2 = new JLabel("Forked by flashback2k14");
		add(aboutText2);

		JLabel btnCounter = new JLabel();
		btnCounter.setText("Button Counter: " + getCounterModel().getCounter());
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