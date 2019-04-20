package lab8;

public class Accounttest {

	public static void main(String[] args) {
		String one = "";
		String two = "";
		String three = "";
		Account ac1 = new Account( 64821 , 5708.23);
		SavingsAccount ac2 = new SavingsAccount();
		ac2.deposit(8322.43);
		ac2.setId(34281);
		CheckingAccount ac3 = new CheckingAccount();
		ac3.setBalance(1320.51);
		ac3.setId(92638);
		one = ac1.toString();
		two = ac2.toString();
		three = ac3.toString();
		
		System.out.println("Account 1: " + one);
		System.out.println("Account 2: " + two);
		System.out.println("Account 3: "+ three);
	}

}
