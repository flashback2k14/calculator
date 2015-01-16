package Calculator;

public class Launcher {
	
	public static void main(String[] args) {
		/**
		 * Init MVC Klassen
		 */
		Controller controller = new Controller();
		View view = new View();
		Model model = new Model();
		/**
		 * Verbinde MVC Klassen miteinander
		 */
		view.setController(controller);
		view.setModel(model);

		controller.setView(view);
		controller.setModel(model);
		/**
		 * Init Hauptfenster
		 */
		view.init();
	}
}