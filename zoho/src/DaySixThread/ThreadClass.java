package DaySixThread;

class hi extends Thread{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("hi");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}	
	}
	
}

class hello implements Runnable{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("hello");
		
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}

 
 


public class ThreadClass {

	
	public static void main(String[] args) {
		
		
		
		hello h1 = new hello(); //new
		Thread h = new Thread(h1);
		hi  h2 = new hi();
		h.start(); //runnable
		//System.out.println(Thread.currentThread().getName());
		System.out.println("done");
		h2.start();
	}
	
	
}
