package Vehicle_oops;

public class Vehicle {
	private int Model;
	private int engine;
	private String color;
	
	public Vehicle(int a, int b, String c) {
		this.Model = a;
		this.engine = b;
		this.color = c;
	}
	
	void VehicleOutput() {
		System.out.println("Model = " + this.Model);
		System.out.println("Engine = " + this.engine + "cc");
		System.out.println("Colour = " + this.color);
	}

}
