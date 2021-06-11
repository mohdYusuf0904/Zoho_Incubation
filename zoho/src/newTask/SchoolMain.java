package newTask;

public class SchoolMain {
	
	
	public static void main(String[] args) {
		
		School crescent = new School("Cresent High sec School","9952616312" , "Ecr road,Kalpakkam", "peter ponnaiah");
		crescent.addStudent("AZMohamed Yusuf", 16, "11", "male", "B+ positive");
		crescent.addStudent("Mohamed Ismail", 12, "3","male","A+ positive");
		crescent.addStudent("ABrun kumar",16, "11", "male", "A+positive");
		crescent.addStudent("Balu", 15,"10", "male", "b+ positive");
	
		crescent.totalStudentList();
		System.out.println("After Sorting");
		crescent.sortStudentsByName();
		crescent.totalStudentList();
		
		 System.out.println("\nAge: Search"); crescent.searchByAge(16);
		 System.out.println("\nClass Search"); crescent.SearchByCLass("3");
		 System.out.println(); crescent.searchStudentByName("Moh");
		
		 
		  
	}

}
