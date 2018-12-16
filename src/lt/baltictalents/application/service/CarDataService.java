package lt.baltictalents.application.service;

import java.util.LinkedList;
import java.util.List;

import lt.baltictalents.application.data.CarData;
import lt.baltictalents.application.data.Fuel;

public class CarDataService {

	private List<CarData> carsData = null;
	private static CarDataService carDataController = null;

	public CarDataService() {
		carsData = new LinkedList<>();
	}

	public static CarDataService getInstance() {
		if (carDataController == null) {
			carDataController = new CarDataService();
		}
		return carDataController;
	}

	// For testing
	public void initList() {
		carsData.add(new CarData("VW", "GOLF", 2006, "HGU475", "1.9 TDI", 77, 55, Fuel.DIESEL));
		carsData.add(new CarData("CHEVROLET", "CAPTIVA", 2006, "KHD318", "2.4", 100, 60, Fuel.PETROL));
		carsData.add(new CarData("OPEL", "ASTRA", 2006, "JBR376", "1.7 TD", 74, 50, Fuel.DIESEL));
	}

	public List<CarData> getCarsData() {
		return carsData;
	}

}
