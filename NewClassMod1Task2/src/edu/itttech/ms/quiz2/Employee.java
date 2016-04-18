package edu.itttech.ms.quiz2;

public class Employee extends Person {
	private String Address;
	private String Position;

	@Override
	public String toString() {

		return super.toString()+String.format("address: %s%nPosition: %s%n", Address, Position);
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}


}
