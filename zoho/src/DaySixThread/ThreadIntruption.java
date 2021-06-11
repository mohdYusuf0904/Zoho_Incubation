package DaySixThread;


class Task extends Thread{
	
	private int value=100;
	public void run() {
		
		
		for(int i=0;i<value;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				
				System.out.println("Thread Is Intruppted");
				value=0;
			}
			
		}
	}
}
public class ThreadIntruption {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Task t = new Task();
		t.start();
		
		t.join(3000);
		t.interrupt();
		
	}

}
