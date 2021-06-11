package DayFour;

import java.util.Comparator;

public class SortStudent implements Comparator<Student>{


	private static int num;
	
	public int compare(Student o1, Student o2) {

		if(num==0)
			return o1.getName().compareToIgnoreCase(o2.getName());
		else if(num==1)
			return Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
		else if(num==2)
			return Integer.valueOf(o1.getStd()).compareTo(Integer.valueOf(o2.getStd()));
		else if(num==3)
		{
			
			if(o1.getStd()==o2.getStd())
			{
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		}
		return 0;
	
	
	}
	public static void setNum(int n)
	{
		num=n;		
	}
	
	
}