package lab3_2;

public interface Bankable {
	 
    static String BANK = "Bank";
    public static final String ACCOUNT = "Account";
 
    void deposit(double amount);
 
    public void withdraw(double amount);
 
    public abstract double checkBalance();
}