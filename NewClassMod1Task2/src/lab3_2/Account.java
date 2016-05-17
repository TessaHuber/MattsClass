package lab3_2;

public abstract class Account implements Bankable {
    private String accountNumber;
    private String name;
    private double balance;
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public boolean equals(Object obj) {
 
        if(this == obj) {
            return true;
        }else if(!(obj instanceof Account)){
            return false;
        }
 
        Account acct = (Account) obj;
 
        if(acct.accountNumber != null && this.accountNumber != null) {
            if(!acct.accountNumber.equals(this.accountNumber)) {
                return false;
            }
        }
 
        if(acct.name != null && this.name != null) {
            if(!acct.name.equals(this.name)) {
                return false;
            }
        }
        if(acct.balance != this.balance) {
            return false;
        }
 
        return true;
    }
 
    @Override
    public int hashCode() {
 
        int hash = 17;
        hash = 31 * hash + this.accountNumber.hashCode();
        hash = 31 * hash + this.name.hashCode();
        hash = 31 * hash + ((int)this.balance);
 
        return hash;
    }
}