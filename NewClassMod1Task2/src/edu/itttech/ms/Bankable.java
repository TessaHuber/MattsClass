package edu.itttech.ms;

public interface Bankable {

	static String BANK = "Bank";
	public static final String ACCOUNT = "Account";

	void deposit(double amount);

	public void withdraw(double amount);

	public abstract double checkBalance();
}
