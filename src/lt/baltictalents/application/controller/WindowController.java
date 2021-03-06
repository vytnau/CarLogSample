package lt.baltictalents.application.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;
import lt.baltictalents.application.data.CarData;
import lt.baltictalents.application.service.CarDataService;
import lt.baltictalents.application.view.MyCarsView;
import lt.baltictalents.application.view.NewCarView;

public class WindowController {

	private final static String MY_CARS_WINDOW = "MyCarsWindow";
	private final static String NEW_CAR_WINDOW = "NewCarWindow";	
	private Map<String, Application> windows;
	private CarDataService carDataService;
	private static WindowController controller;

	public static WindowController getInstance() {
		if (controller == null) {
			controller = new WindowController();
		}
		return controller;
	}

	public WindowController() {
		windows = new HashMap<>();
		carDataService = new CarDataService();
		carDataService.initList();
		initWindows();
	}

	private void initWindows() {
		windows.put(MY_CARS_WINDOW, new MyCarsView());
		windows.put(NEW_CAR_WINDOW, new NewCarView());
	}

	public void showMainScreen() throws Exception {
		Application app = windows.get(MY_CARS_WINDOW);
		Application.launch(app.getClass());
	}

	public List<CarData> getCarsData() {
		return carDataService.getCarsData();
	}

	public void openCreateCarWindow() {
		Application app = windows.get(NEW_CAR_WINDOW);
		openWindow(app);
	}
	
	public void openEditCarWindow(CarData carData) {
		Application app = windows.get(NEW_CAR_WINDOW);		
		openWindow(app);
		((NewCarView)app).editCar(carData);
	}

	private void openWindow(Application app) {
		Stage stage = new Stage();
		try {
			app.start(stage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void upsertCar(CarData car) {
		carDataService.upsert(car);
		Application app = windows.get(MY_CARS_WINDOW);
		((MyCarsView)app).updateTable();
	}
	
	public void removeCar(CarData car){
		carDataService.remove(car);
		Application app = windows.get(MY_CARS_WINDOW);
		((MyCarsView)app).updateTable();
	}
	
	public void updateWindowMap(Application app){
		windows.put(MY_CARS_WINDOW, app);
	}
}
