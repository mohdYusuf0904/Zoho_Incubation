package zoho;

public class BankAccount {

	private double balance;
	private String name;
	private long AccNumber;
	
	public void withdraw(double val) {
		
		if(balance<100 || val>balance || val<100)
			System.out.println("Sorry! can't be  withdrawn");
		else
			balance=balance-val;
	}
	
	public BankAccount( String name, long accNumber,double balance) {
	
		this.balance = balance;
		this.name = name;
		AccNumber = accNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double balance) {
	
		if(balance<=100)
		{
			System.out.println("amount as been more than 100");
		}
		else
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public long getAccNumber() {
		return AccNumber;
	}
	
	
}
