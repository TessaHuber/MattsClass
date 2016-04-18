package edu.itttech.ms;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String branchId;
	private String branchName;
	private List<Person> persons;

	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public List<Person> getPersons() {
		if(persons == null) {
			persons = new ArrayList<>();
		}
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
}
