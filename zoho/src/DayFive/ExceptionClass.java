package DayFive;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionClass {

	
	static void share(int i) throws FileNotFoundException,IOException {
		
		if(i>1 || i<0)
		{	
			throw new IllegalArgumentException();
		}
		
		if(i==0)
		{
			//server down
			throw new IOException("Server down");
		
		}else if(i==1)
		{
			//input file is not found
			throw new FileNotFoundException("File Not Found");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			share(0);
		}catch(FileNotFoundException e)
		{
			System.out.println("New File as Created using that name.txt");
		}
		catch(IOException i)
		{
			System.out.println("Connected to new server");
			//i.printStackTrace();
		}
	}
	
}
