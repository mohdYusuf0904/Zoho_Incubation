package DayFive;

import java.io.*;

public class TryWithResource {

	
	public static void main(String[] args) throws Exception {


		
		 //methodArm(); 
		 //methodWithoutArm();
		//benifitOfArm();
	}

	private static void benifitOfArm() throws Exception {
		
		try(test1 t = new test1(); test2 t2 = new test2(); FileOutputStream out = new FileOutputStream("yusuf.txt"))
		{
			
			System.out.println("run");
			throw new Exception();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
		
			System.out.println("do");
			e.printStackTrace();
		} System.out.println("close");
		
	}

		
		
		
	
	private static void methodWithoutArm() {
		
		FileOutputStream out=null;
		
		try {
			
			out = new FileOutputStream("yusuf.txt");
			
		}catch(FileNotFoundException e)
		{
			
		}finally {
			
			try {
				if(out!=null)
				out.close();
			} catch (IOException e) {
				
			}finally {
				System.out.println("closed");
			}
		}
		
		
	}

	private static void methodArm() {
		
		try(FileOutputStream out = new FileOutputStream("yusuf.txt"))
		{
			
			System.out.println("run");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		 System.out.println("close");
		
	}
	
}

class test1 implements AutoCloseable{

	@Override
	public void close() throws IOException  {
		
		throw new IOException();
	}
	
}

class test2 implements AutoCloseable{

	@Override
	public void close() throws IOException  {
		
		throw new IOException("Supression");
	}
	
	
}