package DayThree;

class Animal{
	
	String name;
	String vegFood;
	int noOfLegs;
	
	
	public void eat() {
	
		System.out.println("eating.." );
	}
	
	public void sleep() {
		
		System.out.println("sleeping");		
	}
	
	public void barking() {
		
		System.out.println("barking");
	}
	
	public void run() {
		
		System.out.println("walking");
			
	}

	
}
class cat extends Animal{
	
	
	public void barking()
	{
		System.out.println("meow-meow");
	}
	
}