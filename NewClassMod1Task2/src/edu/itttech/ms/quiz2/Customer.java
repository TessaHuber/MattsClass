package edu.itttech.ms.quiz2;

public class Customer extends Person{
	private String Address;

	@Override
	public String toString() {

		return super.toString()+String.format("address: %s%n", Address);
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
