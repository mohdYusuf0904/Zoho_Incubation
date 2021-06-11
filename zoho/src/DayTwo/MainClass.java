package DayTwo;

public class MainClass{
	
	
	public static void main(String[] args) {
		
		Animal cat = new cat("john","male",true,"brown","cat-home foods","persian-cat");
		System.out.println(cat);
		
	}
}
class Animal {
	
		private String name;
		private String gender;
		private boolean isPet;
		private String color;
		
		public Animal(String name, String gender, boolean isPet, String color) {
			super();
			this.name = name;
			this.gender = gender;
			this.isPet = isPet;
			this.color = color;
		}

		@Override
		public String toString() {
			return "Animal [name=" + name + ", gender=" + gender + ", isPet=" + isPet + ", color=" + color + "]";
		}
		
}

class cat extends Animal{
	private String food;
	private String catType;
	
	
	public cat(String name, String gender, boolean isPet, String color,String food,String type) {
		super(name, gender, isPet, color);
		// TODO Auto-generated constructor stub
		this.food=food;
		this.catType=type;
	}


	@Override
	public String toString() {
		return "cat [food=" + food + ", catType=" + catType + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
