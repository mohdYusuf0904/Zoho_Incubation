package DaySixThread;

import java.util.concurrent.TimeUnit;

class bank implements Runnable{
	
	private volatile double balance;
	
	public bank(double balance)
	{
		this.balance=balance;
	}
	
	
	public synchronized void getAmount() {
		
		System.out.println(Thread.currentThread().getName() +" invoking get balance :" +balance);
		
	}
	
	public synchronized  void withDraw(double amount) {
		
		System.out.println("processing---: "+Thread.currentThread().getName());
	/*	synchronized(this){ */
		if(balance>amount)
		{
			System.out.println(Thread.currentThread().getName()+" : is trying to withdraw amount :" +amount);
			balance -= amount;
			System.out.println(Thread.currentThread().getName() +": Successfully withdraw "+amount);
			
		}else {
			
			System.out.println(Thread.currentThread().getName() +": insufficent balance");
		}
	
		}
		
	
	
	public void run() {
		
		getAmount();
		withDraw(75);
		if(balance<0)
		{
			System.out.println("Money Overdrawn!! :"+balance);
		}
		
		
	}
	
}
public class RaceConditon {

	
	public static void main(String[] args) throws InterruptedException {

		bank acc = new bank(100);		
		Thread yusuf = new Thread(acc);
		Thread nani = new Thread(acc);
		yusuf.setName("yusuf");
		
		nani.setName("Nani");
		yusuf.start();
		nani.start();
		
	
	}
	
}
