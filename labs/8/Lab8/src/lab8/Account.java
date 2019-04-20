package lab8;
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	Account() {}
	
	Account(int id, double bal) {
		this.id = id;
		this.balance = bal;
	}
	
	// getters...
	int getId() {
		return id;
	}
	
	double getBalance() {
		return balance;
	}
	
	double getAIR() {
		return annualInterestRate;
	}
	
	String getDateCreated() {
		return dateCreated.toString();
	}
	
	// setters...
	void setId(int id) {
		this.id = id;
	}
	
	void setBalance(double bal) {
		this.balance = bal;
	}
	
	void setAIR(double AIR) {
		this.annualInterestRate = AIR;
	}
	
	// methods...
	double getMonthlyInterestRate() {
		return annualInterestRate / 100 / 12;
	}
	
	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	void withdraw(double amount) {
		balance -= amount;
	}
	
	void deposit(double amount) {
		balance += amount;
	}
	
	@Override
	public String toString() {
		return "Type: Generic account;  ID: " + this.id 
				+ ";  balance: " + this.balance;
	}
	
}