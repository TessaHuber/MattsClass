package lab3_2;

public class BankTester {
    public static void main(String[] args) {
    	//yes i used some of the code from class but becuase i wanted to have it 
        //working onmycomputer for future refreence saved this incasei wanted to go backand look at it
    
    	
        Person me = new Customer<Account>();
        me.setId("ID808");
        me.setFirstName("Tessa");
        me.setLastName("Huber");
        me.setEmail("tersabearxd@aim.com");
        me.setPhone("414-578-7290");
   

 
       // Address address = new Address();
       // address.setAddress1("4116 s 5th place");
       // address.setCity("milwaukee");
       // address.setState("WI");
       // address.setZip("53207");
 
       
        Address addresss = new Address("4116 s 5th pl","Milwaukee","wi","53207");
        me.setAddress(addresss);
        

 
        Account account = new SavingsAccount();
        account.setAccountNumber("1968745");
        account.setName("Tessa's Savings");
        account.setBalance(1000.0);
 
        ((Customer<Account>)me).getAccounts().add(account);
        
 
      // Bank bank = new Bank();
      //  bank.setBranchId("Branch1");
       // bank.setBranchName("Money Branch");
      //  bank.getPersons().add(me);
        
        Bank banks = new Bank("branch2","broke branch");

 
        System.out.println(banks.getBranchId());
        System.out.println(banks.getBranchName());
 
        for(Person person : banks.getPersons()){
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
            
        
            
       // ((Object) bank.getPersons()).stream().forEach(person -> {
       //    System.out.println(person);
       //});
 
      //Person person = bank.getPersons().stream()
        //               .filter(p -> (p.getId().equals("ID10"))).findFirst().orElse(new Customer<Account>());
                       //.forEach(System.out::println);
 
        System.out.println(person);
    }}}
