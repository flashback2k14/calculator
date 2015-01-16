package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	/**
	 * Attribute
	 */
	private View view;
	private CounterModel counterModel;
	private VerlaufModel verlaufModel;
	private Grundrechenarten grundrechenarten;

	/**
	 * Getter / Setter
	 */
	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public CounterModel getCounterModel() {
		return this.counterModel;
	}

	public void setCounterModel(CounterModel counterModel) {
		this.counterModel = counterModel;
	}

	public VerlaufModel getVerlaufModel() {
		return verlaufModel;
	}

	public void setVerlaufModel(VerlaufModel verlaufModel) {
		this.verlaufModel = verlaufModel;
	}

	public Grundrechenarten getGrundrechenarten() {
		return grundrechenarten;
	}

	public void setGrundrechenarten(Grundrechenarten grundrechenarten) {
		this.grundrechenarten = grundrechenarten;
	}

	/**
	 * Button Events
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
			case Constants.ONE:
				ViewHelper.setNumberInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.ONE);
				break;

			case Constants.TWO:
				ViewHelper.setNumberInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.TWO);
				break;

			case Constants.THREE:
				ViewHelper.setNumberInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.THREE);
				break;

			case Constants.FOUR:
				ViewHelper.setNumberInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.FOUR);
				break;

			case Constants.FIVE:
				ViewHelper.setNumberInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.FIVE);
				break;

			case Constants.SIX:
				ViewHelper.setNumberInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.SIX);
				break;

			case Constants.SEVEN:
				ViewHelper.setNumberInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.SEVEN);
				break;

			case Constants.EIGHT:
				ViewHelper.setNumberInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.EIGHT);
				break;

			case Constants.NINE:
				ViewHelper.setNumberInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.NINE);
				break;

			case Constants.ZERO:
				ViewHelper.setNumberInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.ZERO);
				break;

			case Constants.ADD:
				ViewHelper.setOperatorInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.ADD);
				break;

			case Constants.SUB:
				ViewHelper.setOperatorInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.SUB);
				break;

			case Constants.MUL:
				ViewHelper.setOperatorInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.MUL);
				break;

			case Constants.DIV:
				ViewHelper.setOperatorInput(getCounterModel(), getGrundrechenarten(), getView(), Constants.DIV);
				break;

			case Constants.EQUAL:
				ViewHelper.setEqualInput(getCounterModel(), getGrundrechenarten(), getView());
				break;

			case Constants.RESET:
				ViewHelper.setResetInput(getCounterModel(), getVerlaufModel(), getGrundrechenarten(), getView(), Constants.RESET);
				break;

			case Constants.ABOUT:
				/**
				 * Erhöhe Button Counter um 1
				 */
				getCounterModel().incCounter();
				/**
				 * init About Fenster + übergebe Model
				 */
				About a = new About();
				a.setCounterModel(getCounterModel());
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
				getCounterModel().incCounter();
				/**
				 * Wechsel Panel Theme
				 */
				getView().changeTheme();
				/**
				 * Zeige Counter in MainFrame an
				 */
				getView().setCounterToAnzeigeFeld();
				break;

			case Constants.VERLAUF:
				getCounterModel().incCounter();

				VerlaufView v = new VerlaufView();
				v.setVerlaufModel(getVerlaufModel());
				v.initialise();

				getView().setCounterToAnzeigeFeld();
				break;

			default:
				break;
		}
	}
}