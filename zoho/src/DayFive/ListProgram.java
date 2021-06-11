package DayFive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProgram {

	
	static List<String> list;
	static void print()
	{
		int i=1;
		for(String s:list)
		{
			System.out.println(i + "."+s);
			i++;
		}
	}
	static void addNames(String name)
	{
		
		list.add(name);
	}
	static void changeNameInIndex(int index,String name)
	{
		index--;
		list.set(index, name);
	}
	
	static int getTotalNumberOfName()
	{
		
		return list.size();
	}
	
	static void addInIndex(int index,String name) {
			
		index--;
		list.add(index, name);
	}
	
	static List<String> subList(int frm,int to) {
		
		frm--;
		to--;
		return list.subList(frm,to);
	}
	
	static String getName(int index)
	{
		index=index-1;
		return list.get(index);
	}
	
	static int getIndex(String name)
	{
		
		return list.indexOf(name)+1;
	}
	
	static void removeName(String name)
	{
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
			String s = it.next();
			if(s.equals(name))
			{
				it.remove();
			}
			
		}
		
	}
	public static void main(String[] args) {
	
		list = new ArrayList<>();
		
		addNames("yusuf");
		addNames("tamil");
		addNames("sandy");
		addNames("fathah");
		print();
		int i=getIndex("yusuf");
		System.out.println("index of yusuf :" +i);
		addInIndex(2,"khaja");
		print();
		changeNameInIndex(3,"tharique");
		
		
		for(String s:list)
		{
			if(s.equals("yusuf"))
				list.remove(s);
		}
		removeName("khaja");
		print();
		
		
	}
	
}
