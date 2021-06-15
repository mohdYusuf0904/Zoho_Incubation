package DayFour;
import java.util.*;

public class School {	
	
	private String schoolName;
	private String phoneNumber;
	private String Address;
	private String schoolPrincipal;
	private List<Student> studentList;
	
	
	public School(String schoolName, String phoneNumber, String address, String schoolPrincipal) {
		
		studentList = new ArrayList<>();
		this.schoolName = schoolName;
		this.phoneNumber = phoneNumber;
		Address = address;
		this.schoolPrincipal = schoolPrincipal;
	
	}
	
	
	
	public void addStudent(String name,int age,int i,String gender,String bloodgrp)
	{
		Student st = new Student(name,i,age,gender,bloodgrp);	
		studentList.add(st);
	}

	
	public List searchByAge(int age)
	{
		List<Student> st = new ArrayList<>();
		for(Student s:studentList)
		{
			if(age==s.getAge())
			st.add(s);
		}
	
		return st;
		
	}
	public List<Student> searchStudentByName(String name)
	{
		List<Student> list = new ArrayList<>();
		for(Student stu : studentList)
		{
			
			if(stu.getName().toLowerCase().contains(name.toLowerCase()))
			{
				list.add(stu);
			}		
		}
		
		return list;
	}
	
	public List<Student> sortStudentsByName() {
	
		List<Student> st = new ArrayList<>(studentList);
		SortStudent.setNum(0);
		st.sort(new SortStudent());
		
		return st;	
		
	}
	
	public List<Student> totalStudentList() {
		
		List<Student> list = new ArrayList<>(studentList);
		
		return list;
	}

	public List<Student> sortByStandard() {
		
		List<Student> st = new ArrayList<>(studentList);
		SortStudent.setNum(2);
		st.sort(new SortStudent());
		return st;
		
	}

	public List<Student> sortByAge() {

		List<Student> st = new ArrayList<>(studentList);
		SortStudent.setNum(1);
		st.sort(new SortStudent());
		return st;
	}
	
	public List<Student> manualStdSort(){
		
		List<Student> st = new ArrayList<>(studentList);
		SortStudent.setNum(2);
		st.sort(new SortStudent());
		SortStudent.setNum(3);
		st.sort(new SortStudent());
		
		return st;

	}
	


	public List<Student> searchByStd(int std) {
		
		List<Student> st = new ArrayList<>();
		for(Student s:studentList)
		{
			if(std==s.getStd())		
			st.add(s);
		}
		
		return st;
	
	}

	public List<Student> sortManualByName() {
		
		List<Student> list  = new ArrayList<>(studentList);
		
		return null;
	}
}

