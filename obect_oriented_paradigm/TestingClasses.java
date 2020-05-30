package obect_oriented_paradigm;

public class TestingClasses {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = "1235";
		s1.name = "Ali";
		s1.my_name();
		////////////
		System.out.println("\n\n");
		
		HtuStudent s2 = new HtuStudent("222","Omar","Computer Science",false);
		s2.my_name();
		s2.major();
		/////////////////////////////
		System.out.println("\n\n");
		Club s3 = new Club("Elias","formula student", "2");
		s3.my_name();
		s3.id ="2560";
		s3.scholarship = true;
		s3.major = "IS";
		s3.major();
		s3.studentClub();
				
	}

}
