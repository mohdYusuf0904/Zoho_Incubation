package DayThree;
import java.util.ArrayList;
import java.util.List;

public class schoolTest{

	public static void main(String[] args) {
		
		
		
		School school1 = new School("SDA higher sec","E.c.r road","Private Govt-certified");
		Student st = school1.getSt("Yusuf", 10, "12-std");
		Student student2 = school1.getSt("Khaja", 10,"3rd std");
		
		school1.addStudent(student2);
		school1.addStudent(st);

		System.out.println(school1.getSchoolName());
		school1.displayStudents();
	}
	
}

class School {

	Student st;
	private String schoolName;
	private String convent;
	private String Address;
	private List<Student> studentList;
	
	public School(String schoolName, String convent, String address) {
	//	super();
		studentList = new ArrayList<>();
		this.schoolName = schoolName;
		this.convent = convent;
		Address = address;
	}
	
	
	public void displayStudents() {
		
		for(Student s: studentList)
		{
			System.out.println(s);
		}
		
		
	}


	void addStudent(Student s)
	{
		studentList.add(s);
	}
	
	public Student getSt(String name, int age, String std) {
		return new Student(name,age,std);
	}


	
	public void setSt(Student st) {
		this.st = st;
	}


	void feesPay() {
		
		
		System.out.println("Pay fees");
	}
	
	
	
	String getAddress() {
		
		return Address;
	}
	
	String getSchoolName() {
		
		return schoolName;
	}
	
}

class Student{
	
	private String name;
	private int age;
	private String std;
	
	
	
	
	public Student(String name, int age, String std) {
		super();
		this.name = name;
		this.age = age;
		this.std = std;
	}
	
	void study()
	{
		System.out.println("reading");
	}
	
	void test() {
		
		System.out.println("write-test");
	}
	
	void eat() {
		
		System.out.println("Eating---");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", std=" + std + "]";
	}
	
	
}