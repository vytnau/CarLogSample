package lt.baltictalents.application;

import lt.baltictalents.application.controller.WindowController;

public class Main {
	public static void main(String[] args) throws Exception {
		WindowController  window = WindowController.getInstance();
		window.showMainScreen();

	}
}
