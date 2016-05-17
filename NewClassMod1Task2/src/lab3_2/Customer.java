package lab3_2;

import java.util.ArrayList;
import java.util.List;
 
public class Customer<Tessa> extends Person {
    private List<Tessa> accounts;
 
   

	public List<Tessa> getAccounts() {
        if(accounts == null) {
            accounts = new ArrayList<>();
        }
        return accounts;
    }
 
    public void setAccounts(List<Tessa> accounts) {
        this.accounts = accounts;
    }
}
