package DayFour;

class x{
	int i;
}

public class Student{

	public x v  = new x();
	private String name;
	private int Std;
	private int age;
	private String bloodGroup;
	private String gender;
	
	public Student(String name, int i, int age, String gender,String bloodGroup) {
		super();
		this.name = name;
		Std = i;
		this.age = age;
		this.gender=gender;
		this.bloodGroup = bloodGroup;
		v.i=5;
	}

	public String getName() {
		return name;
	}


	public int getStd() {
		return Std;
	}


	public int getAge() {
		return age;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}

	@Override
	public String toString() {
		return "name=" + name + ", Std=" + Std + ", age=" + age +" gender = "+ gender + " bloodGroup=" + bloodGroup +" \n";
	}

	
	
	
}
