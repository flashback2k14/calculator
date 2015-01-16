package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	/**
	 * Attribute
	 */
	private View view;
	private Model model;

	/**
	 * Getter / Setter
	 */
	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	/**
	 * Counter Methode
	 */
	private void incCounter(){
		getModel().setCounter(getModel().getCounter() + 1);
	}

	/**
	 * Button Events
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
			case Constants.ABOUT:
				/**
				 * Erhöhe Button Counter um 1
				 */
				incCounter();
				/**
				 * init About Fenster + übergebe Model
				 */
				About a = new About();
				a.setModel(getModel());
				a.initialise();
				/**
				 * Zeige Counter in MainFrame an
				 */
				getView().setCounterToAnzeigeFeld();
				break;

			case Constants.THEME:
				/**
				 * Erhöhe Button Counter um 1
				 */
				incCounter();
				/**
				 * Wechsel Panel Theme
				 */
				getView().changeTheme();
				/**
				 * Zeige Counter in MainFrame an
				 */
				getView().setCounterToAnzeigeFeld();
				break;

			default:
				break;
		}
	}
}