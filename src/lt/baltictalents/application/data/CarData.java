package lt.baltictalents.application.data;

public class CarData extends BaseData{
	private String make;
	private String model;
	private String licNumber;
	private String engine;
	private int power;
	private int fuelTank;
	private Fuel fuel;
	
	public int getFuelTank() {
		return fuelTank;
	}
	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}
	public Fuel getFuel() {
		return fuel;
	}
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLicNumber() {
		return licNumber;
	}
	public void setLicNumber(String licNumber) {
		this.licNumber = licNumber;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
}
