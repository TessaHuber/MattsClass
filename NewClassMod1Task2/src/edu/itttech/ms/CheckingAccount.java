package edu.itttech.ms;

public class CheckingAccount extends Account {

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

}
