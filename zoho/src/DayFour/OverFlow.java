package DayFour;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class OverFlow {

	
	void stringOverflow() {
		
		String s = " ";
		for(long i=0;i>=0;i++)
		{
			s+="s";
		}
		System.out.println("done");
		
	}
	
	public static void main(String[] args) {
		
		OverFlow of = new OverFlow();
		of.stringOverflow();

		//Float[] array = new Float[10000 * 100000];
		for(int i=0;i<1000000;i++)
		{
			int k=34;
		}
	System.out.println("DONE");
		
		
	}
	
}
