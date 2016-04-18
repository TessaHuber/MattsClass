package edu.itttech.ms;

public class LoanAccount extends Account {

	private double interest;

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}

	@Override
	public void withdraw(double amount) {
		setBalance(getBalance() - amount);
	}

	@Override
	public double checkBalance() {
		return getBalance();
	}


	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

}
