package lab8;

public class CheckingAccount extends Account {
	final static double OVERDRAFT_lIMIT = 5000;
	
	@Override
	void withdraw(double amount) {
		if(amount - OVERDRAFT_lIMIT <= getBalance())
			super.withdraw(amount);
		else 
			System.out.println("Funds too low to withdraw");
		}

}
