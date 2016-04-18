package edu.itttech.ms.quiz2;

import java.util.Date;

public class Person {

	private String firstName;
	private String lastName;
	private Date Dob;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name: %s %s%nDate Of Birth: %s%n" , firstName, lastName, Dob.toString());
	}


}
