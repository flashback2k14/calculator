package Calculator;

public class Launcher {
	
	public static void main(String[] args) {
		/**
		 * Init MVC Klassen
		 */
		Controller controller = new Controller();
		View view = new View();
		CounterModel counterModel = new CounterModel();
		VerlaufModel verlaufModel = new VerlaufModel();
		Grundrechenarten grundrechenarten = new Grundrechenarten();
		/**
		 * Verbinde MVC Klassen miteinander
		 */
		view.setController(controller);
		view.setCounterModel(counterModel);

		controller.setView(view);
		controller.setCounterModel(counterModel);
		controller.setVerlaufModel(verlaufModel);
		controller.setGrundrechenarten(grundrechenarten);
		/**
		 * Init Hauptfenster
		 */
		view.init();
	}
}