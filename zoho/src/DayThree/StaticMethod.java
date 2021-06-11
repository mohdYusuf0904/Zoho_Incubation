package DayThree;

public class StaticMethod {
	
	
	static String name;
	
	static void setName(String nam)
	{

			name=nam;
		
	}
	static String getName() {
		
		return name;
	}
	
	
	
	public static void main(String[] args) {
		
		
		StaticMethod d = new StaticMethod();
		
		d.setName("yusuf");
		StaticMethod c = new StaticMethod();
		d.setName("tharique");
		
		System.out.println(d.getName());
	}

}
