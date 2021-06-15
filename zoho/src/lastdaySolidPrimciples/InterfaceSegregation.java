package lastdaySolidPrimciples;

interface component{
	
	public void touch();
	public void os();
	public void mouse();
	public void ram();
	//
	//
	
}

class Windows implements component{

	@Override
	public void touch() {

			//unused/////
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
	
}

class AndroidPhone implements component{

	@Override
	public void touch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void os() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouse() {
		//unused
	}

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceSegregation {

}
