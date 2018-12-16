package lt.baltictalents.application.data;

public enum Fuel {
	PETROL,
	DIESEL;
	
	public static Fuel mapEnum(String str){
		switch (str.toLowerCase()) {
		case "petrol":
			return PETROL;
		default:
			return DIESEL;
		}
	}
}
