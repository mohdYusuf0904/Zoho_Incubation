package DayFive;

import java.util.ArrayList;
import java.util.List;

public class Register {

	
	static List<String> values = new ArrayList<>();
	static void addAccNumbers(String num) throws AccountNumberNotVAlid 
	{
		
		int i= Integer.parseInt(num);	
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		try {
			addAccNumbers("3242424");
			addAccNumbers("23232s4");
			System.out.println("done");
		} catch (AccountNumberNotVAlid e) {
			
			System.out.println();
		}
			
	}
	
}
