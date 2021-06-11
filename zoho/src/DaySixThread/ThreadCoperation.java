package DaySixThread;
class Consumer extends Thread{
	
	private Number n;
	public Consumer(Number n)
	{
		this.n=n;
	}
	
	public void run()
	{

		while(true)
		{
			n.getNum();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Producer extends Thread{
	
	private Number n;
	public Producer(Number n)
	{
		this.n=n;
	}
	
	
	public void run()
	{
		int i=0;
		while(true)
		{
			n.setNum(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Number{
	
	volatile boolean isTrue=false;
	private int num;
	public synchronized void getNum() {
		
		while(!isTrue)
		{
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("get :" + num);
		isTrue=false;
		notify();
	}
	
	public synchronized void setNum(int num) {
		
		while(isTrue)
		{
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.num=num;
		System.out.println("Put :"+num);
		isTrue=true;
		notify();
	}
	
	
	
}
public class ThreadCoperation {

	
	
	public static void main(String[] args) {
	
		Number n = new Number();
		Producer p = new Producer(n);
		Consumer c = new Consumer(n);
		p.start();
		c.start();
	}
	
}
