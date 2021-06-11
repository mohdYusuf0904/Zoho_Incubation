package DayFive;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sett {

	
	public static void main(String[]
			args) {
		
		
		List<String> list = List.of("apple","orange","apple","medicine","pineapple");
		Set<String > set = new HashSet();
		Set<String> lset = new LinkedHashSet();
		Set<String> tset = new TreeSet();
		
		for(String s:list)
		{
			
			set.add(s);
			lset.add(s);
			tset.add(s);
			
		}
		System.out.println(list);
		System.out.println("Hash Set");
		System.out.println(set);
		System.out.println("LinkedHashSet");
		System.out.println(lset);
		System.out.println("Tree Set");
		System.out.println(tset);
		
	}
	
}
