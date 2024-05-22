package Hospital_oops;

public class nurse extends person{
	
	private int roomNo;
	
	public nurse(String name, int age, String gender, int roomNo) {
		super(name, age, gender);
		this.roomNo = roomNo;
	}
	
    public void roomnoOutput() {
    	System.out.println("nurse name: "+ getName());
    	System.out.println("age: "+ getAge());
		System.out.println("gender: "+ getGender());
    	System.out.println("room number: "+ roomNo);
    }
}
