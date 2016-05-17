package Lab4_2task2;

import java.util.Scanner;

public class Front {

	public static void main(String[] args) {

	Employee e=new Employee();
	Scanner in = new Scanner(System.in);
	System.out.print("~~ Employee Regestration~~");
	System.out.print("Please Enter Employee First Name:");
	String Fname = in.next();
	e.setFName(Fname);
	System.out.print("Please Enter Employee Last Name:");
	String Lname= in.next();
	e.setLName(Lname);
	System.out.print("Please Enter Employee Email:");
	String email= in.next();
	e.setEmail(email);
	System.out.print("Please Enter Employee Age:");
	int age=in.nextInt();
	e.setAge(age);

	if (age<20)
		System.out.print("the employee is too young");
	if(age>58)
		System.out.print("the employee is past retirement age ");
	if(age>20 && age<58)
		System.out.print("please press enter to continue");
	else
		System.out.print("Invalid Age exception");

	// there should be a user defined exception in the code called InvalidAgeException, not just a printout of the words Invalid Age Exception. create a new class called InvalidAgeException  that extends Exception and throw and catch that in the main method here.
}}
