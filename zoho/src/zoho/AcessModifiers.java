package zoho;

public class AcessModifiers {
	
	private int p=3;
	public int aa=5;
	protected int c;
	int k=4;
		
}

class b extends AcessModifiers{

	
protected	void display() {
		
		b v = new b();
		v.aa=4;
		// v.p=3;
		v.c=2;
			
	}
		
}