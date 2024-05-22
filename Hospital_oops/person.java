package Hospital_oops;

public class person {
	private String name;
	private int age;
	private String gender;
	
	public person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void personOutput() {
		System.out.println("person name = " + name);
		System.out.println("age = " + age);
		System.out.println("gender = " + gender);
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
}
