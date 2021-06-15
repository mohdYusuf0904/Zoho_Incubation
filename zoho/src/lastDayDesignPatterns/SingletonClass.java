package lastDayDesignPatterns;

public class SingletonClass {

	public static void main(String[] args) {
		
		Specialtype sp = Specialtype.instance;
		// Enum is a  Specialtype;
		//like those constructor are always private
		
		Student student = Student.getStudent();

	}
	
}

class Student{
	
	private static Student st = new Student();
	//while classsloading extra space loaded
	private static String name;
	private Student() {
		
	}
	
	public static void setName(String nam) {
		
		name=nam;
	}
	
	public static String getName() {
		
		return name;
	}
	public static  Student getStudent() {
		
		return st;
		
	}
	
	
}


class StudentLazy{
	

	private static StudentLazy st;
	//while classsloading extra space loaded
	private static String name;
	
	private StudentLazy() {
	
		if(st==null)
		{
			
			synchronized(this)
			{
				if(st==null)
					st=new StudentLazy();
				
			}
		}
		
			
	}
		
	
	public static void setName(String nam) {
		
		name=nam;
	
	}
	
	public static String getName() {
		
		return name;
	}
	public static  StudentLazy getStudent() {
		
		return new StudentLazy();
	}
	
	
}

enum Specialtype{
	
	
	
	instance;

	
}