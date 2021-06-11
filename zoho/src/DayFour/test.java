package DayFour;
import java.util.ArrayList;
import java.util.List;

class Students{
	
	String Name;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Students [Name=" + Name + "]\n";
	}

}
public class test {

	public static void main(String[] args) {
		
		List<Students> studentList = new ArrayList<>();
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		s1.setName("Mohamed asmail");
		s2.setName("Mohamed");
		s3.setName("Ashik");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		List<Students> student = new ArrayList<>(studentList);
		
		if(student.isEmpty() || student.size()<1)
		{
			
		}
		else
		for(int i=0;i<student.size();i++)
		{
			
			for(int j=i+1;j<student.size();j++)
			{
				if(student.get(i).getName().toLowerCase().charAt(0)>student.get(j).getName().toLowerCase().charAt(0))
				{
					swap(student,i,j);
				}else if(student.get(i).getName().charAt(0)==student.get(j).getName().charAt(0))
				{
					String str1 =student.get(i).getName().toLowerCase();
					String str2 = student.get(j).getName().toLowerCase();
					boolean isTrue = false;
					
					int nxt1=0,nxt2=0;
					while(nxt1<str1.length() && nxt2<str2.length())
					{
						if(str1.charAt(nxt1)==' ')
						{
							nxt1++;
							continue;
						}else if(str2.charAt(nxt2)==' ')
						{
							nxt2++;
							continue;
						}
						
						if(str1.charAt(nxt1)>str2.charAt(nxt2))
						{
							swap(student,i,j);
							isTrue=true;
							break;
							
						}else if(str1.charAt(nxt1)<str2.charAt(nxt2))
						{
							break;
						}
						nxt1++;
						nxt2++;
						
					}
					
					if(!isTrue && str1.length()>str2.length())
					{
						swap(student,i,j);
					}
				}
				
			}
			
		}
		System.out.println(student);
		
	}

	private static void swap(List<Students> student, int i, int j) {
	
		Students l = student.get(i);
		student.set(i,student.get(j));
		student.set(j, l);
	}

}
