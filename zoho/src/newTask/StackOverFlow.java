package newTask;

public class StackOverFlow {

	
	
	static int sum(int a,int b)
	{
		
		System.out.println(a+ " "+ b);
		return sum(5,6);
	}
	public static void main(String[] args) {
		
		StackOverFlow.sum(12, 2);
		
	}
	
	
	
}
