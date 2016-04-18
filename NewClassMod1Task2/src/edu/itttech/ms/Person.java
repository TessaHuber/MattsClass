package edu.itttech.ms;

public abstract class Person {

	private String id;
	private String firstName;
	private String lastName;
	private Address address;
	private String phone;
	private String email;

	public Person() {

	}

	public Person(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(String id, String firstName, String lastName, Address address, String phone, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public void eat() {
		eat("");
	}

	public void eat(String food) {
		eat(food, "");
	}

	public void eat(String food, String color) {
		System.out.println("Yummy " + color + " " + food);
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "[" + id + ":" + firstName + ":" + lastName + ":" + email + ":" + phone + "]";
	}
}
