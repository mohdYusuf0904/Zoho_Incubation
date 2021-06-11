package DayFive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class tryWithFinally {
	
	
	public static void main(String[] args) throws Exception {
		
		//MethodWithoutException();
		//System.out.println("Main");
		
		
		//MethodWithException();
		//System.out.println("main");
		
		 MethodCatchNotException();
		 System.out.println("Main");
	}

	
	private static void MethodCatchNotException() throws Exception {
		

		try {
			System.out.println("Statement 1");
			share_1();
			System.out.println("Statement 2");
		}catch(IOException i) {
			
			System.out.println("Catch block");
			
		}finally {
			
			System.out.println("Finally");
			
		}
		System.out.println("After finally");
		
	}
	private static void share_1() throws Exception {
		
		throw new Exception();
	}


	private static void MethodWithException() {
		
	
		try {
			System.out.println("Statement 1");
			share();
			System.out.println("Statement 2");
		}catch(IOException i) {
			
			System.out.println("Catch block");
			
		}finally {
			
			System.out.println("Finally");
			
		}
		System.out.println("After finally");
	}
	


	private static void MethodWithoutException() {
		
		try {

			System.out.println("Statement 1 - try");
			//exce
			System.out.println("Statement 2");
			
		}catch(Exception o)
		{
				
			System.out.println("Catch - block");
			
		}finally {
			System.out.println("No - Finally ");
		}
		System.out.println("After finally");
		
	}

	
	
	private static void share() throws IOException {
	
		throw new IOException("Share");
		
	}
	
}
