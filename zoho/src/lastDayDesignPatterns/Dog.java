package lastDayDesignPatterns;

public class Dog implements Animal{

	private String name;
	private String type;
	
	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + "]";
	}
	
	
	
	
}
