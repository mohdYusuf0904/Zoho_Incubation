package lastDayDesignPatterns;

public class Cat implements Animal{

	private String name;
	private String type;

	public Cat(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + "]";
	}
	
	
}
