package DayTwo;

public class StaticWithoutMain {


	public static void main(String[] args) {
		
		System.out.println(test.getSum());
		System.out.println(args.toString());
	}
	
}

class  test{


	static {
		
		value();
	}
	
	  private static int sum;
	 
	  public static int getSum()
	  {
	        value();
	        return sum;
	  }

	  
	  void hello() {
		  
		  value();
	  }
		private static boolean isTrue=false;

		public static void value() {
		
		while(!isTrue)
		{
			
			for(int i=0;i<100;i++)
			sum+=i;
			
			isTrue=true;
			
		}
		
	}

}