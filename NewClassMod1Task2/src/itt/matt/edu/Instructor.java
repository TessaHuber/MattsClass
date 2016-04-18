package itt.matt.edu;

public class Instructor {
	private int instructorID;
	private String firstName;
	private String lastName;
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getInstructorID() {
		return instructorID;
	}

	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fname) throws NameException {

		if(fname == null || !fname.matches("[A-Za-z\\-\\.\\ \\']+")){
			throw new NameException("First name must not be null and must contain letters");
		}

		firstName = fname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lname) throws NameException {
		if(lname == null || !lname.matches("[A-Za-z\\-\\.\\ \\']+")){
			throw new NameException("Last name must not be null and must contain letters");
		}
		lastName = lname;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " ID: " + instructorID;
	}
}
