package DayFour;

import java.io.IOException;

public class exception {
	
	static void m() throws IOException 
	{
		
		throw new IOException();
		
	}
	static int divide(int a,int b)
	{
		
		return a/b;
		
	}
	public static void main(String[] args) {
		
		int a[] = new int[50];
		try {
			
		m();
		a[61]=56;
		divide(100,0);
		
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Operation cannot done");
		}
		
	}

}
