package lastDaySolidSolutions;

interface components{
	
	void os();
	void ram();
	void speakers();
}

interface AndroidComponents{
	
	void touch();
	void dualCamera();
}

interface ComputerComponent{
	
	void mouse();
	void monitor();
	
}


class windows implements components,ComputerComponent{

	@Override
	public void monitor() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void os() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speakers() {
		// TODO Auto-generated method stub
		
	}
	
}

class AndroidC implements AndroidComponents,components{

	@Override
	public void touch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dualCamera() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void os() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speakers() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceSolution {
	
	

}
