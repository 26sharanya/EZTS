package Vehicle_oops;

public class bus extends Vehicle{
	
	private String type;
	
	public bus(int a, int b, String c, String t, String f, String z) {
		super(a, b, c);
		this.type=t;
	}

	
	void BusOutput() {
		super.VehicleOutput();
		System.out.println("Seating capacity = "+this.type);
	}
	

}

