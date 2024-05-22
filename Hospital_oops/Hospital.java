package Hospital_oops;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the person name");
		String person = sc.next();
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		System.out.println("Enter the Gender");
		String gender = sc.next();
		
		person p = new person(person, age, gender);
		
		p.personOutput();
		
		System.out.println("Enter the speciality");
		String speciality = sc.next();
		
        doctor d = new doctor(person, age, gender, speciality);
		
		d.doctorOutput();
		
		System.out.println("Enter the diesease");
		String disease = sc.next();
		
		patient pa = new patient(person, age, gender, disease);
		
		pa.patientOutput();
		
		System.out.println("Enter the roomno.");
		int roomNo = sc.nextInt();
		
		nurse n = new nurse(person, age, gender, roomNo);
		n.roomnoOutput();
	}

}

