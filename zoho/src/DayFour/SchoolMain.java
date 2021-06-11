package DayFour;
import java.util.ArrayList;
import java.util.*;
import DayFive.*;

public class SchoolMain {
	
	Sett s;
	int i;
	
	public static void main(String[] args) {
	
		List<Student> result = new ArrayList<>();
		//((Object) result).clone();
	
		School crescent = new School("ACresent High sec School","9952616312" , "Ecr road,Kalpakkam", "peter ponnaiah");
		crescent.addStudent("Mohamedd Ismail", 16, 11, "male", "B+ positive");
		crescent.addStudent("mOhamedk Ashik", 12, 3,"male","A+ positive");
		crescent.addStudent("Arun kumar",16, 11, "male", "A+positive");
		crescent.addStudent("Azif", 15,12, "male", "b+ positive");
		crescent.addStudent("Abalu", 16, 12,"male", "a+ positive");
		crescent.addStudent("Azar", 16, 11, "male","a+ positive");
		result = crescent.searchStudentByName("za");
		isEmpty(result);
		result = crescent.searchByAge(16);
		isEmpty(result);
		result = crescent.searchByStd(9);
		isEmpty(result);
		
		System.out.println("Sort BY Standard :");
		result = crescent.sortByStandard();
		System.out.println(result);
		
		System.out.println("Sort By Name :");
		result = crescent.sortStudentsByName();
		System.out.println(result);
		System.out.println("Sort By Age :");
		result=crescent.sortByAge();
		System.out.println(result);
		crescent.totalStudentList();
		result = crescent.manualStdSort();
		System.out.println(result);
		ArrayList<Student> clon =  (ArrayList) ((ArrayList<Student>)result).clone();
		clon.get(0).v.i=54;
		System.out.println(result.get(0).v.i);
		System.out.println(clon.get(0).v.i);
		
	}
	static void isEmpty(List<Student> result)
	{
		 
		if(!result.isEmpty())
		{	 
			 for(Student s:result)
			  System.out.println(s);
		}else {
			 System.out.println("No result Found");
		}
	}
	
}
