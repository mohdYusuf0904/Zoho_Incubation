package DayFour;


interface operation{

	int calculate(int a,int b);
}

enum calc implements operation{
	
	ADD
	{
		
		public int calculate(int a,int b) {
		
			return a+b;
			
		}
		
	},SUBTRACT{
		
		
		public int calculate(int a,int b) {
			
			
			return a-b;
			
		}
			
		
	}

	
}
public class InterfaceEnum {
	
	public static void main(String[] args) {
		
		
		
		calc c = calc.ADD;
		System.out.println(c.calculate(6, 6));
		c=calc.SUBTRACT;
		System.out.println(c.calculate(12, 6));
	}
	
}
