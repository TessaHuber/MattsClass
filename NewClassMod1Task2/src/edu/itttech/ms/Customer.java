package edu.itttech.ms;

import java.util.ArrayList;
import java.util.List;

public class Customer<Matt> extends Person {
	private List<Matt> accounts;

	public List<Matt> getAccounts() {
		if(accounts == null) {
			accounts = new ArrayList<>();
		}
		return accounts;
	}

	public void setAccounts(List<Matt> accounts) {
		this.accounts = accounts;
	}
}
