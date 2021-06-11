package Collections;

import java.util.ArrayList;
import java.util.List;

public class test {

	
	
	public static void main(String[] args) {
		
		List as = new ArrayList<>();
		
		as.add(12);
		as.add(14);
		as.add(1);
		
		List s = new ArrayList<>();
		s=as;
		s.add(1);	
		System.out.println(as);
		System.out.println(s);
	
	}
}
