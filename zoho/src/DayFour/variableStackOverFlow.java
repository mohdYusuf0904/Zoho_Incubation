package DayFour;

public class variableStackOverFlow {
	
	
	
	
	static int var(int i)
	{
		
		int k=i;
		
		return var(i+1);
		
	}
	

	
	public static void main(String[] args) {		
	
		int inn = -2147483647;
		// out of memory Integer in = new Integer(21474836475);
	//out of memory	Float f =Float.MAX_VALUE+564245546233;
		
		//System.out.println(f);
		//2147483647 string max length
		String s="";
		for(int i=0;i<2147483647;i++)
		{
			s+="a";
		}
		var(2);
	
		for(int i=0;;i++)
		{
			int c=34;
		}
	}
}
