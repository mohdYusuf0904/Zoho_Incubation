package newTask;

import java.util.ArrayList;
import java.util.List;

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
	
	
	public void addStudent(String name,int age,String std,String gender,String bloodgrp)
	{
		Student st = new Student(name,std,age,gender,bloodgrp);	
		studentList.add(st);
	}

	
	public void searchByAge(int age)
	{
		int i=0;
		for(Student st:studentList)
		{
			
			if(st.getAge()==age)
			{
				i=1;
				System.out.println(st);
			}
			
		}

		if(i==0)
		{
			System.out.println("name not exist with this age");
		}
		
		
	}
	public void searchStudentByName(String name)
	{
		int i=0;
		System.out.println("Similar Names:");
		
		for(Student stu : studentList)
		{
			
			
			if(stu.getName().contains(name))
			{
				System.out.println(stu);
			}
			
		}

		if(i==0)
		{
			System.out.println("Name not exist");
		}
		
		
	}
	
	
	public void SearchByCLass(String std){
	
		int i=0;
		for(Student st:studentList)
		{
		
			if(st.getStd().equals(std)) {
			System.out.println(st);
			i=1;
			}
		}
		if(i==0)
		{
			System.out.println("class not exist");
		}
		
	}
	
	
	
	public void sortStudentsByName() {
	
		
		for(int i=0;i<studentList.size();i++)
		{
			
			for(int j=i+1;j<studentList.size();j++)
			{
				
				if(studentList.get(i).getName().charAt(0)>studentList.get(j).getName().charAt(0))
				{
					Student l = studentList.get(i);
					studentList.set(i,studentList.get(j));
					studentList.set(j, l);
				
				}
			}
			
		}
		
		
	}
	
	public void totalStudentList() {
		
		
		System.out.println("Total Student");
		for(Student st:studentList)
		{
			
			System.out.println(st);
			
		}
		
		
	}
}
class Student{

	private String name;
	private String Std;
	private int age;
	private String bloodGroup;
	private String gender;
	
	public Student(String name, String std, int age, String gender,String bloodGroup) {
		super();
		this.name = name;
		Std = std;
		this.age = age;
		this.gender=gender;
		this.bloodGroup = bloodGroup;
	}

	public String getName() {
		return name;
	}


	public String getStd() {
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
		return "name=" + name + ", Std=" + Std + ", age=" + age +" gender = "+ gender + " bloodGroup=" + bloodGroup + " ";
	}
	
	
}
