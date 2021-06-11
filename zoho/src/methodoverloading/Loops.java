package methodoverloading;

import java.util.Scanner;

public class Loops {

	
	public static void whileLoop()
	{
		

		int n=1234;
		
		while(n!=0)
		{
			
			int s = n%10;
			System.out.println(s);
			n=n/10;
			
		}
	}
	

		
	
	public static void main(String[] args) {
		
		//whileLoop();
		//doWhile();
	}




	private static void doWhile() {
		

		Scanner in= new Scanner(System.in);
		int n;
		do {

			n=in.nextInt();

			System.out.println("not - exit");
		}while(n!=0);
		
		System.out.println("exit");
	}
			
	
	
}
