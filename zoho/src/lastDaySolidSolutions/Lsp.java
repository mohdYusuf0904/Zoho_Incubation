package lastDaySolidSolutions;

public class Lsp {

	public static void main(String[] args) {
		
		employee per = new permenantEmployee();
		employee temp = new temporaryEmployee();
		
		
	}
	
}

class permenantEmployee implements employee{

	@Override
	public void getBonus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fullTime() {
		// TODO Auto-generated method stub
		
	}
	
}

class temporaryEmployee implements employee{

	@Override
	public void getBonus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fullTime() {
		// TODO Auto-generated method stub
		
	}
	
}
class contractEmployee implements employee{

	@Override
	public void fullTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBonus() {
		// TODO Auto-generated method stub
		//unimplement
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		//liskov
	}
	
}

interface employee{
	
	public void fullTime();
	public void getBonus();
	public void getSalary();
	
}

interface Cemployee{
	
	public void partTime();
	public void getSalary();
}