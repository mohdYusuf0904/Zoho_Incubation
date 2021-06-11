package newTask;

class Calculate{
	
	int calculate(int a,int b)
	{
		return a+b;
	}
	
}

public class sum extends Calculate{
	
	
	int calculate(int a,int b,int c)
	{
		int s = super.calculate(a, b);
		return s/c;
		
	}
	public static void main(String[] args) {
		
		sum s = new sum();
		System.out.println("Sum + Devide :"+ s.calculate(25, 5,2));
		
	}
	
}
