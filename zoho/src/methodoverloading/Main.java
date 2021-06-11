package methodoverloading;

public class Main {

	
	static int sum(int a,int b,int c) {
		
		
		return a+b+c;
		
	}
	
	
	static int sum(int a,int b)
	{
		
		return a+b;
	}
	
	public static void main(String[] args) {
		
		
		int s = Main.sum(1, 22);
		
		System.out.println(s);
		
		 s = Main.sum(1, 2,4);
		System.out.println(s);
	}
	
	
}
