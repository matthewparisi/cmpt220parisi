package lab8;

public class SavingsAccount extends Account {
	
	void withdraw(double amount) {
		if(amount <= getBalance())
			super.withdraw(amount);
		else 
			System.out.println("Funds too low to withdraw");
		}


}
