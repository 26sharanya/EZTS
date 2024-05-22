package Hospital_oops;

public class patient extends person {
	private String disease;
	
	public patient(String name, int age, String gender, String disease) {
		super(name, age, gender);
		this.disease = disease;
	}

	 public void patientOutput() {
		System.out.println("patient name: " + getName());
		System.out.println("age: " + getAge());
        System.out.println("gender: " + getGender());
        System.out.println("disease:" + disease);
	}
}
