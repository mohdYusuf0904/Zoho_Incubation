package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("words");
		list.add(0,"yusuf");
		list.addAll(List.of("arun","raja"));
		System.out.println(list);
		list.addAll(1,List.of("yasin","peter"));
		System.out.println(list);
		ArrayList ls = new ArrayList<>();
		ls=(ArrayList) ((ArrayList)list).clone();
		System.out.println(ls);
		//ls.add("newone");
		System.out.println(list);
		System.out.println(list.contains("yusuf"));
		System.out.println(ls.equals(list));;
		list.remove(2);
		System.out.println(list);
		list.remove("yasin");
		System.out.println(list);
		list.set(2, "tamil");
		System.out.println(list);
		//System.gc();
		
	}
}
