package obect_oriented_paradigm;


public class Student {
	// attributes
	String name;
	
	String id;
	
	public Student() {
	}

public Student(String name, String id) { //constructor for attributes
	
	this.name=name;
	
	this.id=id;
	
	
}
public void my_name() {
	System.out.println("my name is  " + name);
}

}