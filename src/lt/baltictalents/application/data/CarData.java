package lt.baltictalents.application.data;

public class CarData extends BaseData{
	private String make;
	private String model;
	private String licNumber;
	private String engine;
	private long year;
	private int power;
	private int fuelTank;
	private Fuel fuel;
	
	public CarData(String make, String model, long year, String licNumber, String engine, int power, int fuelTank, Fuel fuelType){
		super();
		this.licNumber = licNumber;
		this.make = make;
		this.model = model;
		this.engine = engine;
		this.power = power;
		this.fuelTank = fuelTank;
		this.fuel = fuelType;
		this.year = year;
	}
	
	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

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
