package Vehicle_oops;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Vehicle vh1 = new Vehicle();
		System.out.println("Enter the Vehicle Model");
		int m = sc.nextInt();
		
		System.out.println("Enter the Vehicle Engine");
		int e = sc.nextInt();
		
		System.out.println("Enter the Vehicle Colour");
		String s = sc.next();
		
		System.out.println("Enter the Vehicle type");
		String t = sc.next();
		
		bike b = new bike(m, e, s, t);
		
		b.BikeOutput();
		
		System.out.println("Enter the fuel type");
		String f = sc.next();
		
		car c = new car(m, e, s, t, f);
		
		c.CarOutput();
		
		System.out.println("Enter the seating capacity");
		String z = sc.next();
		
		bus o = new bus(m,e,s,t,f,z);
		
		o.BusOutput();

	}

}
