
public class Account {

	public   String account_holder;
	
	


	public double account_number;
	
	public double account_balance ;
	
	
	
	
	
	public String getAccount_holder() {
		return account_holder;
	}


	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}


	public double getAccount_number() {
		return account_number;
	}


	public void setAccount_number(double account_number) {
		this.account_number = account_number;
	}


	public double getAccount_balance() {
		return account_balance;
	}


	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}


	public double deposite(double amount) 
	{
		account_balance = account_balance + amount;
		
		return account_balance;
		
	}
	
	
	public double withdraw(double amount) 
	{
		account_balance = account_balance - amount;
		
		return account_balance;
		
	}
	
	
	@Override
	public String toString() {
		return "Account [account_holder=" + account_holder + ", account_number=" + account_number + ", account_balance="
				+ account_balance + "]";
	}
}


