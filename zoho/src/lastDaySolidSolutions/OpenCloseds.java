package lastDaySolidSolutions;


public class OpenCloseds {


	public static void main(String[] args) {
		
		 calculatorr add = new Add();
		 add.perform(25, 45);
		 calculatorr multiply = new Add();
		 add.perform(45, 20);
		 
		 
		 
	}
	

}

class Calculation{
	
	calculatorr calc;
	
	public Calculation(calculatorr calc)
	{
		this.calc=calc;
	}
	
	public int perform(int a,int b) {
		
		return calc.perform(a, b);
		
	}
	
	
	
}

interface calculatorr{
	
	int  perform(int a,int b);
}

class Add implements calculatorr{

	@Override
	public int perform(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

class Multiplication implements calculatorr{

	@Override
	public int perform(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}

class divide implements calculatorr{

	@Override
	public int perform(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}