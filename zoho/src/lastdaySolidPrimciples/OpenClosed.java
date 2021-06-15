package lastdaySolidPrimciples;

public class OpenClosed {
	
	
	public static void main(String[] args) {
		
		
		calculation calc = new calculation();
		
		calc.sum("add", 23,52);
		
	}
	

}


class calculation{
	
	
	public void sum(String str,int a,int b){
		
		if(str.equalsIgnoreCase("add"))
		{
			System.out.println(a+b);
		}
		else if(str.equalsIgnoreCase("subtract"))
		{
			System.out.println(a-b);
		}
		
		
		//what if we want to add multiplication
		//so this is voilates ocp rule
	}
	
	
}