package Vehicle_oops;

public class car extends Vehicle{
	
	private String type;
	
	public car(int a, int b, String c, String t, String f) {
		super(a, b, c);
		this.type=t;
	}

	
	void CarOutput() {
		super.VehicleOutput();
		System.out.println("Fuel type = "+this.type);
	}
	

}
