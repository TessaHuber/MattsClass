package itt.matt.edu;

public class Student {

	private String firstName;
	private String lastName;
	private int id;
	private Schedule schedule;


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lName) {
		this.lastName = lName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return firstName +" " + lastName + " ID: "+ id;
	}


}
