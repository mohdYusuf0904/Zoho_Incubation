package DayThree;

public class stackAndHeap {
		
	
	public static void main(String[] args) {
		
		testclass tc = new testclass();
	
		tc.age=20;
		tc.name="yusuf";
		display();
		tc=null;
		
		tc.display();
		
	}


	private static void display() {
		
		testclass tc = new testclass();
		System.out.println(tc.age);
		System.out.println("in---main");
	}
	

}

class testclass
{
	
	int age;
	String name;
	
	
	void display()
	{
		System.out.println(" "+name+" "+age);
	}
	
	
}
