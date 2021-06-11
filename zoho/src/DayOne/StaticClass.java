package DayOne;

public class StaticClass {
	
	
	public static final String type = "CAR";
	final int j;
	
	StaticClass(){
		
		j=3;
	}
	
	public static void main(String[] args) {
		
		//j=4; final cannot reassign
		
		A st = new A();
		st.i=1;
		for(int i=0;i<5;i++)
		{
			A.i=3;
			System.out.println(st.i);
			st.run();
			st.i++;
			
		}
		
	}
	
	
}

class test{

	void display() {
		
		System.out.println(StaticClass.type);
		
	}
	
 static void run() {
	 
	 System.out.println("test");
 }
	
}

class A extends test{
	
	static int i;

		
}