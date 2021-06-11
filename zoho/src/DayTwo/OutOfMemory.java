package DayTwo;

public class OutOfMemory {

	
	public static void main(String[] args) {
		
		method1();
	}

	private static void method1() {
		
		method2();
	}

	private static void method2() {
		
		method1();
	}
	
	
}
