package obect_oriented_paradigm;

public class Club extends HtuStudent {
	String club_name;	
	String club_id;
	
	//constructor overloading...
	public Club() {	
	}
	
	public Club(String name, String club_name, String club_id) {
			this.name = name;
			this.club_name = club_name;
			this.club_id = club_id;
		}
	public void studentClub() {
		System.out.println(name + " is in the "+ club_name + " club.");
		
	}

}
