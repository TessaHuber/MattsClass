package edu.itttech.ms;

public class BankTester {
	public static void main(String[] args) {
		Person me = new Customer<Account>();
		me.setId("ID101");
		me.setFirstName("Matt");
		me.setLastName("Schultz");
		me.setEmail("matthew.schultz_itt@yahoo.com");
		me.setPhone("414-732-6639");

		Address address = new Address();
		address.setAddress1("6300 W Layton Ave");
		address.setCity("Greenfield");
		address.setState("WI");
		address.setZip("53220");

		me.setAddress(address);

		Account account = new SavingsAccount();
		account.setAccountNumber("123456");
		account.setName("Matt's Savings");
		account.setBalance(10.0);

		((Customer<Account>)me).getAccounts().add(account);

		Bank bank = new Bank();
		bank.setBranchId("Branch1");
		bank.setBranchName("Greenfield Branch");
		bank.getPersons().add(me);

		System.out.println(bank.getBranchId());
		System.out.println(bank.getBranchName());

		/*for(Person person : bank.getPersons()){
			System.out.println(person.getFirstName());
			System.out.println(person.getLastName());
		}*/

		bank.getPersons().stream().forEach(person -> {
			System.out.println(person);
		});

		Person person = bank.getPersons().stream()
						 .filter(p -> (p.getId().equals("ID10"))).findFirst().orElse(new Customer<Account>());
						 //.forEach(System.out::println);

		System.out.println(person);

		person.eat();

		person.eat("tacos");

		person.eat("banana", "yellow");
	}
}
