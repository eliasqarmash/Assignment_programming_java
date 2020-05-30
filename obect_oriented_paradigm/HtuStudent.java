package obect_oriented_paradigm;

public class HtuStudent extends Student{

	String major;
	Boolean scholarship;
	
	//constructor overloading...
	public HtuStudent() {
		
	}
	
	public HtuStudent(String id, String name, String major, Boolean scholarship) {
		this.id = id;
		this.name = name;
		this.major = major;
		this.scholarship = scholarship;
				
		
	}
	public void major() {
		System.out.println("my major is " + major);
	}
	
}
